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

    private var isOn: Boolean,

    private var osIsLoaded: Boolean,

    val listOfGames: List<String>,

    val joystickAvailability: Boolean,

    private var balanceOfProceeds: Float,

    private var owner: String,

    private var supportPhone: String

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

    fun turnOn() {

        isOn = true
        loadOs()

    }

    fun turnOff() {

        shutDownOs()
        isOn = false

    }

    private fun loadOs() {}

    private fun shutDownOs() {}

    fun showListOfGames() {}

    fun turnOnGame() {}

    fun payForGameSession() {}

    fun openSafeNGetCash() {}

    protected fun payTheWinnings() {}


}