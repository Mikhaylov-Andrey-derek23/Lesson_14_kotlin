package com.example.lesson_14

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

//Темы: LineLayout, передача данных между Activity
class MainActivity : AppCompatActivity() {

    private var btnSendInfo : Button? = null
    private var editTextToPass: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnSendInfo = findViewById(R.id.btnSendInfo)
        editTextToPass = findViewById(R.id.etEditTextToPass)
        setOnClickListeners()

    }
    private fun setOnClickListeners(){

        btnSendInfo?.setOnClickListener {
            var intent = Intent(this, Secondctivity::class.java)
            intent.putExtra("USER_INPUT_DATA_EXTRA", editTextToPass?.text.toString())
            startActivity(intent)
        }
    }
}