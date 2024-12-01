package com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson25.homework.task6


//Задание 6. Создай функцию расширение словаря из строк и чисел, которая принимает
// число и возвращает список ключей, длина которых меньше их значений но больше
// заданного в функции аргумента. В случае если список получается пустой нужно
// выкинуть исключение IllegalState.
//По аналогии с предыдущим заданием выполни трансформации и проверки.

fun Map<String, Int>.func60(arg: Int): List<String> {

    val list = this.filter { (key, value) ->
        key.length in (arg + 1) until value
    }.keys.toList()

    if (list.isEmpty()) {
        throw IllegalStateException()
    }

    return list

}

fun main() {

    val func61 = fun(arg: Int, map: Map<String, Int>): List<String> {

        val list = map.filter { (key, value) ->
            key.length in (arg + 1) until value
        }.keys.toList()

        if (list.isEmpty()) {
            throw IllegalStateException()
        }

        return list

    }

    val func62: (Int, Map<String, Int>) -> List<String> = { arg, map ->

        val list = map.filter { (key, value) ->
            key.length in (arg + 1) until value
        }.keys.toList()

        if (list.isEmpty()) {
            throw IllegalStateException()
        }

       list

    }

    val func63 = { arg: Int, map: Map<String, Int> ->

        val list = map.filter { (key, value) ->
            key.length in (arg + 1) until value
        }.keys.toList()

        if (list.isEmpty()) {
            throw IllegalStateException()
        }

        list

    }


}
