package com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson24.homework

//Задание 4. Создай свой тип исключения в отдельном файле, наследуемый от
// AssertionError и принимающий текст. Выброси это исключение в main

class AssertionErrorExt(message: String) : AssertionError(message) {}