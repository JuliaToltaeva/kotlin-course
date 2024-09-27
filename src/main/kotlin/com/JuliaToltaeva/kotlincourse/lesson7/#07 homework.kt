package com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson7

fun main() {
//    println(cycle1())
//    println(cycle2())
//    println(cycle3())
//    println(cycle4())
//    println(cycle5())
//    println(cycle6())
//    println(cycle7())
//    println(cycle8())
//    println(cycle9())
//    println(cycle10())
//    println(cycle11())
//    println(cycle12())
//    println(cycle13())
//    println(cycle14())
//    println(cycle15())
    println(cycle16())
}

//Задания для Цикла for
//Прямой Диапазон:
//Напишите цикл for, который выводит числа от 1 до 5.

fun cycle1(): String{
    for (i in 1..5) {
        print("$i ")
    }
    return(" ")
}

//Напишите цикл for, который выводит четные числа от 1 до 10.

fun cycle2(): String {
    for (i in 1..10) {
        if (i % 2 == 0) {
            print("$i ")
        }
    }
    return (" ")
}

//Обратный Диапазон:
//Создайте цикл for, который выводит числа от 5 до 1.

fun cycle3(): String {
    for (i in 5 downTo 1) {
        print("$i ")
    }
    return (" ")
}

//Создайте цикл for, который выводит числа от 10 до 1, уменьшая их на 2.

fun cycle4(): String {
    for (i in 10 downTo 1 step 2) {
        print("$i ")
    }
    return (" ")
}

//С Шагом (step):
//Используйте цикл for с шагом 2 для вывода чисел от 1 до 9.

fun cycle5(): String {
    for (i in 1..9 step 2) {
        print("$i ")
    }
    return (" ")
}

//Напишите цикл for, который выводит каждое третье число в диапазоне от 1 до 20.

fun cycle6(): String {
    for (i in 1..20 step 3) {
        print("$i ")
    }
    return (" ")
}

//Использование До (until):
//Используйте цикл for и until, чтобы вывести числа из диапазона 1-9 (9 не включается).

fun cycle7(): String {
    for (i in 1 until 9){
        print("$i ")
    }
    return (" ")
}

//Напишите цикл for с until, чтобы вывести числа от 3 до 15, не включая 15.

fun cycle8(): String {
    for (i in 3 until 15) {
        print("$i ")
    }
        return (" ")
}

//Задания для Цикла while
//Цикл while:
//Создайте цикл while, который выводит квадраты чисел от 1 до 5.

fun cycle9(): String {
    var counter = 1
    while (counter++ < 5) {
        var multiplier = counter*counter
        print("$multiplier ")
    }
    return (" ")
}

//Напишите цикл while, который уменьшает число от 10 до 5. После этого вывести результат в консоль
fun cycle10(): String {
    var counter1 = 10
    while (counter1 >= 5) {
        print("$counter1 ")
        counter1--
    }
    return (" ")
}

//Цикл do...while:
//Используйте цикл do...while, чтобы вывести числа от 5 до 1.

fun cycle11(): String {
    var counter2 = 5
    do {
        print(counter2--)
        print(" ")
    } while (counter2 >= 1)
    return (" ")
}

//Создайте цикл do...while, который повторяется, пока счетчик меньше 10, начиная с 5.

fun cycle12(): String {
    var counter3 = 5
    do {
        print(counter3++)
        print(" ")
    } while (counter3 < 10)
    return (" ")
}

//Задания для Прерывания и Пропуска Итерации
//Использование break:
//Напишите цикл for от 1 до 10 и используйте break, чтобы выйти из цикла при достижении 6.

fun cycle13(): String {
    for (i in 1..10) {
        if (i == 6) break
        print("$i ")
    }
return (" ")
}

//Создайте цикл while, который бесконечно выводит числа, начиная с 1, но прерывается при достижении 10.

fun cycle14(): String {
    var counter4 = 1
    while (true) {
        print(counter4++)
        print(" ")
        if (counter4 == 10) break
    }
return (" ")
}

//Использование continue:
//В цикле for от 1 до 10 используйте continue, чтобы пропустить четные числа.

fun cycle15(): String {
    for (i in 1..10) {
        if (i%2 == 0) {
            print(i)
            print(" ")
            continue
        }
    }
    return (" ")
}

////Напишите цикл while, который выводит числа от 1 до 10, но пропускает числа, кратные 3.

fun cycle16(): String {
    var count = 1
    while (count <= 10) {
        if (count < 3) {
            count++
            continue
        } else {
            if (count % 3 == 0) {
                print(count)
                print(" ")
            }
        }
        count++
    }
    return (" ")
}

//
////Задача на вложенный цикл
////Создать цикл в цикле, в каждом использовать диапазон от 1 до 10.
////В консоль вывести результат умножения переменных цикла.
////Результат умножения выводить через print() и добавлять ещё один print(“ ”) с пробелом, чтобы отделять значения в строку.
////После вложенного цикла выводить пустой println() чтобы следующий проход начинать с новой строки.
////Результат должен быть как на картинке.