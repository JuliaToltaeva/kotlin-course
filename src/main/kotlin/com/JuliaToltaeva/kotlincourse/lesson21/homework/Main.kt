package com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson21.homework

//Требуется описать класс, интерфейс или функцию и реализовать предложенную
// логику в коде.

//Создайте функцию toMap<K, V>(keys: List<K>, values: List<V>): Map<K, V>,
// которая будет создавать карту из списков ключей и значений. Если ключей или
// значений больше, то оставшиеся ключи или значения не записываем в словарь.

fun <K, V> toMap(keys: List<K>, values: List<V>): Map<K, V> {

    val map1 = mutableMapOf<K, V>()

    val sizeOfMap = minOf(keys.size, values.size)

    for (i in 0 until sizeOfMap) {

        map1[keys[i]] = values[i]

    }

    return map1

}


//Напишите функцию getMiddleElement<T>(list: List<T>): T?, которая будет
// возвращать средний элемент списка, если он существует.

fun <T> getMiddleElement(list: List<T>): T? {

    val indexAverage = list.size / 2

    return if (list.size % 2 == 1)
        list[indexAverage]
    else null

}
