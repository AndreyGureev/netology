package block1

const val MINUTE = 60
const val HOUR = 60 * MINUTE
const val DAY = 24 * HOUR

// «1.3. Управляющие конструкции. Функции»
// Задача №1 - «Только что»
fun main() {
    while (true) {
        var sum: Int
        print("Введите число в секундах: ")
        while (true) {
            try {
                sum = readLine()?.toInt() ?: return
                if (sum < 0) error(0)
                break
            } catch (e: Exception) {
                println("Не верный ввод данных, введите повторно!")
            }
        }
        println(agoToText(sum))
    }
}

fun agoToText(sum: Int): String {
    return when (sum) {
        in 0..MINUTE -> ("Alex" + "был(а) только что")
        in MINUTE + 1..HOUR -> {
            println("Вася")
            mode(sum)
        }
        in HOUR + 1..DAY -> {
            println("Женя :)")
            mode(sum)
        }
        in DAY + 1..2 * DAY -> ("Аркадий" + "был(а) в сети сегодня")
        in 2 * DAY + 1..3 * DAY -> ("Олег" + "был(а) в сети вчера")
        in DAY * 3 + 1..Int.MAX_VALUE -> ("Вован" + "был(а) в сети давно")
        else -> error("Несоблюдены все правила!")
    }
}

fun mode(sum: Int): String {
    val totalMinutes = sum / MINUTE
    val totalHours = sum / HOUR
    return when (sum) {
        in MINUTE + 1..HOUR -> {
            if (totalMinutes % 10 == 1 && totalMinutes != 11) ("Был(а) $totalMinutes минуту назад")
            else if (totalMinutes % 10 in 2..4 && totalMinutes !in 12..14) ("Был(а) $totalMinutes минуты назад")
            else ("Был(а) $totalMinutes минут назад")
        }
        in HOUR + 1..DAY -> {
            if (totalHours % 10 == 1 && totalHours != 11) ("Был(а) $totalHours час назад")
            else if (totalHours % 10 in 2..4 && totalHours !in 12..14) ("Был(а) $totalHours часа назад")
            else ("Был(а) $totalHours часов назад")
        }
        else -> error("Несоблюдены все правила!")
    }
}
