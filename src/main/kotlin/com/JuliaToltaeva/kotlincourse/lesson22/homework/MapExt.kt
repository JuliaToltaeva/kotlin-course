package com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson22.homework

//Реализуйте функцию-расширение для класса словаря допускающего null с ключами
// дженериком и значениями типа список из такого же дженерика, которая
// принимает один аргумент типа число и возвращает словарь допускающий null
// с ключами типа строка и значениями типа дженерика допускающего null.

fun <T> Map<T?, List<T>>.useMap(arg: Int): Map<String?, T?> {

    return mapOf("string" to null)

}