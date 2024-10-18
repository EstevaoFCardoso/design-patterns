package creational.factory_method

import creational.factory_method.vehicles.Car
import creational.factory_method.vehicles.IVehicle

class CarTransport : Transport() {
    override fun createTransport(): IVehicle {
        return Car()
    }
}