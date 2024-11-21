package com.example.petscrud.models

import java.time.LocalDate

data class Pet (
    var name : String = "",
    var race : String = "",
    var weight : Float = 0.0f,
    var date : LocalDate = LocalDate.now()
)
