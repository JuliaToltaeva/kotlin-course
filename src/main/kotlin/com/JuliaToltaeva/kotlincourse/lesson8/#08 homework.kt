package com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson8

fun main () {
    println(changeString01("Это невозможно выполнить за один день"))
    println(changeString02("Я не уверен в успехе этого проекта"))
    println(changeString03("Произошла катастрофа на сервере"))
    println(changeString04("Этот код работает без проблем"))
    println(changeString05("Удача"))

    val string = "Пользователь вошел в систему -> 2021-12-01 09:48:23"
    println(getData(string))
    println(getTime(string))

    println(maskPersonalData("4539 1488 0343 6467"))
    println(formatEMail("username@example.com"))
    println(getFileName("C:/Пользователи/Документы/report.txt"))
    println(makeAbbrev("Объектно-ориентированное программирование"))

    println(getString("Юля классная девушка"))

    println(encrypt("KotlinF"))
    println(decrypt("oKltni0F"))

    getTable(9)

}

//Создайте функцию, которая будет анализировать входящие фразы и применять к ним различные преобразования,
//делая текст более ироничным или забавным. Функция должна уметь распознавать ключевые слова или условия и
//соответственно изменять фразу.
//Правила Проверки и Преобразования:
//Если фраза содержит слово "невозможно":
//Преобразование: Замените "невозможно" на "совершенно точно возможно, просто требует времени".

fun changeString01 (string: String) : String{
    return when {
        string.contains("невозможно") -> string.replace("невозможно", "совершенно точно возможно, просто требует времени")
        else -> ""
    }
}

//Если фраза начинается с "Я не уверен":
//Преобразование: Добавьте в конец фразы ", но моя интуиция говорит об обратном".

fun changeString02 (string: String) : String{
    return when {
        string.startsWith("Я не уверен") -> "$string, но моя интуиция говорит об обратном"
        else -> ""
    }
}

//Если фраза содержит слово "катастрофа":
//Преобразование: Замените "катастрофа" на "интересное событие".

fun changeString03 (string: String) : String{
    return when{
        string.contains("катастрофа") -> string.replace("катастрофа", "интересное событие")
        else -> ""
    }
}

//Если фраза заканчивается на "без проблем":
//Преобразование: Замените "без проблем" на "с парой интересных вызовов на пути".

fun changeString04 (string: String) : String{
    return when{
        string.endsWith("без проблем") -> string.replace("без проблем", "с парой интересных вызовов на пути")
        else -> ""
    }
}

//Если фраза содержит только одно слово:
//Преобразование: Добавьте перед словом "Иногда," и после слова ", но не всегда".

fun changeString05 (string: String) : String{
    return when{
        string.isNotEmpty() -> "Иногда,$string, но не всегда"
        else -> ""
    }
}

//Примеры Тестовых Фраз:
//"Это невозможно выполнить за один день"
//"Я не уверен в успехе этого проекта"
//"Произошла катастрофа на сервере"
//"Этот код работает без проблем"
//"Удача"

//Задание 1: Извлечение Даты из Строки Лога. Используй indexOf или split для получения правой части сообщения.
//Описание: У вас есть строка лога вида "Пользователь вошел в систему -> 2021-12-01 09:48:23".
//Извлеките отдельно дату и время из этой строки и сразу распечатай их по очереди.

fun getData (string: String): String {
    val data = string.split(" ")[5]
    return(data)
}

fun getTime (string: String): String {
    val time = string.split(" ")[6]
    return(time)
}

//Задание 2: Маскирование Личных Данных
//Описание: Дана строка с номером кредитной карты "4539 1488 0343 6467".
//Замаскируйте все цифры, кроме последних четырех, символами "*".

fun maskPersonalData (num: String): String{
    return "**** **** **** ${num.split(" ")[3]}"
}

//Задание 3: Форматирование Адреса Электронной Почты. Используй replace
//Описание: У вас есть электронный адрес "username@example.com".
//Преобразуйте его в строку "username [at] example [dot] com".

fun formatEMail (email: String): String{
    val email1 = email.replace("@"," [at] ")
    val email2 = email1.replace(".", " [dot] ")
    return(email2)
}

//Задание 4: Извлечение Имени Файла из Пути
//Описание: Дан путь к файлу "C:/Пользователи/Документы/report.txt". Извлеките название файла с расширением.

fun getFileName (path: String): String{
    val fileName = path.split("/")[3]
    return(fileName)
}

//Задание 5: Создание Аббревиатуры из Фразы. Используй split с набором символов для разделения.
//Используй for для перебора слов. Используй var переменную для накопления первых букв.
//Описание: У вас есть фраза, например "Объектно-ориентированное программирование".
// Создайте аббревиатуру из начальных букв слов (например, "ООП").

fun makeAbbrev (text: String): String{
    val textDelimeters = text.split(" ", "-")
    var abbrev: String = ""

//    val char0 = textDelimeters[0].substring(0,1)
//    val char1 = textDelimeters[1].substring(0,1)
//    val char2 = textDelimeters[2].substring(0,1)
//    return("$char0$char1$char2")

    for (i in 0..2) {
        val char = textDelimeters[i].substring(0, 1)
        abbrev = "$abbrev$char"
    }
    return (abbrev.uppercase())
}

//Дополнительные задания
//Написать метод, который преобразует строку из нескольких слов в строку,
//где каждое слово начинается с заглавной буквы, а все остальные - строчные.
//(можно использовать такой же подход как в задании 5, но накапливать не первые буквы, а целиком слова,
//составленные из первой буквы с uppercase и оставшейся части слова)

fun getString (stringIn: String): String{
    val stringDelimeters = stringIn.split(" ")

    var stringOut = ""
    var charTitleFirst: String = ""
    var charNotTitleElse: String = ""

    for (i in 0..2) {
        charTitleFirst = stringDelimeters[i].substring(0,1).uppercase()
        charNotTitleElse = stringDelimeters[i].substring(1)
        stringOut = "$stringOut $charTitleFirst$charNotTitleElse"
    }
    return (stringOut.substring(1))
}

//Написать шифратор/дешифратор для строки. Шифровка производится путём замены двух соседних букв между собой:
//Kotlin шифруется в oKltni. Дешифровка выполняется аналогично.
//Если длина строки - нечётная, в конец добавляется символ пробела до начала шифрования.
//Таким образом все шифрованные сообщения будут с чётной длинной.
//Должно получиться два публичных метода: encrypt() и decrypt() которые принимают и возвращают строку.

fun encrypt (string: String): String {
    var stringOut = ""
    val stringAmountEvenNum = string.length % 2
    val length = string.length
    if (stringAmountEvenNum == 0) {
        for (i in 0..<length step 2) {
            val char0 = string.substring(i + 1, i + 2)
            val char1 = string.substring(i, i + 1)
            val char01 = "$char0$char1"
            stringOut = "$stringOut$char01"
        }
    }
    else {
        for (i in 0..length - 2 step 2) {
            val char0 = string.substring(i + 1, i + 2)
            val char1 = string.substring(i, i + 1)
            val char01 = "$char0$char1"
            stringOut = "$stringOut$char01"
        }
        val charEnd = string.substring(length-1)
        val charEnd0 = "0"
        val charEndEnd0 = "$charEnd0$charEnd"
        stringOut = "$stringOut$charEndEnd0"
    }
    return(stringOut)
}

fun decrypt (string: String): String {
    var stringIn = ""
    val length = string.length

    for (i in 0..<length step 2) {
        val char0 = string.substring(i + 1, i + 2)
        val char1 = string.substring(i, i + 1)
        val char01 = "$char0$char1"
        stringIn = "$stringIn$char01"
    }

    stringIn.replace("0","")
    return(stringIn)
}

//Таблица с примерами форматирования строк
//https://docs.google.com/spreadsheets/d/11hRZpqELzL35UCwQoZioEzK1f1FTYrSRj_lh-14rzXA/edit?usp=drive_link

//Таблица умножения
//Вывести таблицу умножения в консоль так, чтобы были ровные строки и столбцы. В заголовках столбцов и строк -
//числа для перемножения. В перекрестии - результат умножения. Каждый столбец должен быть выровнен по правому краю.
//Для печати результата в той же строке использовать print()
//Для перехода на следующую строку использовать println()
//Для выравнивания использовать функции форматирования строк с шаблоном (%s)
//Результат должен выглядеть как на скриншоте.
//Для усложнения задачи, можно в метод передавать размерность таблицы по вертикали и горизонтали и
//динамически рассчитывать количество пробелов для форматирования.

fun getTable(limit: Int): String {
    // первая строка
    print(" ")
    for (i in 1..limit) {
        print(String.format("%3s", i))
    }
    // перенос строки
    println(" ")
    //
    for (i in 1..limit) {
        print("$i ")
        for (k in 1..limit) {
            val multy = (i * k).toString()
            if (multy.length <= 1) {
                print(String.format("%2s", multy))
                print(" ")

            } else if(multy.length == 2){
                print("$multy ")
            }
        }
        println(" ")
    }
    return("")
}