package edu.dio.streams.funtionalinterfaces.predicate;

/*
 * Representa uma função que aceita um argumento do tipo T e retorna um valor booleano.
 * É comumente usada para filtrar os elementos do Stream com base em alguma condição.
 */

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateExample {
    public static void main(String[] args) {
        // Ciar uma lista de palavras.
        List<String> listaPalavras = Arrays.asList("Java", "Kotlin", "C", "Python", "CSharp", "Go", "Ruby");

        // Criar um Predicate que verifica se a palavra yem mais de 5 caracteres.
        Predicate<String> maisDeCincoCaracteres = palavra -> (palavra.length() > 5);

        // Usar o Stream para filtrar as palavras com mais de 5 caracteres e, em seguida,
        // imprimir cada palavra que passou no filtro.
        // PRIMEIRA FORMA:
        listaPalavras.stream()
                .filter(maisDeCincoCaracteres)
                .forEach(p -> System.out.printf("%s ", p));

        // SEGUNDA FORMA (implementado a regra diretamente no filter):
        listaPalavras.stream()
                .filter(p -> p.length() > 5)
                .forEach(p -> System.out.printf("%s ", p));
    }
}
