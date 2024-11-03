package com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson18.homework

import com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson18.classwork.Colors

//Задания для отработки переопределения методов

fun main() {

    val listAnimal = listOf(
        Bird(),
        Dog(),
        Cat()
    )

    listAnimal.forEach { it.makeSound() }

    fun printColored(text: String, color: String, backgroundColor: String = "") {
        println("$color$backgroundColor$text${Colors.RESET}")
    }


    println("\nNext Task")

    val param = 5.0

    val listFigure = listOf(

        Square(param),
        Circle(param),
        Triangle(1.0, 1.0, 0.52)

    )

    listFigure.forEach { it.area() }


    println("\nNext Task")

    val listPrinter = listOf(

        LaserPrinter(),
        DotMatrixPrinter()

    )

    listPrinter.forEach { it.print("Фраза для вывода на печать слов по словам") }

    println("\nNext Task")

    println(Shoppingcart().itemMap)


    println("\nNext Task")


}


//Задания для отработки перегрузки методов в классах
