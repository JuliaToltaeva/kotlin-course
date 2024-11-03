package com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson18.homework

class Square(

    private val sideOfSquare: Double

) : Shape() {

    override fun area() {

        println("areaOfSquare")
        println(sideOfSquare * sideOfSquare)

    }

}