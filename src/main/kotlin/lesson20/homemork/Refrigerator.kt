package com.juliatoltaeva.lesson20.homemork

//Создай абстрактные классы устройств, используя эти интерфейсы.
//Реализовывать методы не нужно.
//Холодильник

abstract class Refrigerator : Powerable, Openable, TemperatureRegulatable,
    LightEmitting, SoundEmitting, Programmable, Cleanable, Drainable {}