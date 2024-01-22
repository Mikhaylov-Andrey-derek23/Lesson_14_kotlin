package com.example.lesson_14

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class ThirdActivity : AppCompatActivity() {
    private  var btnNavigateFirstScreen: Button? = null
    private var btnNext: Button? = null
    private  var fragmentText: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        btnNavigateFirstScreen = findViewById(R.id.btnNavigateToFirstActivity)
        btnNext = findViewById(R.id.btnNavigateToFourActivity)
        fragmentText = findViewById(R.id.FragmentText)
        fragmentText?.text = intent.getStringExtra("USER_INPUT_DATA_EXTRA")
        setOnClickListeners()
    }
    private fun setOnClickListeners(){

        btnNavigateFirstScreen?.setOnClickListener {
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        btnNext?.setOnClickListener {
            var intent = Intent(this, FourActivity::class.java)
            startActivity(intent)
        }
    }
}