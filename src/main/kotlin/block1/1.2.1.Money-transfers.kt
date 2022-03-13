package ru.netology.block1

// «1.2. Отличия от Java: immutability, переменные, типы данных, операторы и приведение типов»
// Задача №1 - Денежные переводы
fun main() {
    val minCommission = 35
    val percentCommission = 0.75

    while (true) {
        print("Введите сумму для перевода: ")
        try {
            val amount = readLine()?.toInt() ?: return
            if (amount > 0) {
                val initialCommission = amount * percentCommission / 100
                val finalCommission = if (initialCommission <= minCommission) {
                    minCommission
                } else initialCommission
                println("Комиссия, которую заплатил пользователь при переводе: $finalCommission копеек")
            } else if (amount < 0) {
                println("Не верный ввод данных, введите положительное число!")
            }
        } catch (e: Exception) {
            println("Не верный ввод данных, введите целое число!")
        }
    }
}