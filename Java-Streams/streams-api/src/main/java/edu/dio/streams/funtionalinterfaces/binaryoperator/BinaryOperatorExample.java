package edu.dio.streams.funtionalinterfaces.binaryoperator;

/*
 * Representa uma operação que combina dois argumentos do tipo T e retorna um resultado do mesmo tipo T.
 * É usada para realizar operações de redução de pares de elementos, como somar números ou combinar objetos.
 */

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        // Criar uma lista de números inteiros.
        List<Integer> listaNumeros = Arrays.asList(1, 2, 3, 4, 5);

        // Usar o BinaryOperator com expressão lambda para somar dois números inteiros.
        BinaryOperator<Integer> somar = (num1, num2) -> num1 + num2;

        // Usar o BinaryOperator para somar todos os números no Stream.
        // PRIMEIRA FORMA:
        int resultado = listaNumeros.stream()
                .reduce(0, somar); // O primeiro argumento (identity) representa a variável acumuladora (inicia em 0).

        // SEGUNDA FORMA (passando o BinaryOperator no método reduce):
        int resultado2 = listaNumeros.stream()
                .reduce(0, (n1, n2) -> n1 + n2); // OU Integer::sum (Method Reference).

        // Imprimir o resultado da soma.
        System.out.printf("A soma dos números é = %d%n", resultado);
    }
}
