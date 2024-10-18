package structural.adapter.mercadopago

import structural.adapter.payoneer.IPayonnerPayments
import structural.adapter.utils.Token

class MercadoPago : IPayonnerPayments {
    override fun authToken(): Token {
        return Token()
    }

    override fun sendPayment() {
        println("Enviando pagamentos via Mercado Pago")
    }

    override fun receivePayment() {
        println("Recebendo pagamentos via Mercado Pago")
    }
}