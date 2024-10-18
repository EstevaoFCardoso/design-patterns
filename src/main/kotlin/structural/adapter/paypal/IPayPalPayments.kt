package structural.adapter.paypal

import structural.adapter.utils.Token

interface IPayPalPayments {
    fun authToken(): Token
    fun paypalPayment()
    fun paypalReceive()
}