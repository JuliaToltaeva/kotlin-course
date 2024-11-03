package com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson18.homework

class Bird : Animal() {

    override fun makeSound() {

        val text = "Tweet"
        printText(text, Colors.BLUE)

    }
}