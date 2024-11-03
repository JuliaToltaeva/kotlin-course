package com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson17.homework

import com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson11.getKey

//Четвёртый класс должен принимать словарь из строк (ключи и значения).
//Каждая пара ключа и значения должна попадать в контейнер следующим образом -
//ключ в начало, значение в конец.

class Put4() : Materials() {

    fun putMap(map: Map<String, String>) {
        val extracted = extractMaterial()
            .toMutableList()

        for (entries in map) {
            addMaterial(entries.key)
            addMaterial(entries.value)
        }
    }
}
