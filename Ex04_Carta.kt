data class Carta(val valor: String, val naipe: String) {
    override fun toString(): String {
        return "$valor$naipe"
    }
}
