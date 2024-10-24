package com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson15.homework

// Аспект реальности: Эмоция Создайте класс Emotion, который представляет эмоцию.
// У него должно быть свойство type (String) и intensity (Int).
// Добавьте метод express(), который выводит описание эмоции в зависимости
// от её типа и интенсивности.

class Emotion(
    var type: String,
    var intensity: Int
) {

    fun express() {
        if (type == "type" && intensity == 5) {
            println("Description Emotion Name")
            println("-----")
        }
    }
}