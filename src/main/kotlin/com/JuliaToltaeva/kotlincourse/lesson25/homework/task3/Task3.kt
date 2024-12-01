package com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson25.homework.task3


//Задание 3. Создай функцию, которая принимает список строк и число, а возвращает
// список из строк, длина которых больше или равна заданному числу. Если список
// пуст, нужно выкинуть исключение.
//По аналогии с предыдущим заданием выполни трансформации и проверки.

fun func30(list: List<String>, arg: Int): List<String> {

    require(list.isNotEmpty()) { "Пустой список" }

    return list.filter { it.length >= arg }

}

fun main() {

    val func31 = fun (list: List<String>, arg: Int): List<String> {

        require(list.isNotEmpty()) { "Пустой список" }

        return list.filter { it.length >= arg }
    }


    val func32: (List<String>, Int) -> List<String> = { list, arg ->

        require(list.isNotEmpty()) { "Пустой список" }

        list.filter { it.length >= arg }
    }


    val func33 = { list: List<String>, arg: Int ->

        require(list.isNotEmpty()) { "Пустой список" }

        list.filter { it.length >= arg }

    }

    println(func30(listOf("1", "02", "003", "02"), 2))
    println(func31(listOf("1", "02", "003", "02"), 2))
    println(func32(listOf("1", "02", "003", "02"), 2))
    println(func33(listOf("1", "02", "003", "02"), 2))

    println(func30(listOf(), 2))
    println(func31(listOf(), 2))
    println(func32(listOf(), 2))
    println(func33(listOf(), 2))


}