package edu.dio.map.pesquisa.estoquedeprodutos;

import edu.dio.map.pesquisa.estoquedeprodutos.estoque.EstoqueProduto;
import edu.dio.map.pesquisa.estoquedeprodutos.estoque.Produto;

public class Main {
    public static void main(String[] args) {
        EstoqueProduto estoqueProduto = new EstoqueProduto();

        // Adicionando produtos ao estoque.
        estoqueProduto.adicionarProduto(1000, "Mouse", 500, 20.0);
        estoqueProduto.adicionarProduto(1001, "Monitor", 50, 500.0);
        estoqueProduto.adicionarProduto(1002, "AMD Ryzen 5 5800X3D", 15, 1500.0);
        estoqueProduto.adicionarProduto(1010, "Teclado", 200, 250.99);

        // Exibindo os produtos em estoque.
        estoqueProduto.exibirProdutos();

        // Calculando o valor total do estoque.
        System.out.printf("\nVALOR TOTAL DO ESTOQUE: R$ %.2f", estoqueProduto.calcularValorTotalEstoque());

        // Exibindo o produto mais caro do estoque.
        System.out.println("\nProduto mais caro:");
        Produto prodCaro = estoqueProduto.obterProdutoMaisCaro();
        System.out.printf("CÓD: %d | NOME: %s | QTD: %d | PREÇO: %.2f%n",
                prodCaro.getCodigo(), prodCaro.getNome(), prodCaro.getQuantidade(), prodCaro.getPreco());

        // Exibindo o produto mais barato do estoque.
        System.out.println("\nProduto mais barato:");
        Produto prodBarato = estoqueProduto.obterProdutoMaisBarato();
        System.out.printf("CÓD: %d | NOME: %s | QTD: %d | PREÇO: %.2f%n",
                prodBarato.getCodigo(), prodBarato.getNome(), prodBarato.getQuantidade(), prodBarato.getPreco());

        // Exibindo o produto mais caro com maior quantidade em estoque.
        System.out.println("\nProduto com estoque mais caro:");
        Produto prodEstoqueCaro = estoqueProduto.obterProdutoMaiorQuantidadeValorTotalNoEstoque();
        System.out.printf("CÓD: %d | NOME: %s | QTD: %d | PREÇO: %.2f%n",
                prodEstoqueCaro.getCodigo(), prodEstoqueCaro.getNome(), prodEstoqueCaro.getQuantidade(), prodEstoqueCaro.getPreco());
    }
}
