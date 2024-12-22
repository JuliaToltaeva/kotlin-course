package com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson31.homework.json

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import java.io.File

//Создай дата класс сотрудника компании Employee, содержащий:
//имя
//статус трудоустройства (булево)
//дата рождения (строка)
//должность CharacterTypes (enum из прошлого урока)
//список подчинённых с типом Emploee

//Создай небольшую иерархию из сотрудников где во главе CTO.
//Это значит что в объект сотрудника с должностью CTO в поле списка подчинённых должны попасть пара тим лидов,
//в списке подчинённых которых есть разработчики, дизайнеры и тестировщики.
//Чтобы было немного но и была вложенность.
//
//Сериализуй CTO в текст с настройкой prettyPrinting и текст запиши в файл в корне проекта.
//
//Прочитай текст из файла, десериализуй его в объект класса Employee и распечатай в консоль.

fun main() {

    val developer1 = Employee(
        "Разработчиков Иван",
        "hired",
        "01/01/1991",
        CharacterTypes.MOBILE_DEVELOPER,
        emptyList()
    )

    val developer2 = Employee(
        "Разработчикова Ирина",
        "hired",
        "01/01/1992",
        CharacterTypes.MOBILE_DEVELOPER,
        emptyList()
    )

    val qaEngineer1 = Employee(
        "Тестировщиков Алексей",
        "hired",
        "02/02/1993",
        CharacterTypes.QA_ENGINEER,
        emptyList()
    )

    val qaEngineer2 = Employee(
        "Тестировщикова Анна",
        "hired",
        "02/02/1994",
        CharacterTypes.QA_ENGINEER,
        emptyList()
    )

    val designer1 = Employee(
        "Дизайнеров Петр",
        "hired",
        "03/03/1994",
        CharacterTypes.DESIGNER,
        emptyList()
    )

    val designer2 = Employee(
        "Дизайнерова Паулина",
        "hired",
        "03/03/1994",
        CharacterTypes.DESIGNER,
        emptyList()
    )

    val employeeOfTeamLeader1 = listOf(
        developer1,
        qaEngineer1,
        designer1
    )

    val employeeOfTeamLeader2 = listOf(
        developer2,
        qaEngineer2,
        designer2
    )

    val teamLeader1 = Employee(
        "Тимлидеров Станислав",
        "hired",
        "04/04/1988",
        CharacterTypes.TEAM_LEADER,
        employeeOfTeamLeader1
    )

    val teamLeader2 = Employee(
        "Тимлидерова Светлана",
        "hired",
        "04/04/1989",
        CharacterTypes.TEAM_LEADER,
        employeeOfTeamLeader2
    )

    val employeeOfCTO = listOf(
        teamLeader1,
        teamLeader2
    )

    val cto = Employee(
        "CTO",
        "hired",
        "05/05/1980",
        CharacterTypes.CTO,
        employeeOfCTO
    )

    val gson = GsonBuilder().setPrettyPrinting().create()
    val json = gson.toJson(cto)

    File("cto.json").writeText(json)

    val revert = gson.fromJson(json, Employee:: class.java)
    println(revert)

}