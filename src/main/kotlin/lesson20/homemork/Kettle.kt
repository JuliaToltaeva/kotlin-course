package com.juliatoltaeva.lesson20.homemork

class Kettle : HouseholdAppliancesTemperatureRegulatable() {

    override val maxTemperature: Int
        get() = 95

    override fun setTemperature(temp: Int) {



        println("Для чайника установлена температура $temp")
    }

    private var isPowerOn = false

    override fun powerOn()
    {
        isPowerOn = !isPowerOn
        println("Чайник включен")

    }

    override fun programAction(action: String) {

        powerOn()

        println("Включен режим ручной настройки, установлена программа $action")
    }

    override fun execute() {}

    override fun close() {
        TODO("Not yet implemented")
    }

    override fun powerOff() {
        TODO("Not yet implemented")
    }

}