package com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson22.homework

import kotlin.math.absoluteValue

//Домашнее задание оформляем в ветке master в пакете lesson22.homework,
// расширения для каждого типа создаём в отдельном файле TypeExt как я
// показывал на уроке. При невыполнении этого требования домашка не засчитывается.


//Задача 2:Сконструируй объекты, позволяющие вызвать определённые выше функции
// и вызови их.

fun main() {

    val object1: Array<Int> = arrayOf(1, 2, 3)

    val object2: Char = 'c'

    val object3: MutableList<Number?> = mutableListOf(
        1,
        2,
        null
    )

    val object4: Map<String?, List<String>> = mapOf(
        null to listOf("string1", "string2", "string3"),
        "10" to listOf("string1", "string2", "string3"),
        "20" to listOf("string1", "string2", "string3"),
    )

    val object5: Long = 123455678L


    object1.useArray()

    object2.useChar(1, 2, true)

    object3.useMutableList(10, 20)

    object4.useMap(10)

    object5.useLong()


    val movingPair1 = Pair("ключ", "значение")

    val movingPair2 = Pair(null, "значение")

    val movingPair3 = Pair("ключ", null)
    // насколько помню, то ключ не может быть нулевой
    // поэтому здесь нужна проверка
    // но я болею, у меня нет на нее сил

    val movingPair4 = Pair(null, null)
    // и тут тоже нет сил на проверку


    println("movingPair1 ${movingPair1.revert()}")

    println("movingPair2 ${movingPair2.revert()}")

    println("movingPair3 ${movingPair3.revert()}")

    println("movingPair4 ${movingPair4.revert()}")


    val checkingWithin1 = 100.within(101, 1)

    val checkingWithin2 = 100.00.within(101.00, 1.00)

    val checkingWithin3 = 100L.within(101L, 1L)


    println("checkingWithin1 $checkingWithin1")

    println("checkingWithin2 $checkingWithin2")

    println("checkingWithin3 $checkingWithin3")



    val elem = "d"

    val encryptingElement = elem.encrypt(2)

    val decryptingElement = encryptingElement.decrypt(2)

    println("encryptingElement $encryptingElement")

    println("decryptingElement $decryptingElement")


}




//Задача 6: Собери пидмаркоз!
//
//Многие уже знают любимую игру в Твиттере - собирание разных слов из букв
// через ответы (но мы то знаем что слово только одно, но не будем его
// называть). Напиши метод расширения строки, который будет принимать список
// имён пользователей и выводить в консоли эту строку побуквенно в столбик:
// имя автора и букву под ним. Если сможешь повторить оригинальный шаблон
// вывода ответов с помощью похожих ASCII символов, будет очень круто.
// Вот ссылка на референс:
//https://x.com/SadNSober_/status/1370280031616897026
//
//Если не удаётся открыть ссылку, вот скрин
//
//
//
//
//
//Решения доступны по ссылке (после отправки доната)
//17. Расширение классов - решения



