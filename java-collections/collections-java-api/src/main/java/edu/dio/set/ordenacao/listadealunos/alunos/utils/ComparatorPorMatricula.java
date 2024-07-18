package edu.dio.set.ordenacao.listadealunos.alunos.utils;

import edu.dio.set.ordenacao.listadealunos.alunos.Aluno;

import java.util.Comparator;

public class ComparatorPorMatricula implements Comparator<Aluno> {

    @Override
    public int compare(Aluno a1, Aluno a2) {
        return Long.compare(a1.getMatricula(), a2.getMatricula());
    }
}
