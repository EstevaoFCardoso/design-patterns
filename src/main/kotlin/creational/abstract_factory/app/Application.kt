package creational.abstract_factory.app

import creational.abstract_factory.aircrafts.IAircraft
import creational.abstract_factory.boats.IBoat
import creational.abstract_factory.factories.ITransporteFactory
import creational.abstract_factory.landvehicles.ILandVehicle

class Application(factory: creational.abstract_factory.factories.ITransporteFactory) {
    private val vehicle: creational.abstract_factory.landvehicles.ILandVehicle = factory.createTransportVehicle()
    private val aircraft: creational.abstract_factory.aircrafts.IAircraft = factory.createTransportAircraft()
    private val boat: creational.abstract_factory.boats.IBoat = factory.createTransportBoat()

    fun startRoute() {
        vehicle.startRoute()
        aircraft.startRoute()
        boat.startRoute()
    }
}