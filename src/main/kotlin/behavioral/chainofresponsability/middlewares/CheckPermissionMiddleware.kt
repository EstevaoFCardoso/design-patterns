package behavioral.chainofresponsability.middlewares

class CheckPermissionMiddleware : Middleware() {
    override fun check(email: String, password: String): Boolean {
        return if (email == "master@hcode.com.br") {
            println("Bem vindo Administrador!")
            true
        } else {
            println("Bem vindo!")
            checkNext(email, password)
        }
    }
}