fun main() {
    val baralho = Baralho()
    baralho.embaralhar()

    val jogadores = mutableListOf<Jogador>()
    val numeroDeJogadores = 5

    val nomesJogadores = listOf("Pedro", "Paulo", "Alex", "Simone", "Simaria")

    for (i in 0 until numeroDeJogadores) {
        val jogador = Jogador(nomesJogadores[i])
        val cartas = baralho.distribuirCartas(5)
        jogador.receberCartas(cartas)
        jogadores.add(jogador)
    }

    var vencedor: Jogador? = null
    var melhormao = ""
    for (jogador in jogadores) {
        val jogada = jogador.verificarCombinacaoVencedora()
        println("${jogador.nome} - Cartas: ${jogador.cartasNaMaoString()} - Mão: $jogada")
        if (jogada != "Nenhuma combinação vencedora" && (melhormao.isEmpty() || jogada > melhormao)) {
            melhormao = jogada
            vencedor = jogador
        }
    }

    if (vencedor != null) {
        println("\nVencedor: ${vencedor.nome} - Melhor Mão: $melhormao")
    } else {
        println("\nNenhum jogador teve uma combinação vencedora.")
    }
}
