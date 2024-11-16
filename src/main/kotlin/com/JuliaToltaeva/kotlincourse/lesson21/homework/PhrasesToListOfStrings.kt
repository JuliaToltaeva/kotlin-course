package com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson21.homework

//Создай класс PhrasesToListOfStrings и имплементируй интефрейс Mapper с типами
// String и List<String>. Метод преобразования должен разбивать входящую строку
// по символу пробела и возвращать список из полученных слов.

class PhrasesToListOfStrings : Mapper<String, List<String>> {

    override fun convert(element: String): List<String> {

        return element.split(" ")

    }

    override fun convertSecond(element: String): List<String> {

        return element.split(" ")

    }

}