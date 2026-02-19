package com.example.mamedovaliarastunovich

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    companion object {
        private const val TAG = "SecondActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        Log.d(TAG, "onCreate called")

        // Получаем данные из Intent
        val fullName = intent.getStringExtra("FULL_NAME") ?: "Не указано"
        val groupNumber = intent.getStringExtra("GROUP_NUMBER") ?: "Не указано"
        val age = intent.getStringExtra("AGE") ?: "Не указано"
        val desiredGrade = intent.getStringExtra("DESIRED_GRADE") ?: "Не указано"

        // Отображаем данные
        val textViewResult = findViewById<TextView>(R.id.text_view_result)
        textViewResult.text = """
            Данные пользователя:
            
            ФИО: $fullName
            Группа: $groupNumber
            Возраст: $age
            Желаемая оценка: $desiredGrade
        """.trimIndent()
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart called")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume called")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause called")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart called")
    }
}