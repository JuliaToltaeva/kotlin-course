package com.JuliaToltaeva.kotlincourse.lesson31.homework.unittest

import com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson31.homework.unittest.Candy
import com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson31.homework.unittest.CandyStorageImpl
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class CandyStorageImplTest {

    private val storage = CandyStorageImpl(10f, 20f)

    //    Тест на отрицательную емкость контейнера
    @Test
    fun `should throw if containerCapacity is negative`() {
        Assertions.assertThrows(IllegalArgumentException::class.java) {
            CandyStorageImpl(-4f, 20f)
        }
    }

    //    Тест на емкость хранилища, меньшую чем емкость контейнера
    @Test
    fun `should throw if storageCapacity is lower than containerCapacity`() {
        Assertions.assertThrows(IllegalArgumentException::class.java) {
            CandyStorageImpl(19f, 20f)
        }
    }

    //    Тест на добавление конфет
    @Test
    fun addCandy() = with(storage) {
        addCandy(Candy.MARS, 2.2f)
        Assertions.assertEquals(2.2f, getAmount(Candy.MARS))
    }

    //    Тест на получение типов конфет
    @Test
    fun getCandyTypes1() = with(storage) {
        Assertions.assertTrue(getCandyTypes().isEmpty())
        addCandy(Candy.MARS, 2.2f)
        Assertions.assertEquals(listOf(Candy.MARS), getCandyTypes())
    }

    //    Тест на добавление дополнительных конфет
    @Test
    fun addExtraCandy() = with(storage) {
        addCandy(Candy.MARS, 2.2f)
        addCandy(Candy.MARS, 1.3f)
        Assertions.assertEquals(3.5f, getAmount(Candy.MARS))
    }

    //    Тест проверку вместимости контейнеров
    @Test
    fun `should throw if storage can take new container`() = with(storage) {
        addCandy(Candy.MARS, 1.1f)
        addCandy(Candy.TWIX, 2.7f)
        Assertions.assertTrue(storage.getCandyTypes().size <= (storageCapacity / containerCapacity))
    }

    @Test
    fun `should throw if storage can not take new container`() = with(storage) {
        addCandy(Candy.MARS, 1.1f)
        addCandy(Candy.TWIX, 2.7f)
        addCandy(Candy.LION, 2.7f)
        if (storage.getCandyTypes().size <= (storageCapacity / containerCapacity)) {
            throw IllegalStateException("Не хватает места в хранилище для добавления конфет")
        }
    }

    //    Тест на добавление нескольких типов конфет
    @Test
    fun addAFewTypesOfCandies() = with(storage) {
        addCandy(Candy.MARS, 1.1f)
        addCandy(Candy.TWIX, 2.7f)
        Assertions.assertAll(
            { Assertions.assertEquals(1.1f, getAmount(Candy.MARS)) },
            { Assertions.assertEquals(2.7f, getAmount(Candy.TWIX)) },
        )
    }

    //    Тест на возвращение 0, если контейнер не полный:
    @Test
    fun `should return 0 if container not full`() = with(storage) {
        Assertions.assertEquals(0f, addCandy(Candy.TWIX, 9.9f))
    }

    // Тест на возвращение остатка, если добавляемое количество превышает оставшееся место
    @Test
    fun `should return rest if added cereal is biggest than container empty space`() = with(storage) {
        Assertions.assertEquals(0.1f, addCandy(Candy.MILKY_WAY, 10.1f), 0.01f)
    }

    // Тест на отрицательное количество конфет
    @Test
    fun `should throw if candy amount is negative`(): Unit = with(storage) {
        Assertions.assertThrows(IllegalArgumentException::class.java) {
            addCandy(Candy.MARS, -1f)
        }
    }

    // Тест на недостаток места для нового контейнера:
    @Test
    fun `should throw when storage don't have space for new container`(): Unit = with(storage) {
        addCandy(Candy.MARS, 0.1f)
        addCandy(Candy.MILKY_WAY, 0.1f)
        Assertions.assertThrows(IllegalStateException::class.java) {
            addCandy(Candy.TWIX, 0.1f)
        }
    }

    // getCandy
    @Test
    fun `should throw if amount is negative`(): Unit = with(storage) {
        Assertions.assertThrows(IllegalArgumentException::class.java) {
            getCandy(Candy.MARS, -1f)
        }
    }

    @Test
    fun `should return true when getting candy is OK`(): Unit = with(storage) {
        addCandy(Candy.MARS, 2.2f)
        getCandy(Candy.MARS, 2.2f)
        Assertions.assertEquals(0f, getAmount(Candy.MARS))
    }

    @Test
    fun `should return true when getting multiple candy is OK`() = with(storage) {
        addCandy(Candy.MARS, 1.1f)
        addCandy(Candy.TWIX, 2.7f)

        getCandy(Candy.MARS, 1.1f)
        getCandy(Candy.TWIX, 2.7f)

        Assertions.assertAll(
            { Assertions.assertEquals(0f, getAmount(Candy.MARS)) },
            { Assertions.assertEquals(0f, getAmount(Candy.TWIX)) },
        )
    }

    // check removeContainer
    @Test
    fun `should return true when container is empty`() {
        Assertions.assertTrue(storage.removeContainer(Candy.MARS))
    }

    @Test
    fun `should return false when container is not empty`() {
        storage.addCandy(Candy.MARS, 2.7f)
        Assertions.assertFalse(storage.removeContainer(Candy.MARS))
    }

    @Test
    fun `should return false when removing a few containers`() {
        storage.addCandy(Candy.MARS, 1.0f)
        storage.addCandy(Candy.TWIX, 1.0f)
        Assertions.assertAll(
            { Assertions.assertFalse(storage.removeContainer(Candy.MARS)) },
            { Assertions.assertFalse(storage.removeContainer(Candy.TWIX)) },
        )

    }

    // checking getAmount
    @Test
    fun `should return true if getAmount more than 0`() {
        storage.addCandy(Candy.TWIX, 2.7f)
        Assertions.assertTrue(storage.getAmount(Candy.TWIX) >= 0)
    }

    @Test
    fun `should return true if getAmount lower than containerCapacity`() {
        storage.addCandy(Candy.TWIX, 2.7f)
        Assertions.assertTrue(storage.getAmount(Candy.TWIX) <= 10f)
    }

    // checking getSpace
    @Test
    fun `should return true if space is free`() {
        storage.addCandy(Candy.TWIX, 2.7f)
        Assertions.assertTrue(storage.getSpace(Candy.TWIX) > 0)
    }

    @Test
    fun `should return true if space lower than containerCapacity`() {
        storage.addCandy(Candy.TWIX, 2.7f)
        Assertions.assertTrue(storage.getSpace(Candy.TWIX) < 10f)
    }

    @Test
    fun `should return true if sum of containerCapacity lower than storageCapacity`() = with(storage) {
        addCandy(Candy.MARS, 1.1f)
        addCandy(Candy.TWIX, 2.7f)

        val sum = with(storage) {
            getAmount(Candy.MARS) + getAmount(Candy.TWIX)
        }

        Assertions.assertTrue(sum <= 20f)
    }

}