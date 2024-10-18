package behavioral.chainofresponsability.middlewares

import behavioral.chainofresponsability.servers.Server

class CheckUserMiddleware(private val server: Server) : Middleware() {

    override fun check(email: String, password: String): Boolean {
        if (!server.hasEmail(email)) {
            println("E-mail Inválido")
            return false
        }

        if (!server.isValidPassword(email, password)) {
            println("E-mail ou Senha Inválidos")
            return false
        }

        return checkNext(email, password)
    }
}