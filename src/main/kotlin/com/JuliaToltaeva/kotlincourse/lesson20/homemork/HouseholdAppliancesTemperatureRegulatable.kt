package com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson20.homemork

//Создай абстрактный класс оборудования с возможностью устанавливать температуру
// и открываться и с наследованием от программируемого оборудования.
// Также имплементируй интерфейсы.

abstract class HouseholdAppliancesTemperatureRegulatable : com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson20.homemork.TemperatureRegulatable,
    com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson20.homemork.Openable,
    com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson20.homemork.Programmable,
    com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson20.homemork.Powerable {

    override val maxTemperature: Int
        get() = TODO("Not yet implemented")

    override fun setTemperature(temp: Int) {}

    override fun open() {}

    override fun programAction(action: String) {}

    override fun execute() {}

    override fun powerOn() {}


}