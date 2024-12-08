package com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson27.homework

class Employee(val name: String, val age: Int, private val position: String) {
    var email: String = ""
    var department: String = "General"

    override fun toString(): String {
        return "Employee(name='$name', age=$age, position='$position', email='$email', department='$department')"
    }
}