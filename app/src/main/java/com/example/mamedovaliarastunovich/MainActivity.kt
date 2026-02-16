package com.example.mamedovaliarastunovich

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val label = findViewById<TextView>(R.id.main_label)
        val userData: EditText =findViewById(R.id.user_data)
        val button: Button = findViewById(R.id.button)

        button.setOnClickListener {
            val text = userData.text.toString().trim()
            if (text == "Mikami")
                Toast.makeText(this, "User enter $text", Toast.LENGTH_SHORT).show()
            else
                label.text = text
        }


        }
    }
