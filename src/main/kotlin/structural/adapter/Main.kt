package structural.adapter

import structural.adapter.adapters.MercadoPagoAdapter
import structural.adapter.adapters.PayoneerAdapter
import structural.adapter.mercadopago.MercadoPago
import structural.adapter.payoneer.Payoneer
import structural.adapter.paypal.IPayPalPayments

fun main() {
    // val payment: IPayonnerPayments = Payoneer()
    //val payment: IPayPalPayments = PayoneerAdapter(Payoneer())

    val payment: IPayPalPayments = MercadoPagoAdapter(MercadoPago())

    payment.paypalPayment()
    payment.paypalReceive()
}