package creational.builder.car

import creational.builder.components.CarType
import creational.builder.components.Engine
import creational.builder.components.Transmission

class Car(
    private val carType: CarType,
    private val seats: Int,
    private val engine: Engine,
    private val transmission: Transmission
) {

    fun getCarType(): CarType {
        return carType
    }

    fun getSeats(): Int{
        return seats
    }

    fun getEngine(): Engine {
        return engine
    }

     fun getTransmission(): Transmission {
        return transmission
    }
}