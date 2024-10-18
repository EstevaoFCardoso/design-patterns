package creational.abstract_factory.factories

import creational.abstract_factory.aircrafts.IAircraft
import creational.abstract_factory.boats.IBoat
import creational.abstract_factory.landvehicles.ILandVehicle

interface ITransporteFactory {

    fun createTransportVehicle() : creational.abstract_factory.landvehicles.ILandVehicle
    fun createTransportAircraft() : creational.abstract_factory.aircrafts.IAircraft
    fun createTransportBoat(): creational.abstract_factory.boats.IBoat
}