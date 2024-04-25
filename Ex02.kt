fun calcularSomaFormula(n: Int): Int {
    return n * (n + 1) * (2 * n + 1) / 6
}

fun main() {
    println("Digite um número inteiro positivo:")
    val n = readLine()?.toIntOrNull()

    if (n != null && n > 0) {
        val soma = calcularSomaFormula(n)
        println("f($n) = $soma")
    } else {
        println("Entrada inválida. Por favor, digite um número inteiro positivo.")
    }
}
