import java.util.Date

enum class Prioridade {
    BAIXA, MEDIA, ALTA
}

data class Tarefa(
    val titulo: String,
    val descricao: String,
    val dataVencimento: Date,
    val prioridade: Prioridade
)
