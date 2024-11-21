package com.example.petscrud.activity

import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import com.example.petscrud.R
import com.example.petscrud.models.Pet
import com.google.gson.Gson
import okhttp3.Call
import okhttp3.Callback
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttp
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response
import java.io.IOException
import java.time.LocalDate
import java.time.format.DateTimeFormatter

class PetActivity() : Activity() {
    val lista = ArrayList<Pet>()
    val URL_BASE = "https://restapikotlin-default-rtdb.firebaseio.com/"
    val formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy")
    val clienteHttp = OkHttpClient()
    val gson = Gson()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.pet_layout)
        val rawName = findViewById<EditText>(R.id.edtName)
        val rawRace = findViewById<EditText>(R.id.edtRace)
        val rawWeight = findViewById<EditText>(R.id.edtWeight)
        val rawDate = findViewById<EditText>(R.id.edtDate)

        val btnGravar = findViewById<Button>(R.id.btnGravar)
        val btnSearch = findViewById<Button>(R.id.btnSearch)

        val gson = Gson()
        val client = OkHttpClient()

        btnGravar.setOnClickListener {
            val pet = Pet(
                name = rawName.text.toString(),
                race = rawRace.text.toString(),
                weight = rawWeight.text.toString().toFloat(),
                date = LocalDate.now()
            )
            val petJson = gson.toJson(pet)
            Log.d("AGENDA", "JSON CRIADO: $petJson")
            lista.add(pet)
            Log.v("TESTE", lista.toString())
        }

        fun carregarFirebase(){
            val request = Request.Builder().get().url("$URL_BASE/pets.json").build()

            val response = object : Callback{
                override fun onFailure(call: Call, e: IOException) {
                    Log.e("PET", "Erro ao ler os dados", e)
                }

                override fun onResponse(call: Call, response: Response) {

                }

            }
            clienteHttp.newCall(request).enqueue(response)
        }

        fun salvarFirebase(p : Pet){
            val request = Request.Builder()
                .post(petJson.toRequestBody("application/json".toMediaType()))
                .url("$URL_BASE/pets.json").build()

            val response = object : Callback{
                override fun onFailure(call: Call, e: IOException) {
                    TODO("Not yet implemented")
                }

                override fun onResponse(call: Call, response: Response) {
                    TODO("Not yet implemented")
                }
            }
        }
    }
}