package com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson31.homework.json

data class Employee(
    val name: String,
    val status: String,
    val birthday: String,
    val position: CharacterTypes,
    val employee: List<Employee>
)