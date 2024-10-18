package creational.builder.builders

import creational.builder.components.CarType
import creational.builder.components.Engine
import creational.builder.components.Transmission

interface IBuilder {

    fun setCarType(carType: CarType)
    fun setSeats(seats: Int)
    fun setEngine(engine: Engine)
    fun setTransmission(transmission: Transmission)
}