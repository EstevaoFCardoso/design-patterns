package creational.factory_method.vehicles

class Motorcycle : IVehicle {

    override fun startRoute() {
        getCargo()
        println("Iniciamos a entrega")
    }

    override fun getCargo() {
        println("Pegamos a encomenda")
    }
}