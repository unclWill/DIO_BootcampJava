package edu.dio.list.pesquisaemlist.somadenumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> listaNumeros;

    public SomaNumeros() {
        listaNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        listaNumeros.add(numero);
    }

    public int calcularSoma() {
        int somaNumeros = 0;
        if (!listaNumeros.isEmpty()) {
            for (Integer numero : listaNumeros) {
                somaNumeros += numero;
            }
        }
        return somaNumeros;
    }

    public int encontrarMaiorNumero() {
        int maiorNumero = listaNumeros.get(0);

        for (Integer numeroAtual : listaNumeros) {
            if (numeroAtual > maiorNumero) {
                    maiorNumero = numeroAtual;
            }
        }
        return maiorNumero;
    }

    public int encontrarMenorNumero() {
        int menorNumero = listaNumeros.get(0);
        for (Integer numeroAtual : listaNumeros) {
            if (numeroAtual < menorNumero) {
                menorNumero = numeroAtual;
            }
        }
        return menorNumero;
    }

    public void exibirNumeros() {
        if (!listaNumeros.isEmpty()) {
            for (Integer numero : listaNumeros) {
                System.out.println(numero);
            }
        }
    }
}
