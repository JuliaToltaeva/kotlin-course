package com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson28.homework

import java.io.File

fun main() {

//Задача 1
//Создайте текстовый файл workspace/task1/example.txt
//запишите в него строку "Hello, Kotlin!", а затем проверьте, существует ли файл.

    println("\nЗадача 1")

    val file = File("workspace/task1/example.txt")

    file.apply {
        parentFile.mkdirs()
        createNewFile()
        writeText("Hello, Kotlin!")
    }

    if (file.exists()) {
        println("Файл существует")
    } else {
        println("Файл не существует")
    }


//Задача 2
//Создайте директорию workspace/task2/testDir
//проверьте, является ли она директорией, и выведите её абсолютный путь.

    println("\nЗадача 2")

    val dir2 = File("workspace/task2/testDir")
    dir2.mkdirs()

    dir2.apply {
        if (isDirectory) {
            println("Является директорией")
            println(absolutePath)
        } else {
            println("Не является директорией")
        }
    }


//Задача 3
//Создайте директорию workspace/task3/structure.
//Внутри директории structure создайте папку myDir с двумя вложенными поддиректориями subDir1 и subDir2.
//Проверьте, что myDir действительно содержит эти поддиректории.

    println("\nЗадача 3")

    val dir3 = File("workspace/task3/structure")
    dir3.mkdirs()



//Задача 4
//Создайте директорию workspace/task4/temp.
//Внутри директории temp создайте несколько вложенных файлов и директорий. Удалите директорию workspace/task4 со всем
//содержимым

//Задача 5
//Создайте файл workspace/task5/config/config.txt
//запишите в него список параметров (в формате ключ=значение), а затем прочитайте файл и выведите только значения.

//Задача 6
//Пройди по всем вложенным директориям workspace и выведи в консоль сначала пути директорий, а потом пути файлов

//Задача 7
//Создайте директорию workspace/task9/docs.
//Проверь, есть ли файл с именем readme.md. Если файла нет, создайте его и запишите текст "This is a README file."

//Задача 8
//Создайте файлы
//workspace/task10/data/1/4/prod/data14.mysql
//workspace/task10/data/2/3/prod/data23.mysql
//workspace/task10/data/5/2/prod/data52.mysql
//Создайте директорию workspace/task10/backup и скопируйте туда файлы из workspace/task10/data сохраняя структуру
//директорий. Для копирования используй метод copyTo

}

