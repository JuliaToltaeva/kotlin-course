package com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson21.homework

//Создай класс StringValidator и имплементируй интерфейс Validator с типом
// String?. Реализуй проверку, что строка не является null, не пустая и не
// состоит из одних пробелов.

class StringValidator: Validator<String?> {

    override fun checkElement(element: String?): Boolean {

        return !element.isNullOrBlank()

    }

}