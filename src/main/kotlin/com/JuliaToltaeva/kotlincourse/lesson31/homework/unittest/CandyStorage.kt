package com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson31.homework.unittest

interface CandyStorage {

    /**
     * Объём одного контейнера
     * @throws IllegalArgumentException если значение отрицательное при инициализации
     */
    val containerCapacity: Float

    /**
     * Совокупный объём хранилища
     * @throws IllegalArgumentException если значение меньше, чем [containerCapacity] при инициализации
     */
    val storageCapacity: Float

    /**
     * @param candy конфеты для добавления в контейнер
     * @param amount количество добавляемых конфет
     * @return количество оставшихся конфет если контейнер заполнился
     * @throws IllegalArgumentException если передано отрицательное значение
     * @throws IllegalStateException если хранилище не позволяет разместить ещё один контейнер для новых конфет
     */
    fun addCandy(candy: Candy, amount: Float): Float

    /**
     * @param candy конфеты, которые нужно взять из контейнера
     * @param amount количество конфет
     * @return количество полученных конфет или остаток, если было меньше
     * @throws IllegalArgumentException если передано отрицательное значение
     */
    fun getCandy(candy: Candy, amount: Float): Float

    /**
     * @param candy уничтожает пустой контейнер
     * @return true если контейнер уничтожен и false если контейнер не пуст
     */
    fun removeContainer(candy: Candy): Boolean

    /**
     * @param candy конфеты, количество которых нужно узнать
     * @return количество конфет, которые хранятся в контейнере
     */
    fun getAmount(candy: Candy): Float

    /**
     * @param candy конфеты, для которых нужно проверить доступное место в контейнере
     * @return количество конфет, которые может вместить контейнер с учётом его текущей заполненности
     */
    fun getSpace(candy: Candy): Float

    /**
     * @return текстовое представление
     */
    override fun toString(): String


}