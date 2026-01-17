package com.example.babycamapp.ui.main

import android.graphics.Bitmap
import androidx.lifecycle.viewModelScope
import com.andyha.coreui.base.viewModel.BaseViewModel
import com.andyha.p2p.streaming.kit.data.repository.server.ServerRepository
import com.andyha.wifidirectkit.manager.WifiDirectManager
import com.andyha.wifidirectkit.model.ConnectionState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.launch
import timber.log.Timber
import javax.inject.Inject


@HiltViewModel
class ServerViewModel @Inject constructor(
    private val serverRepository: ServerRepository,
    private val wifiDirectManager: WifiDirectManager,
) : BaseViewModel() {

    //IP addresses of subscribers
    private val subscribers = mutableSetOf<String>()

    private var connectionState: ConnectionState = ConnectionState.Disconnected

    val groupFormed by lazy { wifiDirectManager.groupFormed }

    private val _uiState = MutableStateFlow(ServerUiState(connectionState))
    val uiState = _uiState.asStateFlow()

    fun initWifiDirect() {
        wifiDirectManager.init()
        viewModelScope.launch { wifiDirectManager.createGroup() }
        listenToGroupFormed()
        listenToConnectionState()
    }

    private fun listenToGroupFormed() {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                wifiDirectManager.groupFormed
                    .catch { Timber.e(it) } // Rethrow exception for logging
                    .collect { groupFormedEvent ->
                        Timber.d("collect GroupFormed: $groupFormedEvent")
                        subscribers.clear()
                        groupFormedEvent?.groupOwnerAddress?.hostAddress?.let { serverAddress ->
                            listenToSubscribers(serverAddress)
                        }
                    }
            } catch (e: Exception) {
                Timber.e(e, "Error listening to group formation")
                // Handle error, possibly emit error state to UI
//                _uiState.tryEmit(ServerUiState(ConnectionState.Error))
            }
        }
    }

    private fun listenToConnectionState() {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                wifiDirectManager.connectionState
                    .catch { throw it } // Rethrow exception for logging
                    .collect { connectionStateEvent ->
                        Timber.d("collect ConnectionState: $connectionStateEvent")
                        connectionState = connectionStateEvent
                        emitUiState()
                    }
            } catch (e: Exception) {
                Timber.e(e, "Error listening to connection state")
                // Handle error, possibly emit error state to UI
               // _uiState.tryEmit(ServerUiState(ConnectionState.Error))
            }
        }
    }

    private fun emitUiState() {
        _uiState.tryEmit(ServerUiState(connectionState))
    }

    fun toggleGroup() {
        viewModelScope.launch(Dispatchers.IO) {
            wifiDirectManager.toggleGroup()
         }
    }

    fun sendCameraFrame(bitmap: Bitmap) {
        Timber.d("sendCameraFrame: $subscribers")
        viewModelScope.launch(Dispatchers.IO) {
            try {
                for (subscriber in subscribers) {
                    serverRepository.sendBitmap(subscriber, bitmap)
                }
            } catch (e: Exception) {
                Timber.e(e, "Error sending camera frame to subscribers")
                // Handle error, possibly emit error state to UI
                // You may also want to remove the subscriber from the list if the sending fails
            }
        }
    }

    private fun listenToSubscribers(serverAddress: String) {
        Timber.d("Start listening to subscribers: $serverAddress")
        viewModelScope.launch(Dispatchers.IO) {
            try {
                serverRepository.receiveSubscribers(serverAddress)
                    .catch { Timber.e(it) } // Rethrow exception for logging
                    .collect { subscriber ->
                        Timber.d("collectSubscriber: $subscriber")
                        subscribers.add(subscriber)
                    }
            } catch (e: Exception) {
                Timber.e(e, "Error listening to subscribers")
                // Handle error, possibly emit error state to UI
                //_uiState.tryEmit(ServerUiState(ConnectionState.Error))
            }
        }
    }

    override fun onCleared() {
        super.onCleared()
        wifiDirectManager.close()
    }
}