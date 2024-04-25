class Jogador(val nome: String) {
    private val cartasNaMao: MutableList<Carta> = mutableListOf()

    fun receberCartas(cartas: List<Carta>) {
        cartasNaMao.addAll(cartas)
    }

    fun verificarCombinacaoVencedora(): String {
        val agrupamentoPorValor = cartasNaMao.groupBy { it.valor }
        val agrupamentoPorNaipe = cartasNaMao.groupBy { it.naipe }

        val trincas = agrupamentoPorValor.values.any { it.size == 3 }
        val pares = agrupamentoPorValor.values.any { it.size == 2 }
        val flush = agrupamentoPorNaipe.values.any { it.size == 5 }
        val fullHouse = trincas && pares

        return when {
            flush -> "Flush"
            fullHouse -> "Full House"
            trincas -> "Trinca"
            pares -> "Par"
            else -> "Não esta boa para rodada "
        }
    }

    fun cartasNaMaoString(): String {
        return cartasNaMao.joinToString(", ") { it.toString() }
    }
}
