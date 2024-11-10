package com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson20.homemork

import java.io.InputStream

interface Powerable {
    fun powerOn()
    fun powerOff()
}

interface Openable {
    fun open()
    fun close()
}

interface WaterContainer {
    val capacity: Int
    fun fillWater(amount: Int)
    fun getWater(amount: Int)
}

interface TemperatureRegulatable {
    val maxTemperature: Int
    fun setTemperature(temp: Int)
}

interface WaterConnection {
    fun connectToWaterSupply()
    fun getWater(amount: Int)
}

interface AutomaticShutdown {
    val sensorType: String
    val maxSensoredValue: Int
    fun startMonitoring()
}

interface Drainable {
    fun connectToDrain()
    fun drain()
}

interface Timable {
    fun setTimer(time: Int)
}

interface BatteryOperated {
    fun getCapacity(): Double
    fun replaceBattery()
}

interface Mechanical {
    fun performMechanicalAction()
}

interface LightEmitting {
    fun emitLight()
    fun completeLiteEmission()
}

interface SoundEmitting {
    fun setVolume(volume: Int)
    fun mute()
    fun playSound(stream: InputStream)
}

interface Programmable {
    fun programAction(action: String)
    fun execute()
}

interface Movable {
    fun move(direction: String, distance: Int)
}

interface Cleanable {
    fun clean()
}

interface Rechargeable {
    fun getChargeLevel(): Double
    fun recharge()
}

// Создай объекты этих устройств и позапускай их с различными методами.

fun main () {

    val kettle = com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson20.homemork.Kettle()
    val oven = com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson20.homemork.Oven()
    val refrigerator = com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson20.homemork.RefrigeratorSub(0)

    kettle.setTemperature(90)
    kettle.programAction("Кипение")
    println("-----")

    oven.setTemperature(180)
    oven.programAction("Запекание")
    println("-----")

    refrigerator.setTemperature(-20)
    refrigerator.programAction("Быстрая заморозка")








}




