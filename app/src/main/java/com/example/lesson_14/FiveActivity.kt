package com.example.lesson_14

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class FiveActivity : AppCompatActivity() {
    private  var btnNavigateFirstScreen: Button? = null
    private  var nameUser: TextView? = null
    private  var email: TextView? = null
    private  var phone: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_five)
        btnNavigateFirstScreen = findViewById(R.id.btnNavigateToFirstActivity)
        nameUser = findViewById(R.id.userName)
        nameUser?.text = intent.getStringExtra("USER_NAME").toString()

        email = findViewById(R.id.userEmail)
        email?.text = intent.getStringExtra("USER_EMAIL").toString()

        phone = findViewById(R.id.userPhone)
        phone?.text = intent.getStringExtra("USER_PHONE").toString()

        setOnClickListeners()
    }
    private fun setOnClickListeners(){

        btnNavigateFirstScreen?.setOnClickListener {
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}