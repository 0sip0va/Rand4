package com.example.random4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        val textView = findViewById<TextView>(R.id.textView)
        val textView2 = findViewById<TextView>(R.id.textView2)


        button.setOnClickListener {
            val random = Random.nextInt(10, 99) + 1
            val random2 = Random.nextInt(100, 999) + 1
            textView2.text = random.toString()
            textView.text = random2.toString()

        }
    }
}