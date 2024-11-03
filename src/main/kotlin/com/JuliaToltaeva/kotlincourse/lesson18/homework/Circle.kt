package com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson18.homework

class Circle(

    private val radiusOfCircle: Double

) : Shape() {

    override fun area() {

        println("areaOfCircle")
        println(3.14 * radiusOfCircle * radiusOfCircle)

    }

}