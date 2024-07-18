package edu.dio.set.operacoesbasicas.conjuntodepalavras;

import edu.dio.set.operacoesbasicas.conjuntodepalavras.palavras.ConjuntoPalavrasUnicas;

public class Main {
    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjPalavrasUnicas = new ConjuntoPalavrasUnicas();

        // Adicionando palavras ao conjunto.
        conjPalavrasUnicas.adicionarPalavra("Java");
        conjPalavrasUnicas.adicionarPalavra("Oracle");
        conjPalavrasUnicas.adicionarPalavra("Sun Microsystems");
        conjPalavrasUnicas.adicionarPalavra("Java");

        // Removendo uma palavra do conjunto.
        conjPalavrasUnicas.removerPalavra("Oracle");

        // Verificano se uma palavra existe no conjunto.
        conjPalavrasUnicas.verificarPalavra("Oracle");

        // Exibindo as palavras do conjunto.
        conjPalavrasUnicas.exibirPalavrasUnicas();
    }
}
