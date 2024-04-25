// Classe Cachorro, derivada de Animal
class Cachorro(nome: String, idade: Int) : Animal(nome, idade, "Au Au") {
    override fun fazerSom() {
        println("$nome fazendo som: $som")
    }

    // Método específico para cachorro
    fun latir() {
        println("$nome latindo: $som")
    }
}