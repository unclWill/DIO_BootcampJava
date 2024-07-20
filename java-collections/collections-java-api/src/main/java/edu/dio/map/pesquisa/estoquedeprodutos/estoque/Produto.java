package edu.dio.map.pesquisa.estoquedeprodutos.estoque;

import java.util.Objects;

public class Produto implements Comparable<Produto> {
    private long codigo;
    private String nome;
    private int quantidade;
    private double preco;

    public Produto() {}

    public Produto(long codigo, String nome, int quantidade, double preco) {
        setCodigo(codigo);
        setNome(nome);
        setQuantidade(quantidade);
        setPreco(preco);
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        if (codigo > 0) {
            this.codigo = codigo;
        }
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade > 0) {
            this.quantidade = quantidade;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.isBlank()) {
            this.nome = nome;
        }
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        }
    }

    @Override
    public int compareTo(Produto p) {
        return Double.compare(preco, p.preco);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return getCodigo() == produto.getCodigo();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getCodigo());
    }
}
