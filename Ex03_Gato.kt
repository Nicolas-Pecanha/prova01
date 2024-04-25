// Classe Gato, derivada de Animal
class Gato(nome: String, idade: Int) : Animal(nome, idade, "Miau") {
    override fun fazerSom() {
        println("$nome fazendo som: $som")
    }

    // Método específico para gato
    fun miar() {
        println("$nome miando: $som")
    }
}