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

    println("Мой формат:")
    println("LocalDate: ${myFormatDate(localDate)}")
    println("LocalTime: ${myFormatDate(localTime)}")
    println("LocalDateTime: ${myFormatDate(localDateTime)}")
    println("Instant: ${myFormatDate(instant)}")
    println("ZonedDateTime: ${myFormatDate(zonedDateTime)}")
    println("OffsetDateTime: ${myFormatDate(offsetDateTime)}")

    println("\nISO формат:")
    println("LocalDate: ${isoFormatDate(localDate)}")
    println("LocalTime: ${isoFormatDate(localTime)}")
    println("LocalDateTime: ${isoFormatDate(localDateTime)}")
    println("Instant: ${isoFormatDate(instant)}")
    println("ZonedDateTime: ${isoFormatDate(zonedDateTime)}")
    println("OffsetDateTime: ${isoFormatDate(offsetDateTime)}")


//Создай объекты дат и / или времени которые мы изучили и по очереди передай их в метод созданный выше.
//Не используй в них метод now()

//Создайте функцию identifyGeneration, которая принимает дату рождения в формате LocalDate и печатает строку,
//определяющую, к какому поколению принадлежит человек: "Бумер" для тех, кто родился с 1946 по 1964 год включительно,
//и "Зумер" для тех, кто родился с 1997 по 2012 год включительно. Если дата рождения не попадает ни в один
//из этих диапазонов, функция должна возвращать "Не определено". Для сравнения дат используй методы isAfter(otherDate)
//и isBefore(otherDate). Объекты с эталонными датами вынеси в приватные поля файла с методом identifyGeneration.

//Создай два объекта даты: 25 февраля 2023 года и 25 февраля 2024 года. Создай форматтер, который форматирует дату
// в месяц и день.
//Выведи первую отформатированную дату, прибавив к ней 10 дней.
//Выведи вторую отформатированную дату, прибавив к ней 10 дней.
//Найди отличия)))
}