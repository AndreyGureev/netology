package ru.netology.block1

// «1.2. Отличия от Java: immutability, переменные, типы данных, операторы и приведение типов»
// Задача №2 - "Люди/Человеки"
fun main() {
    while (true) {
        print("Введите число лайков: ")
        try {
            val likes = readLine()?.toInt() ?: return
            if (likes % 2 == 0 ||
                likes % 3 == 0 ||
                likes % 5 == 0 ||
                likes % 7 == 0 ||
                likes % 11 == 1
                    ) {
                println("Понравилось $likes людям")
            } else {
                println("Понравилось $likes человеку")
            }
            if (likes < 0) {
                println("Не верный ввод данных, введите положительное число!")
            }
        } catch (e: Exception) {
            println("Не верный ввод данных, введите целое число!")
        }
    }
}
