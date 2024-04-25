fun main() {
    println("Digite os numeros dos messes do ano:")
    val input = readLine()?.trim() // Remover espaços em branco

    val numeroMes = try {
        input?.toInt()
    } catch (e: NumberFormatException) {
        null
    }

    if (numeroMes in 1..12) {
        val nomeMes = when (numeroMes) {
            1 -> "Janeiro"
            2 -> "Fevereiro"
            3 -> "Março"
            4 -> "Abril"
            5 -> "Maio"
            6 -> "Junho"
            7 -> "Julho"
            8 -> "Agosto"
            9 -> "Setembro"
            10 -> "Outubro"
            11 -> "Novembro"
            12 -> "Dezembro"
            else -> "Consulta inválida! O número de messes deve estar entre 1 e 12."
        }
        println("O mês que equivale  ao número informado é $numeroMes é $nomeMes.")
    } else {
        println("Consulta inválida! O número de messes deve estar entre 1 e 12.")
    }
}
