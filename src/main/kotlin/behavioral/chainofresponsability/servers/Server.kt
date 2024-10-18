package behavioral.chainofresponsability.servers

import behavioral.chainofresponsability.middlewares.Middleware

class Server {

    private val users = mutableMapOf<String, String>()
    private var middleware: Middleware? = null

    fun setMiddleware(middleware: Middleware) {
        this.middleware = middleware
    }

    fun logIn(email: String, password: String): Boolean {
        return if (middleware?.check(email, password) == true) {
            println("Usuário autenticado com sucesso!")
            println("Seja Bem vindo!")
            true
        } else {
            false
        }
    }

    fun registerUser(email: String, password: String) {
        users[email] = password
    }

    fun hasEmail(email: String): Boolean {
        return users.containsKey(email)
    }

    fun isValidPassword(email: String, password: String): Boolean {
        return users[email] == password
    }
}