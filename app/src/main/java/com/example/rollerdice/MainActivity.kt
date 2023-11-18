package com.example.rollerdice

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.ComponentActivity
import com.example.rollerdice.databinding.MainActivityBinding
import java.util.Random

private lateinit var binding: MainActivityBinding
class MainActivity : ComponentActivity() {
    @SuppressLint("MissingInflatedId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = MainActivityBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)


        binding.rollBtn.setOnClickListener{
            Toast.makeText(this, "Let's roll", Toast.LENGTH_SHORT).show()
            var numInt = (Random().nextInt(6)+1)
            val drawableRes = when(numInt) {
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }
            val diceImage = binding.imgDice
            diceImage.setImageResource(drawableRes)
        }

        val tvRoll = binding.rolltv

    }
}

