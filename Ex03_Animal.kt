// Classe abstrata Animal
abstract class Animal(val nome: String, val idade: Int, val som: String) {
    // Método abstrato para emitir o som do animal
    abstract fun fazerSom()

    // Método para exibir informações do animal
    fun exibirInfo() {
        println("Nome: $nome")
        println("Idade: $idade anos")
        println("Som: $som")
    }
}