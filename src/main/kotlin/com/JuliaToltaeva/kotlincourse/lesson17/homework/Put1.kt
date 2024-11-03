package com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson17.homework

//Первый класс должен вставлять строку на дно контейнера (должно появиться под индексом 0)

class Put1() : Materials() {

    fun putString(string: String): Unit {
        val extracted = extractMaterial()
            .toMutableList()

        for (i in extracted.indices) {
            if (i == 0) {
                extracted.add(0, string)
                addMaterial(extracted[i])
            } else addMaterial(extracted[i])
        }
    }
}