package edu.dio.list.catalogodelivros;

import edu.dio.list.catalogodelivros.livros.CatalogoLivros;
import edu.dio.list.catalogodelivros.livros.Livro;

import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        // Instanciando livros.
        Livro livro1, livro2, livro3, livro4;
        livro1 = new Livro("Java: Guia do Programador", "Peter Jandl Junior", 2021);
        livro2 = new Livro("Entendendo Algoritmos", "Aditya Y. Bhargava", 2017);
        livro3 = new Livro("Programação em Baixo Nível", "Igor Zhirkov", 2018);
        livro4 = new Livro("Curso Básico da Linguagem C", "Peter Jandl Junior", 2019);

        // Adicionando livros ao catálogo.
        catalogoLivros.adicionarLivro(livro1);
        catalogoLivros.adicionarLivro(livro2);
        catalogoLivros.adicionarLivro(livro3);
        catalogoLivros.adicionarLivro(livro4);

        // Pesquisando por livros que sejam de um autor específico.
        System.out.println("PESQUISA LIVROS POR AUTOR");
        List<Livro> livros = catalogoLivros.pesquisarPorAutor("Peter Jandl Junior");
        imprimirListaLivros(livros);

        // Pesquisando por livros que foram lançados dentro de um intervalo específico.
        System.out.println("\nPESQUISA LIVROS EM INTERVALOS");
        List<Livro> intervaloDeLivros = catalogoLivros.pesquisarPorIntervaloAnos(2016, 2019);
        imprimirListaLivros(intervaloDeLivros);

        // Pesquisando pela primeira ocorrência do título de um livro.
        System.out.println("\nPESQUISA LIVRO POR TÍTULO");
        Livro livro = catalogoLivros.pesquisarPorTitulo("Entendendo Algoritmos");
        System.out.println(livro);
    }

    public static void imprimirListaLivros(List<Livro> listaLivros) {
        for (Livro livro : listaLivros) {
            System.out.printf("Título: %s | Autor: %s | Ano de publicação: %d%n", livro.getTitulo(), livro.getAutor(), livro.getAnoPublicacao());
        }
    }
}
