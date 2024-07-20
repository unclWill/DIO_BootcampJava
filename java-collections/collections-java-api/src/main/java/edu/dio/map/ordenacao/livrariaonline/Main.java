package edu.dio.map.ordenacao.livrariaonline;

import edu.dio.map.ordenacao.livrariaonline.livraria.LivrariaOnline;
import edu.dio.map.ordenacao.livrariaonline.livraria.Livro;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        LivrariaOnline livrariaOnline = new LivrariaOnline();

        // Adicionando livros.
        livrariaOnline.adicionarLivro("978-85-7522-109-9", "Java: Guia do Programador", "Peter Jandl Junior", 100.0);
        livrariaOnline.adicionarLivro("100-10-3311-106-1", "Organização Estruturada de Computadores", "Andrew Tanenbaum", 229.0);
        livrariaOnline.adicionarLivro("200-11-4412-105-2", "Sistemas Operacionais Modernos", "Andrew Tanenbaum", 265.71);
        livrariaOnline.adicionarLivro("300-12-4415-104-3", "Entendendo Algoritmos", "Aditya Bhargava", 70.0);
        livrariaOnline.adicionarLivro("400-13-6616-103-4", "Breve história de quase tudo", "Bill Bryson", 50.79);
        livrariaOnline.adicionarLivro("500-14-7717-102-5", "O Hobbit", "J.R.R. Tolkien", 55.99);
        livrariaOnline.adicionarLivro("600-15-8818-101-6", "O Senhor dos Anéis: A Sociedade do Anel", "J.R.R. Tolkien", 70.49);

        // Removendo livros.
        livrariaOnline.removerLivro("Entendendo Algoritmos");

        // Exibindo os livros ordenados pelo preço.
        imprimirMapa(livrariaOnline.exibirLivrosOrdenadosPorPreco());

        // Pesquisando livros.
        imprimirLista(livrariaOnline.pesquisarLivrosPorAutor("Andrew Tanenbaum"));

        // Exibindo o livro mais caro.
        System.out.println("\nLIVRO MAIS CARO");
        Livro livroMaisCaro = livrariaOnline.obterLivroMaisCaro();
        System.out.printf("Título: %s | Preço: R$ %.2f%n", livroMaisCaro.getTitulo(), livroMaisCaro.getPreco());

        // Exibindo o livro mais barato.
        System.out.println("\nLIVRO MAIS BARATO:");
        Livro livroMaisBarato = livrariaOnline.obterLivroMaisBarato();
        System.out.printf("Título: %s | Preço: R$ %.2f%n", livroMaisBarato.getTitulo(), livroMaisBarato.getPreco());
    }

    public static void imprimirMapa(Map<String, Livro> livros) {
        System.out.println("\nEXIBINDO LIVROS ORDENADOS PELO PREÇO:");
        for (Livro livro : livros.values()) {
            System.out.printf("Título: %s | Autor: %s | Preço: R$ %.2f%n",
                    livro.getTitulo(), livro.getAutor(), livro.getPreco());
        }
    }

    public static void imprimirLista(List<Livro> livros) {
        System.out.printf("\nEXIBINDO LIVRO(S) DO AUTOR: %s%n", livros.get(0).getAutor());
        for (Livro livro : livros) {
            System.out.printf("Título: %s | Autor: %s | Preço: R$ %.2f%n",
                    livro.getTitulo(), livro.getAutor(), livro.getPreco());
        }
    }
}
