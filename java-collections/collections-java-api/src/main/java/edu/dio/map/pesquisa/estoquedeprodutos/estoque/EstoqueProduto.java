package edu.dio.map.pesquisa.estoquedeprodutos.estoque;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProduto {
    private Map<Long, Produto> mapaProdutos;

    public EstoqueProduto() {
        mapaProdutos = new HashMap<>();
    }

    public void adicionarProduto(long codigo, String nome, int quantidade, double preco) {
        mapaProdutos.put(codigo, new Produto(codigo, nome, quantidade, preco));
    }

    public void exibirProdutos() {
        if (!mapaProdutos.isEmpty()) {
            for (Map.Entry<Long, Produto> produto : mapaProdutos.entrySet()) {
                System.out.printf("CÓD: %d | NOME: %s | QTD: %d | PREÇO: %.2f%n",
                        produto.getValue().getCodigo(), produto.getValue().getNome(), produto.getValue().getQuantidade(), produto.getValue().getPreco());
            }
        }
    }

    public double calcularValorTotalEstoque() {
        double valorTotal = 0d;
        if (!mapaProdutos.isEmpty()) {
            for (Produto produto : mapaProdutos.values()) {
                valorTotal += produto.getQuantidade() * produto.getPreco();
            }
        }
        return valorTotal;
    }

    public Produto obterProdutoMaisCaro() {
        double maiorPreco = 0;
        Produto p = null;
        if (!mapaProdutos.isEmpty()) {
            for (Produto produto : mapaProdutos.values()) {
                if (produto.getPreco() > maiorPreco) {
                    maiorPreco = produto.getPreco();
                    p = produto;
                }
            }
        }
        return p;
    }

    public Produto obterProdutoMaisBarato() {
        double menorPreco = Double.MAX_VALUE;
        Produto p = null;
        if (!mapaProdutos.isEmpty()) {
            for (Map.Entry<Long, Produto> produto : mapaProdutos.entrySet()) {
                if (produto.getValue().getPreco() < menorPreco) {
                    menorPreco = produto.getValue().getPreco();
                    p = produto.getValue();
                }
            }
        }
        return p;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        Produto p = null;
        double valorTotal = 0;
        if (!mapaProdutos.isEmpty()) {
            for (Map.Entry<Long, Produto> produto : mapaProdutos.entrySet()) {
                double valorTotalTemp = produto.getValue().getPreco() * produto.getValue().getQuantidade();
                if (valorTotalTemp > valorTotal) {
                    valorTotal = valorTotalTemp;
                    p = produto.getValue();
                }
            }
        }
        return p;
    }
}
