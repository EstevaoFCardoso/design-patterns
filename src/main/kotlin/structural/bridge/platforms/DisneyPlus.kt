package structural.bridge.platforms

class DisneyPlus : IPlatform {

    init {
        configureRMTP()
        println("Facebook: Transmissão Iniciada")
    }

    override fun configureRMTP() {
        authToken()
        println("Facebook: Conta autorizada")
    }

    override fun authToken() {
        println("Facebook: Autorizando aplicação")
    }
}