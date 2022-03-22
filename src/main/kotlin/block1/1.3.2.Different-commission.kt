package block1

enum class PaymentSystem {
    MasterCard, Maestro, Visa, Mir, VKPay
}

const val MIN_COMMISSION = 3500
const val PERCENT_COMMISSION = 2000

// «1.3. Управляющие конструкции. Функции»
// Задача №2 - Разная комиссия
fun main() {
    var paymentSystemAmount: Int
    var amount: Int
    val amountPreviousTransfers = 0

    while (true) {
        try {
            print("Введите сумму для перевода: ")
            amount = (readLine()?.toInt() ?: return) * 100
            if (amount < 0) println("Не верный ввод данных, введите положительное число!")
            println(
                "\nВыбор патежной системы\n" +
                        "1. VK Pay\n" +
                        "2. Master card\n" +
                        "3. Maestro\n" +
                        "4. Visa\n" +
                        "5. Мир"
            )
            paymentSystemAmount = readLine()?.toInt() ?: return
            if (paymentSystemAmount < 0) println("Не верный ввод данных, введите положительное число!")
            val paymentSystem: PaymentSystem = when (paymentSystemAmount) {
                1 -> PaymentSystem.VKPay
                2 -> PaymentSystem.MasterCard
                3 -> PaymentSystem.Maestro
                4 -> PaymentSystem.Visa
                5 -> PaymentSystem.Mir
                else -> error("Несоблюдена платежная система!")
            }
            val finalCommission = commissionFulfillment(amount, amountPreviousTransfers, paymentSystem)
            println(analysis(amount, finalCommission))
        } catch (e: Exception) {
            println("Не верный ввод данных, введите повторно число!")
        }
    }
}

fun commissionFulfillment(
    amount: Int,
    amountPreviousTransfers: Int = 0,
    paymentSystem: PaymentSystem = PaymentSystem.VKPay //По умолчанию
): Int {
    val commission: Int
    return when (paymentSystem) {
        PaymentSystem.VKPay -> 0
        PaymentSystem.Maestro, PaymentSystem.MasterCard -> {
            if (amountPreviousTransfers in 30000..7500000) {
                0
            } else {
                commission = (amount * 0.006 + PERCENT_COMMISSION).toInt()
                commission
            }
        }
        PaymentSystem.Visa, PaymentSystem.Mir -> {
            commission = if (amount * 0.0075 > MIN_COMMISSION) (amount * 0.0075).toInt() else MIN_COMMISSION
            commission
        }
    }
}

fun analysis(amount: Int, commission: Int = 0): String {
    return if (commission == 0) {
        ("Комиссия не взымается \n" +
                "Сумма перевода " + amount / 100 + "." + amount % 100)
    } else {
        ("Комиссия " + commission / 100 + "." +
                commission % 100 + " Сумма перевода " +
                (amount - commission) / 100 + "." +
                (amount - commission) % 100)
    }
}