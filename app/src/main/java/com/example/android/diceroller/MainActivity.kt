package com.example.android.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Inisialisasi View
        val rollButton: Button = findViewById(R.id.roll_button)
        val resultText: TextView = findViewById(R.id.result_text)

        rollButton.setOnClickListener { rollDice() }
    }

    private fun rollDice(){
        //Toast.makeText(this, "Button Clicked", Toast.LENGTH_SHORT).show()

        //Variabel untuk mendapatkan angka random dari 1 sampai 6 secara otomatis
        val randomInt = (1..6).random()
        result_text.text = randomInt.toString()
    }
}
