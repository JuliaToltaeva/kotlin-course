package com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson15.homework

// Природное явление: Луна Создайте объект Moon, который будет представлять Луну.
// Добавьте свойства isVisible (Boolean), чтобы отображать, видна ли Луна
// в данный момент, и phase (String), чтобы отображать текущую фазу Луны
// (например, "Full Moon", "New Moon").
// Добавьте метод showPhase(), который выводит текущую фазу Луны.

class MoonPhase(
    val isVisible: Boolean,
    val phase: String
) {
    companion object {
        val phaseList = listOf(
            "Full Moon",
            "New Moon"
        )
    }

    fun showPhase() {
        if (isVisible == true) {
            println(phase)
            println("-----")
        }
    }

}