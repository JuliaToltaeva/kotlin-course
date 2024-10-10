package com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson11

import com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson10.getArray
import javax.xml.crypto.Data

fun main(){

//Задания в целом повторяют задачи с урока и служат для закрепления навыка,
//поэтому стараемся выполнять без переписывания с урока.
//Задание 1: Создание Пустого Словаря
//Создайте пустой неизменяемый словарь, где ключи и значения - целые числа.

    val map1 = mapOf <Int, Int>()

    println("Задание 1:")
    println(map1)

//Задание 2: Создание и Инициализация Словаря
//Создайте словарь, инициализированный несколькими парами "ключ-значение", где ключи - float, а значения - double

    val map2 = mapOf(
        0F to 0.0,
        1F to 1.0
    )

    println("\nЗадание 2:")
    println(map2)

//Задание 3: Создание Изменяемого Словаря
//Создайте изменяемый словарь, где ключи - целые числа, а значения - строки.

    val map3 = mutableMapOf<Int, String>()

    println("\nЗадание 3:")
    println(map3)

//Задание 4: Добавление Элементов в Словарь
//Имея изменяемый словарь, добавьте в него новые пары "ключ-значение".

    map3[154] = "Новосибирск"
    map3[122] = "Барнаул"
    map3[70] = "Томск"

    println("\nЗадание 4:")
    println(map3)

//Задание 5: Получение Значений из Словаря
//Используя словарь из предыдущего задания, извлеките значение, используя ключ.
//Попробуй получить значение с ключом, которого в словаре нет.

    println("\nЗадание 5:")
    println(map3[154])

//Задание 6: Удаление Элементов из Словаря
//Удалите определенный элемент из изменяемого словаря по его ключу.

    map3.remove(70)

    println("\nЗадание 6:")
    println(map3)

//Задание 7: Перебор Словаря в Цикле
//Создайте словарь (ключи Double, значения Int) и выведи в цикле результат деления ключа на значение.
//Не забудь обработать деление на 0 (в этом случае выведи слово “бесконечность”)

    val map7 = mapOf (
        0.0 to 0,
        1.0 to 1,
        2.1 to 2
    )

    println("\nЗадание 7:")

    for (entries in map7) {
        if (entries.value != 0) {
            val div = (entries.key / entries.value).toDouble()
            println(div)
        }
        else println("бесконечность")
    }

//Задание 8: Перезапись Элементов Словаря
//Измените значение для существующего ключа в изменяемом словаре.

    map3[70] = "Омск"

    println("\nЗадание 8:")
    println(map3)

//Задание 9: Сложение Двух Словарей
//Создайте два словаря и объедините их в третьем изменяемом словаре через циклы.

    val a1 = 154 to "Новосибирск"
    val a2 = 122 to "Барнаул"
    val a3 = 70 to "Томск"

    val b1 = 16 to "Казань"
    val b2 = 42 to "Кемерово"
    val b3 = 28 to "Благовещенск"

    val map91 = mapOf(
        a1,
        a2,
        a3
    )

    val map92 = mapOf(
        b1,
        b2,
        b3
    )

    var mapNew9 = mutableMapOf<Int, String>()

    for ((code, city) in map91){
        mapNew9[code] = city
    }

    for ((code, city) in map92){
        mapNew9[code] = city
    }

    println("\nЗадание 9:")
    println(mapNew9)

//Задание 10: Словарь с Сложными Типами
//Создайте словарь, где ключами являются строки, а значениями - списки целых чисел.
//Добавьте несколько элементов в этот словарь.

    val city1 = "Казань" to listOf(1, 2, 3)
    val city2 = "Кемерово" to listOf(4, 5, 6)
    val city3 = "Благовещенск" to listOf(8, 9, 10)

    val map10 = mapOf(
        city1,
        city2,
        city3
    )

    println("\nЗадание 10:")
    println(map10)

//Задание 11: Использование Множества в Качестве Значения
//Создай словарь, в котором ключи - это целые числа, а значения - изменяемые множества строк.
//Добавь данные в словарь.
//Получи значение по ключу (это должно быть множество строк)
//и добавь в это множество ещё строку. Распечатай полученное множество.

    val citySet1 = 1 to mutableSetOf("Новосибирск", "Красноярск")
    val citySet2 = 2 to mutableSetOf("Москва", "Санкт-Петербург")
    val citySet3 = 3 to mutableSetOf("Владивосток", "Уссурийск")

    val map11 = mutableMapOf(
        citySet1,
        citySet2,
        citySet3
    )

    val key11 = 2

    println("\nЗадание 11:")
    println(getValueMap11(map11, key11))

//Задание 12: Поиск Элемента по Значению
//Создай словарь, где ключами будут пары чисел.
//Через перебор найди значение у которого пара будет содержать цифру 5 в качестве первого или второго значения.

    val numPair1 = 0 to 1
    val numPair2 = 5 to 5

    val string1 = "значение отсутствует в списке"
    val string2 = "значение есть в списке"

    val map12 = mapOf(
        numPair1 to string1,
        numPair2 to string2
    )

    println("\nЗадание 12:")
    println(getValueMap12(map12, 5))

//======
//Напиши решения задач. В каждом случае нужно проанализировать и подобрать оптимальный тип словаря.
//Задание 6: Словарь Библиотека
//Ключи - автор книги, значения - список книг

    val libraryMap = mapOf<String, MutableList<String>>()

//Задание 12: Справочник Растений
//Ключи - типы растений (например, "Цветы", "Деревья"), значения - списки названий растений

    val plantsMap = mapOf<String, List<String>>()

//Задание 8: Четвертьфинала
//Ключи - названия спортивных команд, значения - списки игроков каждой команды

    val quarFinalsMap = mapOf<String, List<String>>()

//Задание 9: Курс лечения
//Ключи - даты, значения - список препаратов принимаемых в дату

    val cureFinalMap = mapOf<String, MutableList<String>>()

//Задание 10: Словарь Путешественника
//Ключи - страны, значения - словари из городов со списком интересных мест.

    val dictionaryMap = mapOf<String, MutableMap <MutableList<String>, String>>()
}

fun getValueMap11(map11: Map <Int, MutableSet<String>>, key11: Int): String{
    for ((num, city) in map11){
        if (key11 == num)
        return city.toString()
    }
    return ""
}

//Задание 12: Поиск Элемента по Значению
//Создай словарь, где ключами будут пары чисел.
//Через перебор найди значение у которого пара будет содержать цифру 5 в качестве первого или второго значения.

fun getValueMap12(map12: Map <Pair<Int, Int>, String>, key: Int): String{
    for ((numPair, string) in map12){
        val key1 = numPair.first
        val key2 = numPair.second
            if ((key1 == 5) || (key2 == 5)) {
                return (string)
            }
        }
    return ""
}


