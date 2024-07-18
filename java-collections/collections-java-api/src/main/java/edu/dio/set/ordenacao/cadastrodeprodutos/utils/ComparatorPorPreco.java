package edu.dio.set.ordenacao.cadastrodeprodutos.utils;

import edu.dio.set.ordenacao.cadastrodeprodutos.produtos.Produto;

import java.util.Comparator;

public class ComparatorPorPreco implements Comparator<Produto> {
    @Override
    public int compare(Produto p1, Produto p2) {
        return Double.compare(p1.getPreco(), p2.getPreco());
    }
}
