package edu.dio.map.operacoesbasicas.dicionario;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> mapaPalavras;

    public Dicionario() {
        mapaPalavras = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        mapaPalavras.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        if (!mapaPalavras.isEmpty()) {
            mapaPalavras.remove(palavra);
        }
    }

    public void exibirPalavras() {
        if (!mapaPalavras.isEmpty()) {
            for (Map.Entry<String, String> contato : mapaPalavras.entrySet()) {
                String palavra = contato.getKey();
                String descricao = contato.getValue();
                System.out.printf("Palavra: %s | Descrição: %s%n", palavra, descricao);
            }
        } else {
            System.out.println("A agenda está vazia!");
        }
    }

    public String pesquisarPorPalavra(String palavra) {
        String descricao = null;
        if (!mapaPalavras.isEmpty()) {
            for (Map.Entry<String, String> p : mapaPalavras.entrySet()) {
                String chave = p.getKey();
                String desc = p.getValue();
                if (chave.equals(palavra)) {
                    descricao = desc;
                }
            }
        }
        return String.format("%s: %s", palavra, descricao);
    }


}
