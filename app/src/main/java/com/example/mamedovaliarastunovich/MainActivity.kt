package com.example.mamedovaliarastunovich

import android.widget.Switch
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    companion object {
        private const val TAG = "MainActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        Log.d(TAG, "onCreate called")

        val label = findViewById<TextView>(R.id.main_label)
        val userData: EditText = findViewById(R.id.user_data)
        val button: Button = findViewById(R.id.button)

        // программный способ перехода
        button.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)

            // получка и перевод
            val fullName = findViewById<EditText>(R.id.edit_text_full_name)?.text.toString()
            val groupNumber = findViewById<EditText>(R.id.edit_text_group)?.text.toString()
            val age = findViewById<EditText>(R.id.edit_text_age)?.text.toString()
            val desiredGrade = findViewById<EditText>(R.id.edit_text_grade)?.text.toString()

            // отладка
            Log.d(TAG, "Передаваемые данные: ФИО=$fullName, Группа=$groupNumber, Возраст=$age, Оценка=$desiredGrade")

            intent.putExtra("FULL_NAME", fullName)
            intent.putExtra("GROUP_NUMBER", groupNumber)
            intent.putExtra("AGE", age)
            intent.putExtra("DESIRED_GRADE", desiredGrade)

            startActivity(intent)
        }



        button.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)

            // инфа от эдитов
            val fullName = findViewById<EditText>(R.id.edit_text_full_name)?.text.toString()
            val groupNumber = findViewById<EditText>(R.id.edit_text_group)?.text.toString()
            val age = findViewById<EditText>(R.id.edit_text_age)?.text.toString()
            val desiredGrade = findViewById<EditText>(R.id.edit_text_grade)?.text.toString()

            // инфа свитчи
            val isBeautiful = findViewById<Switch>(R.id.switch4).isChecked
            val isSmart = findViewById<Switch>(R.id.switch5).isChecked
            val isStrong = findViewById<Switch>(R.id.switch6).isChecked

            // отладки
            Log.d(TAG, "Switches: Красивый=$isBeautiful, Умный=$isSmart, Сильный=$isStrong")

            // Передаём ВСЕ данные
            intent.putExtra("FULL_NAME", fullName)
            intent.putExtra("GROUP_NUMBER", groupNumber)
            intent.putExtra("AGE", age)
            intent.putExtra("DESIRED_GRADE", desiredGrade)

            // свитчи в t/f
            intent.putExtra("IS_BEAUTIFUL", isBeautiful)
            intent.putExtra("IS_SMART", isSmart)
            intent.putExtra("IS_STRONG", isStrong)

            startActivity(intent)
        }
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
    fun onSecondActivityClick(view: View) {
        val intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)
    }
}