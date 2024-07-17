package edu.dio;

import edu.dio.listatarefas.ListaTarefas;
import edu.dio.listatarefas.Tarefa;

import java.util.List;


public class Main {
    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        // Adicionando tarefas.
        listaTarefas.adicionarTarefa("Estudar Java");
        listaTarefas.adicionarTarefa("Estudar a Collections API");
        listaTarefas.adicionarTarefa("Assistir o Senhor dos Anéis: O Retorno do Rei");

        // Exibindo as tarefas.
        percorrerListaDeTarefas(listaTarefas.obterDescricoesTarefas(), listaTarefas);

        // Removendo uma tarefa.
        listaTarefas.removerTarefa("Estudar Java");

        // Exibindo as tarefas após a remoção.
        System.out.println();
        percorrerListaDeTarefas(listaTarefas.obterDescricoesTarefas(), listaTarefas);
    }

    public static void percorrerListaDeTarefas(List<Tarefa> listaTarefas, ListaTarefas tarefas) {
        System.out.printf("Total de tarefas a fazer: %d%n", tarefas.obterNumeroTotalDeTarefas());
        for (Tarefa t : listaTarefas) {
            System.out.println(t.getDescricao());
        }
    }
}