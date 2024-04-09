package com.example.assignment1

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    }

fun setContentView(activityMain:Int
}

fun <T> findViewById(ageNumber: Int): Any {

}



}

override fun onCreat(savedInstanceState: Bundle?) {
    super .onCreate(savedInstanceState)
    setContentView(.Layout. activity_main)
    //Declearing the views
    val ageNumber = findViewById<Edit>(R.id.ageNumber)
    val btnGenerate = findViewById<Button>(R.id.btnGenerate)
    val btnClear = findViewById<Button>(R.id.btnClear)
    val txResult = findViewById<TextView>(R.id.txResults)
        btnGenerate.setOnClicklis {
                val age = ageNumber.text.toString(.toIntOrNull()
                if (age != null) {
                        val result = when (age) {
                        in 0..12 -> ""
                        in 13..19 -> ""
                        in 20..59 -> ""
                        }
                }
        }





}







