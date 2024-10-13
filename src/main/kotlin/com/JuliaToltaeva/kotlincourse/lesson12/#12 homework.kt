package com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson12

fun main() {

    val list = listOf(1, 2, -1, 3, 4, 5)
    val list7 = listOf(1, 2, 3, 4, 5, null)
    val procList = listOf("1", "2", null, "3" )

    println("Задание 1:")
    println(function1())

    println("\nЗадание 2:")
    println(function2(1, 2))

    println("\nЗадание 3:")
    println(function3("Строка"))

    println("\nЗадание 4:")
    println(function4(list))

    println("\nЗадание 5:")
    println(function5("длина строки 15"))

    println("\nЗадание 6:")
    println(function6())

    println("\nЗадание 7:")
    println(function7(list7))

    println("\nЗадание 8:")
    println(function8(0))

    println("\nЗадание 9:")
    println(function9())

    println("\nЗадание 10:")
    println(function10("", 0))

    println("\nmultiplyByTwo:")
    println(multiplyByTwo(5))

    println("\nisEven:")
    println(isEven(5))

    println("\nprintNumbersUntil:")
    println(printNumbersUntil(3))

    println("\nfindFirstNegative:")
    println(findFirstNegative(list))

    println("\nprocessList:")
    println(processList(procList))

    println("\ndrawRectangle")
    println(drawRectangle(7,7))
}

//Напиши валидную сигнатура метода
//Напишите сигнатуру функции, которая не принимает аргументов и не возвращает значения.

fun function1() = Unit

//Напишите сигнатуру функции, которая принимает два целых числа и возвращает их сумму.

fun function2(a: Int, b: Int): Int{
    return(a + b)
}

//Напишите сигнатуру функции, которая принимает строку и ничего не возвращает.

fun function3(string: String) = Unit

//Напишите сигнатуру функции, которая принимает список целых чисел и возвращает среднее значение типа Double.

fun function4(list: List<Int>): Double{
    var sum = 0
    for (i in list.indices){
        sum += list[i]
    }
    val average = (sum / (list.lastIndex + 1)).toDouble()
    return(average)
}

//Напишите сигнатуру функции, которая принимает nullable строку и возвращает её длину в виде nullable целого числа.

fun function5(string5: String) : Int? {
    val length = string5.length
    return length
}

//Напишите сигнатуру функции, которая не принимает аргументов и возвращает nullable вещественное число.

fun function6() : Float? {
    val a = null
    return a
}

//Напишите сигнатуру функции, которая принимает nullable список целых чисел и не возвращает значения.

fun function7(list7: List<Int?>) = Unit

//Напишите сигнатуру функции, которая принимает целое число и возвращает nullable строку.

fun function8(a: Int): String?{
    val string = null
    return string
}

//Напишите сигнатуру функции, которая не принимает аргументов и возвращает список nullable строк.

fun function9(): List<String?>{
    val list = listOf("1", "2", "3", null)
    return list
}

//Напишите сигнатуру функции, которая принимает nullable строку и nullable целое число и возвращает nullable
//булево значение.

fun function10(string: String?, int: Int?): Boolean?{
    val a = null
    return a
}


//Напиши рабочий код для следующих задач:
//Задача 1:
//Напишите функцию multiplyByTwo, которая принимает целое число и возвращает его, умноженное на 2.

fun multiplyByTwo(int: Int): Int{
    return int * 2
}

//Задача 2:
//Создайте функцию isEven, которая принимает целое число и возвращает true, если число чётное,
//и false в противном случае.

fun isEven(int: Int): Boolean{
    if (int % 2 == 0) return true
    else return false
}

//Задача 3:
//Напишите функцию printNumbersUntil, которая принимает целое число n и выводит на экран числа от 1 до n.
//Если число n меньше 1, функция должна прекратить выполнение с помощью return без вывода сообщений.

fun printNumbersUntil(n: Int): MutableList<Int> {
    val list = mutableListOf<Int>()
    if (n >= 1) {
        for (i in 0..<n) {
            val i = i + 1
            list.add(i)
        }
    }
    return list
}

//Задача 4:
//Создайте функцию findFirstNegative, которая принимает список целых чисел и возвращает первое отрицательное
//число в списке. Если отрицательных чисел нет, функция должна вернуть null.

fun findFirstNegative(list: List<Int>): Int?{
    for (i in list.indices){
        if (list[i] <= 0) {
            return list[i]}
        }
    return null
}

//Задача 5:
//Напишите функцию processList, которая принимает список строк.
//Функция должна проходить по списку и выводить каждую строку. Если встречается null значение,
//функция должна прекратить выполнение с помощью return без возврата значения.

fun processList(procList: List<String?>) : String?{
    for (i in procList.indices){
        if (procList[i] == null) {
            return null}
        else println(procList[i])
    }
    return "Конец"
}

//Сделай рефакторинг функции, через определение вспомогательных приватных функций.
//Требуется избавиться от дублирования кода и трудно воспринимаемых фрагментов.
//Сначала сделай запуск функции и посмотри на результат её работы.
//Сделай запуск после рефакторинга и проверь, чтобы результат работы был аналогичным.

private fun checkSize(size: Int, name: String){
    if (size <= 0) throw IllegalArgumentException("$name должно быть положительным и больше нуля")
}

private fun makeHorizontalLine(width: Int){
    var line = "+"
    for (i in 1 until width - 1) {
        line += "-"
    }
    line += "+\n"
    print(line)
}

private fun verticalLine(height: Int, width: Int){
    for (i in 1 until height - 1) {
        var middleLine = "|"
        for (j in 1 until width - 1) {
            middleLine += " "
        }
        middleLine += "|\n"
        print(middleLine)
    }
}

fun drawRectangle(width: Int, height: Int) {
    checkSize(width, "width")
    checkSize(height, "height")

    // Верхняя граница
    makeHorizontalLine(width)

    // Боковые границы
    verticalLine(height, width)

    // Нижняя граница
    makeHorizontalLine(width)
}