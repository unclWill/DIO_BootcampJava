package edu.dio.streams.funtionalinterfaces.consumer;

/*
 * Representa uma operação que aceita um argumento do tipo T (generics) e não restorna nenhuma resultado.
 * É utilizada principalmente para realizar ações, ou efeitos colaterais nos elementos do Stream sem modificar, ou
 * retornar valor.
 */

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsumerExample {
    public static void main(String[] args) {
        // Criar uma lista de números inteiros.
        List<Integer> listaNumeros = Arrays.asList(1, 2, 3, 4, 5);

        // Usar o Consumer com expressão lambda para imprimir números pares.
        Consumer<Integer> imprimirNumeroPar = numero -> {
            if (numero % 2 == 0) {
                System.out.printf("%d ", numero);
            }
        };

        // Usar o Consumer para imprimir números pares no Stream.
        // PRIMEIRA FORMA: passando o Consumer como argumento do método forEach.
        // listaNumeros.stream().forEach(imprimirNumeroPar);

        // SEGUNDA FORMA (mais usual): fazendo a implementação diretamente no forEach.
        listaNumeros.stream().
                filter(n -> n % 2 == 0) // Fazendo a filtragem diretamentem usando o Predicate.
                .forEach(n -> System.out.printf("%d ", n));
    }
}
