package creational.abstract_factory

import creational.abstract_factory.app.Application
import creational.abstract_factory.factories.BoatTransport
import creational.abstract_factory.factories.ITransporteFactory
import creational.abstract_factory.factories.NineNineTransport
import creational.abstract_factory.factories.UberTransport

fun main() {
    val app = creational.abstract_factory.configureApplication()
    app.startRoute()
}

fun configureApplication(): creational.abstract_factory.app.Application {
    val factory: creational.abstract_factory.factories.ITransporteFactory

    val company = "boat"

    factory = when (company) {
        "uber" -> creational.abstract_factory.factories.UberTransport()
        "99" -> creational.abstract_factory.factories.NineNineTransport()
        else -> creational.abstract_factory.factories.BoatTransport()
    }

    return creational.abstract_factory.app.Application(factory)
}