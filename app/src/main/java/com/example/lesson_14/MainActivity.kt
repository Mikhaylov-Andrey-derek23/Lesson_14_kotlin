package com.example.lesson_14

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

//Темы: LineLayout, передача данных между Activity
class MainActivity : AppCompatActivity() {

    private  var btnPassText: Button? = null
    private  var fragmentText: TextView? = null
    private var editTextToPass: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnPassText = findViewById(R.id.btnPassText)
        fragmentText = findViewById(R.id.FragmentText)
        editTextToPass = findViewById(R.id.etEditTextToPass)
        setOnClickListeners()

    }
    private fun setOnClickListeners(){

        btnPassText?.setOnClickListener {
            var intent = Intent(this, Secondctivity::class.java)
            intent.putExtra("USER_INPUT_DATA_EXTRA", editTextToPass?.text.toString())
            startActivity(intent)
        }
    }
}