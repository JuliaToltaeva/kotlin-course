package com.juliatoltaeva.com.JuliaToltaeva.kotlincourse.lesson3

import java.awt.image.BufferedImage
import java.io.File
import java.time.LocalDate
import javax.imageio.ImageIO

// Погрузимся в атмосферу "Hackathon Survival"
// Марафон, где участники пытаются завершить реальный проект в условиях искусственно созданного хаоса
// (например, часто меняющиеся требования, неожиданные "сбои" в оборудовании)

// Для каждого из полей подбери наилучший способ хранения из известных тебе.
// Учитывай такие факторы, как изменяемость, обязательность, возможность начальной установки,
// ресурсоёмкие вычисления значения, необходимость проверки устанавливаемого значения на валидность
// или запрет доступа на установку при возможности чтения, публичность и приватность данных.

// Название мероприятия
val event: String = "Hackathon Survival"

// Дата проведения
var data: LocalDate = LocalDate.of(2024, 9, 12)

// Место проведения
val address: String = "Moscow, Sovetskaya, 1-1"

// Подробный бюджет мероприятия, включая расходы на оборудование, кейтеринг и другие операционные расходы.
// val budget1: String by lazy {
//    ""
// }
// правильно ниже
private val budget: String = "50000" // приватная переменная, недоступная извне

// Количество участников
var participants: Int = 0 // на момент создания мероприятия
    get() = field
    private set (value) {field = value} // изменение доступно не для всех

// Длительность хакатона
var duration: Long = 120*8*60 // в минутах, но принято в секундах или миллисекундах, сложный тип переменной
// Long используется для длительности в секундах и миллисекундах

// Контактная информация и условия соглашений с поставщиками пищи, оборудования и других услуг
private lateinit var suppliers: String

// Текущее состояние хакатона (статус)
var eventStatus: String = "Не начат"

// Список спонсоров
val sponsors: String = "Microsoft Corporation, SAP, Oracle"

// Бюджет мероприятия
//var eventBudget: Int = 0
//    get() = field
//    set (value) {
//        if (value > 0) field += value
//    }

// Текущий уровень доступа к интернету
// lateinit var internetLevel: String
// правильно ниже
var internetAccessLevel: Int = 0

// Информация о транспортировке оборудования, распределении ресурсов и координации между различными командами поддержки.
private var support: String = ""

// Количество команд
var amountTeam: Int = 5

// Перечень задач
val teamTask: String = "Задачи"

// План эвакуации
val image: BufferedImage = ImageIO.read(File("https://promarket.shop/wa-data/public/site/img/plan-evakuatsii.jpg"))

// Список доступного оборудования
var equipment: String = ""

// Список свободного оборудования
var equipmentFree: String = ""

// График питания участников (зависит от поставщика питания, определяемого за неделю до начала)
lateinit var meal: String

// План мероприятий на случай сбоев
val planB: String = ""

// Список экспертов и жюри
var experts: String = ""

// Методы и процедуры для сбора отзывов от участников и гостей, включая анонимные опросы и интервью.
val feedbackMethod: String by lazy {
    ""
}

// Политика конфиденциальности
val privacyPolicy: String = ""

// Приватные отзывы (фидбэк) участников и зрителей для анализа проблем.
private val feedbackPrivate: String by lazy {
    ""
}

// Текущая температура в помещении
var temperature2: Int = 25

// Мониторинг и анализ производительности сетевого оборудования и интернет-соединения
var statusNetwork: String = "OK"

// Уровень освещения
var lightningLevel: Int = 100

// Лог событий мероприятия
private var log: String = ""

// Доступность медицинской помощи
var medicine: String = ""

// Планы и процедуры для обеспечения безопасности мероприятия,
// включая планы эвакуации и протоколы чрезвычайных ситуаций.
private val planSOS: String = ""

// Регистрационный номер мероприятия
const val NUMBER_EVENT: String = "13092024"

// Максимально допустимый уровень шума в помещении хакатона.
val noizeMax: Int = 55

// Индикатор превышения уровня шума в помещениях
//var noizeLevel: Int = noizeMax
//    set(value) {
//        if (value >= noizeMax) field += value
//    }
var noizeLevel: Boolean = false

// Формат мероприятия (зависит от геополитической обстановки)
var format: String = ""

// Количество свободных мест для отдыха (например, кресел или диванов)
// сеттер валидирует, чтобы количество не было меньше нуля.
var capacityFree: Int = 0
    set(value) {
       if (value > 0) field += value
    }

// План взаимодействия с прессой
var media: String = ""

// Детальная информация о проектах каждой команды, сбор данных включает в себя компиляцию кода
// и сбор статистики прогона автоматизированных проверок.
var teamProject: String = ""

// Статус получения всех необходимых разрешений
var statusAccess: String = ""

// Указывает, открыт ли доступ к эксклюзивным ресурсам (например, специальному оборудованию)
var access: String = ""

// Список партнеров мероприятия
var partners: String = ""

// Отчет, включающий фотографии, видео и отзывы, генерируется и становится доступен после завершения мероприятия.
val report: String by lazy {
    ""
}

// План распределения призов
val lazyValue: String by lazy {
    ""
}

// Контактная информация экстренных служб, медицинского персонала и других важных служб, недоступная участникам.
// ссылка ведет на ftp с паролем или на карту, на которой указано расположение сейфа
// в которой эта информация скрыта
const val CONTACT_SOS: String = "Контактная информация экстренных служб: телефон 112"

//решение Саши ниже
val secretInfo: String = "secret info"
    get() {
        if (isAccessible()) return field
        else return "Access denied"
    }

// Особые условия для участников с ограниченными возможностями
var specialConditions: String = "Особые условия"

// Общее настроение участников (определяется опросами)
val mood: String by lazy {
    ""
}

// Подробный план хакатона, включающий время и содержание каждого сегмента
// инициализируется непосредственно перед началом мероприятия.
lateinit var plan: String

// Имя знаменитого специального гостя, которое будет объявлено за день до мероприятия.
lateinit var guest: String

// Максимальное количество людей, которое может вместить место проведения.
const val CAPACITY: Int = 50

// Стандартное количество часов, отведенное каждой команде для работы над проектом.
const val TIMEMAX: Int = 2

// Текущая температура в помещении
var temperature: Double = 20.0