package com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson18.homework

import kotlin.math.sin

class Triangle(

    private val sideOfTriangle1: Double,
    private val sideOfTriangle2: Double,
    private val angleOfTriangle: Double

) : Shape() {

    override fun area() {

        val sinOfAngle = sin(angleOfTriangle)
        val areaOfCircle = 0.5 * sideOfTriangle1 * sideOfTriangle2 * sinOfAngle

        println("areaOfCircle")
        println(areaOfCircle)

    }

}