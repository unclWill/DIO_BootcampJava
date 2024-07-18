package edu.dio.set.ordenacao.cadastrodeprodutos.utils;

import edu.dio.set.ordenacao.cadastrodeprodutos.produtos.Produto;

import java.util.Comparator;

public class ComparatorPorCodigo implements Comparator<Produto> {
    @Override
    public int compare(Produto p1, Produto p2) {
        return Long.compare(p1.getCodigo(), p2.getCodigo());
    }

    @Override
    public Comparator<Produto> reversed() {
        return Comparator.super.reversed();
    }
}
