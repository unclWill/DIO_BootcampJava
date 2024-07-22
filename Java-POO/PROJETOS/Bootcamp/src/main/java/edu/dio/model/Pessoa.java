package edu.dio.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import lombok.Data;

@Data
public abstract class Pessoa {
    private String nome;
    private String email;
    private LocalDate dataNascimento;

    public Pessoa(String nome) {
        setNome(nome);
    }

    public Pessoa(String nome, String email, LocalDate dataNascimento) {
        setNome(nome);
        setEmail(email);
        setDataNascimento(dataNascimento);
    }

    public String getDataNascimento() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return dataNascimento.format(dtf);
    }

    public void setNome(String nome) {
        if (nome != null && !nome.isBlank()) {
            this.nome = nome;
        } else {
            throw new IllegalArgumentException("O nome não pode estar nulo ou vazio!");
        }
    }

    public void setEmail(String email) {
        if (email != null && !email.isBlank()) {
            this.email = email;
        } else {
            throw new IllegalArgumentException("O email não pode estar nulo ou vazio!");
        }
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        if (dataNascimento != null) {
            this.dataNascimento = dataNascimento;
        } else {
            throw new IllegalArgumentException("A data de nascimento não pode estar nula!");
        }
    }
}
