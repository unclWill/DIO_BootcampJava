package edu.dio.list.ordenacao.ordenacaodepessoas.utils;

import edu.dio.list.ordenacao.ordenacaodepessoas.pessoas.Pessoa;

import java.util.Comparator;

public class ComparatorPorAltura implements Comparator<Pessoa> {
    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return Double.compare(p1.getAltura(), p2.getAltura());
    }
}