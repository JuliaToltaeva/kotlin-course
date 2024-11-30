package com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson25.homework.task1

//Задание 1. Создай константу в файле с текстом.
//Проверь как функция работает

const val TEXT = "константа в файле с текстом"

//Создай функцию, которая ничего не принимает и не возвращает и печатает в
//консоль текст константы.

fun func10() {

    println(TEXT)

}

fun main() {

    func10()

    //Создай аналогичную анонимную функцию.

    val func11 = fun() {

        println(TEXT)

    }

    func11()

    //Создай аналогичное лямбда выражение с указанием типа.

    val func12: () -> Unit = {

        println(TEXT)

    }

    func12()

    //Создай лямбда выражение без указания типа.

    val func13 = { println(TEXT) }

    func13()

}