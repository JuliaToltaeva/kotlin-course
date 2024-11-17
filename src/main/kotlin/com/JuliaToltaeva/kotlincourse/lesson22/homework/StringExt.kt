package com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson22.homework

//Задача 5: Кодер-декодер строк
//Реализуйте для класса String два метода расширения: encrypt и decrypt.

// Метод encrypt должен сдвигать каждый символ исходной строки на заданное
// число позиций вперед по таблице Unicode, а метод decrypt — на то же число
// позиций назад. Оба метода принимают один параметр base типа Int, который
// определяет величину сдвига.
//
// Протестируйте вашу реализацию, убедившись, что
// после шифрования и последующей расшифровки строка возвращается к исходному
// состоянию.
//Сдвиг по таблице Unicode реализуется простым прибавлением или вычитанием
// размера сдвига к char символу.


fun String.encrypt(base: Int): String {

    return this.map { (it + base).toChar() }
        .joinToString { "" }
}


fun String.decrypt(base: Int): String {

    return this.map { (it - base).toChar() }
        .joinToString { "" }
}
