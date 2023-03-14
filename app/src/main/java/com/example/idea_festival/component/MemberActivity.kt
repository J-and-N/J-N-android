package com.example.idea_festival.component

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.idea_festival.R

class MemberActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_member)
        val sta_button : Button = findViewById(R.id.me_join)
        sta_button.setOnClickListener{
            val intent = Intent(this, StatusActivity::class.java)
            startActivity(intent)
        }
    }
}