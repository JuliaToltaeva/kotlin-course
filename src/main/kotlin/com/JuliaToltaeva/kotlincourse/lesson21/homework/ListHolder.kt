package com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson21.homework

//Напишите класс ListHolder, который будет хранить список элементов типа T
// и иметь метод для добавления и получения всех элементов.


class ListHolder<T> {

    private val listHolder: MutableList<T> = mutableListOf()

    fun add(item: T) {
        listHolder.add(item)
    }

    fun get(): MutableList<T> {
        return listHolder
    }

}