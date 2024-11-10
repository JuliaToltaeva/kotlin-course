package com.juliatoltaeva.lesson20.homemork

//Создай абстрактный класс для включаемого оборудования и имплементируй
//соответствующий интерфейс с реализацией методов
//(достаточно println с выполняемым действием).

abstract class HouseholdAppliancesPowerable : Powerable {

    override fun powerOn() {
        println("Device is powered on")
    }

    override fun powerOff() {
        println("Device is powered off")
    }

}