package com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson25.homework.task2


//Задание 2. Создай функцию, которая принимает список чисел и возвращает среднее
// арифметическое этого списка. С помощью require проверь, что список не пустой.

//Проверь, что лямбда выражение работает правильно с помощью нескольких наборов
// данных (в том числе пустого).

fun func20(list: List<Int>): Double {

    require(list.isNotEmpty()) { "Пустой список" }
    return list.average()

}

fun main() {

    //Создай аналогичную анонимную функцию.

    val func21 = fun(list: List<Int>): Double {

        require(list.isNotEmpty()) { "Пустой список" }
        return list.average()

    }

    //Создай аналогичное лямбда выражение с указанием типа.

    val func22: (List<Int>) -> Double = {

        require(it.isNotEmpty()) { "Пустой список" }
        it.average()

    }


    //Создай лямбда выражение без указания типа.

    val func23 = { list: List<Int> ->
        require(list.isNotEmpty()) { "Пустой список" }
        list.average()
    }


    println(func20(listOf(0, 1, 2, 3, 4)))
    println(func21(listOf(0, 1, 2, 3, 4)))
    println(func22(listOf(0, 1, 2, 3, 4)))
    println(func23(listOf(0, 1, 2, 3, 4)))

    println(func20(listOf(1, 0, 1, 0, 1)))
    println(func21(listOf(1, 0, 1, 0, 1)))
    println(func22(listOf(1, 0, 1, 0, 1)))
    println(func23(listOf(1, 0, 1, 0, 1)))


    println(func20(listOf()))
    println(func21(listOf()))
    println(func22(listOf()))
    println(func23(listOf()))


}