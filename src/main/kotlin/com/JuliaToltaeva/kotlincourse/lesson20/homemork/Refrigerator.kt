package com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson20.homemork

//Создай абстрактные классы устройств, используя эти интерфейсы.
//Реализовывать методы не нужно.
//Холодильник

abstract class Refrigerator : com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson20.homemork.Powerable,
    com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson20.homemork.Openable,
    com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson20.homemork.TemperatureRegulatable,
    com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson20.homemork.LightEmitting,
    com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson20.homemork.SoundEmitting,
    com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson20.homemork.Programmable,
    com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson20.homemork.Cleanable,
    com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson20.homemork.Drainable {}