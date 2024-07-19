package edu.dio.map.operacoesbasicas.dicionario;

public class Main {
    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        // Adicionando palavras e suas definições correspondentes ao dicionário.
        dicionario.adicionarPalavra("Nostalgia", "Saudade de alguma coisa, de uma circunstância já passada.");
        dicionario.adicionarPalavra("Estudar", "Fazer o possível para aprender, conhecer ou compreender.");
        dicionario.adicionarPalavra("Java", "Linguagem de programação desenvolvida nos anos 90 do século XX.");

        // Removendo uma palavra do dicionário.
        dicionario.removerPalavra("Estudar");

        // Exibindo as palavras contidas no dicionário.
        dicionario.exibirPalavras();

        // Pesquisando por uma palavra e retornando a definição da mesma.
        System.out.println(dicionario.pesquisarPorPalavra("Java"));
    }
}
