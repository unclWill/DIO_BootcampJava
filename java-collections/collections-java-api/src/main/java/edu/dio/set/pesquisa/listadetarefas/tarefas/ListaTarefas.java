package edu.dio.set.pesquisa.listadetarefas.tarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> conjuntoTarefas;

    public ListaTarefas() {
        conjuntoTarefas = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        conjuntoTarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        Tarefa tarefaParaRemover = null;
        if (!conjuntoTarefas.isEmpty()) {
            for (Tarefa t : conjuntoTarefas) {
                if (t.getDescricao().equals(descricao)) {
                    tarefaParaRemover = t;
                    break;
                }
            }
            conjuntoTarefas.remove(tarefaParaRemover);
        } else {
            throw new RuntimeException("Tarefa não encontrada!");
        }
    }

    public void exibirTarefas() {
        if (!conjuntoTarefas.isEmpty()) {
            for (Tarefa t : conjuntoTarefas) {
                System.out.printf("Descrição: %s | Status: %s%n",
                        t.getDescricao(), (t.isConcluida()) ? "Concluída" : "Pendente");
            }
        } else {
            System.out.println("Não existem tarefas para serem exibidas.");
        }
    }

    public int contarTarefas() {
        return conjuntoTarefas.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        if (!conjuntoTarefas.isEmpty()) {
            for (Tarefa t : conjuntoTarefas) {
                if (t.isConcluida()) {
                    tarefasConcluidas.add(t);
                }
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        if (!conjuntoTarefas.isEmpty()) {
            for (Tarefa t : conjuntoTarefas) {
                if (!t.isConcluida()) {
                    tarefasPendentes.add(t);
                }
            }
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao) {
        if (!conjuntoTarefas.isEmpty()) {
            for (Tarefa t : conjuntoTarefas) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    t.setConcluida(true);
                    break;
                }
            }
        } else {
            System.out.println("A lista de tarefas está vazia!");
        }
    }

    public void marcarTarefaPendente(String descricao) {
        if (!conjuntoTarefas.isEmpty()) {
            for (Tarefa t : conjuntoTarefas) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    t.setConcluida(false);
                    break;
                }
            }
        } else {
            System.out.println("A lista de tarefas está vazia!");
        }
    }

    public void limparListaTarefas() {
        if (!conjuntoTarefas.isEmpty()) {
            conjuntoTarefas.clear();
        } else {
            System.out.println("A lista de tarefas já está vazia!");
        }
    }

}
