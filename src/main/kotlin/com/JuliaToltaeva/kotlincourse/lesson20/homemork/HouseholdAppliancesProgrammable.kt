package com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson20.homemork

//Создай абстрактный класс для программируемого оборудования
//(с имплементацией соответствующего интерфейса и реализацией методов)
//и наследуй его от абстрактного класса включаемого оборудования.

abstract class HouseholdAppliancesProgrammable : com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson20.homemork.Programmable, com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson20.homemork.HouseholdAppliancesPowerable() {

    override fun programAction(action: String) {}

    override fun execute() {}

    override fun powerOn() {}

    override fun powerOff() {}

}