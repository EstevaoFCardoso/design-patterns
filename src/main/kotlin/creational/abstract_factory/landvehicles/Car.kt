package creational.abstract_factory.landvehicles

class Car : creational.abstract_factory.landvehicles.ILandVehicle {
    override fun startRoute() {
        getCargo()
        println("Iniciando o trajeto")
    }

    override fun getCargo() {
        println("Pegamos os passageiros, estamos prontos")
    }
}