package creational.abstract_factory.factories

import creational.abstract_factory.aircrafts.Helicopter
import creational.abstract_factory.aircrafts.IAircraft
import creational.abstract_factory.boats.Boat
import creational.abstract_factory.boats.IBoat
import creational.abstract_factory.landvehicles.ILandVehicle
import creational.abstract_factory.landvehicles.Motorcycle

class NineNineTransport : creational.abstract_factory.factories.ITransporteFactory {

    override fun createTransportVehicle(): creational.abstract_factory.landvehicles.ILandVehicle {
        return creational.abstract_factory.landvehicles.Motorcycle()
    }

    override fun createTransportAircraft(): creational.abstract_factory.aircrafts.IAircraft {
        return creational.abstract_factory.aircrafts.Helicopter()
    }

    override fun createTransportBoat(): creational.abstract_factory.boats.IBoat {
        return creational.abstract_factory.boats.Boat()
    }
}