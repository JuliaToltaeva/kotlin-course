package com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson18.homework

open class Cat : Animal() {

    override fun makeSound() {

        val text = "Meow"
        printText(text, Colors.RED)

    }

}