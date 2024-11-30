package com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson24.homework

//Задание 1. Воспроизвести фрагменты кода, которые могут привести к
// возникновению исключений:

fun inFun() {
    inFun()
}

fun setYear1(year: Int) {
    require(year >= 0) {
        "текст ошибки 1"
    }
}

fun setYear2(year: Int) {
    check(year >= 0) {
        "текст ошибки 2"
    }
}

fun main() {

    //NullPointerException

    val argNull = null
    argNull!!

    //ArrayIndexOutOfBoundsException

    val array = arrayOf(0, 1, 2, 3, 4)
    array[5]

    //ClassCastException

    array as String

    //NumberFormatException

    "string".toInt()

    //IllegalArgumentException

    setYear1(-1)

    //IllegalStateException

    setYear2(-1)

    //OutOfMemoryError

    val list = mutableListOf("")

    while (true) {

        list.add("забиваем память до ошибки")

    }


    //StackOverflowError

    inFun()

//Задание 2. Оберни все вызовы из предыдущего задания в блок try-catch и
// создай для каждого типа ошибки свой catch блок


    try {

        // NullPointerException
        argNull!!

        // ArrayIndexOutOfBoundsException
        val array = arrayOf(0, 1, 2, 3, 4)
        array[6]

        //ClassCastException
        array as String

        //NumberFormatException
        "string".toInt()

        //IllegalArgumentException
        setYear1(-1)

        //IllegalStateException
        setYear2(-1)

        //OutOfMemoryError
        while (true) {
            list.add("забиваем память до ошибки")
        }

        //StackOverflowError
        inFun()


    } catch (e: NullPointerException) {

        throw NullPointerException()

    } catch (e: ArrayIndexOutOfBoundsException) {

        throw ArrayIndexOutOfBoundsException()

    } catch (e: ClassCastException) {

        throw ClassCastException()

    } catch (e: NumberFormatException) {

        throw NumberFormatException()

    } catch (e: IllegalArgumentException) {

        throw IllegalArgumentException()

    } catch (e: IllegalStateException) {

        throw IllegalStateException()

    } catch (e: OutOfMemoryError) {

        throw OutOfMemoryError()

    } catch (e: StackOverflowError) {

        throw StackOverflowError()

    } finally {

        println("finally block")

    }


//Задание 3. Оберни все вызовы из предыдущего задания в блок try-catch с одним
// блоком catch для любого типа исключений. Внутри блока catch, используя when,
// напиши для каждого исключения вывод в консоль специфического сообщения,
// подходящего под каждый из типов.

    try {

        argNull!!

    } catch (e: Throwable) {

        when (e) {

            is NullPointerException -> println("NullPointerException")
            is ArrayIndexOutOfBoundsException -> println("ArrayIndexOutOfBoundsException")
            is ClassCastException -> println("ClassCastException")
            is NumberFormatException -> println("NumberFormatException")
            is IllegalArgumentException -> println("IllegalArgumentException")
            is IllegalStateException -> println("IllegalStateException")
            is OutOfMemoryError -> println("OutOfMemoryError")
            is StackOverflowError -> println("StackOverflowError")
            else -> "нет исключения"

        }

    }


//Задание 4. Создай свой тип исключения в отдельном файле, наследуемый от
// AssertionError и принимающий текст. Выброси это исключение в main

    throw AssertionErrorExt("AssertionErrorExt")

//Задание 5. Создай свой тип исключения в отдельном файле, наследуемый от
// RuntimeException и принимающий ArrayIndexOutOfBoundsException тип в качестве
// аргумента. Напиши код, который спровоцирует выброс ArrayIndexOutOfBoundsException,
// перехвати его с помощью try-catch и в блоке catch выведи сообщение в консоль
// и сделай выброс своего типа исключения.


    try {

        val array5 = arrayOf(0, 1, 2, 3, 4)
        array5[6]

    } catch (e: Exception) {

        when (e) {

            is NullPointerException -> {
                println("NullPointerException")
                throw NullPointerException()
            }

            is ArrayIndexOutOfBoundsException -> {
                println("ArrayIndexOutOfBoundsException")
                throw RuntimeExceptionExt(e)
            }

            is RuntimeException -> {
                println("RuntimeException")
                throw RuntimeException()
            }

            else -> "нет исключения"

        }

    }


}






