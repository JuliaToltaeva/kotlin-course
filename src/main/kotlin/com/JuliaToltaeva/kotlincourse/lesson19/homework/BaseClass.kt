package com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson19.homework

//Нужно скопировать код к себе и постараться ответить на все “почему” в комментариях
//и заданным образом доработать класс ChildrenClass (BaseClass доработке не подлежит)

abstract class BaseClass(
    // объясни, почему это поле доступно в main() для чтения из класса ChildrenClass
    // потому что приватные поля доступны не только в текущем классе, но и во всех наследуемых классах

    private val privateVal: String,

    // объясни, почему это поле недоступно в main()
    // потому что защищенные поля доступны только в текущем классе

    protected val protectedVal: String,
    val publicVal: String
) {

    var publicField = "измени меня из функции main() на Антонио Бандераса и проверь через функцию getAll()" +
            "Доработай ChildrenClass таким образом, чтобы это получилось"
        set(value) {
            if (verifyPublicField(value)) {
                field = value
            }
        }
    protected open var protectedField = "измени меня из функции main() через сеттер в наследнике"

    private var privateField = "добавь сеттер чтобы изменить меня из main()"

    protected fun setPrivateFieldValue(value: String) {
        privateField = value
    }

    fun getAll(): String {
        return mapOf(
            "privateVal" to privateVal,
            "protectedVal" to protectedVal,
            "publicVal" to publicVal,
            "publicField" to publicField,
            "protectedField" to protectedField,
            "privateField" to privateField,
        ).map { "${it.key}: ${it.value}" }
            .joinToString("\n")
    }

    fun printText() {
        privatePrint()
    }

    // объясни, почему эта функция не может быть публичной
    // потому что она выполняет внутренние процедуры класса, которые не нужно выводить наружу
    protected open fun getProtectedClass() = ProtectedClass()

    protected open fun verifyPublicField(value: String): Boolean {
        return value.length < 3
    }

    private fun privatePrint() {
        println("Печать из класса BaseClass")
    }



    // объясни, почему эта функция не может быть публичной или protected
    // потому что это внутренние процедуры внутри класса и мы не будет их наследовать

    private fun getPrivateClass() = PrivateClass()

    protected class ProtectedClass

    private class PrivateClass
}
