package edu.dio.list.ordenacaoemlist.ordenacaodenumeros;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        // Adicionando números à lista.
        ordenacaoNumeros.adicionarNumero(100);
        ordenacaoNumeros.adicionarNumero(92);
        ordenacaoNumeros.adicionarNumero(900);
        ordenacaoNumeros.adicionarNumero(45);
        ordenacaoNumeros.adicionarNumero(1001);
        ordenacaoNumeros.adicionarNumero(2);

        // Exibindo a lista.
        System.out.println("Ordem de inserção");
        ordenacaoNumeros.exibirLista();

        // Ordenando a lista do menor para o maior.
        imprimirListaDeNumerosOrdenados(ordenacaoNumeros.ordenarAscendente());

        // Ordenando a lista do maior para o menor.
        imprimirListaDeNumerosOrdenados(ordenacaoNumeros.ordenarDescendente());
    }

    public static void imprimirListaDeNumerosOrdenados(List<Integer> elementos) {
        if ((elementos.size() - 1) > elementos.get(0)) {
            System.out.println("\nLista de números ordenados de forma crescente");
        } else {
            System.out.println("\nLista de números ordenados de forma decrescente");
        }

        for (Integer num : elementos) {
            System.out.println(num);
        }
    }
}
