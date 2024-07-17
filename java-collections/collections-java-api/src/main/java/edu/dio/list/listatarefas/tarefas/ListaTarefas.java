package edu.dio.list.listatarefas.tarefas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa> listaTarefas;

    public ListaTarefas() {
        listaTarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        listaTarefas.add(new Tarefa(descricao));
    }

    // Utilizando a abordagem mais simplificada.
    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t: listaTarefas) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }

        listaTarefas.removeAll(tarefasParaRemover);
    }

    // Utilizando a abordagem da lambda expression.
    public void removerTarefaComLambda(String descricao) {
        listaTarefas.removeIf(t -> t.getDescricao().equalsIgnoreCase(descricao));
    }

    // Utilizando a abordagem do Iterator.
    public void removerTarefaComIterator(String descricao) {
        Iterator<Tarefa> iterTarefa = listaTarefas.iterator();
        while (iterTarefa.hasNext()) {
            Tarefa t = iterTarefa.next();
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                iterTarefa.remove();
            }
        }
    }

    public int obterNumeroTotalDeTarefas() {
        return listaTarefas.size();
    }

    public List<Tarefa> obterDescricoesTarefas() {
        return listaTarefas;
    }
}
