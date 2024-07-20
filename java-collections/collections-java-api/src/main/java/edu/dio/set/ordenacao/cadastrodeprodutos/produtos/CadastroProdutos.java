package edu.dio.set.ordenacao.cadastrodeprodutos.produtos;

import edu.dio.set.ordenacao.cadastrodeprodutos.utils.ComparatorPorCodigo;
import edu.dio.set.ordenacao.cadastrodeprodutos.utils.ComparatorPorPreco;
import edu.dio.set.ordenacao.cadastrodeprodutos.utils.ComparatorPorQuantidade;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> conjuntoProdutos;

    public CadastroProdutos() {
        conjuntoProdutos = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int qtd) {
        conjuntoProdutos.add(new Produto(cod, nome, preco, qtd));
    }

    public Set<Produto> exibirProdutosPorNome() {
        if (conjuntoProdutos.isEmpty()) {
            return null;
        }

        return new TreeSet<>(conjuntoProdutos);
    }

    public Set<Produto> exibirProdutosPorPreco() {
        if (conjuntoProdutos.isEmpty()) {
            return null;
        }

        Set<Produto> ordenadoPorPreco = new TreeSet<>(new ComparatorPorPreco());
        ordenadoPorPreco.addAll(conjuntoProdutos);
        return ordenadoPorPreco;
    }

    public Set<Produto> exibirProdutosPorQuantidade() {
        if (conjuntoProdutos.isEmpty()) {
            return null;
        }

        Set<Produto> ordenadosPorQtd = new TreeSet<>(new ComparatorPorQuantidade());
        ordenadosPorQtd.addAll(conjuntoProdutos);
        return ordenadosPorQtd;
    }

    public Set<Produto> exibirProdutosPorCodigo() {
        if (conjuntoProdutos.isEmpty()) {
            return null;
        }

        Set<Produto> ordenadosPorCodigo = new TreeSet<>(new ComparatorPorCodigo());
        ordenadosPorCodigo.addAll(conjuntoProdutos);
        return ordenadosPorCodigo;
    }
}
