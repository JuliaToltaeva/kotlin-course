package com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson14

fun main() {

//    Для решения каждой задачи постарайтесь использовать наиболее подходящий метод,
//    не повторяясь с решением других задач.

//    Дан словарь с именем и временем выполнения каждого автоматизированного теста
//    в секундах. Определите среднее время выполнения теста.

    val passTest = mapOf(
        "Тест1" to 1,
        "Тест2" to 2,
        "Тест3" to 3,
        "Тест4" to 4,
        "Тест5" to 5
    )

    val averageTimeTest = passTest.values
        .average()

    println("averageTimeTest $averageTimeTest\n")

//    Имеется словарь с метаданными автоматизированных тестов, где ключи —
//    это имена тестовых методов, а значения - строка с метаданными.
//    Выведите список всех тестовых методов.

    val testMeta = mapOf(
        "Тестовый метод1" to "Метаданные1",
        "Тестовый метод2" to "Метаданные2",
        "Тестовый метод3" to "Метаданные3",
        "Тестовый метод4" to "Метаданные4",
        "Тестовый метод5" to "Метаданные5"
    )

    val listTestMethod = testMeta.keys

    println("listTestMethod $listTestMethod\n")

//    В изменяемый словарь с данными о прохождении тестов добавьте новый тест
//    и его результат.

    val passTestNew = passTest + ("Тест6" to 6)
    println("passTestNew $passTestNew\n")

//    Посчитайте количество успешных тестов в словаре с результатами.

    val successfulTests = passTest
        .count { it.value < 3 }
    println("successfulTests $successfulTests\n")

//    Удалите из изменяемого словаря с баг-трекингом запись о баге,
//    который был исправлен.

    val testMeta1 = mutableMapOf(
        "Тестовый метод1" to "Баг1",
        "Тестовый метод2" to "Баг2",
        "Тестовый метод3" to "Баг3",
        "Тестовый метод4" to "Баг4",
        "Тестовый метод5" to "Баг5"
    )

    val testMetaNew = testMeta1 - "Тестовый метод1"
    println("testMetaNew $testMetaNew\n")

//    Для словаря с результатами тестирования веб-страниц (ключ — URL страницы,
//    значение — статус ответа), выведите сообщение о странице и статусе её проверки.

    val testUrl = mapOf(
        "URL_1" to "404",
        "URL_2" to "505",
        "URL_3" to "501",
        "URL_4" to "200",
        "URL_5" to "200"
    )

    println("testUrl")

    testUrl.forEach {
        println("${it.key} status ${it.value}")
    }

//    Найдите в словаре с названием и временем ответа сервисов только те,
//    время ответа которых превышает заданный порог.

    val respTimeServ = mapOf(
        "Service_1" to 100,
        "Service_2" to 200,
        "Service_3" to 300,
        "Service_4" to 400,
        "Service_5" to 500
    )

    val respTimeServNew = respTimeServ
        .filter { it.value < 200 }

    println("respTimeServNew $respTimeServNew\n")

//    В словаре хранятся результаты тестирования API (ключ — endpoint, значение —
//    статус ответа в строке). Для указанного endpoint найдите статус ответа,
//    если endpoint отсутствует, предположите, что он не был протестирован.

    val testAPI = mapOf(
        "EndPoint_1" to "200",
        "EndPoint_2" to "500",
        "EndPoint_3" to "505",
        "EndPoint_4" to "200",
        "EndPoint_5" to "505"
    )

    val testAPINew1 = testAPI
        .getOrElse("EndPoint_3") {
            Exception("не был протестирован")
        }
    val testAPINew2 = testAPI
        .getOrElse("EndPoint_10") {
            Exception("не был протестирован")
        }

    println("TestAPINew $testAPINew1")
    println("TestAPINew $testAPINew2\n")

//    Из словаря, содержащего конфигурации тестового окружения
//    (ключ — название параметра конфигурации), получите значение
//    для "browserType". Ответ не может быть null.

    val testEnvConfig = mapOf(
        "browserType" to "Яндекс Браузер Версия 24.7.6.974 (64-bit)",
        "ConfigName_2" to "Description2",
        "ConfigName_3" to "Description3",
        "ConfigName_4" to "Description4",
        "ConfigName_5" to "Description5"
    )

    val testEnvConfigBrowser = testEnvConfig
        .getOrDefault("browserType", "")

    println("testEnvConfigBrowser $testEnvConfigBrowser\n")

//    Создайте копию неизменяемого словаря с данными о версиях тестируемого ПО,
//    чтобы добавить новую версию.

    val testEnvConfigNew = testEnvConfig.toMutableMap()
    println("testEnvConfigNew $testEnvConfigNew\n")

//    Используя словарь с настройками тестирования для различных мобильных устройств
//    (ключ — модель устройства), получите настройки для конкретной модели или
//    верните настройки по умолчанию.

    val mobDevicesTestSet = mapOf(
        "Model_1" to "Settings_1",
        "Model_2" to "Settings_2",
        "Model_3" to "Settings_3",
        "Model_4" to "Settings_4",
        "Model_5" to "Settings_5"
    )

    val mobDevicesTestSetNew = mobDevicesTestSet.getOrDefault(
        "Model_3", "настройки по умолчанию"
    )

//    Проверьте, содержит ли словарь с ошибками тестирования (код и описание)
//    определенный код ошибки.

    val testErrors = mapOf(
        "200" to "Description_1",
        "500" to "Description_2",
        "505" to "Description_3",
        "200" to "Description_4",
        "505" to "Description_5"
    )

    val testErrorsNew = testErrors.containsKey("500")
    println("testErrorsNew $testErrorsNew\n")

//    Дан неизменяемый словарь, где ключи — это идентификаторы тестовых сценариев
//    в формате "TestID_Version", а значения — статусы выполнения этих тестов
//    ("Passed", "Failed", "Skipped"). Отфильтруйте словарь, оставив только те сценарии,
//    идентификаторы которых соответствуют определённой версии тестов.

    val testCases = mapOf(
        "TestID_1" to "Passed",
        "TestID_2" to "Failed",
        "TestID_3" to "Passed",
        "TestID_4" to "Skipped",
        "TestID_5" to "Failed",
        "TestID_6 optional" to "Failed"
    )

    val testCasesFilter = testCases
        .filterKeys { it == "Test_PRC-131" }
    println("testCasesFilter $testCasesFilter\n")

//    У вас есть словарь, где ключи — это названия функциональных модулей приложения,
//    а значения — результаты их тестирования.
//    Проверьте, есть ли модули с неудачным тестированием.

    val modulesTests = mapOf(
        "Module_1" to "Passed",
        "Module_2" to "Failed",
        "Module_3" to "Passed",
        "Module_4" to "Skipped",
        "Module_5" to "Failed"
    )

    val modulesTestsNew = modulesTests.containsValue("Failed")
    println("modulesTestsNew $modulesTestsNew\n")

//    Добавьте в изменяемый словарь с настройками тестовой среды настройки
//    из другого словаря.

    val testEnvConfig1 = mutableMapOf(
        "browserType" to "Яндекс Браузер Версия 24.7.6.974 (64-bit)",
        "ConfigName_2" to "Description2",
        "ConfigName_3" to "Description3"
    )

    val testEnvConfig2 = mapOf(
        "ConfigName_1" to "Description1",
        "ConfigName_3" to "Description3",
        "ConfigName_4" to "Description4"
    )

    testEnvConfig1.putAll(testEnvConfig2)

    println("testEnvConfig1 $testEnvConfig1\n")

//    Объедините два неизменяемых словаря с данными о багах.

    val bagReport1 = mutableMapOf(
        "Тестовый метод_1" to "Баг_1",
        "Тестовый метод_2" to "Баг_2",
        "Тестовый метод_3" to "Баг_3",
    )

    val bagReport2 = mutableMapOf(
        "Тестовый метод_7" to "Баг_2",
        "Тестовый метод_8" to "Баг_3",
        "Тестовый метод_9" to "Баг_4"
    )

    val bagReportAll = mutableMapOf<String, String>()

    bagReportAll.putAll(bagReport1)
    bagReportAll.putAll(bagReport2)

    println("bagReportAll $bagReportAll\n")

//    Очистите изменяемый словарь с временными данными о последнем прогоне
//    автоматизированных тестов.

    val lastTimeRunAutoTest: MutableMap<String, String> = mutableMapOf(
        "Test_1" to "20.10.2024 07:50",
        "Test_2" to "20.05.2024 07:50",
        "Test_3" to "20.12.2023 07:50"
    )

    lastTimeRunAutoTest.clear()

    println("lastTimeRunAutoTest $lastTimeRunAutoTest\n")

//    Исключите из отчета по автоматизированному тестированию те случаи,
//    где тесты были пропущены (имеют статус “skipped”)

    val modulesTestsNew1 = modulesTests
        .filterNot { it.value == "Skipped" }
    println("modulesTestsNew1 $modulesTestsNew1\n")

//    Удалите из словаря с конфигурациями тестирования набор устаревших конфигураций.

    val testEnvConfigNew1 = testEnvConfig - "ConfigName_4"

    println("testEnvConfigNew1 $testEnvConfigNew1\n")

//    Создайте отчет о тестировании, преобразовав словарь с результатами тестирования
//    (ключ — идентификатор теста, значение — результат) в список строк формата
//    "Test ID: результат".

    val testReport = mutableMapOf(
        "Test ID_1" to "Passed",
        "Test ID_2" to "Failed",
        "Test ID_3" to "Skipped"
    )

    val testReportString = testReport.map { "${it.key}: ${it.value}" }

    println("testReportString $testReportString\n")

//    Преобразуйте изменяемый словарь с результатами последнего тестирования
//    в неизменяемый для архивации.

    val testReportToMap = testReport.toMap()

    println("testReportToMap $testReportToMap\n")

//    Преобразуйте словарь, содержащий ID теста и данные о времени выполнения тестов,
//    заменив идентификаторы тестов на их названия (название можно получить вызвав
//    фейковый метод, например getNameById(id: String))

    val timePassTest = mapOf(
        "ID_1" to 100,
        "ID_2" to 200,
        "ID_3" to 300
    )

    val timePassTestName = timePassTest
        .mapKeys { getNameById("ID") }
    println("timePassTestName $timePassTestName\n")

//    Для словаря с оценками производительности различных версий приложения увеличьте
//    каждую оценку на 10%, чтобы учесть новые условия тестирования.

    val performAppVer = mapOf(
        "Version_1" to 4.9F,
        "Version_2" to 6.0F,
        "Version_3" to 5.0F
    )

    val performAppVerNew = performAppVer.mapValues {
        "%.1f".format(it.value * 1.1)
    }

    println("performAppVerNew $performAppVerNew \n")

//    Проверьте, пуст ли словарь с ошибками компиляции тестов.

    val testCompilationErrors = mapOf(
        "Error_1" to "Description_1",
        "Error_2" to "Description_2",
        "Error_3" to "Description_3"
    )

    val checkIsEmpty = testCompilationErrors.isEmpty()

    println("checkIsEmpty $checkIsEmpty\n")

//    Убедитесь, что словарь с результатами нагрузочного тестирования не пуст.

    val loadTesting = mapOf(
        "Test_1" to "Description_1",
        "Test_2" to "Description_2",
        "Test_3" to "Description_3"
    )

    val checkIsEmpty1 = loadTesting.isNotEmpty()
    println("checkIsEmpty1 $checkIsEmpty1\n")

//    Проверьте, прошли ли успешно все автоматизированные тесты в словаре
//    с результатами.

    val checkingIsPassed = testCases
        .all { it.value == "Passed" }
    println("checkingIsPassed $checkingIsPassed\n")

//    Определите, содержит ли словарь с результатами тестирования
//    хотя бы один тест с ошибкой.

    val checkingIsFailed = testCases
        .any {
            it.value == "Failed"
        }
    println("checkingIsFailed $checkingIsFailed\n")

//    Отфильтруйте словарь с результатами тестирования сервисов,
//    оставив только те тесты,
//    которые не прошли успешно и содержат в названии “optional”.

    val checkingIsOptional = testCases
        .filter {
            it.value != "Passed" && it.key.contains("optional")
        }
    println("checkingIsOptional $checkingIsOptional")

}

fun getNameById(id: String): String {
    return "Name"
}