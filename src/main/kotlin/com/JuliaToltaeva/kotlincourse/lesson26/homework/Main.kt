package com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson26.homework

fun main() {

    val func11: () -> Unit = { println("репка") }
    func1(func11)

    val func21: (Int) -> String = { "дедка" }
    func2(func21)

    val func31: Int.(String) -> Boolean = { false }
    func3(func31)

    val func41: (Double, Double) -> Boolean = { arg1, arg2 ->
        arg1 == arg2
    }
    func4(func41)

    val func51: (Int) -> List<Int> = { listOf(2, 0, 1, 4) }
    func5(func51, 2024)

    val func61: (String) -> (Int) -> Boolean = { arg1 ->
        { arg2 ->
            arg1 == arg2.toString()
        }
    }
    func6(func61)

    val func71: (
        list: List<Int>,
        set: Set<String>) -> Map<String, Int> = { list, set -> mapOf(
            "1" to 1,
            "2" to 2
        )
    }

    val list = listOf(1, 2)
    val set = setOf("1", "2")

    func7(list, set, func71)


}

//Напишите функцию, которая принимает другую функцию без аргументов и возвращаемого значения.

fun func1(func10: () -> Unit) {

    func10()

}

//Создайте функцию, принимающую функцию с одним аргументом типа Int и возвращающую String.

fun func2(func20: (Int) -> String) {

    println(func20(2024))

}

//Реализуйте функцию, принимающую функцию расширения типа Int, принимающую String и возвращающую Boolean.

fun func3(func30: Int.(String) -> Boolean) {

    println(2024.func30("внучка"))

}

//Напишите функцию, которая принимает функцию с двумя аргументами типа Double и возвращает Boolean.

fun func4(func40: (Double, Double) -> Boolean) {

    println(func40(0.0, 0.1))

}

//Напишите функцию, которая принимает функцию с одним аргументом-дженериком T и возвращает List<T>.

fun <T> func5(func50: (T) -> List<T>, arg: T) {

    val result = func50(arg)
    println(func50(arg))

}

//Создайте функцию, принимающую функцию с аргументом типа String и возвращающую другую функцию, принимающую Int и
//возвращающую Boolean.

fun func6(func60: (String) -> (Int) -> Boolean) {

    println(func60("собачка"))
    //сигнатура правильная, но в консоли не то

}

//Напишите функцию, которая принимает список чисел, множество строк, функцию с аргументами типа List<Int> и Set<String> и
//возвращающую Map<String, Int>.

fun func7(
    list: List<Int>,
    set: Set<String>,
    func70: (List<Int>, Set<String>) -> Map<String, Int>
) {

    println(func70(list, set))

}

//Напишите функцию, возвращающую строку, принимающую число и функцию, принимающую число и возвращающую строку


//Напишите функцию, принимающую функцию, которая возвращает функцию без аргументов и возвращаемого значения.


