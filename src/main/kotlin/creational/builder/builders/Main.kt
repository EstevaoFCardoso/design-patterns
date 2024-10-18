package creational.builder.builders

import creational.builder.director.Director

fun main() {
    val director = Director()

    // Criando o carro
    val builder = CarBuilder()
    director.constructSedanCar(builder)

    val car = builder.getResult()
    println("${car.getCarType()} produzido com sucesso!")

    val truckBuilder = TruckBuilder()
    director.constructTruck(truckBuilder)

    val truck = truckBuilder.getResult()
    println("Caminhao: ${truck.result()}")
}