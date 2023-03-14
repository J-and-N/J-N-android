package com.example.idea_festival.server

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.idea_festival.R
import com.example.idea_festival.camera.CameraActivity
import com.example.idea_festival.component.StatusActivity
import com.example.idea_festival.component.TempratureActivity

class ServerActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_server)

       // ConstraintLayout(setOf(findViewById(R.id.seredit)))
        val button1 : ImageButton = findViewById(R.id.se_rec)
        button1.setOnClickListener{
            val intent = Intent(this, TempratureActivity::class.java)
            startActivity(intent)
        }
        val button2 : ImageButton = findViewById(R.id.se_status)
        button2.setOnClickListener{
            val intent = Intent(this, StatusActivity::class.java)
            startActivity(intent)
        }
        val button3 : ImageButton = findViewById(R.id.se_camera)
        button3.setOnClickListener{
            val intent = Intent(this, CameraActivity::class.java)
            startActivity(intent)
        }

        val button : Button = findViewById(R.id.add)
        button.setOnClickListener{

        }
    }

    private fun ConstraintLayout(of: Context) {

    }


}