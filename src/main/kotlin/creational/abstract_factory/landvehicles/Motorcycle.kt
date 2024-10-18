package creational.abstract_factory.landvehicles

class Motorcycle : creational.abstract_factory.landvehicles.ILandVehicle {

    override fun startRoute() {
        getCargo()
        println("Iniciamos a entrega")
    }

    override fun getCargo() {
        println("Pegamos a encomenda")
    }
}