package com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson15.homework_ext

//Класс Shelf (Полка Стеллажа)
//Характеристики:
//Вместимость полки (capacity): максимальная сумма букв всех названий предметов, которые могут быть размещены на полке.
//Список предметов (items): хранит названия предметов на полке.

class Shelf(
    newItem: String
) {

    //Добавление Предмета (addItem):
    //Принимает название предмета.
    //Проверяет, поместится ли предмет на полку, учитывая длину его названия и текущее заполнение полки.
    //Возвращает true и добавляет предмет, если есть место. В противном случае возвращает false.

    companion object {
        const val CAPACITY = 10
        val itemsList = mutableListOf(
            "1",
            "23",
            "456"
        )
    }

    fun addItem(newItem: String): Boolean {
        return (canAccommodate && itemsList.add(newItem))
    }

    private fun getFreeLength(itemName: String): Int {
        val lengthName = itemsList
            .sumOf { it.length }
        return CAPACITY - lengthName
    }

    private val freeLength = getFreeLength(newItem)

    private val canAccommodate = canAccommodate(newItem)

    val findItem = findItem(newItem)

    //Удаление Предмета (removeItem):
    //Принимает название предмета.
    //Удаляет предмет, если он найден на полке.
    //Возвращает true, если предмет был удален, и false, если такой предмет не найден.

    fun removeItem(itemName: String): Boolean {
        return itemsList.remove(itemName)
    }

    //Проверка Вместимости (canAccommodate):
    //Принимает название предмета.
    //Определяет, вместится ли предмет на полку.
    //Возвращает true, если предмет вместится, и false, если места недостаточно.

    fun canAccommodate(itemName: String): Boolean {
        return itemName.length <= freeLength
    }

    //    Проверка наличия предмета:
    //    Принимает название предмета
    //    Возвращает true если такой предмет есть

    fun findItem(itemName: String): Boolean {
        for (i in itemsList) {
            if (i == itemName) {
                return true
            }
        }
        return false
    }

    //    Получение списка предметов:
    //    Возвращает неизменяемый список предметов

    fun getItemsList(): List<String> {
        return itemsList.toList()
    }

}

