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

    public Integer pesquisarPorNome(String nome) {
        Integer telefone = null;
        if (!mapaContatos.isEmpty()) {
            telefone = mapaContatos.get(nome);
        }
        return telefone;
    }
}
