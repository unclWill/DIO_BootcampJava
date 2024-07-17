package edu.dio.list.carrinhodecompras;

import edu.dio.list.carrinhodecompras.carrinho.CarrinhoDeCompras;

public class Main {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        // Adicionando itens ao carrinho.
        carrinho.adicionarItem("Java: Guia do Programador", 100.0, 2);
        carrinho.adicionarItem("Sistemas Orientados a Objetos: Teoria e Prática com UML e Java", 70.0, 1);
        carrinho.adicionarItem("Entendendo Algoritmos", 100.0, 1);
        carrinho.adicionarItem("Programação em Baixo Nível", 125.0, 1);

        // Removendo um item.
        carrinho.removerItem("Entendendo Algoritmos");

        // Exibindo os itens do carrinho.
        carrinho.exibirItems();

        // Obtendo o valor total dos itens no carrinho.
        System.out.printf("Valor total do carrinho: R$ %.2f%n", carrinho.calcularValorTotal());
    }
}
