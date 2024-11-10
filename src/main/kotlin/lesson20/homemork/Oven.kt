package com.juliatoltaeva.lesson20.homemork

class Oven : HouseholdAppliancesTemperatureRegulatable() {

    override val maxTemperature: Int
        get() = 200

    override fun setTemperature(temp: Int) {

        println("Для духовки установлена температура $temp")
    }

    private var isPowerOn = false

    override fun powerOn()
    {
        isPowerOn = !isPowerOn
        println("Духовка включена")

    }

    override fun programAction(action: String) {

        powerOn()

        println("Включен режим ручной настройки")
    }

    override fun execute() {}

    override fun close() {
        TODO("Not yet implemented")
    }

    override fun powerOff() {
        TODO("Not yet implemented")
    }

}