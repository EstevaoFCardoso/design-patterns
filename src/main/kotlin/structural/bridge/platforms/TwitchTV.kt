package structural.bridge.platforms

class TwitchTV : IPlatform {

    init {
        configureRMTP()
        println("TwitchTV: Transmissão Iniciada")
    }

    override fun configureRMTP() {
        authToken()
        println("TwitchTV: configurando RMTP")
    }

    override fun authToken() {
        println("TwitchTV: Validando o Canal")
    }
}