package com.example.idea_festival.component

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import com.example.idea_festival.R
import com.example.idea_festival.camera.CameraActivity
import com.example.idea_festival.server.ServerActivity

class HumidityActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_humidity)
        val button1 : ImageButton = findViewById(R.id.h_status)
        button1.setOnClickListener{
            val intent = Intent(this, StatusActivity::class.java)
            startActivity(intent)
        }
        val button5 : Button = findViewById(R.id.temp_btn)
        button5.setOnClickListener {
            val intent = Intent(this, HumidityActivity::class.java)
            startActivity(intent)
        }
        val button : ImageButton = findViewById(R.id.h_server)
        button.setOnClickListener{
            val intent = Intent(this, ServerActivity::class.java)
            startActivity(intent)
        }
        val button2 : ImageButton = findViewById(R.id.h_camera)
        button2.setOnClickListener {
            val intent = Intent(this, CameraActivity::class.java)
            startActivity(intent)
        }
    }
}