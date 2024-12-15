package com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson29.homework

import java.time.*
import java.time.format.DateTimeFormatter
import java.time.temporal.Temporal

fun main() {

//Создай текущую временнУю метку и выведи её на печать (чтобы ещё раз запомнить название этого класса)

    val instant = Instant.now()
    println("Задача 1")
    println("Текущая временнАя метка")
    println(instant)


//Создай дату своего дня рождения.

    val birthday = LocalDate.of(
        1990,
        9,
        12
    )


//Создай период между датой своего рождения и текущей датой.
//Выведи на печать количество лет из этого периода.

    println("\nЗадача 3")

    val today = LocalDate.now()
    val period = Period.between(birthday, today)

    println("Количество лет из периода между датой рождения и текущей датой")
    println(period.years)


//Создай функцию, которая принимает тип Temporal и выводит форматированное значение в зависимости от того,
//содержит ли аргумент время и часовой пояс. Temporal - это общий тип для разных классов даты-времени.
//В форматированном значении нужно выводить часы, минуты, секунды и таймзону, если они представлены в переданном объекте.
//Обработай в методе все типы дат, которые знаешь.
//Реализуй два варианта функции - с собственный форматированием и с форматами из ISO коллекции.

    println("\nЗадача 4")

    val myFormatDate = fun(timeInner: Temporal): String {

        val formatter = DateTimeFormatter.ofPattern(
            "HH:mm:ss ZZZ"
        )

        return when (timeInner) {

            is ZonedDateTime -> {
                timeInner.format(formatter)
            }

            is OffsetDateTime -> {
                timeInner.format(formatter)
            }

            else -> {
                "Этот тип даты не содержит время и/или часовой пояс"
            }
        }

    }

    val isoFormatDate = fun(timeInner: Temporal): String {

        val formatter = DateTimeFormatter.ISO_ZONED_DATE_TIME

        return when (timeInner) {

            is ZonedDateTime -> {
                timeInner.format(formatter)
            }

            is OffsetDateTime -> {
                timeInner.format(formatter)
            }

            else -> {
                "Этот тип даты не содержит время и/или часовой пояс"
            }
        }

    }


    val localDate = LocalDate.now()
    val localTime = LocalTime.now()
    val localDateTime = LocalDateTime.now()
    val zonedDateTime = ZonedDateTime.now()
    val offsetDateTime = OffsetDateTime.now()

    val listForPrint = listOf(
        Pair("LocalDate", localDate),
        Pair("LocalTime", localTime),
        Pair("LocalDateTime", localDateTime),
        Pair("Instant", instant),
        Pair("ZonedDateTime", zonedDateTime),
        Pair("OffsetDateTime", offsetDateTime)
    )

    println("Мой формат с использованием текущего времени:")

    listForPrint.forEach { (key, value) ->
        println("$key, ${myFormatDate(value)}")
    }

    println("\nISO формат с использованием текущего времени:")

    listForPrint.forEach { (key, value) ->
        println("$key, ${isoFormatDate(value)}")
    }


//Создай объекты дат и / или времени которые мы изучили и по очереди передай их в метод созданный выше.
//Не используй в них метод now()

    println("\nЗадача 5")

    val localDate2 = LocalDate.of(
        2025, 1, 1
    )
    val localTime2 = LocalTime.of(
        1, 1, 1
    )
    val localDateTime2 = LocalDateTime.of(
        2025, 1, 1, 1, 1, 1
    )
    val zonedDateTime2 = ZonedDateTime.of(
        localDateTime, ZoneId.of("Europe/Vatican")
    )
    val offsetDateTime2 = OffsetDateTime.of(
        localDateTime, ZoneOffset.ofHours(3)
    )

    val instant2 = Instant.ofEpochSecond(123456789)

    val listForPrint2 = listOf(
        Pair("LocalDate", localDate2),
        Pair("LocalTime", localTime2),
        Pair("LocalDateTime", localDateTime2),
        Pair("Instant", instant2),
        Pair("ZonedDateTime", zonedDateTime2),
        Pair("OffsetDateTime", offsetDateTime2)
    )

    println("Мой формат с использованием указанного времени:")

    listForPrint2.forEach { (key, value) ->
        println("$key, ${myFormatDate(value)}")
    }

    println("\nISO формат с использованием указанного времени:")

    listForPrint2.forEach { (key, value) ->
        println("$key, ${isoFormatDate(value)}")
    }


//Создайте функцию identifyGeneration, которая принимает дату рождения в формате LocalDate и печатает строку,
//определяющую, к какому поколению принадлежит человек: "Бумер" для тех, кто родился с 1946 по 1964 год включительно,
//и "Зумер" для тех, кто родился с 1997 по 2012 год включительно. Если дата рождения не попадает ни в один
//из этих диапазонов, функция должна возвращать "Не определено". Для сравнения дат используй методы isAfter(otherDate)
//и isBefore(otherDate). Объекты с эталонными датами вынеси в приватные поля файла с методом identifyGeneration.

    println("\nЗадача 6")

    val identifyGeneration = fun(birthday: LocalDate) {

        return when {

            (birthday.isAfter(LocalDateForYear.getDate1()) || birthday == LocalDateForYear.getDate1())
                    &&
                    (birthday.isBefore(LocalDateForYear.getDate2()) || birthday == LocalDateForYear.getDate2())
                        -> println("Бумер")

            (birthday.isAfter(LocalDateForYear.getDate3()) || birthday == LocalDateForYear.getDate3())
                    &&
                    (birthday.isBefore(LocalDateForYear.getDate4()) || birthday == LocalDateForYear.getDate4())
                        -> println("Зумер")

            else -> println("Не определено")
        }
    }

    println(
        "Должны быть не определены: " +
                "1940, " +
                "1965, " +
                "1980, " +
                "1945-12-31, " +
                "1996-12-31"
    )

    identifyGeneration(LocalDate.of(1940, 1, 1))
    identifyGeneration(LocalDate.of(1945, 12, 31))
    identifyGeneration(LocalDate.of(1965, 1, 1))
    identifyGeneration(LocalDate.of(1980, 1, 1))
    identifyGeneration(LocalDate.of(1996, 12, 31))
    identifyGeneration(LocalDate.of(2013, 11, 1))
    identifyGeneration(LocalDate.of(2020, 11, 1))

    println(
        "\nДолжны быть бумеры: " +
                "1946-1-1, " +
                "1950, " +
                "1964-12-31, "
    )

    identifyGeneration(LocalDate.of(1946, 1, 1))
    identifyGeneration(LocalDate.of(1950, 1, 1))
    identifyGeneration(LocalDate.of(1964, 12, 31))

    println(
        "\nДолжны быть зумеры: " +
                "1997-1-1, " +
                "2005, " +
                "2012-12-31"
    )

    identifyGeneration(LocalDate.of(1997, 1, 1))
    identifyGeneration(LocalDate.of(2005, 1, 1))
    identifyGeneration(LocalDate.of(2012, 12, 31))


//Создай два объекта даты: 25 февраля 2023 года и 25 февраля 2024 года. Создай форматтер, который форматирует дату
// в месяц и день.
//Выведи первую отформатированную дату, прибавив к ней 10 дней.
//Выведи вторую отформатированную дату, прибавив к ней 10 дней.
//Найди отличия)))
}