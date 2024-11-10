package com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson19.homework

open class ChildrenClass(
    private val privateVal: String,
    protectedVal: String,

    // объясни, почему этот аргумент доступен в main() несмотря на то, что это не поле
    // потому что это публичное поле родительского метода
    publicVal: String


) : BaseClass(privateVal, protectedVal, privateVal) {

    // объясни, почему в main() доступна функция getAll() хотя её здесь нет
    // потому что она публичная и потому что класс публичный

    // проверь, что выводится на печать при вызове функции printText()
    // проверила, выводится "Печать из класса BaseClass" из родительского метода

    // и объясни, почему не происходит переопределение метода privatePrint()
    // потому что это приватный метод, его нельзя переопределять в подклассах


    private fun privatePrint() {
        println("Печать из класса ChildrenClass")
    }

    override fun verifyPublicField(value: String): Boolean {
        return value == "Антонио Бандерас"
    }

    fun changeProtectedField(value: String) {
        protectedField = value
    }

    fun setPrivateField(value: String) {
        setPrivateFieldValue(value)
    }








}