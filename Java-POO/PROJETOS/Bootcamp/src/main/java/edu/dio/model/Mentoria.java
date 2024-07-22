package edu.dio.model;

import lombok.Getter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Getter
public class Mentoria extends Conteudo {
    private LocalDate dataMentoria;

    public Mentoria() {}

    public Mentoria(String titulo, String descricao, LocalDate dataMentoria) {
        setTitulo(titulo);
        setDescricao(descricao);
        setDataMentoria(dataMentoria);
    }

    public String getDataMentoria() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return dataMentoria.format(dtf);
    }

    public void setDataMentoria(LocalDate dataMentoria) {
        if (dataMentoria != null) {
            this.dataMentoria = dataMentoria;
        } else {
            throw new IllegalArgumentException("A data da mentoria não pode estar nula!");
        }
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20D;
    }

    @Override
    public String toString() {
        return String.format(
                """
                Título: %s
                Descrição: %s
                Data: %s
                """, this.getTitulo(), this.getDescricao(), this.getDataMentoria());
    }
}
