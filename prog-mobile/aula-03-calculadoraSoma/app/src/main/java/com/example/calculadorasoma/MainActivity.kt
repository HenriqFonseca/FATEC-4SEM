package com.example.calculadorasoma

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?){

        super.onCreate(savedInstanceState)
        Log.v("CALCULADORA", "Activity criada on create")
        setContentView(R.layout.activity_main)

        val rawNum1 = findViewById<EditText>(R.id.num1)
        val rawNum2 = findViewById<EditText>(R.id.num2)

        val sumBtn = findViewById<Button>(R.id.sumBtn)
        val rawResult = findViewById<TextView>(R.id.result)

        sumBtn.setOnClickListener{
            var num1 = rawNum1.text.toString().toDouble()
            var num2 = rawNum2.text.toString().toDouble()
            rawResult.text = "Resultado: ${num1 + num2}"

            Log.v("OLHA AQUI O NUMERO UM", "Resultado: ${num1}")
        }
    }

}