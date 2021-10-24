package com.kururu.homeworks

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var number1: EditText
    lateinit var number2: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))
        number1 = findViewById(R.id.editText)
        number2 = findViewById(R.id.editText2)

    }

    fun onButtonClicked(view: View) {

        try {
            var num1:Int = Integer.parseInt(number1.text.toString())
            var num2:Int = Integer.parseInt(number2.text.toString())
           var result = num1+num2


            val i = Intent(this, ResultActivity::class.java).apply {
                putExtra("result",result.toString())
            }

            startActivity(i)
        } catch (e:Exception){
            Toast.makeText(this@MainActivity , "Invalid Operation" , Toast.LENGTH_LONG).show()
        }





    }
}