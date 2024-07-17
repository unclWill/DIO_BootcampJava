package edu.dio.list.ordenacaoemlist.ordenacaodepessoas;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        // Adicionando pessoas à lista.
        ordenacaoPessoas.adicionarPessoa("William", 27, 1.83);
        ordenacaoPessoas.adicionarPessoa("Raquel", 26, 1.70);
        ordenacaoPessoas.adicionarPessoa("José", 19, 1.75);

        // Ordenando por idade.
        System.out.println("Lista ordenada por idade");
        exibirLista(ordenacaoPessoas.ordenarPorIdade());

        // Ordendo por altura.
        System.out.println("Lista ordenada por altura");
        exibirLista(ordenacaoPessoas.ordenarPorAltura());
    }

    public static void exibirLista(List<Pessoa> listaPessoas) {
        for (Pessoa p : listaPessoas) {
            System.out.printf("Nome: %s | Idade: %d | Altura: %.2f%n", p.getNome(), p.getIdade(), p.getAltura());
        }
    }
}
