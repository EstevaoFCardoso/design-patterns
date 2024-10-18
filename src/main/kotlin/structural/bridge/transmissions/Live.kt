package structural.bridge.transmissions

import structural.bridge.platforms.IPlatform

open class Live(var platform: IPlatform? = null) : ITransmission {

    override fun broadcasting() {
        println("Iniciando a Transmissão!")
    }

    override fun result() {
        println("**** ON AIR ****")
    }

    override fun startingToRecord() {
        println("Iniciando a gravação!")
    }

    override fun endRecording() {
        println("Fim da gravação!")
    }
}