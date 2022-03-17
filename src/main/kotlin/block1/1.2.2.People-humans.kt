package ru.netology.block1

// «1.2. Отличия от Java: immutability, переменные, типы данных, операторы и приведение типов»
// Задача №2 - "Люди/Человеки"
fun main() {
    while (true) {
        print("Введите число лайков: ")
        try {
            val likes = readLine()?.toInt() ?: return
            if (((likes == 1 || likes % 10 == 1) && likes % 100 != 11) && likes != 11) {
                println("Понравилось $likes человеку")
            } else {
                println("Понравилось $likes людям")
            }
//            when {
//                likes.mod(100) == 11 -> println("Понравилось $likes людям")
//               else -> {
//                    println("Понравилось $likes человеку")
//                }
//            }
            if (likes < 0) {
                println("Не верный ввод данных, введите положительное число!")
            }
        } catch (e: Exception) {
            println("Не верный ввод данных, введите целое число!")
        }
    }
}
