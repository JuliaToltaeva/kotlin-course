package com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson17.homework

//Второй класс должен получать список строк и вставлять их в начало контейнера
//но поочерёдно с теми данными, которые уже есть. То-есть, наш список должен появиться
//в контейнере по индексам 0, 2, 4 и так далее.

class Put2() : Materials() {

    fun putString(stringList: List<String>): Unit {
        val extracted = extractMaterial().toMutableList()

        for (i in extracted.indices) {

            if (i % 2 == 0) {
                if (i == 0) {
                    extracted.add(i, stringList[i])
                } else extracted.add(i, stringList[i / 2])

            } else {
                addMaterial(extracted[i - 1])
            }
        }
    }
}