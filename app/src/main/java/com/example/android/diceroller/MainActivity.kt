package com.example.android.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

/*
AppCompatActivity adalah sebuah subclass dari Activity yang mendukung semua fitur Android modern
ketika menyediakan kompatibilitas dengan Android dengan versi yang lebih lama. Untuk membuat
aplikasi kita available untuk perangkat Android yang dengan jumlah terbanyak dan kemungkinan
pengguna, selalu gunakan AppCompatActivity
 */
class MainActivity : AppCompatActivity() {
    lateinit var diceImage : ImageView
    lateinit var diceImage2 : ImageView
    lateinit var rollButton: Button
    //lateinit var countUpButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Inisialisasi View
        //val countUpButton: Button = findViewById(R.id.count_up_button)
        rollButton = findViewById(R.id.roll_button)
        diceImage = findViewById(R.id.dice_image)
        diceImage2 = findViewById(R.id.dice_image2)

        rollButton.setOnClickListener { rollDice() }
    }

    /*
    private fun countUp() {
           var text = result_text.text.toString()
        if (text == getString(R.string.hello_world_text)){
            result_text.text = "1"
        } else {
            var numberNow: Int = text.toInt()
            if (numberNow < 6){
                numberNow+=1
                result_text.text = numberNow.toString()
            }
        }
    }

     */

    private fun rollDice(){
        // function ketika button Roll di klik
        diceImage.setImageResource(getRandomDiceImage())
        diceImage2.setImageResource(getRandomDiceImage())
    }
    private fun getRandomDiceImage() : Int {
        // Variabel untuk mendapatkan angka random dari 1 sampai 6 secara otomatis
        val randomInt = (1..6).random()
        // Mengembalikan nilai drawable
        return when (randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
    }
}
