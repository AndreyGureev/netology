package ru.netology.block1

// «1.2. Отличия от Java: immutability, переменные, типы данных, операторы и приведение типов»
// Задача №2 - "Люди/Человеки"
fun main() {
    while (true) {
        print("Введите число лайков: ")
        try {
            val likes = readLine()!!.toUInt()
            if (likes % 10U == 1U && likes % 100U != 11U)
                println("Понравилось $likes человеку")
            else println("Понравилось $likes людям")
            if (likes < 0U) {
                println("Не верный ввод данных, введите положительное число!")
            }
        } catch (e: Exception) {
            println("Не верный ввод данных, введите целое число!")
        }
    }
}
