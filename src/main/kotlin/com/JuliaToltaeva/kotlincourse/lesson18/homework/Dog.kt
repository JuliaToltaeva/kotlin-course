package com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson18.homework

open class Dog : Animal() {

    override fun makeSound() {

        val text = "Bark"
        printText(text, Colors.GREEN)

    }

}