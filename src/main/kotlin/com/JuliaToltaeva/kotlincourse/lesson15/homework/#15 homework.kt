package com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson15.homework

import com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson15.classwork.Car

fun main() {
    val party = Party("Место X", 55)
    party.details()

    val emotion = Emotion("type", 5)
    emotion.express()

    val moon = MoonPhase(true, MoonPhase.phaseList[0])
    moon.showPhase()

    val concert = Concert(
        Concert.group,
        Concert.place,
        Concert.price,
        Concert.capacity,
        true)
    concert.getInfoConcert()
    concert.buyTicket()

}