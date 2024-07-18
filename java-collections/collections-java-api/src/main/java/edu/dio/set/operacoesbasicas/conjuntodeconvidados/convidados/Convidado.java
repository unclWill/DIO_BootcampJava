package edu.dio.set.operacoesbasicas.conjuntodeconvidados.convidados;

import java.util.Objects;

public class Convidado {
    private String nome;
    private int codigoConvite;

    public Convidado() {}

    public Convidado(String nome, int codigoConvite) {
        setNome(nome);
        setCodigoConvite(codigoConvite);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.isBlank()) {
            this.nome = nome;
        }
    }

    public int getCodigoConvite() {
        return codigoConvite;
    }

    public void setCodigoConvite(int codigoConvite) {
        this.codigoConvite = codigoConvite;
    }

    /**
     * A sobrescrita dos métodos <b>equals</b> e <b>hashCode</b> permite que a interface Set impeça que objetos repetidos sejam inseridos no conjunto.
     * @param o Objeto que será comparado.
     * @return Se o código do convite existe ou não dentro do conjunto.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Convidado convidado = (Convidado) o;
        return getCodigoConvite() == convidado.getCodigoConvite();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getCodigoConvite());
    }
}
