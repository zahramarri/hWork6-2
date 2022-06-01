package com.learning.hwork6_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.learning.hwork6_2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private var winner: Char? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textViewStatus.text = when (winner) {
            'O' -> "player O winner"
            'X' -> "player X winner"
            else -> "Draw"
        }

    }



}