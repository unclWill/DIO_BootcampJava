package edu.dio.set.pesquisa.agendadecontatos.contatos;

import java.util.Objects;

public class Contato {
    private String nome;
    private int numeroTelefone;

    public Contato() {}

    public Contato(String nome, int numeroTelefone) {
        setNome(nome);
        setNumeroTelefone(numeroTelefone);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.isBlank()) {
            this.nome = nome;
        }
    }

    public int getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(int numeroTelefone) {
        String numero = String.valueOf(numeroTelefone);
        if (numero.length() == 9) {
            this.numeroTelefone = numeroTelefone;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return getNumeroTelefone() == contato.getNumeroTelefone() && Objects.equals(getNome(), contato.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getNumeroTelefone());
    }
}
