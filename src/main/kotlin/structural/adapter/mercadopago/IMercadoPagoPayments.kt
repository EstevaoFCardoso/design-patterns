package structural.adapter.mercadopago

import structural.adapter.utils.Token

interface IMercadoPagoPayments {
    fun authToken(): Token
    fun sendPayment()
    fun receivePayment()
}