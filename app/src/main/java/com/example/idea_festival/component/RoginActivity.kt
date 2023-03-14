package com.example.idea_festival.component

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.idea_festival.R

class RoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rogin)
        val mem_button : Button = findViewById(R.id.membership)
        mem_button.setOnClickListener{
            val intent = Intent(this, MemberActivity::class.java)
            startActivity(intent)
        }
        val ro_button : Button = findViewById(R.id.jo_in)
        ro_button.setOnClickListener {
            val intent = Intent(this, StatusActivity::class.java)
            startActivity(intent)
        }
    }
}