package com.juliatoltaeva.lesson20.homemork

//Создай абстрактный класс для программируемого оборудования
//(с имплементацией соответствующего интерфейса и реализацией методов)
//и наследуй его от абстрактного класса включаемого оборудования.

abstract class HouseholdAppliancesProgrammable : Programmable, HouseholdAppliancesPowerable() {

    override fun programAction(action: String) {}

    override fun execute() {}

    override fun powerOn() {}

    override fun powerOff() {}

}