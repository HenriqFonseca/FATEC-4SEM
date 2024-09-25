package com.example.petscrud

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.activity.ComponentActivity
import com.example.petscrud.models.Pet
import com.google.gson.Gson
import okhttp3.OkHttpClient

class MainActivity : ComponentActivity(){
    val URL_BASE = "https://restapikotlin-default-rtdb.firebaseio.com/"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.create_layout)
        val rawName = findViewById<EditText>(R.id.edtName)
        val rawRace = findViewById<EditText>(R.id.edtRace)
        val rawWeith = findViewById<EditText>(R.id.edtWeight)
        val rawDate = findViewById<EditText>(R.id.edtDate)

        val btnGravar = findViewById<Button>(R.id.btnGravar)
        val btnSearch = findViewById<Button>(R.id.btnSearch)

        val gson = Gson()

        btnGravar.setOnClickListener{
            val pet = Pet(
                name = rawName.text.toString(),
                race = rawRace.text.toString(),
                weight = rawWeith.text.toString(),
                date = rawDate.text.toString()
            )
            val petJson = gson.toJson(pet)
            Log.d("JSONTESTEPORRARARA", "Json: $petJson")
        }
    }
}