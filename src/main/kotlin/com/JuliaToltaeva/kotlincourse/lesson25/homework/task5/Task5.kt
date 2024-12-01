package com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson25.homework.task5

import com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson25.homework.task4.func40


//Задание 5. Создай функцию расширение списка чисел, которая будет возвращать список
// уникальных чисел (без дубликатов).
//Создай аналогичную анонимную функцию.
//Создай аналогичное лямбда выражение с указанием типа.
//Проверь, что лямбда выражение работает правильно с помощью нескольких наборов данных.

fun func50(list: List<Int>): List<Int> {

    require(list.isNotEmpty()) { "Пустой список" }
    return list.distinct()

}

fun main() {

    val func51 = fun(list: List<Int>): List<Int> {

        require(list.isNotEmpty()) { "Пустой список" }
        return list.distinct()

    }

    val func52: (List<Int>) -> List<Int> = { list ->

        require(list.isNotEmpty()) { "Пустой список" }
        list.distinct()

    }

    val func53 = { list: List<Int> ->

        require(list.isNotEmpty()) { "Пустой список" }
        list.distinct()

    }

    println(func50(listOf(0, 1, 2, 3, 0, 1, 2, 3)))
    println(func51(listOf(0, 1, 2, 3, 0, 1, 2, 3)))
    println(func52(listOf(0, 1, 2, 3, 0, 1, 2, 3)))
    println(func53(listOf(0, 1, 2, 3, 0, 1, 2, 3)))

    println(func50(listOf()))
    println(func51(listOf()))
    println(func52(listOf()))
    println(func53(listOf()))


}