package edu.dio.map.pesquisa.contagemdepalavras;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> mapaPalavras;

    public ContagemPalavras() {
        mapaPalavras = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem) {
        mapaPalavras.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {
        if (!mapaPalavras.isEmpty()) {
            mapaPalavras.remove(palavra);
        }
    }

    public void exibirContagemPalavras() {
        if (!mapaPalavras.isEmpty()) {
            for (Map.Entry<String, Integer> palavra : mapaPalavras.entrySet()) {
                System.out.printf("Palavra: %s | Contagem: %d%n", palavra.getKey(), palavra.getValue());
            }
        }
    }

    public String encontrarPalavraMaisFrequente() {
        String palavraMaisFrequente = null;
        int contagem = 0;
        if (!mapaPalavras.isEmpty()) {
            for (Map.Entry<String, Integer> palavra : mapaPalavras.entrySet()) {
                if (palavra.getValue() > contagem) {
                    contagem = palavra.getValue();
                    palavraMaisFrequente = palavra.getKey();
                }
            }
        }
        return String.format("Palavra: %s | Contagem: %d", palavraMaisFrequente, contagem);
    }
}
