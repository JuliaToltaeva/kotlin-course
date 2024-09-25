package com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson6

import kotlin.time.times

fun main (){
    println (getSeason (9))
    println (getSeason (0))
    println ("")

//    println (checkPersonAge(2.0))
//    println (checkPersonAge(1.0))
//    println ("")

    println (getTransport(10.0))
    println (getTransport(0.0))
    println ("")

//    println (getBonuses (3.0))
//    println (getBonuses (0.0))
//    println ("")

    println (getDocExtension("doc"))
    println (getDocExtension("gif"))
    println ("")

    println (convertTemp(20.0, 'C'))
    println (convertTemp(0.0, 'A'))
    println ("")
}

// Задача 1

fun getSeason (monthNum : Int): String {
    return when {
        monthNum !in 1..12 -> "Ошибка ввода номера месяца"
        monthNum == 12 -> "Зима"
        monthNum in 1..2 -> "Зима"
        monthNum in 3..5 -> "Весна"
        monthNum in 6..8 -> "Лето"
        else -> "Осень"
    }
    }

// Задача 2

fun checkPersonAge (petAge : Double): String {
    return if ((petAge <= 0.0) || (petAge > 7.0)) {
        throw Exception("Ошибка ввода возраста собаки")
    } else {
        convertPersonAge(petAge)
    } as String
}

fun convertPersonAge (petAge : Double): Double {
    return if (petAge > 0.0 && petAge < 2.0) {
        10.5 * petAge
    } else {
        (10.5 * 2 + 4.0 * (petAge-2))
    }
}

// Задача 3

fun getTransport (routeLength: Double): String {
    return when {
        routeLength <= 0.0 -> throw Exception ("Ошибка ввода длины маршрута")
        (routeLength > 0.0) && (routeLength < 1.0) -> "Пешком"
        (routeLength >= 1.0) && (routeLength < 5.0) -> "Велосипед"
        else -> "Автотранспорт"
    }
}

// Задача 4

fun getBonuses (price: Double): String {
    return if (price < 0.0) {
        throw Exception ("Ошибка")
    } else (if (price < 1000.0) {
        convertBonusLess1000 (price)
    } else {
        convertBonusMore1000 (price)
    }) as String
}

fun convertBonusLess1000 (price: Double): Double {
    val bonusLess1000 : Double = (price / 100.0) * 2.0
    return bonusLess1000
}

fun convertBonusMore1000 (price: Double): Double {
    val bonusLess1000 : Double = (price / 100.0) * 2.0
    val bonusMore1000 : Double = bonusLess1000 + 4.0 * (price / 100.0 - 10.0)
    return bonusMore1000
}

// Задача 5
fun getDocExtension (docExtension: String): String {
    return when (docExtension){
        "doc", "pdf", "rtf", "txt" -> "Текстовый документ"
        "bmp", "gif", "jpg", "psd", "tif" -> "Изображение"
        "xlsx", "ods", "xls" -> "Таблица"
        else -> "Неизвестный тип"
    }
}

// Задача 6

fun convertTemp (degree: Double, unit: Char): String {
    return if (unit == 'C') {
        val result: Double = (degree * 9.0/5.0) + 32.0
        "$result F"
    } else {
        val result: Double = (degree - 32.0) / 1.8
        "$result C"
    }.toString()
}

// Задача 7

fun chooseClothes (temp: Int): String {
    return when {
        (temp > 35) || (temp < -30) -> "рекомендация не выходить из дома"
        temp in -30 until 0 -> "куртка и шапка"
        temp in 0..15 -> "ветровка"
        else -> "футболка и шорты"
    }
}

// Задача 8

fun chooseFilm (age: Int): String {
    return when {
        (age < 0) || (age > 110) -> throw Exception ("ошибка")
        age in 0..9 -> "детские"
        age in 10 until 18 -> "подростковые"
        else -> "18+"
    }
}

//В каждом задании также нужно валидировать входящие данные, если это имеет смысл.

//Задание 1: "Определение Сезона"
//Контекст: Напишите функцию, которая на основе номера месяца возвращает сезон года.

//Задание 2: "Расчет Возраста Питомца"
//Контекст: Создайте функцию, которая преобразует возраст собаки в "человеческие" годы.
//До 2 лет каждый год собаки равен 10.5 человеческим годам, после - каждый год равен 4 человеческим годам.
//2 включительно или нет - неизвестно

//Задание 3: "Определение Вида Транспорта"
//Контекст: Напишите функцию, которая определяет, какой вид транспорта лучше использовать, исходя из длины маршрута.
//Если маршрут до 1 км - "пешком", до 5 км - "велосипед", иначе - "автотранспорт".

//Задание 4: "Расчет Бонусных Баллов"
//Контекст: Клиенты интернет-магазина получают бонусные баллы за покупки.
//Напишите функцию, которая принимает сумму покупки и возвращает количество бонусных баллов:
//2 балла за каждые 100 рублей при сумме покупки до 1000 рублей и 5 баллов за каждые 100 рублей при сумме свыше этого.

//Задание 5: "Определение Типа Документа"
//Контекст: В системе хранения документов каждый файл имеет расширение.
//Напишите функцию, которая на основе расширения файла возвращает его тип:
//"Текстовый документ", "Изображение", "Таблица" или "Неизвестный тип".

//Задание 6: "Конвертация Температуры"
//Контекст: Создайте функцию, которая конвертирует температуру из градусов Цельсия в Фаренгейты и наоборот
//в зависимости от указанной единицы измерения (C/F). Единицу измерения нужно передать вторым аргументом функции.
//Несколько аргументов передаются через запятую. Возвращать нужно строку. Подсказка: для генерации строки
//из числа и буквы можно использовать шаблон “$result F” для фаренгейта или “$result C” для цельсия

//Задание 7: "Подбор Одежды по Погоде"
//Контекст: Напишите функцию, которая на основе температуры воздуха рекомендует тип одежды:
//"куртка и шапка" при температуре ниже 0, "ветровка" от 0 до 15 градусов и "футболка и шорты" при температуре выше 15.
//При температурах ниже -30 и выше +35 рекомендуйте не выходить из дома.

//Задание 8: "Выбор Фильма по Возрасту"
//Контекст: Кинотеатр предлагает фильмы разных возрастных категорий.
//Напишите функцию, которая принимает возраст зрителя и возвращает доступные для него категории фильмов:
//"детские", "подростковые", "18+".
