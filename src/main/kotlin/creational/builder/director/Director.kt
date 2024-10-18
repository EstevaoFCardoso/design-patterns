package creational.builder.director

import creational.builder.builders.IBuilder
import creational.builder.components.CarType
import creational.builder.components.Engine
import creational.builder.components.Transmission

class Director {

    fun constructSedanCar(builder: IBuilder) {
        builder.setCarType(CarType.SEDAN)
        builder.setSeats(5)
        builder.setTransmission(Transmission.AUTOMATIC)
        builder.setEngine(Engine(1600))
    }

    fun constructTruck(builder: IBuilder) {
        builder.setCarType(CarType.TRUCK)
        builder.setSeats(5)
        builder.setTransmission(Transmission.AUTOMATIC_SEQUENTIAL)
        builder.setEngine(Engine(13000))
    }
}