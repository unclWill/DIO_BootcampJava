package edu.dio.streams.desafios.desafio2;

/*
 * Desafio 2 - Imprima a soma dos números pares da lista:
 * Utilizando a Stream API, realize a soma dos números pares da lista e exiba o resultado no console.
 */

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> somaPares = numeros.stream()
                .filter(n -> n % 2 == 0)
                .toList();

        int resultado = somaPares.stream()
                .reduce(0, Integer::sum);

        System.out.printf("Resultado da operação = %d%n", resultado);
    }
}