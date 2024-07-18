package edu.dio.set.ordenacao.cadastrodeprodutos;

import edu.dio.set.ordenacao.cadastrodeprodutos.produtos.CadastroProdutos;
import edu.dio.set.ordenacao.cadastrodeprodutos.produtos.Produto;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        CadastroProdutos cadProdutos = new CadastroProdutos();

        // Adicionando produtos.
        cadProdutos.adicionarProduto(1001L, "Processador AMD Ryzen 5 5700X", 1200.0, 42);
        cadProdutos.adicionarProduto(100L, "Livro Java: Guia do Programador", 150.0, 200);
        cadProdutos.adicionarProduto(250L, "Headset Razer", 699.0, 30);
        cadProdutos.adicionarProduto(30L, "Mouse Logitech", 459.90, 120);

        // Exibindo produtos odenados pelo nome.
        System.out.println("Produtos pelo nome:");
        percorrerConjunto(cadProdutos.exibirProdutosPorNome());

        // Exibindo produtos ordenados pelo preço.
        System.out.println("\nProdutos por preço:");
        percorrerConjunto(cadProdutos.exibirProdutosPorPreco());

        // Exibindo produtos ordenados pela quantidade.
        System.out.println("\nProdutos por quantidade:");
        percorrerConjunto(cadProdutos.exibirProdutosPorQuantidade());

        // Exibindo produtos ordenandos pelo código.
        System.out.println("\nProdutos por código:");
        percorrerConjunto(cadProdutos.exibirProdutosPorCodigo());
    }

    public static void percorrerConjunto(Set<Produto> produtos) {
        for (Produto p : produtos) {
            System.out.printf("COD: %d | NOME: %s | PREÇO: %.2f | QTD: %d%n", p.getCodigo(), p.getNome(), p.getPreco(), p.getQuantidade());
        }
    }
}
