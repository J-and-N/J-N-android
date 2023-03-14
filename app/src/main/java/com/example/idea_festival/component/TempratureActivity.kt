package com.example.idea_festival.component

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import com.example.idea_festival.R
import com.example.idea_festival.camera.CameraActivity
import com.example.idea_festival.server.ServerActivity

class TempratureActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_temprature)
        val button : ImageButton = findViewById(R.id.te_status)
        button.setOnClickListener{
            val intent = Intent(this, StatusActivity::class.java)
            startActivity(intent)
        }
        val button1 : Button = findViewById(R.id.humi_btn)
        button1.setOnClickListener {
            val intent = Intent(this, HumidityActivity::class.java)
            startActivity(intent)
        }
        val button2 : ImageButton = findViewById(R.id.te_server)
        button2.setOnClickListener{
            val intent = Intent(this, ServerActivity::class.java)
            startActivity(intent)
        }
        val button3 : ImageButton = findViewById(R.id.te_camera)
        button3.setOnClickListener{
            val intent = Intent(this, CameraActivity::class.java)
            startActivity(intent)
        }
    }
}