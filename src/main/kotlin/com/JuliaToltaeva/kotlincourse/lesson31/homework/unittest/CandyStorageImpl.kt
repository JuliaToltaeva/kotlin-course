package com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson31.homework.unittest

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
    private var currentContainerAmount = 0f

    private val getStorageCandies = getAmount(Candy.MARS) +
            getAmount(Candy.MARS) +
            getAmount(Candy.TWIX) +
            getAmount(Candy.LION) +
            getAmount(Candy.MILKY_WAY) +
            getAmount(Candy.SNICKERS)

    // дальше будет переопределением методов интерфейса

    fun getCandyTypes() = storage.keys.toList()

    fun getSpaceStorage(): Boolean {
        val availableSpaceStorage = storageCapacity - getStorageCandies
        return availableSpaceStorage > 0
    }

    override fun addCandy(candy: Candy, amount: Float): Float {

        require(amount >= 0) { "Количество конфет не может быть отрицательным" }

        if (!getSpaceStorage()) {throw IllegalStateException("Недостаточно места в контейнере для добавления конфет")}

        if (currentContainerAmount + amount > containerCapacity) {
            val overflow = (currentContainerAmount + amount) - containerCapacity
            currentContainerAmount = containerCapacity

            storage[candy] = (storage[candy] ?: 0f) + (amount - overflow)
            return overflow
        } else {
            currentContainerAmount += amount
            storage[candy] = (storage[candy] ?: 0f) + amount
            return 0f
        }

    }

    override fun getCandy(candy: Candy, amount: Float): Float {

        require(amount >= 0) { "Количество конфет не может быть отрицательным" }

        if (currentContainerAmount < amount) {
            val remaining = currentContainerAmount
            currentContainerAmount = 0f
            storage[candy] = (storage[candy] ?: 0f) - remaining
            return remaining
        } else {
            currentContainerAmount -= amount
            storage[candy] = (storage[candy] ?: 0f) - amount
            return amount
        }

    }

    override fun removeContainer(candy: Candy): Boolean {
        return if (currentContainerAmount == 0f) {
            storage.remove(candy) != null
        } else {
            false
        }
    }

    override fun getAmount(candy: Candy): Float {
        return storage[candy] ?: 0f
    }

    override fun getSpace(candy: Candy): Float {
        val availableSpace = containerCapacity - currentContainerAmount
        return if (availableSpace > 0) availableSpace else 0f
    }

    override fun toString(): String {
        return "containerCapacity = $containerCapacity, " +
                "currentContainerAmount = $currentContainerAmount"
    }


}
