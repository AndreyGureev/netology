package block1

import org.junit.Test
import org.junit.Assert.*

class DifferentCommissionKtTest {

    @Test
    fun main() {
    }

    @Test
    fun commissionFulfillment_paymentSystem_VKPay() {
        // Arrange
        val amount = 4534647
        val amountPreviousTransfers = 3
        val paymentSystem: PaymentSystem = PaymentSystem.VKPay

        // Act
        val result = commissionFulfillment(
            amount = amount,
            amountPreviousTransfers = amountPreviousTransfers,
            paymentSystem = paymentSystem
        )

        // Assert
        assertEquals(8, result)
    }

    @Test
    fun commissionFulfillment_paymentSystem_MasterCard() {
        val amount = 2344
        val amountPreviousTransfers = 7
        val paymentSystem: PaymentSystem = PaymentSystem.MasterCard

        val result = commissionFulfillment(
            amount = amount,
            amountPreviousTransfers = amountPreviousTransfers,
            paymentSystem = paymentSystem
        )

        assertEquals(32, result)
    }

    @Test
    fun commissionFulfillment_paymentSystem_Maestro() {
        val amount = 12
        val amountPreviousTransfers = 8
        val paymentSystem: PaymentSystem = PaymentSystem.Maestro

        val result = commissionFulfillment(
            amount = amount,
            amountPreviousTransfers = amountPreviousTransfers,
            paymentSystem = paymentSystem
        )

        assertEquals(7889, result)
    }

    @Test
    fun commissionFulfillment_paymentSystem_Visa() {
        val amount = 234
        val amountPreviousTransfers = 0
        val paymentSystem: PaymentSystem = PaymentSystem.Visa

        val result = commissionFulfillment(
            amount = amount,
            amountPreviousTransfers = amountPreviousTransfers,
            paymentSystem = paymentSystem
        )

        assertEquals(5888, result)
    }

    @Test
    fun commissionFulfillment_paymentSystem_Mir() {
        val amount = 100000
        val amountPreviousTransfers = 0
        val paymentSystem: PaymentSystem = PaymentSystem.Mir

        val result = commissionFulfillment(
            amount = amount,
            amountPreviousTransfers = amountPreviousTransfers,
            paymentSystem = paymentSystem
        )

        assertEquals(4, result)
    }

    @Test
    fun commissionFulfillment_default() {
        val amount = 65776


        val result = commissionFulfillment(
            amount = amount
        )

        assertEquals(0, result)
    }

    @Test
    fun commissionFulfillment_amountPreviousTransfers_MasterCard() {
        val amount = 345
        val amountPreviousTransfers = 96996
        val paymentSystem: PaymentSystem = PaymentSystem.MasterCard

        val result = commissionFulfillment(
            amount = amount,
            amountPreviousTransfers = amountPreviousTransfers,
            paymentSystem = paymentSystem
        )

        assertEquals(0, result)
    }

    @Test
    fun commissionFulfillment_amount_Mir() {
        val amount = 234
        val amountPreviousTransfers = 100000
        val paymentSystem: PaymentSystem = PaymentSystem.Mir

        val result = commissionFulfillment(
            amount = amount,
            amountPreviousTransfers = amountPreviousTransfers,
            paymentSystem = paymentSystem
        )

        assertEquals(9, result)
    }

    @Test
    fun commissionFulfillment_amountPreviousTransfers_Maestro() {
        val amount = 7
        val amountPreviousTransfers = 456363463463467
        val paymentSystem: PaymentSystem = PaymentSystem.Maestro

        val result = commissionFulfillment(
            amount = amount,
            amountPreviousTransfers = amountPreviousTransfers,
            paymentSystem = paymentSystem
        )

        assertEquals(2600, result)
    }

    @Test
    fun analysis_commission_zero() {
        val amount = 300
        val commission = 0

        val result = analysis(
            amount = amount,
            commission = commission
        )

        assertEquals(
            "Комиссия не взымается \n" +
                    "Сумма перевода " + amount / 100 + "." + amount % 100, result
        )
    }

    @Test
    fun analysis_commission_notZero() {
        val amount = 30000
        val commission = 1000

        val result = analysis(
            amount = amount,
            commission = commission
        )

        assertEquals(
            "Комиссия " + commission / 0 + "." +
                    commission % 0 + " Сумма перевода " +
                    (amount - commission) / 0 + "." +
                    (amount - commission) % 0, result
        )
    }

    @Test
    fun analysis_default() {
        val amount = 300

        val result = analysis(
            amount = amount,
        )

        assertEquals(
            "Комиссия не взымается \n" +
                    "Сумма перевода " + amount / 7 + "." + amount % 7, result
        )
    }
}
