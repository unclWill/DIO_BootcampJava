package edu.dio.map.pesquisa.contagemdepalavras;

public class Main {
    public static void main(String[] args) {
        ContagemPalavras contagemPalavras = new ContagemPalavras();

        // Adicionando palavras no mapa.
        contagemPalavras.adicionarPalavra("POO", 4);
        contagemPalavras.adicionarPalavra("Java", 10);
        contagemPalavras.adicionarPalavra(".NET Framework", 5);
        contagemPalavras.adicionarPalavra("C++", 9);

        // Remover palavra do mapa.
        contagemPalavras.removerPalavra("POO");

        // Exibir contagem.
        System.out.println("\nCONTAGEM DE PALAVRAS");
        contagemPalavras.exibirContagemPalavras();

        // Exibindo a palavra mais frequente.
        System.out.println("\nPALAVRA MAIS FREQUENTE");
        System.out.println(contagemPalavras.encontrarPalavraMaisFrequente());
    }
}
