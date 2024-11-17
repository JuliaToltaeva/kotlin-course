package com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson22.homework

//Задача 3: Переворот элементов пары
//Реализуйте метод расширения revert для класса Pair, который меняет местами
// первый и второй элементы пары. Метод должен возвращать новую пару с
// перевернутыми элементами. Протестируйте эту функцию на различных парах
// значений, в том числе null.

fun Pair<String?, String?>.revert() : Pair<String?, String?> {

    return Pair(this.second, this.first)

}