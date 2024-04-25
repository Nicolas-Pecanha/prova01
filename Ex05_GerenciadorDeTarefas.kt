import java.util.Date

class GerenciadorDeTarefas {
    private val listaDeTarefas = mutableListOf<Tarefa>()

    fun adicionarTarefa(tarefa: Tarefa) {
        listaDeTarefas.add(tarefa)
    }

    fun removerTarefa(titulo: String) {
        val tarefa = listaDeTarefas.find { it.titulo == titulo }
        tarefa?.let {
            listaDeTarefas.remove(it)
        }
    }

    fun buscarTarefa(titulo: String): Tarefa? {
        return listaDeTarefas.find { it.titulo == titulo }
    }

    fun marcarComoConcluida(titulo: String) {
        val tarefa = listaDeTarefas.find { it.titulo == titulo }
        tarefa?.let {
            // Aqui você pode definir como deseja marcar uma tarefa como concluída,
            // por exemplo, adicionando um atributo booleano "concluida" na classe Tarefa
            // e definindo-o como true quando a tarefa for marcada como concluída.
        }
    }

    fun listarTarefasPorDataVencimento(): List<Tarefa> {
        return listaDeTarefas.sortedBy { it.dataVencimento }
    }
}
