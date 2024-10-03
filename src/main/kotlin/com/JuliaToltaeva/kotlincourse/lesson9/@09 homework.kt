package com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson9

fun main (){
    BirthDay(31, "женат")
}

fun BirthDay(age: Int, status: String): String {
    println("Привет, Саша Молокович!")
    println("\uD83C\uDF89\uD83C\uDF89\uD83C\uDF89 С прошедшим днем рождения!!! \uD83C\uDF82\uD83C\uDF82\uD83C\uDF82")
    println("\nТвой возраст $age и статус <$status>.")

    val ageWow50 = "Да ну нафиг, не может быть, что тебе столько лет!"
    val ageLess18 = "Ну и не говори правдивый возраст!"
    val ageLess30 = "Хорошо сохранился!"

    println("\n<Саша, Саша, поздравляю>, -")
    println("Все писали в общий чат,")
    println("<Наконец-то без задания")
    println("На дом мы остались так!>, –")

    println("\nМожет это совпадение,")
    println("Может так произошло.")
    println("Пушить в сашин день рождения")
    println("Не хочу, а вот вино...")

    println("\n...Я бы попила бокальчик")
    println("Чтоб забыть восьмой урок,")
    println("Но взяла себе пивасик –")
    println("Стало на душе тепло.")

    println("\nХорошо, когда на праздник")
    println("Ничего не пушишь ты,")
    println("Хорошо, когда пивасик")
    println("Можно взять на лессоны.\n")

    return when {
        age < 18 -> println(ageLess18).toString()
        age >= 50 -> println(ageWow50).toString()
        age in 18 until 30 -> {
            println(ageLess30).toString()
        }

        age in 30 until 50 ->
            when {
                status == "женат" -> {println("Еще раз поздравляю с Днюшей!")
                    println("Спроси у жены, пожалуйста, можно ли отправить тебе электронные обнимашки\uD83D\uDE05")
                    println("Если можно, то мои тебе дистанционные обнимашки \uD83E\uDD17\uD83E\uDD17\uD83E\uDD17")
                }
                status == "не женат" -> {println("Мои дистанционные обнимашки тебе \uD83E\uDD17\uD83E\uDD17\uD83E\uDD17")
                println("Хорошей тебе жены! \uD83D\uDE00\uD83D\uDE00\uD83D\uDE00")}
                else -> println("Так не бывает! Хитришь, ну ладно. Твоё право")
            }.toString()
        else -> ({println("\uD83D\uDE3E")}).toString()
    }
}