package com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson29.homework

import java.time.LocalDate

object LocalDateForYear {

    private val localDateForYear1 = LocalDate.of(1946, 1, 1)
    private val localDateForYear2 = LocalDate.of(1964, 12, 31)
    private val localDateForYear3 = LocalDate.of(1997, 1, 1)
    private val localDateForYear4 = LocalDate.of(2012, 12, 31)

    fun getDate1(): LocalDate = localDateForYear1
    fun getDate2(): LocalDate = localDateForYear2
    fun getDate3(): LocalDate = localDateForYear3
    fun getDate4(): LocalDate = localDateForYear4

}