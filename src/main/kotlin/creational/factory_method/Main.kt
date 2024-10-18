package creational.factory_method

fun main(args: Array<String>) {
    if (args.isNotEmpty()) {
        val transport = configure(args[0])
        transport?.let {
            runTransport(it)
        }
    } else {
        println("Nenhum tipo de transporte fornecido. Informe um argumento!")
    }
}
private fun runTransport(transport: Transport) {
    transport.startTransport()
}

private fun configure(type: String): Transport? {
    return when (type) {
        "uber" -> CarTransport()
        "log" -> MotorcycleTransport()
        "eats" -> BikeTransport()
        else -> {
            println("Selecione o tipo de entrega")
            null
        }
    }
}