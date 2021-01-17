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

        //randomNo = Random.nextInt(0,1000)
        //findViewById<TextView>(R.id.text_number).text = randomNo.toString()

        randomNo = showRandomNumber()
        // this block works, commented to unit test
        button.setOnClickListener {

            val userNum1 = editText.text.toString().toInt()
            //displayText.setText("Hi, number is ${num1*20} !!") //works
            if(randomNo == userNum1) {
                displayText.setText("Correct!! Number is ${randomNo*2}/2")
            } else {
                displayText.setText("Wrong by ${userNum1-randomNo}")
            }
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