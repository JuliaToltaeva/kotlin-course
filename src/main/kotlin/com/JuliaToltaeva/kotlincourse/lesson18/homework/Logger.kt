package com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson18.homework

import com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson18.classwork.printColored1

class Logger(
    private val levelLog: MutableList<String> = mutableListOf(
        "INFO",
        "WARNING",
        "ERROR",
        "DEBUG"
    )
) {

    fun log(message: String) {

        if (message.contains(levelLog[0])) {
            println(levelLog[0])
        }

    }

    private val colorsClass = com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson18.homework.Colors
    private val backgroundColorsClass = com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson18.homework.Background

    fun log(levelLogString: String, message: String) {

        if (message.contains(levelLog[1])) {

            printColored1(message, colorsClass.YELLOW)
        }

        if (message.contains(levelLog[2])) {

            printColored1(message, colorsClass.WHITE, Background.RED)
        }

    }

}