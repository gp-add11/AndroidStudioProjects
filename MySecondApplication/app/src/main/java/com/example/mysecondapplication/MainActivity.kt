package com.example.mysecondapplication

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import android.text.InputType
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.button)
        val editText = findViewById<EditText>(R.id.editTextNumber)
        val displayText = findViewById<TextView>(R.id.text_score)
        editText.inputType = InputType.TYPE_CLASS_NUMBER

        //val text1 = editText.text.toString()

        button.setOnClickListener {
            val text1 = editText.text.toString()
            val num1 = text1.toInt()
            //displayText.setText("Hello, number is " + editText.text + " ! stop")  //works
            //displayText.setText("Welcome, no. is ${editText.text} ! over")  //works
            //displayText.setText("Hi, number is $text1 !!") //works
            displayText.setText("Hi, number is ${num1*20} !!") //works
        }

/*        //val userInputValue = findViewById<EditText>(R.id.editTextNumber).text.toString()//.toInt()
        //val userIpVal = findViewById<EditText>(R.id.editTextNumber).tex
        //val button = findViewById<Button>(R.id.button)
        //val abc = findViewById<EditText>(R.id.editTextNumber).getText().toString().toInt()

        findViewById<Button>(R.id.button_check).setOnClickListener {
            Toast.makeText(this, "The entered number is $userInputValue !", Toast.LENGTH_LONG).show()
        }

*/
    }



}