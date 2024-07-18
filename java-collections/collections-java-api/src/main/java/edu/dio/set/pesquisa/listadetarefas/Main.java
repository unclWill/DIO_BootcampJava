package edu.dio.set.pesquisa.listadetarefas;

import edu.dio.set.pesquisa.listadetarefas.tarefas.ListaTarefas;
import edu.dio.set.pesquisa.listadetarefas.tarefas.Tarefa;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        // Adicionando tarefas.
        listaTarefas.adicionarTarefa("Estudar Java");
        listaTarefas.adicionarTarefa("Estudar Estrutura de Dados");
        listaTarefas.adicionarTarefa("Ler O Hobbit");
        listaTarefas.adicionarTarefa("Lavar os sapatos");

        // Removendo uma tarefa.
        listaTarefas.removerTarefa("Lavar os sapatos");

        // Exibindo tarefas.
        listaTarefas.exibirTarefas();

        // Contando a quantidade de tarefas adicionadas.
        System.out.printf("%nQuantidade de tarefas na lista: %d%n", listaTarefas.contarTarefas());

        // Definindo o status de uma tarefa como conclúido.
        listaTarefas.marcarTarefaConcluida("Estudar Java");

        // Definindo o status de uma tarefa como pendente.
        listaTarefas.marcarTarefaPendente("Ler O Hobbit");

        // Exibindo as tarefas que estão com o status conluído.
        System.out.println("\nTarefas concluídas:");
        percorrerConjunto(listaTarefas.obterTarefasConcluidas());

        // Exibindo as tarefas que estão com o status pendente.
        System.out.println("\nTarefas pendentes:");
        percorrerConjunto(listaTarefas.obterTarefasPendentes());

        // Exibindo tarefas após manipualações.
        System.out.println();
        listaTarefas.exibirTarefas();

        // Limpando a lista de tarefas.
        listaTarefas.limparListaTarefas();

        // Exibindo após limpeza.
        System.out.println();
        listaTarefas.exibirTarefas();
    }

    public static void percorrerConjunto(Set<Tarefa> tarefas) {
        for (Tarefa t :tarefas) {
            System.out.printf("Descrição: %s | Status: %s%n",
                    t.getDescricao(), (t.isConcluida()) ? "Concluída" : "Pendente");
        }
    }
}
