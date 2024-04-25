import java.util.Date

fun main() {
    val gerenciadorDeTarefas = GerenciadorDeTarefas()

    // Exemplo de adição de tarefas
    val tarefa1 = Tarefa("Comprar Tadalafila", "ir na farmacia mais proxima e comprar um pacote de tadalafila", Date(), Prioridade.BAIXA)
    val tarefa2 = Tarefa("Ir no Bar do Morango", "Dedicar 1 hora do meu tempo ao preparo do campeonato de caxeta", Date(), Prioridade.ALTA)
    val tarefa3 = Tarefa("Ir no barbeiro", "Ir na barbearia e cortar o cabelo e barba", Date(), Prioridade.ALTA)

    gerenciadorDeTarefas.adicionarTarefa(tarefa1)
    gerenciadorDeTarefas.adicionarTarefa(tarefa2)
    gerenciadorDeTarefas.adicionarTarefa(tarefa3)

    // Exemplo de listagem de tarefas por data de vencimento
    val tarefasOrdenadasPorData = gerenciadorDeTarefas.listarTarefasPorDataVencimento()
    println("Tarefas ordenadas por data de vencimento:")
    tarefasOrdenadasPorData.forEach { println(it) }

    // Exemplo de remoção de tarefa
    gerenciadorDeTarefas.removerTarefa("Comprar Tadalafila")

    // Exemplo de busca de tarefa
    val tarefaEncontrada = gerenciadorDeTarefas.buscarTarefa("Ir no Bar do Morango")
    println("Tarefa encontrada: $tarefaEncontrada")
}
