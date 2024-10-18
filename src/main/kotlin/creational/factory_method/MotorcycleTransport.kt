package creational.factory_method

import creational.factory_method.vehicles.IVehicle
import creational.factory_method.vehicles.Motorcycle

class MotorcycleTransport : Transport() {
    override fun createTransport(): IVehicle {
        return Motorcycle()
    }
}