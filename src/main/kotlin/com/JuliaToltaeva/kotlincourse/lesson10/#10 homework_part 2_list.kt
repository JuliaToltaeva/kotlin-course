package com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson10

fun main() {

//Работа со списками List
//Задание 1: Создание Пустого Списка
//Создайте пустой неизменяемый список целых чисел.

    val list1 = listOf<Int>()

    println("Задание 1:")
    print(list1.toList())

//Задание 2: Создание и Инициализация Списка
//Создайте неизменяемый список строк, содержащий три элемента (например, "Hello", "World", "Kotlin").

    val list2 = listOf("Hello", "World", "Kotlin")

    println("\n\nЗадание 2:")
    print(list2.toList())

//Задание 3: Создание Изменяемого Списка
//Создайте изменяемый список целых чисел и инициализируйте его значениями от 1 до 5.

    val list3 = mutableListOf(1, 2, 3, 4, 5)

    println("\n\nЗадание 3:")
    print(list3.toList())

//Задание 4: Добавление Элементов в Список
//Имея изменяемый список целых чисел, добавьте в него новые элементы (например, 6, 7, 8).

    list3.add(6)
    list3.add(7)
    list3.add(8)

    println("\n\nЗадание 4:")
    print(list3.toList())

//Задание 5: Удаление Элементов из Списка
//Имея изменяемый список строк, удалите из него определенный элемент (например, "World").

    val list5 = mutableListOf("Russia", "is", "the", "biggest", "country", "in", "the", "...", "World")
    list5.remove("World")

    println("\n\nЗадание 5:")
    print(list5.toList())

//Задание 6: Перебор Списка в Цикле
//Создайте список целых чисел и используйте цикл для вывода каждого элемента на экран.

    val list6 = listOf(1, 3, 5, 7, 9)

    println("\n\nЗадание 6:")

    for (i in list6.indices) {
        print("${list6[i]} ")
    }

//Задание 7: Получение Элементов Списка по Индексу
//Создайте список строк и получите из него второй элемент, используя его индекс.

    val list7 = listOf("a", "b", "c", "d", "e")

    println("\n\nЗадание 7:")
    print(list7[1])

//Задание 8: Перезапись Элементов Списка по Индексу
//Имея изменяемый список чисел, измените значение элемента на определенной позиции
//(например, замените элемент на позиции 2 на новое значение).

    val list8 = mutableListOf("a", "b", "c", "d", "e")

    list8[2] = "f"

    println("\n\nЗадание 8:")
    print(list8[2])

//Задание 9: Объединение Двух Списков
//Создайте два списка строк и объедините их в один новый список, содержащий элементы обоих списков.
//Реши задачу с помощью циклов.

    val list91 = listOf("a", "b", "c", "d", "e")
    val list92 = listOf("0", "1", "c", "1", "0")
    val listNew9 = mutableListOf<String>()

    for (i in list91) {
        listNew9.add(i)
    }

    for (i in list92) {
        listNew9.add(i)
    }

    println("\n\nЗадание 9:")
    print(listNew9.toList())

//Задание 10: Нахождение Минимального/Максимального Элемента
//Создайте список целых чисел и найдите в нем минимальный и максимальный элементы используя цикл.

    val list10 = listOf(1, 3, 2, 7, 9)
    var maxNum = list10[0]
    var minNum = list10[0]

    for (i in list10.indices) {
        if (i == list10.lastIndex) {
            print("")
        } else {
            maxNum = maxOf(list10[i], list10[i + 1])
            minNum = minOf(list10[i], list10[i + 1])
        }
    }

        println("\n\nЗадание 10:")
        println("max: $maxNum")
        println("min: $minNum")

//Задание 11: Фильтрация Списка
//Имея список целых чисел, создайте новый список, содержащий только четные числа из исходного списка используя цикл.

        val list11 = listOf(1, 2, 5, 4, 9)
        val listNew11 = mutableListOf<Int>()

        for (i in list11.indices) {
            if (list11[i] % 2 == 0) {
                listNew11.add(i)
            }
        }

        println("\nЗадание 11:")
        print(listNew11)
}

