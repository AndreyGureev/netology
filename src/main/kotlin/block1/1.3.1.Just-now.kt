package block1

const val MINUTE = 60
const val HOUR = 3600
const val DAY = 86400

// «1.3. Управляющие конструкции. Функции»
// Задача №1 - «Только что»
fun main() {
    while (true) {
        print("Введите число в минутах: ")
        try {
            val sum = readLine()?.toInt() ?: return
            agoToText(sum)
        } catch (e: Exception) {
            println("Не верный ввод данных, введите повторно!")
        }
    }
}

fun agoToText(sum: Int) {
    val totalMinutes = sum * MINUTE
    val totalHours = sum * MINUTE
    when {
        totalMinutes in 0..MINUTE -> {
            println("Alex")
            println("был(а) только что")
        }
        totalMinutes in MINUTE + 1..HOUR -> {
            val minutesAgo = totalMinutes / 60
            println("Вася")
            print("был(а) в сети $minutesAgo ")
            minutes(sum)
        }
        totalHours in HOUR + 1..DAY -> {
            val hoursAgo = totalHours / 60 / 60
            println("Женя :)")
            print("был(а) в сети $hoursAgo ")
            hours(sum)
        }
        totalHours in DAY + 1..2 * DAY -> {
            println("Аркадий")
            println("был(а) в сети сегодня ")
        }
        totalHours in 2 * DAY + 1..3 * DAY -> {
            println("Олег")
            println("был(а) в сети вчера ")
        }
        totalHours > 3 * DAY + 1 -> {
            println("Вован")
            println("был(а) в сети давно ")
        }
        else -> error("Несоблюдены все правила!")
    }
}

fun minutes(sum: Int) {
    when {
        sum % 10 == 1 && sum % 100 != 11 -> println("минуту назад")
        sum % 10 == 2 && sum % 100 != 12 ||
                sum % 10 == 3 && sum % 100 != 13 ||
                sum % 10 == 4 && sum % 100 != 14 -> println("минуты назад")
        sum < 0 -> println("Не верный ввод данных, введите положительное число!")
        else -> println("минут назад")
    }
}

fun hours(sum: Int) {
    val sum = sum / 60
    when {
        sum % 10 == 1 && sum % 100 != 11 -> println("час назад")
        sum % 10 == 2 && sum % 100 != 12 ||
                sum % 10 == 3 && sum % 100 != 13 ||
                sum % 10 == 4 && sum % 100 != 14 -> println("часа назад")
        sum < 0 -> println("Не верный ввод данных, введите положительное число!")
        else -> println("часов назад")
    }
}