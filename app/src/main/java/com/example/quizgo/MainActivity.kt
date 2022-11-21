package com.example.quizgo

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.quizgo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var activityHomeBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


            activityHomeBinding = ActivityMainBinding.inflate(layoutInflater)
            setContentView(activityHomeBinding.root)
            activityHomeBinding.playQuizHomeBtn.setOnClickListener {
                val intent = Intent(this@MainActivity, PlayActivity::class.java)
                startActivity(intent)
            }
        }
    }
