package com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson19.homework

//    Опиши схематически класс игрового автомата, правильно расставив объявление полей
//    (val или var) и методов (аргументы и возвращаемые значения),
//    включая модификаторы доступа (private для приватных)

//    Поля:
//    цвет
//    модель
//    включен
//    ОС загружена
//    список доступных игр
//    наличие джойстика
//    баланс вырученных средств
//    владелец
//    телефон поддержки.


open class SlotMachine(

    val color: String,

    val model: String,

    var isOn: Boolean,

    var osIsLoaded: Boolean,

    var listOfGames: List<String>,

    var joystickAvailability: Boolean,

    protected var balanceOfProceeds: Float,

    val owner: String,

    val supportPhone: String

) {

//    Методы:
//    включить
//    выключить
//    загрузить ОС
//    завершить работу ОС
//    показать список игр
//    включить игру
//    оплатить игровой сеанс
//    открыть сейф и выдать наличные
//    выплатить выигрыш

    fun turnOn() {}

    fun turnOff() {}

    private fun loadOs() {}

    fun shutDownOs() {}

    fun showListOfGames() {}

    fun turnOnGame() {}

    fun payForGameSession() {}

    protected fun openSafeNGetCash() {}

    protected fun payTheWinnings() {}


}