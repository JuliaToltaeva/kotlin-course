package com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson17.homework

//Наследования в ООП
//Задание 1
//Потренируйся в создании иерархии классов с расширением базовой сущности.
//Для каждого задания опиши в коде базовый класс с базовыми свойствами
// и если применимо - методами. Для произвольных классов также добавь особенные свойства.
// Детально описывать не нужно, упражнение на то, чтобы усвоить иерархию наследования

//Геометрические Фигуры
//Базовый класс: Геометрическая Фигура
//Производные классы: Многоугольник, Круг
//Дополнительное разветвление для Многоугольник: Треугольник, Четырехугольник

open class Figure(

    val square: Int,
    val color: String

)
