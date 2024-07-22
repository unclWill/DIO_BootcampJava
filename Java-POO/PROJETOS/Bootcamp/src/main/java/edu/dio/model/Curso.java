package edu.dio.model;

import lombok.Getter;

@Getter
public class Curso extends Conteudo {
    private int cargaHoraria;

    public Curso(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Curso(String titulo, String descricao, int cargaHoraria) {
        super(titulo, descricao);
        this.cargaHoraria = cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        if (cargaHoraria > 0) {
            this.cargaHoraria = cargaHoraria;
        } else {
            throw new IllegalArgumentException("A carga horária deve ser maior que zero!");
        }
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    @Override
    public String toString() {
        return String.format(
                """
                Título: %s
                Descrição: %s
                Carga Horária: %d
                """, this.getTitulo(), this.getDescricao(), this.getCargaHoraria());
    }
}
