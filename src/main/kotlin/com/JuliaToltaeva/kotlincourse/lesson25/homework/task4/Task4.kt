package com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson25.homework.task4


//Задание 4. Создай функцию, которая принимает большое число и возвращает сумму
// цифр этого числа.
//По аналогии с предыдущим заданием выполни трансформации и проверки.
//Подсказка: для парсинга строки “3” в число 3 можно использовать “3”.digitToInt()

fun func40(arg: String): Int {

    require(arg.isNotEmpty()) { "Пустой список" }
    return arg.sumOf { it.digitToInt() }

}

fun main() {

    val func41 = fun(arg: String): Int {

        require(arg.isNotEmpty()) { "Пустой аргумент" }
        return arg.sumOf { it.digitToInt() }

    }

    val func42: (String) -> Int = {

        require(it.isNotEmpty()) { "Пустой аргумент" }
        it.sumOf { it.digitToInt() }

    }

    val func43 = { arg: String ->

        require(arg.isNotEmpty()) { "Пустой аргумент" }
        arg.sumOf { it.digitToInt() }

    }

    println(func40("123"))
    println(func41("123"))
    println(func42("123"))
    println(func43("123"))

    println(func40("1"))
    println(func41("1"))
    println(func42("1"))
    println(func43("1"))

    println(func40(""))
    println(func41(""))
    println(func42(""))
    println(func43(""))

}

