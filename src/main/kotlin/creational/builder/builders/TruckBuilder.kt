package creational.builder.builders

import creational.builder.car.Truck
import creational.builder.components.CarType
import creational.builder.components.Engine
import creational.builder.components.Transmission

class TruckBuilder : IBuilder {
    private var carType: CarType? = null
    private var seats: Int = 0
    private var transmission: Transmission? = null
    private var engine: Engine? = null

    override fun setCarType(carType: CarType) {
        this.carType = carType
    }

    override fun setSeats(seats: Int) {
        this.seats = seats
    }

    override fun setTransmission(transmission: Transmission) {
        this.transmission = transmission
    }

    override fun setEngine(engine: Engine) {
        this.engine = engine
    }

    fun getResult(): Truck {
        return Truck(
            carType ?: throw IllegalArgumentException("CarType is not set"),
            seats,
            engine ?: throw IllegalArgumentException("Engine is not set"),
            transmission ?: throw IllegalArgumentException("Transmission is not set")
        )
    }
}