package edu.dio.streams.funtionalinterfaces.function;

/*
 * Representa uma função que aceita um argumento do tipo T e retorna um resultado do tipo R.
 * É utilizada para transformar ou mapear os elementos do Stream em outros valores ou tipos.
 */

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        // Criar uma lista de números inteiros.
        List<Integer> listaNumeros = Arrays.asList(1, 2, 3, 4, 5);

        // Usar a Function com expressão lambda para dobrar todos os números.
        Function<Integer, Integer> dobrar = numero -> numero * 2;

        // Usar a função para dobrar todos os números no Stream e armazená-los em outra lista.
        // PRIMEIRA FORMA:
        List<Integer> numerosDobrados = listaNumeros.stream()
                .map(dobrar)
                .toList();

        // SEGUNDA FORMA:
        List<Integer> numerosDobrados2 = listaNumeros.stream()
                .map(n -> n * 2) // Fazendo a Function diretamente no map.
                .toList();

        // Imprimir a lista de números dobrados.
        numerosDobrados.forEach(n -> System.out.printf("%d ", n)); // OU numerosDobrados.forEach(System.out::println);
    }
}
