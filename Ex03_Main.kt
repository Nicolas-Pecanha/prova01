fun main() {
    // Criando uma lista de animais
    val listaAnimais = listOf(
        Cachorro("Shippo", 14),
        Gato("Supino", 2),
        Passaro ("Louro Jose", 5)
    )

    // Exibindo informações e sons de cada animal na lista
    for (animal in listaAnimais) {
        animal.exibirInfo()
        animal.fazerSom()
        println() // Linha em branco para separar as informações de cada animal
    }

    // Testando métodos específicos de cada tipo de animal
    if (listaAnimais[0] is Cachorro) {
        (listaAnimais[0] as Cachorro).latir()
    }
    if (listaAnimais[1] is Gato) {
        (listaAnimais[1] as Gato).miar()
    }
    if (listaAnimais[2] is Passaro) {
        (listaAnimais[2] as Passaro).cantar()
    }
}
