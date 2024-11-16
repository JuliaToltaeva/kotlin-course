package com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson21.homework

//Создай класс OddValidator и имплементируй интерфейс Validator типизированный
// по Int. Реализуй проверку, что число чётное.

class OddValidator: Validator<Int> {

    override fun checkElement(element: Int) = element % 2 == 0

}