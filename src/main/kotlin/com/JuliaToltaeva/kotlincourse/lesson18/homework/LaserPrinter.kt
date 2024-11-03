package com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson18.homework

import com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson18.classwork.printColored1

//Лазерный принтер должен разбивать фразу на слова по пробелу и
//выводить каждое слово отдельно чёрными буквами на белом фоне
//(хорошо работает на тёмной теме)

class LaserPrinter : Printer() {

    override fun print(longString: String) {

        val word = longString.split(" ")

        printColored1(word.toString(), Colors.BLACK, Background.WHITE)
    }

}