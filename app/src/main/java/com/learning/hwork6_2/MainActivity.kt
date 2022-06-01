package com.learning.hwork6_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.learning.hwork6_2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var winner: Char = ' '
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (binding.editTextSquare1.text.isNotEmpty() ||
            binding.editTextSquare2.text.isNotEmpty() ||
            binding.editTextSquare3.text.isNotEmpty() ||
            binding.editTextSquare4.text.isNotEmpty() ||
            binding.editTextSquare5.text.isNotEmpty() ||
            binding.editTextSquare6.text.isNotEmpty() ||
            binding.editTextSquare7.text.isNotEmpty() ||
            binding.editTextSquare8.text.isNotEmpty() ||
            binding.editTextSquare9.text.isNotEmpty()
        ) {
            findWinner()
        }
        binding.textViewStatus.text = when (winner) {
                'O' -> "player O winner"
                'X' -> "player X winner"
                else -> "Draw"
            }

    }

    private fun findWinner() {
        if (binding.editTextSquare1.text == binding.editTextSquare2.text &&
            binding.editTextSquare3.text == binding.editTextSquare2.text ||
            binding.editTextSquare1.text == binding.editTextSquare5.text &&
            binding.editTextSquare6.text == binding.editTextSquare5.text ||
            binding.editTextSquare1.text == binding.editTextSquare4.text &&
            binding.editTextSquare7.text == binding.editTextSquare4.text
        ) {
            winner = binding.editTextSquare1.text.first()
        }
        if (binding.editTextSquare2.text == binding.editTextSquare5.text &&
            binding.editTextSquare8.text == binding.editTextSquare5.text
        ) {
            winner = binding.editTextSquare2.text.first()
        }
        if (binding.editTextSquare3.text == binding.editTextSquare5.text &&
            binding.editTextSquare7.text == binding.editTextSquare5.text ||
            binding.editTextSquare3.text == binding.editTextSquare6.text &&
            binding.editTextSquare9.text == binding.editTextSquare6.text
        ) {
            winner = binding.editTextSquare3.text.first()
        }
        if (binding.editTextSquare4.text == binding.editTextSquare5.text &&
            binding.editTextSquare6.text == binding.editTextSquare5.text
        ) {
            winner = binding.editTextSquare4.text.first()
        }
        if (binding.editTextSquare7.text == binding.editTextSquare8.text &&
            binding.editTextSquare9.text == binding.editTextSquare8.text
        ) {
            winner = binding.editTextSquare7.text.first()
        }
    }

}