package edu.dio.list.ordenacao.ordenacaodenumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> listaNumeros;

    public OrdenacaoNumeros() {
        listaNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        listaNumeros.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> ordenaAscendente = new ArrayList<>(listaNumeros);
        if (!listaNumeros.isEmpty()) {
            Collections.sort(ordenaAscendente);
            return ordenaAscendente;
        } else {
            throw new RuntimeException("Lista vazia!");
        }
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> ordenaDescendente = new ArrayList<>(listaNumeros);
        if (!listaNumeros.isEmpty()) {
            ordenaDescendente.sort(Collections.reverseOrder());
            return ordenaDescendente;
        } else {
            throw new RuntimeException("Lista vazia!");
        }
    }

    public void exibirLista() {
        if (!listaNumeros.isEmpty()) {
            for (Integer n : listaNumeros) {
                System.out.println(n);
            }
        }
    }
}
