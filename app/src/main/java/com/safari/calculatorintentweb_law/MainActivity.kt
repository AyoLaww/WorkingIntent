package com.safari.calculatorintentweb_law

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    var ButtonCalc:Button ?= null
    var ButtonInt:Button ?= null
    var ButtonWeb:Button ?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ButtonCalc = findViewById(R.id.btn_calc)
        ButtonCalc!!.setOnClickListener {
            val intent = Intent(this,calculatoractivity::class.java)
            startActivity(intent)
        }

       ButtonInt = findViewById(R.id.btn_intent)
        ButtonInt!!.setOnClickListener {
            val intent = Intent(this,intentactivity::class.java)
            startActivity(intent)
        }

        ButtonWeb = findViewById(R.id.btn_web)
        ButtonWeb!!.setOnClickListener {
            val intent = Intent(this,webactivity::class.java)
            startActivity(intent)
        }
    }
}