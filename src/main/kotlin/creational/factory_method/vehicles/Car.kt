package creational.factory_method.vehicles

class Car : IVehicle {
    override fun startRoute() {
        getCargo()
        println("Iniciando o trajeto")
    }

    override fun getCargo() {
        println("Pegamos os passageiros, estamos prontos")
    }
}