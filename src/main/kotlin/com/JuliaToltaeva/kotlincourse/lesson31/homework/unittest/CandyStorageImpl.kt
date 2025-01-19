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
            "Ёмкость хранилища не должна быть меньше ёмкости одного контейнера"
        }
    }

    private val storage = mutableMapOf<Candy, Float>()
    private var currentContainerAmount = 0f

    // дальше будет переопределением методов интерфейса

    fun getCandyTypes() = storage.keys.toList()

    override fun addCandy(candy: Candy, amount: Float): Float {

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

        return if (currentContainerAmount < amount) {
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
