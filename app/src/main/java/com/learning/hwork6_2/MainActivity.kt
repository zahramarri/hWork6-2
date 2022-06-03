package com.learning.hwork6_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import com.learning.hwork6_2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var winner: Char = ' '
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.editTextSquare1.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                findWinner1()
                binding.textViewStatus.text = when (winner) {
                    'O' -> "player O winner"
                    'X' -> "player X winner"
                    else -> "Draw"
                }
            }

            override fun afterTextChanged(p0: Editable?) {
            }
        })
        binding.editTextSquare2.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                findWinner2()
                binding.textViewStatus.text = when (winner) {
                    'O' -> "player O winner"
                    'X' -> "player X winner"
                    else -> "Draw"
                }
            }

            override fun afterTextChanged(p0: Editable?) {
            }
        })
        binding.editTextSquare3.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                findWinner3()
                binding.textViewStatus.text = when (winner) {
                    'O' -> "player O winner"
                    'X' -> "player X winner"
                    else -> "Draw"
                }
            }

            override fun afterTextChanged(p0: Editable?) {
            }
        })
        binding.editTextSquare4.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                findWinner4()
                binding.textViewStatus.text = when (winner) {
                    'O' -> "player O winner"
                    'X' -> "player X winner"
                    else -> "Draw"
                }
            }

            override fun afterTextChanged(p0: Editable?) {
            }
        })
        binding.editTextSquare5.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                findWinner5()
                binding.textViewStatus.text = when (winner) {
                    'O' -> "player O winner"
                    'X' -> "player X winner"
                    else -> "Draw"
                }
            }

            override fun afterTextChanged(p0: Editable?) {
            }
        })
        binding.editTextSquare6.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                findWinner6()
                binding.textViewStatus.text = when (winner) {
                    'O' -> "player O winner"
                    'X' -> "player X winner"
                    else -> "Draw"
                }
            }

            override fun afterTextChanged(p0: Editable?) {
            }
        })
        binding.editTextSquare7.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                findWinner7()
                binding.textViewStatus.text = when (winner) {
                    'O' -> "player O winner"
                    'X' -> "player X winner"
                    else -> "Draw"
                }
            }

            override fun afterTextChanged(p0: Editable?) {
            }
        })
        binding.editTextSquare8.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                findWinner8()
                binding.textViewStatus.text = when (winner) {
                    'O' -> "player O winner"
                    'X' -> "player X winner"
                    else -> "Draw"
                }
            }

            override fun afterTextChanged(p0: Editable?) {
            }
        })
        binding.editTextSquare9.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                findWinner9()
                binding.textViewStatus.text = when (winner) {
                    'O' -> "player O winner"
                    'X' -> "player X winner"
                    else -> "Draw"
                }
            }

            override fun afterTextChanged(p0: Editable?) {
            }
        })

    }

    private fun findWinner1() {
        if (binding.editTextSquare1.text.toString() == binding.editTextSquare2.text.toString() &&
            binding.editTextSquare3.text.toString() == binding.editTextSquare2.text.toString() ||
            binding.editTextSquare1.text.toString() == binding.editTextSquare5.text.toString() &&
            binding.editTextSquare9.text.toString() == binding.editTextSquare5.text.toString() ||
            binding.editTextSquare1.text.toString() == binding.editTextSquare4.text.toString() &&
            binding.editTextSquare7.text.toString() == binding.editTextSquare4.text.toString()
        ) {
            winner = binding.editTextSquare1.text.first()
        }
    }

    private fun findWinner2() {
        if (binding.editTextSquare1.text.toString() == binding.editTextSquare2.text.toString() &&
            binding.editTextSquare3.text.toString() == binding.editTextSquare2.text.toString() ||
            binding.editTextSquare2.text.toString() == binding.editTextSquare5.text.toString() &&
            binding.editTextSquare8.text.toString() == binding.editTextSquare5.text.toString()
        ) {
            winner = binding.editTextSquare2.text.first()
        }
    }

    private fun findWinner3() {
        if (binding.editTextSquare1.text.toString() == binding.editTextSquare2.text.toString() &&
            binding.editTextSquare3.text.toString() == binding.editTextSquare2.text.toString() ||
            binding.editTextSquare3.text.toString() == binding.editTextSquare5.text.toString() &&
            binding.editTextSquare7.text.toString() == binding.editTextSquare5.text.toString() ||
            binding.editTextSquare3.text.toString() == binding.editTextSquare6.text.toString() &&
            binding.editTextSquare9.text.toString() == binding.editTextSquare6.text.toString()
        ) {
            winner = binding.editTextSquare3.text.first()
        }
    }

    private fun findWinner4() {
        if (binding.editTextSquare4.text.toString() == binding.editTextSquare5.text.toString() &&
            binding.editTextSquare6.text.toString() == binding.editTextSquare5.text.toString() ||
            binding.editTextSquare1.text.toString() == binding.editTextSquare4.text.toString() &&
            binding.editTextSquare7.text.toString() == binding.editTextSquare4.text.toString()
        ) {
            winner = binding.editTextSquare4.text.first()
        }
    }

    private fun findWinner5() {
        if (binding.editTextSquare1.text.toString() == binding.editTextSquare5.text.toString() &&
            binding.editTextSquare9.text.toString() == binding.editTextSquare5.text.toString() ||
            binding.editTextSquare2.text.toString() == binding.editTextSquare5.text.toString() &&
            binding.editTextSquare8.text.toString() == binding.editTextSquare5.text.toString() ||
            binding.editTextSquare3.text.toString() == binding.editTextSquare5.text.toString() &&
            binding.editTextSquare7.text.toString() == binding.editTextSquare5.text.toString() ||
            binding.editTextSquare4.text.toString() == binding.editTextSquare5.text.toString() &&
            binding.editTextSquare6.text.toString() == binding.editTextSquare5.text.toString()
        ) {
            winner = binding.editTextSquare5.text.first()
        }
    }

    private fun findWinner6() {
        if (binding.editTextSquare3.text.toString() == binding.editTextSquare6.text.toString() &&
            binding.editTextSquare9.text.toString() == binding.editTextSquare6.text.toString() ||
            binding.editTextSquare4.text.toString() == binding.editTextSquare5.text.toString() &&
            binding.editTextSquare6.text.toString() == binding.editTextSquare5.text.toString()
        ) {
            winner = binding.editTextSquare6.text.first()
        }
    }

    private fun findWinner7() {
        if (binding.editTextSquare3.text.toString() == binding.editTextSquare5.text.toString() &&
            binding.editTextSquare7.text.toString() == binding.editTextSquare5.text.toString() ||
            binding.editTextSquare1.text.toString() == binding.editTextSquare4.text.toString() &&
            binding.editTextSquare7.text.toString() == binding.editTextSquare4.text.toString() ||
            binding.editTextSquare7.text.toString() == binding.editTextSquare8.text.toString() &&
            binding.editTextSquare9.text.toString() == binding.editTextSquare8.text.toString()
        ) {
            winner = binding.editTextSquare7.text.first()
        }
    }

    private fun findWinner8() {
        if (binding.editTextSquare7.text.toString() == binding.editTextSquare8.text.toString() &&
            binding.editTextSquare9.text.toString() == binding.editTextSquare8.text.toString() ||
            binding.editTextSquare2.text.toString() == binding.editTextSquare5.text.toString() &&
            binding.editTextSquare8.text.toString() == binding.editTextSquare5.text.toString()
        ) {
            winner = binding.editTextSquare8.text.first()
        }
    }

    private fun findWinner9() {
        if (binding.editTextSquare1.text.toString() == binding.editTextSquare5.text.toString() &&
            binding.editTextSquare9.text.toString() == binding.editTextSquare5.text.toString() ||
            binding.editTextSquare7.text.toString() == binding.editTextSquare8.text.toString() &&
            binding.editTextSquare9.text.toString() == binding.editTextSquare8.text.toString() ||
            binding.editTextSquare3.text.toString() == binding.editTextSquare6.text.toString() &&
            binding.editTextSquare9.text.toString() == binding.editTextSquare6.text.toString()
        ) {
            winner = binding.editTextSquare9.text.first()
        }
    }
}