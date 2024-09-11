package com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson_3

// ключевое_слово название_переменной: тип_переменной = значение_переменой
// Lesson

val name: String = "Alice"           // value неизменяемая переменная
                                     // кавычки для String должны быть двойные
var age: Int = 30                    // variable изменяемая переменная
                                     // Int - число целочисленные (без точки), могут быть отрицательные
const val PI = 3.14                  // название переменной должно быть заглавными буквами
                                     // переменная сразу известна на момент написания кода
lateinit var userinfo: String        // поздняя инициализация
                                     // вычисляется на строне, только val
val lazyValue: String by Lazy {      // ленивая ициализация
    "Hello, this is a lazy string!"  // переменная должна быть описана здесь
}
var speed: Double? = null            // может быть ноль
                                     // вопросительный знак означает, что переменная может быть null
                                     // можно не писать Int и Double, если идея понимает это
var count: Int = 0                   //
    get() = field
    set(value) {
        if (value >=0) field = value
    }

// Example

val chassis: String = "12345abc"
var colour: String = "blue"
var distance: Double = 0.0
lateinit var owner: String
const val WHEELS: Int = 4
val lazyvalue: String by Lazy{
    ""
}
var fuel: Double = 0.0
    get() = field
    set(value) {
        if (value >0) field += value
    }