package com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson31.homework.unittest

import com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson12.getMax
import kotlin.math.min

// Пример имплементации интерфейса с блоком инициализации класса

class CandyStorageImpl(
    override val containerCapacity: Float,
    override val storageCapacity: Float
) : CandyStorage {


    // Блок инициализации класса. Выполняется сразу при создании объекта
    init {
        require(containerCapacity >= 0) {
            "Ёмкость контейнера не может быть отрицательной"
        }
        require(storageCapacity >= containerCapacity) {
            "Ёмкость хранилища должна быть больше или равна ёмкости одного контейнера"
        }

    }


    private val storage = mutableMapOf<Candy, Float>()


    // дальше будет переопределением методов интерфейса

    fun getCandyTypes() = storage.keys.toList()

    private fun checkSpaceStorage(amount: Float) {

        require(amount >= 0) { "Количество конфет не может быть отрицательным" }

        val availableMaxSpaceStorage = (getCandyTypes().size + 2) * containerCapacity

        if (availableMaxSpaceStorage <= 0) {
            throw IllegalStateException("Недостаточно места в хранилище для добавления конфет")
        }

    }

    private fun checkSpaceContainer(amount: Float, candy: Candy) {

        val currentAmountContainer = storage[candy] ?: 0f
        val availableSpaceContainer = containerCapacity - currentAmountContainer

        if (availableSpaceContainer <= 0) {
            throw IllegalStateException("Недостаточно места в контейнере для добавления конфет")
        }
    }

    override fun addCandy(candy: Candy, amount: Float): Float {

        checkSpaceStorage(amount)
        checkSpaceContainer(amount, candy)

        val availableSpaceContainer = containerCapacity - getAmount(candy)
        val currentContainerAmount = getAmount(candy)

        if (amount <= availableSpaceContainer) {
            storage[candy] = currentContainerAmount + amount
            return 0f
        } else {
            val overflow = amount - availableSpaceContainer
            storage[candy] = containerCapacity
            return overflow
        }

    }


    override fun getCandy(candy: Candy, amount: Float): Float {

        require(amount >= 0) { "Количество конфет не может быть отрицательным" }
        require(amount <= getAmount(candy)) { "Количество конфет не может быть взято больше, чем есть в контейнере" }


        val currentAmountContainer = storage[candy] ?: 0f

        if (currentAmountContainer < amount) {
            storage[candy] = currentAmountContainer - amount
            return currentAmountContainer
        } else {
            storage[candy] = currentAmountContainer - amount
            return amount
        }

    }

    override fun removeContainer(candy: Candy): Boolean {
        return if (storage[candy]!! == 0f) {
            storage.remove(candy) != null
        } else {
            false
        }
    }

    override fun getAmount(candy: Candy): Float {
        return storage[candy] ?: 0f
    }

    override fun getSpace(candy: Candy): Float {
        val currentContainerAmount = storage[candy] ?: 0f
        val availableSpaceContainer = containerCapacity - currentContainerAmount
        return if (availableSpaceContainer > 0) availableSpaceContainer else 0f
    }

    override fun toString(): String {
        return "containerCapacity = $containerCapacity"
    }


}
