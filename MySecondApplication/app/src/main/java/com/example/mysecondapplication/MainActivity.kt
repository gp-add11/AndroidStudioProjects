package com.example.mysecondapplication

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userInputValue = findViewById<EditText>(R.id.editTextNumber).text.toString()
        //val userIpVal = findViewById<EditText>(R.id.editTextNumber).tex
/*
        findViewById<Button>(R.id.button_check).setOnClickListener {
            Toast.makeText(this, "The entered number is $userInputValue !", Toast.LENGTH_LONG).show()
        }
*/
    }



}