package edu.dio.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.*;

@Getter
@Setter
public class Bootcamp {
    private String nome;
    private String descricao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(45);
    private Set<Participante> participantes;
    private Set<Conteudo> conteudos;

    public Bootcamp() {
        participantes = new HashSet<>();
        conteudos = new LinkedHashSet<>();
    }

    public Bootcamp(String nome, String descricao) {
        participantes = new HashSet<>();
        conteudos = new LinkedHashSet<>();
        setNome(nome);
        setDescricao(descricao);
    }

    public void setNome(String nome) {
        if (nome != null && !nome.isBlank()) {
            this.nome = nome;
        } else {
            throw new IllegalArgumentException("O nome não pode estar nulo ou vazio!");
        }
    }

    public void setDescricao(String descricao) {
        if (descricao != null && !descricao.isBlank()) {
            this.descricao = descricao;
        } else {
            throw new IllegalArgumentException("A descrição não pode estar nula ou vazia!");
        }
    }

    public void addParticipante(Participante participante) {
        if (participante != null) {
            this.participantes.add(participante);
        } else {
            throw new IllegalArgumentException("O participante não pode estar nulo!");
        }
    }

    public void addConteudo(Conteudo conteudo) {
        if (conteudo != null) {
            this.conteudos.add(conteudo);
        } else {
            throw new IllegalArgumentException("O conteúdo não pode ser nulo!");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(nome, bootcamp.nome)
                && Objects.equals(descricao, bootcamp.descricao)
                && Objects.equals(dataInicial, bootcamp.dataInicial)
                && Objects.equals(dataFinal, bootcamp.dataFinal)
                && Objects.equals(participantes, bootcamp.participantes)
                && Objects.equals(conteudos, bootcamp.conteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataInicial, dataFinal, participantes, conteudos);
    }
}
