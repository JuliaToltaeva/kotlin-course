package com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson23.homework

fun main() {

    val string = "string"
    val int = 2211
    val list = listOf(string, int)

    val map = mapOf(
        string to int,
        int to string
    )

    val lounge = 2211L

    println("Задача 1")
    analyzeDataType(string)
    analyzeDataType(int)
    analyzeDataType(list)
    analyzeDataType(map)
    analyzeDataType(lounge)


    println("\nЗадача 2")
    println(safeCastToList(string))
    println(safeCastToList(list))


    println("\nЗадача 3")
    println(getStringLengthOrZero(string))
    println(getStringLengthOrZero(null))
    println(getStringLengthOrZero(int))


    println("\nЗадача 4")
    println(getAnyAndSetSquare(7))
    println(getAnyAndSetSquare(7.0))
    println(getAnyAndSetSquare("7.0"))


}

//Задача 1
//Напишите функцию analyzeDataType, принимающую параметр типа Any.
// Функция должна определить тип аргумента и вывести соответствующее сообщение:
//Для строки: "Это строка: [значение]".
//Для целого числа: "Это целое число: [значение]".
//Для списка: "Это список, количество элементов: [количество]".
//Для карты: "Это карта, количество пар: [количество]".
//Для остальных типов: "Неизвестный тип данных".
//Используйте оператор is для проверки типов.

fun analyzeDataType(arg1: Any) {

    when (arg1) {

        is String -> println("Это строка: $arg1")
        is Int -> println("Это целое число: $arg1")
        is List<*> -> println("Это список, количество элементов: ${arg1.size}")
        is Map<*, *> -> println("Это карта, количество пар: ${arg1.size}")
        else -> println("Неизвестный тип данных")

    }

}


//Задача 2
//Создайте функцию safeCastToList, принимающую параметр типа Any и возвращающую
// размер списка, если аргумент можно безопасно привести к типу List.
// В случае неудачного приведения функция должна возвращать -1.
//Используйте as? для безопасного приведения типа.

fun safeCastToList(arg2: Any): Int {

    val list = arg2 as? List<*>

    return list?.size ?: -1

}


//Задача 3
//Создайте функцию getStringLengthOrZero, которая принимает параметр типа Any?
// и возвращает длину строки, если аргумент можно привести к типу String.
// В случае, если аргумент равен null или не является строкой, функция должна
// возвращать 0.

fun getStringLengthOrZero(arg3: Any?): Int {

    val string3 = arg3 as? String

    return string3?.length ?: 0

}


//Задача 4
//Создайте функцию, которая принимает параметр типа Any.
//Функция гарантированно ожидает число (в виде числа или строки, например 4
// или 4.2 или “4.2”) и должна вернуть квадрат этого числа. Если придёт число,
// его нужно возвести в квадрат, если придёт строка, то его нужно преобразовать
// в число через функцию toDouble() и возвести в квадрат.

fun getAnyAndSetSquare(arg4: Any): Number {

    return when (arg4) {

        is Int -> arg4 * arg4
        is Double -> arg4 * arg4
        is Float -> arg4 * arg4

        is String -> (arg4.toDouble() * arg4.toDouble())
        else -> throw Exception("")

    }

}


//Задача 5
//Напишите функцию sumIntOrDoubleValues, которая принимает список элементов
// типа Any и возвращает сумму всех целочисленных (Int) и вещественных (Double)
// значений в списке. Все остальные типы должны быть проигнорированы.


//Задача 6
//Создайте функцию tryCastToListAndPrint, которая принимает параметр типа Any
// и пытается привести его к типу List<*>. Если приведение успешно, функция
// должна напечатать все строки из списка, если элемент не является строкой
// то вывести предупреждение об этом. Если приведение неудачно, должно быть
// выведено сообщение об ошибке, не прерывая выполнение программы.
