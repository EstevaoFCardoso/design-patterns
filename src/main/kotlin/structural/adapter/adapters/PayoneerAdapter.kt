package structural.adapter.adapters

import structural.adapter.payoneer.Payoneer
import structural.adapter.paypal.IPayPalPayments
import structural.adapter.utils.Token

class PayoneerAdapter(private val payoneer: Payoneer) : IPayPalPayments {
    private var token: Token? = null

    init {
        println("Adaptando o Payoneer utilizando os métodos padrões do PayPal")
    }

    override fun authToken(): Token {
        return Token()
    }

    override fun paypalPayment() {
        payoneer.sendPayment()
    }

    override fun paypalReceive() {
        payoneer.receivePayment()
    }
}