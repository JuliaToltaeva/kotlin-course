package com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson27.homework

fun main() {

    //Задание 1.

    val arg = {
        val list = List(10000000) { (0..10000).random() }
        list.sorted()
    }
    println("Task1")
    println(timeTracker(arg))


    //Задание 2: Использование apply для инициализации объекта Employee
    //Создайте объект Employee и используйте apply для инициализации его полей email и department.

    val ageOfEmployer = 20
    val nameOfEmployer = "J Corporation"

    val ageOfPerson = 34
    val nameOfPerson = "Julia Toltaeva"

    val employee = Employee(
        nameOfEmployer,
        ageOfEmployer,
        "Position"
    )
        .apply {
            email = "mailik@gmail.com"
            department = "IT Department"
        }
    println("\nTask2")
    println(employee)


    //Задание 3
    val person = Person(nameOfPerson, ageOfPerson)
        .apply {
            email = "mailik@gmail.com"
        }
    println("\nTask3")
    getPerson(person)


    //Задание 4:

    println("\nTask4")
    println(convertPerson(person))


    //Задание 5: Использование run для преобразования и инициализации Employee
//Создайте объект класса Person. Используйте функцию run, чтобы инициализировать объект Employee, добавить ему email и
//department с помощью apply, вернуть инициализированный объект.


    val employee5 = person.run {
        Employee("Name", 20, "Position")
            .apply {
                email = person.email
                department = "Department of ..."
            }
    }

    println("\nTask5")
    println(employee5.toString())


    //Задание 6:
    println("\nTask6")
    println(letSmth(person))
    println(letSmth(null))



}


//Задание 1. Функция высшего порядка.
//Создайте функцию timeTracker, которая принимает другую функцию в качестве аргумента и измеряет время её выполнения.
//Функция timeTracker должна возвращать затраченное время в миллисекундах. Для измерения времени используйте
//System.currentTimeMillis() до и после выполнения переданной функции.
//Для проверки результата можно выполнить в ней например такой ресурсоёмкий код:
//
//val myFunction = {
//    val list = List(10000000) { (0..10000).random() }
//    list.sorted()
//}

fun timeTracker(arg: () -> Any): Long {
    val timeStart = System.currentTimeMillis()
    arg()
    val timeEnd = System.currentTimeMillis()

    val diff = timeEnd - timeStart

    return diff
}


//Задания для работы со scope функциями
//Давайте создадим два класса, которые будут использоваться в заданиях для демонстрации работы scope функций с
//преобразованием объектов и инициализацией или обновлением полей. Классы будут представлять собой Person и Employee,
//где Employee может быть создан на основе данных класса Person.
//
//Классы для демонстрации:
//class Person(val name: String, val age: Int) {
//    var email: String = ""
//}
//class Employee(val name: String, val age: Int, val position: String) {
//    var email: String = ""
//    var department: String = "General"
//}


//Задание 3: Использование also для логирования
//Создайте функцию, принимающую объект Person и выводящую информацию об объекте в консоль в красивом, отформатированном
//виде.
//Создайте объект Person и используйте also для печати данных в консоль с помощью метода который только что создали.

fun getPerson(person: Person) {

    person.also {
        println("Person name: ${person.name}, Person age: ${person.age}")
    }

}


//Задание 4: Использование with для преобразование Person в Employee
//Создайте объект класса Person. Используйте функцию with, чтобы создать из этого объекта Employee, указав дополнительно
//должность. Возвращаемым значением должен быть новый объект Employee.


fun convertPerson(person: Person): Employee {

    with(person) {

        val employee4 = Employee(name, age, "Position")
            .apply {
                email = this.email
                department = "Department of ..."
                var position = "Position"
            }

        return employee4
    }

}


//Задание 6: Использование let для безопасного преобразования Person в Employee
//Создайте функцию, которая принимает объект класса Person?, который может быть null. В функции используйте функцию let
//для создания Employee, только если объект Person не null. В противном случае возвращается null

fun letSmth(person: Person?): Employee? {

    return person?.let {

        Employee("Name", 20, "Position")
            .apply {
                email = it.email
                department = "Department of ..."
            }
    }

}





