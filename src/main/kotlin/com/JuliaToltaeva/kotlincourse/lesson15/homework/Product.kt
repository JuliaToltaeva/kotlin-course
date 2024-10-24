package com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson15.homework

// Покупка: Продукт Создайте дата класс для продукта, который будет
// представлять продукт в магазине.
// У него должны быть свойства “название”, “цена”, “количество”.

data class Product(
    val productName: String,
    var price: Double,
    var quantity: Int
)
