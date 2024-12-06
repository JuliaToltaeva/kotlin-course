package com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson26.homework.part2

fun main() {

    val listOfString = listOf("1", "2", "3")
    val listOfInt = listOf(1, 2, 3)

    val funcFilter1: (String) -> Boolean = {
        it.contains("2")
    }
    val funcFilter2: (String) -> Boolean = {
        it.length == 1
    }

    val result1 = filterStrings(listOfString, funcFilter1)
    val result2 = filterStrings(listOfString, funcFilter2)

    println(result1)
    println(result2)



    val arg01: (Int) -> Int = { it + 1 }
    val arg02: (Int) -> Int = { it * 2 }

    val resultList1 = applyToNumbers(listOfInt, arg01)
    val resultList2 = applyToNumbers(listOfInt, arg02)

    println(resultList1)
    println(resultList2)



    val arg1: (Int) -> Boolean = { it %2 != 0 }
    val arg2: (Int) -> Boolean = { it >= 1 }

    val resultSum1 = sumByCondition(listOfInt, arg1)
    val resultSum2 = sumByCondition(listOfInt, arg2)

    println(resultSum1)
    println(resultSum2)


}

//Задания на разработку кода
//Напишите функцию filterStrings, которая принимает список строк и функцию-фильтр, оставляющую только строки,
// удовлетворяющие условию (то-есть принимающая строку и возвращающая булево значение). Функция должна вернуть результат
// фильтрации исходного списка строк.

fun filterStrings(

    list: List<String>,
    funcFilter: (String) -> Boolean

): List<String> {

    return list.filter(funcFilter)

}


//Создайте функцию applyToNumbers, которая принимает список чисел и функцию, преобразующую каждое число в другое число
// (те-есть принимающая число и возвращающая число). Функция должна вернуть результат преобразования исходного списка
// чисел.

fun applyToNumbers(

    list: List<Int>,
    arg: (Int) -> Int

): List<Int> {

    return list.map(arg)

}


//Реализуйте функцию sumByCondition, которая принимает список чисел и функцию, определяющую условие для включения числа
// в сумму. Функция должна вернуть сумму чисел, прошедших проверку.

fun sumByCondition(

    list: List<Int>,
    arg: (Int) -> Boolean

): Int {

    return list.filter(arg).sum()
}


//Напишите функцию combineAndTransform, которая принимает две коллекции одного типа и функцию для их объединения и
// преобразования в одну коллекцию другого типа. Функция должна вернуть результат преобразования (коллекцию второго типа)
//
//⚡ Для последних четырёх заданий сделать минимум по две разные реализации лямбда функций и проверить работу на разных
// наборах данных

fun <T, R> combineAndTransform(

    list1: List<T>,
    list2: List<T>,
    combinator: (T, T) -> R

): List<R> {

    val size = list1.size + list2.size
    val result = mutableListOf<R>()

    for (i in 0 until size) {
        result.add(combinator(list1[i], list2[i]))
    }

    return result

}




