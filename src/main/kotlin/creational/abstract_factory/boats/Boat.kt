package creational.abstract_factory.boats

class Boat : creational.abstract_factory.boats.IBoat {
    override fun startRoute() {
        getCargo()
        println("Iniciando a viagem")
    }

    override fun getCargo() {
        println("Cruzando o Atlântico!")
    }
}