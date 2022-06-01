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

    fun recognizeWinner() {
        if (binding.editTextSquare1.text == binding.editTextSquare2.text &&
            binding.editTextSquare3.text == binding.editTextSquare2.text ||
            binding.editTextSquare1.text == binding.editTextSquare5.text &&
            binding.editTextSquare6.text == binding.editTextSquare5.text ||
            binding.editTextSquare1.text == binding.editTextSquare4.text &&
            binding.editTextSquare7.text == binding.editTextSquare4.text) {
            winner = binding.editTextSquare1.text.first()
        }
    }

}