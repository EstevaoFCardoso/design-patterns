package behavioral.chainofresponsability.middlewares

abstract class Middleware {
    private var next: Middleware? = null

    fun linkWith(next: Middleware): Middleware {
        this.next = next
        return next
    }

    abstract fun check(email: String, password: String): Boolean

    protected fun checkNext(email: String, password: String): Boolean {
        return next?.check(email, password) ?: true
    }
}