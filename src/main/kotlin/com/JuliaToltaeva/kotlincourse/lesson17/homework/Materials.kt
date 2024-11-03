package com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson17.homework

//Задание 2
//Это класс контейнера. Он абстрактный, это означает, что нельзя создавать экземлпяр
//этого класса, он нужен только для того, чтобы быть основой для подклассов.

//Создай подклассы этого контейнера, которые будут добавлять строку material
//в какое-то определённое место.

abstract class Materials {

    private val materials = mutableListOf<String>()

    fun addMaterial(material: String) {
        materials.add(material)
    }

    fun extractMaterial(): List<String> {
        val extracted = materials.toList()
        materials.clear()
        return extracted
    }

    fun printContainer() {
        materials.forEachIndexed { index, layer ->
            println("[$index]: $layer")
        }
    }
}