package com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson18.homework

import com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson18.classwork.Colors
import com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson18.classwork.printColored1

//Принтер
//Создай абстрактный принтер, который имеет абстрактный метод печати,
//принимающий в качестве аргумента строку.
//Создай классы наследники: лазерный и струйный

//Проверить работу на длинном тексте.
//Подумать, как бы вынести в protected метод базового класса общую
//для обоих классов логику и избавиться от дублирования кода.

abstract class Printer {

    abstract fun print(longString: String)

}