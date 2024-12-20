package com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson30.homework

//Задание 1
//Создай Enum со статусами прохождения теста (pass, broken, failure).
//Создай Enum с типами жилой недвижимости для сайта аренды, включая человекопонятные названия этих типов.
//Создай Enum с планетами солнечной системы, включая расстояние до солнца в астрономических единицах и вес планеты.

enum class TestResult {
    PASS,
    BROKEN,
    FAILURE;

    //Задание 3
    //Создай функцию, которая принимает лямбду без аргументов и возвращаемого значения и возвращает Enum
    //со статусом прохождения теста в зависимости от того как выполнится принятая лямбда.
    //Если без исключений - pass, если будет AssertionError - failure, прочие исключения - broken.

    fun getTestResult(arg: () -> Unit): TestResult {
        return try {
            arg()
            PASS
        } catch (e: AssertionError) {
            FAILURE
        } catch (e: Exception) {
            BROKEN
        }
    }
}

enum class RentalSite(val rentalType: String) {
    RESIDENTAL_BUILDINGS("Жилые дома"),
    APARTMENTS("Квартиры"),
    ROOMS("Комнаты");

    //Задание 2
    //Создай функцию, которая выводит на печать человекочитаемые названия типов недвижимости в порядке
    // возрастания длины названия enum.

    fun printRentalSite() {
        entries.sortedBy { it.rentalType.length }
            .forEach { println(it.rentalType) }

    }
}

enum class Planets(
    private val distance: Double,
    val weight: Double
) {
    MERCURY(0.39, 0.330e24),
    VENUS(0.72, 4.87e24),
    EARTH(1.00, 5.97e24),
    MARS(1.52, 0.642e24),
    JUPITER(5.20, 1898e24),
    SATURN(9.58, 568e24),
    URANUS(19.22, 86.8e24),
    NEPTUNE(30.05, 102e24);

    //Задание 4
    //Создай функцию, которая принимает лямбду и возвращает enum планеты. Лямбда должна принимать планету
    // и возвращать булево значение. Лямбда здесь выступает в качестве фильтра, который должен отфильтровать
    // список всех планет по какому-либо признаку (расстояние или вес). Вернуть нужно первый элемент из
    // отфильтрованного списка или выкинуть исключение если список пустой.

    fun filterPlanets(arg: (Planets) -> Boolean): Planets {
        return entries.firstOrNull ( arg ) ?: throw Exception()
    }

}


fun main() {
    RentalSite.RESIDENTAL_BUILDINGS.printRentalSite()
}
