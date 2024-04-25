// Classe Passaro, derivada de Animal
class Passaro(nome: String, idade: Int) : Animal(nome, idade, "Canto") {
    override fun fazerSom() {
        println("$nome fazendo som: $som")
    }

    // Método específico para pássaro
    fun cantar() {
        println("$nome cantando: $som")
    }
}

