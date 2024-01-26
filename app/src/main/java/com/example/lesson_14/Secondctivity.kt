package com.example.lesson_14

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Secondctivity : AppCompatActivity() {
    private  var fragmentText: TextView? = null
    private  var btnHome: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondctivity)
        btnHome = findViewById(R.id.btnHome)
        fragmentText = findViewById(R.id.FragmentText)
        fragmentText?.text = intent.getStringExtra("USER_INPUT_DATA_EXTRA")
        setOnClickListeners()
    }
    private fun setOnClickListeners(){

        btnHome?.setOnClickListener {
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}