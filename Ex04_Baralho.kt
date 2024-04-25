import kotlin.random.Random

class Baralho {
    private val naipes = arrayOf("♠️", "♥️", "♦️", "♣️")
    private val valores = arrayOf("A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K")
    private val cartas: MutableList<Carta> = mutableListOf()

    init {
        for (naipe in naipes) {
            for (valor in valores) {
                cartas.add(Carta(valor, naipe))
            }
        }
    }

    fun embaralhar() {
        cartas.shuffle()
    }

    fun distribuirCartas(quantidade: Int): List<Carta> {
        val cartasDistribuidas = mutableListOf<Carta>()
        repeat(quantidade) {
            if (cartas.isNotEmpty()) {
                cartasDistribuidas.add(cartas.removeAt(0))
            }
        }
        return cartasDistribuidas
    }
}
