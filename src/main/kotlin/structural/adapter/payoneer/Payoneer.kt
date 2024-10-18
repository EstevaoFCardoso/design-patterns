package structural.adapter.payoneer

import structural.adapter.utils.Token

class Payoneer : IPayonnerPayments {
    override fun authToken(): Token {
        return Token()
    }

    override fun sendPayment() {
        println("Enviando pagamentos via Payoneer")
    }

    override fun receivePayment() {
        println("Recebendo pagamentos via Payoneer")
    }
}