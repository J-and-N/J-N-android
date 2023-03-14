package com.example.idea_festival.component
import android.animation.ValueAnimator
import android.content.Context
import android.content.Intent
import android.content.res.TypedArray
import android.graphics.*
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.util.Log
import android.view.View
import android.view.animation.DecelerateInterpolator
import android.widget.ImageButton
import androidx.core.content.ContextCompat
import com.example.idea_festival.R
import com.example.idea_festival.camera.CameraActivity
import com.example.idea_festival.server.ServerActivity
import java.lang.Math.min


class StatusActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_status)
        val button1 : ImageButton = findViewById(R.id.st_record)
        button1.setOnClickListener{
            val intent = Intent(this, TempratureActivity::class.java)
            startActivity(intent)
        }
        val button2 : ImageButton = findViewById(R.id.st_server)
        button2.setOnClickListener{
            val intent = Intent(this, ServerActivity::class.java)
            startActivity(intent)
        }
        val button3 : ImageButton = findViewById(R.id.st_camera)
        button3.setOnClickListener{
            val intent = Intent(this, CameraActivity::class.java)
            startActivity(intent)
        }
    }

}
