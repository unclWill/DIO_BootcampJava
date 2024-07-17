package edu.dio.list.carrinhodecompras;

import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> listaItens;

    public void adicionarItem(String nome, double preco, int quantidade) {
        listaItens.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        listaItens.removeIf(i -> i.getNome().equalsIgnoreCase(nome));
    }

    public double calcularValorTotal() {
        double valorTotal = 0.0;
        if (!listaItens.isEmpty()) {
            for (Item i : listaItens) {
                valorTotal += i.getPreco();
            }
        }
        return valorTotal;
    }

    public void exibirItems() {
        for (Item i : listaItens) {
            System.out.printf("Nome: %s | Preço: %.2f | Qtd: %d%n", i.getNome(), i.getPreco(), i.getQuantidade());
        }
    }
}
