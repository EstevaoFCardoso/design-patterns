package structural.adapter.payoneer

import structural.adapter.utils.Token

interface IPayonnerPayments {
    fun authToken(): Token
    fun sendPayment()
    fun receivePayment()
}