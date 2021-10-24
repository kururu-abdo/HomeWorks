package com.kururu.homeworks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class ResultActivity : AppCompatActivity() {

    lateinit var opr: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val intentValue = intent.getStringExtra("result")


        opr = findViewById(R.id.opr)
        opr.text = intentValue.toString()
    }
}