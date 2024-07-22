package edu.dio.clientes;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString
public class Cliente {
    private String nome;
    private String sobrenome;
    private LocalDate dataNascimento;
    private Endereco endereco;
    private Contato contato;

    public Cliente(String nome, String sobrenome, LocalDate dataNascimento, Endereco endereco, Contato contato) {
        setNome(nome);
        setSobrenome(sobrenome);
        setDataNascimento(dataNascimento);
        setEndereco(endereco);
        setContato(contato);
    }

    public void setNome(String nome) {
        if (nome != null && !nome.isBlank()) {
            this.nome = nome;
        } else {
            throw new IllegalArgumentException("O nome não pode ser nulo ou vazio!");
        }
    }

    public void setSobrenome(String sobrenome) {
        if (sobrenome != null && !sobrenome.isBlank()) {
            this.sobrenome = sobrenome;
        } else {
            throw new IllegalArgumentException("O sobrenome não pode ser nulo ou vazio!");
        }
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        if (dataNascimento != null) {
            this.dataNascimento = dataNascimento;
        } else {
            throw new IllegalArgumentException("O data de nascimento não pode ser nula!");
        }
    }

    public void setEndereco(Endereco endereco) {
        if (endereco != null) {
            this.endereco = endereco;
        } else {
            throw new IllegalArgumentException("O endereço não pode ser nulo!");
        }
    }

    public void setContato(Contato contato) {
        if (contato != null) {
            this.contato = contato;
        } else {
            throw new IllegalArgumentException("O contato não pode ser nulo!");
        }
    }
}
