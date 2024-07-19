package edu.dio.map.operacoesbasicas.agendadecontatos;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> mapaContatos;

    public AgendaContatos() {
        mapaContatos = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        mapaContatos.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!mapaContatos.isEmpty()) {
            mapaContatos.remove(nome);
        }
    }

    public void exibirContatos() {
        if (!mapaContatos.isEmpty()) {
            for (Map.Entry<String, Integer> contato : mapaContatos.entrySet()) {
                String nome = contato.getKey();
                int telefone = contato.getValue();
                System.out.printf("Nome: %s | Telefone: %d%n", nome, telefone);
            }
        } else {
            System.out.println("A agenda está vazia!");
        }
    }

    public void pesquisarPorNome(String nome) {
        if (!mapaContatos.isEmpty()) {
            for (Map.Entry<String, Integer> contato : mapaContatos.entrySet()) {
                String nomeContato = contato.getKey();
                int telefone = contato.getValue();
                if (nomeContato.equals(nome)) {
                    System.out.printf("Nome: %s | Telefone: %d%n", nomeContato, telefone);
                    break;
                }
            }
        } else {
            System.out.println("O contato buscado não foi encontrado!");
        }
    }
}
