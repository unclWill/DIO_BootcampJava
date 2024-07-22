package edu.dio.model;

import lombok.Getter;

@Getter
public abstract class Conteudo {
    private String titulo;
    private String descricao;

    protected static final double XP_PADRAO = 10D;

    public Conteudo() {}

    public Conteudo(String titulo, String descricao) {
        setTitulo(titulo);
        setDescricao(descricao);
    }

    public void setTitulo(String titulo) {
        if (titulo != null && !titulo.isBlank()) {
            this.titulo = titulo;
        } else {
            throw new IllegalArgumentException("O título não pode estar nulo ou vazio!");
        }
    }

    public void setDescricao(String descricao) {
        if (descricao != null && !descricao.isBlank()) {
            this.descricao = descricao;
        } else {
            throw new IllegalArgumentException("A descrição não pode estar nulo ou vazia!");
        }
    }

    public abstract double calcularXp();
}
