package com.example.mysecondapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userInputValue = findViewById<EditText>(R.id.editTextNumber).text.toString().toInt()

        findViewById<Button>(R.id.button_check).setOnClickListener {
            Toast.makeText(this, "The entered number is $userInputValue !", Toast.LENGTH_LONG).show()
        }

    }



}