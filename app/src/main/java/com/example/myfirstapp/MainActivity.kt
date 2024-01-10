package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myButton = findViewById<Button>(R.id.myButton)
        val myTextView = findViewById<TextView>(R.id.textView)
        var counter = 0
        myButton.setOnClickListener {
            counter++
            myTextView.text = counter.toString()
            Toast.makeText(this, "New Person Counted", Toast.LENGTH_LONG).show()
        }
    }



}