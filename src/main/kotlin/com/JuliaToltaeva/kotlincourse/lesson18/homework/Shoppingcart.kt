package com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson18.homework

//Класс “Корзина товаров”: содержит поле словаря из ID товаров и их количества.
//Базовый метод addToCart(itemId) добавляет одну единицу товара к уже существующим в корзине.


//Учесть, что если товар уже есть в корзине, нужно увеличить его количество, если нет - добавить.
//Попробуй создать корзину и положить в неё товар разными способами, потом распечатать корзину в консоль.
//Переопредели у корзины метод toString для красивого форматирования содержимого таблицы,
//включая итоговое количество артикулов и общее количество всего товара в корзине.


class Shoppingcart(

    val itemMap: MutableMap<String, Int> = mutableMapOf<String, Int>(

        "ID_1" to 1,
        "ID_2" to 2,
        "ID_3" to 3

    )

) {

    fun addToCart(itemId: String) {

        val amountOld = itemMap[itemId]
        val amountNew = amountOld!! + 1

    }
    //Выполнить перегрузку addToCart который:
    //Принимает два аргумента (itemId и количество amount)

    fun addToCart(

        itemId: String,
        amount: Int

    ) {

        val amountNew = itemMap[itemId]!! + amount

    }

    //Принимает словарь из id и количества и добавляет всё в корзину

    fun addToCart(

        mapAdd: Map<String, Int>

    ) {
        for ((key, value) in mapAdd) {

            if (itemMap.containsKey(key)) {
                itemMap.values += value
            } else itemMap[key] = value

        }

    }

    //Принимает список из id (добавляет по одной единице).


}