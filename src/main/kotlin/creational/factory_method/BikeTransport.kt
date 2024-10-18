package creational.factory_method

import creational.factory_method.vehicles.Bike
import creational.factory_method.vehicles.IVehicle

class BikeTransport : Transport() {
    override fun createTransport(): IVehicle {
        return Bike()
    }
}