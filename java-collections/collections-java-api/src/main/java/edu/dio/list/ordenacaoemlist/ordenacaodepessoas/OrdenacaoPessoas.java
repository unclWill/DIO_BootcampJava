package edu.dio.list.ordenacaoemlist.ordenacaodepessoas;

import edu.dio.list.ordenacaoemlist.ordenacaodepessoas.utils.ComparatorPorAltura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> listaPessoas;

    public OrdenacaoPessoas() {
        listaPessoas = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        listaPessoas.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> ordenadoPorIdade = new ArrayList<>(listaPessoas);
        Collections.sort(ordenadoPorIdade);
        return ordenadoPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> ordenadoPorAltura = new ArrayList<>(listaPessoas);
        Collections.sort(ordenadoPorAltura, new ComparatorPorAltura());
        return ordenadoPorAltura;
    }
}
