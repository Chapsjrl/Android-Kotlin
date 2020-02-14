package com.example.diceroller

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var diceImage : ImageView
    lateinit var diceImage2 : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
//        val countButton: Button = findViewById(R.id.count_button)
        val resetButton: Button = findViewById(R.id.reset_button)
        diceImage = findViewById(R.id.dice_image)
        diceImage2 = findViewById(R.id.dice_image2)

        rollButton.setOnClickListener { rollDice() }
//        countButton.setOnClickListener { countUp() }
        resetButton.setOnClickListener {
            diceImage.setImageResource(R.drawable.empty_dice)
            diceImage2.setImageResource(R.drawable.empty_dice)
        }
    }

    private fun rollDice(){
//        val resultText: TextView = findViewById(R.id.result_text)

        diceImage.setImageResource(getRandomImage())
        diceImage2.setImageResource(getRandomImage())
    }

    private fun getRandomImage(): Int {
        return when ((1..6).random()) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
    }

//    private fun countUp(){
//        val resultText: TextView = findViewById(R.id.result_text)
//
//        //Operador de control whe (funciona como switch)
//        val count = when(val aux = resultText.text.toString()) {
//            //Lado izquierdo el caso de cadena, derecho asignación a count
//
//            //Caso inicial se asigna 1
//            "Hello World!", "0" -> 1
//            // caso 6 el botón no suma
//            "6" -> 6
//            //todos los demas casos se suma
//            else -> aux.toInt() + 1
//        }
//        resultText.text = count.toString()
//    }
}
