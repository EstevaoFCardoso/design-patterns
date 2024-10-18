package creational.abstract_factory.aircrafts

class Helicopter: creational.abstract_factory.aircrafts.IAircraft {

    override fun startRoute() {
        wind()
        println("Iniciando a decolagem")
    }

    override fun getCargo() {
        println("Passageiros a borod")
        println("Ligando hélices")
    }

    override fun wind() {
        println("Ventos a 26km/hora, ventos OK")
    }

}