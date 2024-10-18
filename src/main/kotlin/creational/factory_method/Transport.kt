package creational.factory_method

import creational.factory_method.vehicles.IVehicle

abstract class Transport {

    fun startTransport() {
        val vehicle: IVehicle = createTransport()
        vehicle.startRoute()
    }

    protected abstract fun createTransport(): IVehicle
}