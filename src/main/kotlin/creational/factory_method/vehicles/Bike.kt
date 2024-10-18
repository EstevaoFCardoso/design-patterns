package creational.factory_method.vehicles

class Bike : IVehicle {

    override fun startRoute() {
        getCargo()
        println("Iniciamos o trajeto")
    }

    override fun getCargo() {
        println("Pegamos a comida")
    }
}