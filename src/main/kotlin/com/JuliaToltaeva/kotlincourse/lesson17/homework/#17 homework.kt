package com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson17.homework

fun main() {

    val ordinalNumbers = listOf(
        "first", "second", "third", "fourth", "fifth",
        "sixth", "seventh", "eighth", "ninth", "tenth",
        "eleventh", "twelfth", "thirteenth", "fourteenth", "fifteenth",
        "sixteenth", "seventeenth", "eighteenth", "nineteenth", "twentieth"
    )

    val string = "нулевой"

    val stringList = listOf(
        "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11",
        "12", "13", "14", "15", "16", "17", "18", "19", "20"
    )

    val map = mapOf(
        "1" to "first",
        "2" to "second",
        "3" to "third",
        "4" to "fourth",
        "5" to "fifth"

    )


    val put1 = Put1()
    ordinalNumbers.forEach { put1.addMaterial(it) }


    val put2 = Put2()
    ordinalNumbers.forEach { put2.addMaterial(it) }


    val put3 = Put3()
    ordinalNumbers.forEach { put3.addMaterial(it) }


}


