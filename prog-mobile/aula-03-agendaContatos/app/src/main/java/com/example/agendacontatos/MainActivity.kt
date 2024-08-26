package com.example.agendacontatos

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rawName = findViewById<EditText>(R.id.idName)
        val rawPhone = findViewById<EditText>(R.id.idPhone)
        val rawEmail = findViewById<EditText>(R.id.idEmail)

        val saveBtn = findViewById<Button>(R.id.saveBtn)

        saveBtn.setOnClickListener(){
            var phone = rawPhone.text.toString()
            Log.v("AGENDA", "Nome: ${rawName.text}, Telefone: $phone, Email: ${rawEmail.text}")
        }

    }
}