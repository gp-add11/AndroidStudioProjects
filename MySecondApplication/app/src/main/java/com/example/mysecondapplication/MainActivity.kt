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
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.button)
        val editText = findViewById<EditText>(R.id.editTextNumber)
        val displayText = findViewById<TextView>(R.id.text_score)
        editText.inputType = InputType.TYPE_CLASS_NUMBER

        var randomNo: Int
        var correctScore: Int = 0
        var wrongScore: Int = 0

        randomNo = showRandomNumber()

        button.setOnClickListener {
            val userNum1 = editText.text.toString().toInt()

            if(randomNo == userNum1) {
                correctScore++
                displayText.setText("Correct $correctScore times!! Number is ${randomNo*2}/2 ... vs $wrongScore mistakes")
            } else {
                wrongScore++
                displayText.setText("Wrong $wrongScore times ${userNum1-randomNo} ... vs $correctScore corrects")
            }

            editText.text.clear()  //to clear text for next user input, instead of making user to backspace
            randomNo = showRandomNumber()
        }
    }

    private fun showRandomNumber(): Int {
        val num1: Int
        num1 = Random.nextInt(0,1000)
        findViewById<TextView>(R.id.text_number).text = num1.toString()
        return num1
    }


}