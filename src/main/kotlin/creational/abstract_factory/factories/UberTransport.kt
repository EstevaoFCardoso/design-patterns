package creational.abstract_factory.factories

import creational.abstract_factory.aircrafts.Airplane
import creational.abstract_factory.aircrafts.IAircraft
import creational.abstract_factory.boats.Boat
import creational.abstract_factory.boats.IBoat
import creational.abstract_factory.landvehicles.Car
import creational.abstract_factory.landvehicles.ILandVehicle

class UberTransport : creational.abstract_factory.factories.ITransporteFactory {

    override fun createTransportVehicle(): creational.abstract_factory.landvehicles.ILandVehicle {
        return creational.abstract_factory.landvehicles.Car()
    }

    override fun createTransportAircraft(): creational.abstract_factory.aircrafts.IAircraft {
        return creational.abstract_factory.aircrafts.Airplane()
    }

    override fun createTransportBoat(): creational.abstract_factory.boats.IBoat {
       return creational.abstract_factory.boats.Boat()
    }
}