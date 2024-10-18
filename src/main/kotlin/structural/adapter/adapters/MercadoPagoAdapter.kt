package structural.adapter.adapters

import structural.adapter.mercadopago.MercadoPago
import structural.adapter.paypal.IPayPalPayments
import structural.adapter.utils.Token

class MercadoPagoAdapter(private val mercadoPago: MercadoPago) : IPayPalPayments {
    private var token: Token? = null

    init {
        println("Adaptando utilizando os métodos padrões do Mercado Pago")
    }

    override fun authToken(): Token {
        return Token()
    }

    override fun paypalPayment() {
        mercadoPago.sendPayment()
    }

    override fun paypalReceive() {
        mercadoPago.receivePayment()
    }
}