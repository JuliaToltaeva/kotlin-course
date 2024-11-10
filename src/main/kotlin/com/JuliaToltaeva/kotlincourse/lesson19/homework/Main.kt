package com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson19.homework

fun main() {

    val childrenClass = ChildrenClass(
        "privateVal_2",
        "protectedVal_2",
        "publicVal_2"
    )

    childrenClass.printText()

    println("----------")
    childrenClass.publicField = "Антонио Бандерас"
    childrenClass.changeProtectedField("ProtectedField_2")
    childrenClass.setPrivateField("PrivateField_2")


    println(childrenClass.getAll())


}