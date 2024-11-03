package com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson18.homework

import com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson18.classwork.printColored1

//Животные и Их Звуки
//Базовый класс: Animal с методом makeSound().
//Классы наследники: Dog, Cat, Bird.
//Базовый метод makeSound() в классе Animal выводит "This animal makes no sound."
//Переопределите метод makeSound() в каждом классе-наследнике,
//чтобы Dog выводил "Bark", Cat - "Meow", Bird - "Tweet".

//Обогати вывод звуков цветом.
//Создайте список животных List<Animal> и вызовите в цикле метод makeSound()

open class Animal {

    open fun makeSound() {

        println("This animal makes no sound.")

    }

    fun printText(text: String, color: String) {

        printColored1("This animal makes $text sound", color)

    }


}