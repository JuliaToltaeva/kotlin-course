package com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson10

fun main (){

//Работа с Множествами Set
//Задание 1: Создание Пустого Множества.
//Создайте пустое неизменяемое множество целых чисел.

    val set1 = setOf<Int>()

    println("Задание 1:")
    print(set1.toList())

//Задание 2: Создание и Инициализация Множества.
//Создайте неизменяемое множество целых чисел, содержащее три различных элемента (например, 1, 2, 3).

    val set2 = setOf(1, 2, 3)

    println("\n\nЗадание 2:")
    print(set2.toList())

//Задание 3: Создание Изменяемого Множества.
//Создайте изменяемое множество строк и инициализируйте его несколькими значениями (например, "Kotlin", "Java", "Scala").

    val set3 = mutableSetOf("Kotlin", "Java", "Scala")

    println("\n\nЗадание 3:")
    print(set3.toList())

//Задание 4: Добавление Элементов в Множество.
//Имея изменяемое множество строк, добавьте в него новые элементы (например, "Swift", "Go").

    val set4 = mutableSetOf("NotSwift", "NotGo")

    set4.add("Swift")
    set4.add("Go")

    println("\n\nЗадание 4:")
    print(set4.toList())

//Задание 5: Удаление Элементов из Множества.
//Имея изменяемое множество целых чисел, удалите из него определенный элемент (например, 2).

    val set5 = mutableSetOf(1, 1, 3, 2, 2)

    set5.remove(3)

    println("\n\nЗадание 5:")
    print(set5.toList())

//Задание 6: Перебор Множества в Цикле.
//Создайте множество целых чисел и используйте цикл для вывода каждого элемента на экран.

    val set6 = setOf(1, 1, 3, 2, 2)

    println("\n\nЗадание 6:")

    for (i in set6) {
        print("$i ")
    }

//Задание 7: Проверка Наличия Элемента в Множестве.
//Создай функцию, которая принимает множество строк (set) и строку и проверяет, есть ли в множестве указанная строка.
//Нужно вернуть булево значение true если строка есть. Реши задачу через цикл.

    val set7 = setOf("ю", "л", "и", "я")
    val string = "и"

    println("\n\nЗадание 7:")
    print(getString(set7, string))

//Задание 8: Объединение Двух Множеств.
//Создайте два множества строк и объедините их в одно новое множество, содержащее все уникальные элементы обоих множеств.
//Реши задачу с помощью циклов.

    val set81 = setOf("ю", "л", "и", "я")
    val set82 = setOf("а", "л", "е", "к", "с")
    val setNew = mutableSetOf<String>()

    for (i in set81) {
        setNew.add(i)
    }

    for (i in set82) {
        setNew.add(i)
    }

    println("\n\nЗадание 8:")
    print(setNew)

//Задание 9: Нахождение Пересечения Множеств.
//Создайте два множества целых чисел и найдите их пересечение (общие элементы). Реши задачу через вложенные циклы.

    val set91 = setOf(1, 2, 3, 4, 5)
    val set92 = setOf(3, 4, 5, 6)

    println("\n\nЗадание 9:")

    for (i in set91) {
        for (k in set92) {
            if (i == k) {
                print("$i ")
            }
        }
    }

//Задание 10: Нахождение Разности Множеств.
//Создайте два множества строк и найдите разность первого множества относительно второго.
//(элементы, присутствующие в первом множестве, но отсутствующие во втором).
//Реши задачу через вложенные циклы и переменные флаги.

    val setExt1 = setOf("ю", "л", "и", "я")
    val setExt2 = setOf("а", "л", "е", "к", "с")

    println("\n\nЗадание 10:")

    for (i in setExt1) {
        for (k in setExt2) {
            if (i == k) {
                print("$i ")
            }
        }
    }

//Задание 11: Конвертация Множества в Список.
//Создайте множество строк и конвертируйте его в список с использованием цикла.

    val setExt11 = setOf("ю", "л", "и", "я")

    println("\n\nЗадание 11:")
    print(convertSetInList(setExt11))

}

fun getString(set7: Set<String>, string: String): Boolean{
    for (i in set7.indices){
        if (set7.contains(string)){
            return(true)
        }
    }
    return(false)}

fun convertSetInList(setExt11: Set<String>): List<String>{
    val listExt11 = mutableListOf<String>()

    for (i in setExt11) {
        listExt11.add(i)
    }
    return(listExt11)
}