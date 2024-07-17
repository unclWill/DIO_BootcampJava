package edu.dio.list.pesquisaemlist.somadenumeros;

public class Main {
    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        // Adicionando números ná lista.
        somaNumeros.adicionarNumero(100);
        somaNumeros.adicionarNumero(90);
        somaNumeros.adicionarNumero(7);
        somaNumeros.adicionarNumero(50);

        // Calculando a soma dos números da lista.
        System.out.printf("Soma do números = %d%n", somaNumeros.calcularSoma());

        // Encontrando o maior número da lista
        System.out.printf("Maior número da lista = %d%n", somaNumeros.encontrarMaiorNumero());

        // Encontrando o menor número da lista.
        System.out.printf("Menor número da lista = %d%n", somaNumeros.encontrarMenorNumero());

        // Exibindo a lista de números.
        System.out.println("Lista de números");
        somaNumeros.exibirNumeros();
    }
}
