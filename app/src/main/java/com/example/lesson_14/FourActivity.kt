package com.example.lesson_14

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class FourActivity : AppCompatActivity() {
    private var etUser: EditText? = null
    private var etEmail: EditText? = null
    private var etPhone: EditText? = null
    private  var btnNext: Button? = null
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_four)
        etUser = findViewById(R.id.etUserName)
        etEmail = findViewById(R.id.etEmail)
        etPhone = findViewById(R.id.etPhone)
        btnNext = findViewById(R.id.btnPassText)
        setOnClickListeners()

    }
    private fun setOnClickListeners(){

        btnNext?.setOnClickListener {
            var intent = Intent(this, FiveActivity::class.java)
            intent.putExtra("USER_NAME", etUser?.text.toString())
            intent.putExtra("USER_EMAIL", etEmail?.text.toString())
            intent.putExtra("USER_PHONE", etPhone?.text.toString())
            startActivity(intent)
        }
    }
}