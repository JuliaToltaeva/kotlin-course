package com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson18.homework

import com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson18.classwork.printColored1

//Струйный принтер должен разбивать фразу на слова по пробелу
//и выводить каждое слово отдельно цветными буквами на цветном фоне.
//Слова должны быть разноцветны. Можно сделать список пар с цветом текста
//и фона и проходить циклически по этому списку при выводе текста.

class DotMatrixPrinter : Printer() {

    override fun print(longString: String) {

        val word = longString.split(" ")

        printColored1(word.toString(), Colors.RED, Background.GREEN)
    }

}