package com.example.calwithviewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var num1EditText: EditText
    private lateinit var num2EditText: EditText
    private lateinit var answerTextView: TextView
    private lateinit var calculateButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        num1EditText = findViewById(R.id.editTextNumberOne)
        num2EditText = findViewById(R.id.editTextNumberTwo)
        answerTextView = findViewById(R.id.textViewAnswer)
        calculateButton = findViewById(R.id.buttonCalculate)




    }
}