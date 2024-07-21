package edu.dio.streams.funtionalinterfaces.supplier;

/*
 * Representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo T.
 * É comumente usada para criar ou FORNECER novos objetos de um determinado tipo.
 */

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierExample {
    public static void main(String[] args) {
        // Usar o Supplier com expressão Lambda para fornecer uma saudação personalizada.
        Supplier<String> saudacao = () -> "Olá, seja bem vindo!";

        // Usar o Supplier para obter uma lista com 5 saudações.
        // PRIMEIRA FORMA:
        List<String> listaSaudacoes = Stream.generate(saudacao)
                .limit(5L)
                .toList();

        // SEGUNDA FORMA (com o Supplier dentro do método):
        List<String> listaSaudacoes2 = Stream.generate(() -> "Olá, seja bem vindo!")
                        .limit(5)
                        .toList();


        // Imprimir as saudações geradas.
        // Fazendo a mesma coisa mas, usando Method Reference:
        listaSaudacoes.forEach(System.out::println); // OU listaSaudacoes.forEach(s -> System.out.println(s));

    }
}
