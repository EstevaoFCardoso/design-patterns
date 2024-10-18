package behavioral.chainofresponsability

import behavioral.chainofresponsability.middlewares.CheckPermissionMiddleware
import behavioral.chainofresponsability.middlewares.CheckUserMiddleware
import behavioral.chainofresponsability.servers.Server
import java.io.BufferedReader
import java.io.InputStreamReader

object Main {
    private val reader = BufferedReader(InputStreamReader(System.`in`))
    private lateinit var server: Server

    private fun init() {
        server = Server()
        server.registerUser("master@hcode.com.br", "8765rtyuTRE##%")
        server.registerUser("user@hcode.com.br", "123456")

        val middleware = CheckUserMiddleware(server)
        middleware.linkWith(CheckPermissionMiddleware())

        server.setMiddleware(middleware)
    }

    @JvmStatic
    fun main(args: Array<String>) {
        init()

        var done: Boolean

        do {
            println("Digite o e-mail: ")
            val email = reader.readLine()
            println("Digite sua senha: ")
            val password = reader.readLine()
            done = server.logIn(email, password)
        } while (!done)
    }
}