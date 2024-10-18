package creational.builder.car

import creational.builder.builders.IBuilder
import creational.builder.components.CarType
import creational.builder.components.Engine
import creational.builder.components.Transmission

class Truck(
    private var carType: CarType,
    private var seats: Int = 0,
    private var engine: Engine,
    private var transmission: Transmission
) : IBuilder {

    override fun setCarType(carType: CarType) {
        this.carType = carType
    }

    override fun setSeats(seats: Int) {
        this.seats = seats
    }

    override fun setEngine(engine: Engine) {
        this.engine = engine
    }

    override fun setTransmission(transmission: Transmission) {
        this.transmission = transmission
    }

    fun result(): String {
        var truck = "Truck with motor: ${engine.power}\n"
        truck += "Transmission: $transmission"
        return truck
    }
}