package com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson10

fun main() {

//Решай задачи в виде отдельных функций если это имеет смысл.
//Работа с массивами Array
//Задание 1: Создание и Инициализация Массива
//Создайте массив из 5 целых чисел и инициализируйте его значениями от 1 до 5.

    val array1 = arrayOf(1, 2, 3, 4, 5)

    println("Задание 1:")
    print(array1.toList())

//Задание 2: Создание Пустого Массива
//Создайте пустой массив строк размером 10 элементов.

    val array2 = Array(10) { "" }

    println("\n\nЗадание 2:")
    print(array2.toList())

//Задание 3: Заполнение Массива в Цикле
//Создайте массив из 5 элементов типа Double и заполните его значениями, являющимися удвоенным индексом элемента.

    val array3 = Array(5) { 0.0 }

    for (i in array3.indices) {
        array3[i] = (i * i).toDouble()
    }

    println("\n\nЗадание 3:")
    print(array3.toList())

//Задание 4: Изменение Элементов Массива
//Создайте массив из 5 элементов типа Int. Используйте цикл, чтобы присвоить каждому элементу значение,
//равное его индексу, умноженному на 3.

    val array4 = Array(5) { 0 }

    for (i in array4.indices) {
        array4[i] = (i * 3)
    }

    println("\n\nЗадание 4:")
    print(array4.toList())

//Задание 5: Работа с Nullable Элементами
//Создайте массив из 3 nullable строк. Инициализируйте его одним null значением и двумя строками.

    val array5 = kotlin.arrayOfNulls<String?>(3)

    array5[1] = "Строка 1"
    array5[2] = "Строка 2"

    println("\n\nЗадание 5:")
    print(array5.toList())

//Задание 6: Копирование Массива
//Создайте массив целых чисел и скопируйте его в новый массив в цикле.

    val array6 = arrayOf(1, 2, 3, 3, 2, 1)
    val arrayNew = Array(6) { 0 }

    for (i in array6.indices) {
        arrayNew[i] = array6[i]
    }

    println("\n\nЗадание 6:")
    print(arrayNew.toList())

//Задание 7: Разница Двух Массивов
//Создайте два массива целых чисел одинаковой длины. Создайте третий массив, вычев значения одного из другого.

    val array71 = arrayOf(1, 2, 3, 3, 2, 1)
    val array72 = arrayOf(4, 6, 9, 9, 6, 4)

    val lastIndex71 = array71.lastIndex
    val lastIndex72 = array72.lastIndex

    val arrayDif = Array(lastIndex71) { 0 }

    if (lastIndex71 == lastIndex72) {
        for (i in arrayDif.indices) {
            arrayDif[i] = array71[i] - array72[i]
        }
    }

    println("\n\nЗадание 7:")
    print(arrayDif.toList())

//Задание 8: Поиск Индекса Элемента
//Создайте массив целых чисел. Найдите индекс элемента со значением 5. Если значения 5 нет в массиве, возвращаем -1.
//Реши задачу через цикл while.

    val array8 = arrayOf(1, 2, 3, 4, 5, 0, 5)
    var index = array8.lastIndex
    var check5 = false

    println("\n\nЗадание 8:")

    while (index > 0) {
        when (array8[index]) {
            5 -> {
                print("$index ")
                index--
                check5 = true
            }
            else -> index--
        }
    }

    if (!check5) {
        print(-1)
    }

//Задание 9: Перебор Массива
//Создайте массив целых чисел. Используйте цикл для перебора массива и вывода каждого элемента в консоль.
//Напротив каждого элемента должно быть написано “чётное” или “нечётное”.

    val array9 = arrayOf(1, 2, 3, 4, 0, 4, 3, 2, 1)
    var text = ""

    println("\n\nЗадание 9:")

    for (i in array9.indices) {
        if (array9[i] % 2 == 0) {
            text = "чётное"
            println("${array9[i]} $text")
        }
        if (array9[i] % 2 == 1) {
            text = "нечётное"
            println("${array9[i]} $text")
        }
    }

    val array10 = arrayOf("ю", "л", "и", "я")
    val string = "и"

    println("\nЗадание 10:")
    println(getArray(array10, string))
}

//Задание 10: Поиск Значения в Массиве по вхождению
//Создай функцию, которая принимает массив строк и строку для поиска.
//Функция должна находить в массиве элемент, в котором принятая строка является подстрокой (метод contains()).
//Верни найденный элемент из функции в виде строки.

fun getArray(array10: Array<String>, string: String): String {
    for (i in array10.indices) {
        if (array10.contains(string)) {
            return (string)
        }
    }
    return ("")
}