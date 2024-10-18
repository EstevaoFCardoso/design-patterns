package structural.adapter.paypal

import structural.adapter.utils.Token

class PayPal : IPayPalPayments {
    private var token: Token? = null

    override fun authToken(): Token {
        return Token()
    }

    override fun paypalPayment() {
        token = authToken()
        println("Enviando pagamentos via PayPal")
    }

    override fun paypalReceive() {
        println("Recebendo pagamentos via PayPal")
    }
}