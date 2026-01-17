package com.example.babycamapp.ui.main

import android.net.wifi.p2p.WifiP2pDevice
import com.andyha.coreui.base.viewModel.BaseViewModel
import com.andyha.wifidirectkit.manager.WifiDirectManager
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.SharedFlow
import javax.inject.Inject


@HiltViewModel
class DeviceBottomSheetViewModel @Inject constructor(
    private val wifiDirectManager: WifiDirectManager
) : BaseViewModel() {

    val availablePeers: SharedFlow<List<WifiP2pDevice>> by lazy {
        wifiDirectManager.availablePeers
    }
    init {
        // Initialize the WifiDirectManager
        wifiDirectManager.init()
    }

    fun discoverPeers(){
        wifiDirectManager.discoverPeers()
    }

    fun connectToPeer(peer: WifiP2pDevice){
        wifiDirectManager.connect(peer)
    }
}