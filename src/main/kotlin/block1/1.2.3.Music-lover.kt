package ru.netology.block1

// «1.2. Отличия от Java: immutability, переменные, типы данных, операторы и приведение типов»
// Задача №3 - "Меломан"
fun main() {
    while (true) {
        print("Покупка на сумму: ")
        try {
            val amount = readLine()?.toDouble() ?: return
            if (amount in 0.0..1_000.0) {
                println("Сумма составила без скидок: $amount копеек")
                val total = amount * 1 / 100
                val total2 = amount - total
                println("Сумма составляет с учетом скидки 1% от 95% потраченной суммы: $total2 копеек")
                val no = (total2 > 1_000)
                println("Постоянно покупает пользователь музыку или нет? $no")
            } else if (amount in 1_001.0..10_000.0) {
                val total = amount - 100
                println("Стандартная скидка 100 рублей. Сумма составляет: $total копеек")
                val total2 = total * 1 / 100
                val total3 = total - total2
                println("Сумма составляет с учетом скидки 1% от 95% потраченной суммы: $total3 копеек")
                val yes = (total3 > 5_000)
                println("Постоянно покупает пользователь музыку или нет? $yes")
            } else if (amount >= 10_001) {
                val total = amount * 5 / 100
                val total2 = amount - total
                println("Сумма составляет с учетом скидки 5%: $total2 копеек")
                val total3 = total2 * 1 / 100
                val total4 = total2 - total3
                println("Сумма составляет с учетом скидки 1% от 95% потраченной суммы: $total4 копеек")
                val yes = (total4 > 10_001)
                println("Постоянно покупает пользователь музыку или нет? $yes")
            } else if (amount < 0) {
                println("Не верный ввод данных, введите положительное число!")
            }
        } catch (e: Exception) {
            println("Не верный ввод данных, введите целое число!")
        }
    }
}