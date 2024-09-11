package com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson_3

// ключевое_слово название_переменной: тип_переменной = значение_переменой
// Theoretical Lesson

val name: String = "Alice"           // value неизменяемая переменная
                                     // кавычки для String должны быть двойные
var age: Int = 30                    // variable изменяемая переменная
                                     // Int - число целочисленные (без точки), могут быть отрицательные
const val PI = 3.14                  // название переменной должно быть заглавными буквами
                                     // переменная сразу известна на момент написания кода
lateinit var userinfo: String        // поздняя инициализация
                                     // вычисляется на строне, только val
val lazyValue: String by lazy {      // ленивая ициализация
    "Hello, this is a lazy string!"  // переменная должна быть описана здесь
    }

var speed: Double? = null            // может быть ноль
                                     // вопросительный знак означает, что переменная может быть null
                                     // можно не писать Int и Double, если идея понимает это
var count: Int = 0                   // контролер перед клубом, вышибала
    get() = field
    set(value) {
        if (value >=0) field = value
        else field = 100
    }

// Practical Lesson
// 1. переменная изменяемая или неизменяемая?
// 2. как назвать переменную на английском (гуглим)?
// 3. какой тип переменной?

val chassis: String = "12345abc" // номер шасси нового автомобиля

var colour: String = "blue"      // цвет автомобиля

var distance: Double = 0.0       // требует указания десятичного знака

lateinit var owner: String       // имя владельца автомобиля

const val WHEELS: Int = 4        // количество колес, никогда не меняется

val lazyValue: String by lazy {  // детальный отчет, требуемый для утилизации
    ""                           // больше не будет обновляться
    }

var fuel: Double = 0.0           // запас топлива
    get() = field                // топливо будет меняться, а нам нужно сделать ограничение диапазона
    set(value) {
        if (value > 0) field += value
    }