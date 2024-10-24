package com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson15.homework

// Мероприятие: Концерт Создайте класс, который будет представлять концерт.
// У него должны быть свойства “группа”, “место проведения”, “стоимость”,
// “вместимость зала”. Также приватное поле “проданные билеты”. Добавьте метод,
// который выводит информацию о концерте и метод “купить билет”, который увеличивает
// количество проданных билетов на один.

class Concert(
    val group: String,
    val place: String,
    val price: Int,
    val capacity: Int,
    val isSold: Boolean
) {
    private var ticketsSold = 0

    companion object {
        val group = "Group X"
        val place = "Place X"
        val price = 5000
        val capacity = 5000
    }

    fun getInfoConcert() {
        println("Концерт группы $group " +
                "по адресу $place, " +
                "стоимость билета от $price")
    }

    fun buyTicket() {
        while (ticketsSold == 5000) {
            if (isSold) {
                ticketsSold += 1
            }
        }

        println("ticketsSold: $ticketsSold")
        println("-----")
    }



}