package com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson17.homework

//Третий класс должен добавлять элементы в список в алфавитном порядке.
//Если мы добавляем новый элемент в список, то он должен встать где-то между
//другими элементами и занять место в соответствии с сортировкой по алфавиту.

class Put3() : Materials() {

    fun putList(string: String) {
        val extracted = extractMaterial()
            .toMutableList()
            .sorted()

        extracted
            .toMutableList()
            .add(string)
        extracted
            .toMutableList()
            .sorted()

        for (i in extracted.indices) {
            addMaterial(extracted[i])
        }
    }
}