package com.example.babycamapp


import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import com.example.babycamapp.ui.main.ClientActivity
import com.example.babycamapp.ui.main.ServerActivity


class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        val btn1=findViewById<ImageButton>(R.id.parentIcon)
        val btn2=findViewById<ImageButton>(R.id.babyIcon)
        btn1.setOnClickListener {
            Intent(this,ServerActivity::class.java).apply{
                startActivity(this)
            }
        }
        btn2.setOnClickListener {
            Intent(this, ClientActivity::class.java).apply{
                startActivity(this)
            }
        }
    }
}