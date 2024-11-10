package com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson20.homemork

import java.io.InputStream

//Создай не абстрактные классы устройств с наследованием от абстрактного класса
// с возможностью устанавливать температуру и открываться.
// Пусть это будет холодильник, стиральная машина, чайник, духовка.

// Добавь недостающие интерфейсы и реализуй необходимые методы (достаточно вывод
// в консоль производимого действия). Обрати внимание на то, что установка температуры
// и программирование устройства (считай - задание режима работы)
// не имеет смысла при выключенном питании - добавь эту проверку.

class WashingMachineSub(

    override val maxTemperature: Int

) : com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson20.homemork.Refrigerator() {

    private var isPowerOn = false

    override fun powerOn()
    {
        isPowerOn = !isPowerOn
        println("Стиральная машина включена")

    }

    override fun powerOff() {
        TODO("Not yet implemented")
    }

    override fun open() {

        var isOn = true

        println("Стиральная машина открыта")

    }


    override fun close() {
        TODO("Not yet implemented")
    }

    override fun setTemperature(temp: Int) {

        val maxTemperature = 90

        if (temp <= maxTemperature) {

            powerOn()

            println("В стиральной машине установлена температура $temp")
        }

    }

    override fun emitLight() {
        TODO("Not yet implemented")
    }

    override fun completeLiteEmission() {
        TODO("Not yet implemented")
    }

    override fun setVolume(volume: Int) {
        TODO("Not yet implemented")
    }

    override fun mute() {
        TODO("Not yet implemented")
    }

    override fun playSound(stream: InputStream) {
        TODO("Not yet implemented")
    }

    override fun programAction(action: String) {

        powerOn()

        println("Включен режим ручной настройки стиральной машины")
    }

    override fun execute() {
        TODO("Not yet implemented")
    }

    override fun clean() {
        TODO("Not yet implemented")
    }

    override fun connectToDrain() {
        TODO("Not yet implemented")
    }

    override fun drain() {
        TODO("Not yet implemented")
    }
}