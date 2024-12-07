package com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson27.homework

fun main() {

    //Задание 1.

    val arg = {
        val list = List(10000000) { (0..10000).random() }
        list.sorted()
    }

    println(timeTracker(arg))


    //Задание 2: Использование apply для инициализации объекта Employee
    //Создайте объект Employee и используйте apply для инициализации его полей email и department.

    val employee = Employee("Name", 20, "Position")
        .apply {
            email = "mailik@gmail.com"
            department = "Department of ..."
        }


    val person = Person("Julia Toltaeva", 34)
    getPerson(person)


    //Задание 4:
    val position = "Position"
    println(convertPerson(person))


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

fun timeTracker(arg: () -> List<Int>): Long {
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

    println("Person name: ${person.name}, Person age: ${person.age}")

}


//Задание 4: Использование with для преобразование Person в Employee
//Создайте объект класса Person. Используйте функцию with, чтобы создать из этого объекта Employee, указав дополнительно
//должность. Возвращаемым значением должен быть новый объект Employee.


fun convertPerson(person: Person): Employee {

    with(person) {

        val employee2 = Employee("Name", 20, "Position")
            .apply {
                email = "mailik@gmail.com"
                department = "Department of ..."
            }

        return employee2
    }

}


//Задание 5: Использование run для преобразования и инициализации Employee
//Создайте объект класса Person. Используйте функцию run, чтобы инициализировать объект Employee, добавить ему email и
//department с помощью apply, вернуть инициализированный объект.


//Задание 6: Использование let для безопасного преобразования Person в Employee
//Создайте функцию, которая принимает объект класса Person?, который может быть null. В функции используйте функцию let
//для создания Employee, только если объект Person не null. В противном случае возвращается null





