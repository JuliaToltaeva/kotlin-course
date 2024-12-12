package com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson28.homework

import com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson22.classwork.createList
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
        println("Файл существует: ${file.name}")
    } else {
        println("Файл не существует: ${file.name}")
    }


//Задача 2
//Создайте директорию workspace/task2/testDir
//проверьте, является ли она директорией, и выведите её абсолютный путь.

    println("\nЗадача 2")

    val testDir = File("workspace/task2/testDir")
    testDir.mkdirs()

    testDir.apply {
        if (isDirectory) {
            println("Является директорией: ${testDir.name}")
            println("Абсолютный путь: $absolutePath")
        } else {
            println("Не является директорией: ${testDir.name}")
        }
    }


//Задача 3
//Создайте директорию workspace/task3/structure.
//Внутри директории structure создайте папку myDir с двумя вложенными поддиректориями subDir1 и subDir2.
//Проверьте, что myDir действительно содержит эти поддиректории.

    println("\nЗадача 3")

    val structure = File("workspace/task3/structure")
    structure.mkdirs()

    val myDir = File("workspace/task3/structure/myDir")
    myDir.mkdir()

    val subDir1 = File("workspace/task3/structure/myDir/subDir1")
    subDir1.mkdir()

    val subDir2 = File("workspace/task3/structure/myDir/subDir2")
    subDir2.mkdir()

    val checkDir = fun(subDir: File) {
        if (subDir.exists() && subDir.isDirectory) {
            println("Директория создана: ${subDir.name}")
        } else {
            println("Директория не создана: ${subDir.name}")
        }
    }

    checkDir(subDir1)
    checkDir(subDir2)

//Задача 4
//Создайте директорию workspace/task4/temp.
//Внутри директории temp создайте несколько вложенных файлов и директорий.
//Удалите директорию workspace/task4 со всем содержимым

    println("\nЗадача 4")

    val temp = File("workspace/task4/temp")
    temp.mkdirs()

    val tempFile1 = File("workspace/task4/temp/file1.txt")
    val tempFile2 = File("workspace/task4/temp/file2.txt")

    val tempDir1 = File("workspace/task4/temp/dir1")
    val tempDir2 = File("workspace/task4/temp/dir2")

    tempFile1.createNewFile()
    tempFile2.createNewFile()

    tempDir1.createNewFile()
    tempDir2.createNewFile()

    val checkFile = fun(file: File) {
        if (file.exists() && file.isFile) {
            println("Файл создан: ${file.name}")
        } else {
            println("Файл не создан: ${file.name}")
        }
    }

    checkFile(tempFile1)
    checkFile(tempFile2)

    val task4 = File("workspace/task4")

    if (task4.deleteRecursively()) {
        println("Директория удалена: $task4")
    } else {
        println("Директория не удалена: $task4")
    }


//Задача 5
//Создайте файл workspace/task5/config/config.txt
//запишите в него список параметров (в формате ключ=значение), а затем прочитайте файл и выведите только значения.

    println("\nЗадача 5")



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

