package com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson17.homework

open class FurnitureType(
    typeOfAppointment: String,
    val purchaseType: String // тип покупки - бюджетная/люкс
) : Furniture(typeOfAppointment)