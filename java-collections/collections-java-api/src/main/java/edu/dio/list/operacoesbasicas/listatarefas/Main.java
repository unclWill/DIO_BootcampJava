package edu.dio.list.operacoesbasicas.listatarefas;

import edu.dio.list.operacoesbasicas.listatarefas.tarefas.ListaTarefas;
import edu.dio.list.operacoesbasicas.listatarefas.tarefas.Tarefa;

public class Main {
    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        // Adicionando tarefas.
        listaTarefas.adicionarTarefa("Estudar Java");
        listaTarefas.adicionarTarefa("Estudar a Collections API");
        listaTarefas.adicionarTarefa("Assistir o Senhor dos Anéis: O Retorno do Rei");

        // Exibindo as tarefas.
        percorrerListaDeTarefas(listaTarefas);

        // Removendo uma tarefa.
        listaTarefas.removerTarefa("Estudar Java");

        // Exibindo as tarefas após a remoção.
        System.out.println();
        percorrerListaDeTarefas(listaTarefas);
    }

    public static void percorrerListaDeTarefas(ListaTarefas tarefas) {
        System.out.printf("Total de tarefas a fazer: %d%n", tarefas.obterNumeroTotalDeTarefas());
        for (Tarefa t : tarefas.obterDescricoesTarefas()) {
            System.out.println(t.getDescricao());
        }
    }
}