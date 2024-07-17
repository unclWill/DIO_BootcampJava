package edu.dio.listatarefas;

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

    public void removerTarefa(String descricao) {
        // Utilizando abordagem da lamba expression.
        listaTarefas.removeIf(t -> t.getDescricao().equals(descricao));
    }

      // Utilizando abordagem do Iterator.
//    public void removerTarefa(String descricao) {
//        Iterator<Tarefa> iterTarefa = listaTarefas.iterator();
//        while (iterTarefa.hasNext()) {
//            Tarefa t = iterTarefa.next();
//            if (t.getDescricao().equals(descricao)) {
//                iterTarefa.remove();
//            }
//        }
//    }

    public int obterNumeroTotalDeTarefas() {
        return listaTarefas.size();
    }

    public List<Tarefa> obterDescricoesTarefas() {
        return listaTarefas;
    }
}
