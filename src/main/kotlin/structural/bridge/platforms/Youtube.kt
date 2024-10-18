package structural.bridge.platforms

class YouTube : IPlatform {

    init {
        configureRMTP()
        println("YouTube: Transmissão Iniciada")
    }

    override fun configureRMTP() {
        authToken()
        println("YouTube: configurando broadcasting")
    }

    override fun authToken() {
        println("YouTube: Autorizando aplicação")
    }
}