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
        require(amount >= 0) {
            "Количество конфет не может быть отрицательным"
        }
        require(amount <= containerCapacity) {
            "Количество конфет не может быть отрицательным"
        }
        val result = amount
        return(result)
        // вернули остаток места в контейнере
    }

    override fun getCandy(candy: Candy, amount: Float): Float {
        TODO("Not yet implemented")
    }

    override fun removeContainer(candy: Candy): Boolean {
        return currentContainerAmount == 0f
    }

    override fun getAmount(candy: Candy): Float {
        TODO("Not yet implemented")
    }

    override fun getSpace(candy: Candy): Float {
        TODO("Not yet implemented")
    }

    override fun toString(): String {
        TODO("Not yet implemented")
    }


}
