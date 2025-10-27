package com.anondo.quizapppractice

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.anondo.quizapppractice.databinding.ActivityMainBinding
import com.anondo.quizapppractice.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {
    lateinit var binding: ActivityResultBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var score = intent.getIntExtra("score" , 0)

        binding.mainTitle.text = "Your score : "+score

        binding.startButton.setOnClickListener {

            startActivity(Intent(this , Dashboard_Activity::class.java))
            finish()

        }

    }
}