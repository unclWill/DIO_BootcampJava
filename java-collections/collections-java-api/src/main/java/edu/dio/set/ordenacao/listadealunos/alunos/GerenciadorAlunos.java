package edu.dio.set.ordenacao.listadealunos.alunos;

import edu.dio.set.ordenacao.listadealunos.alunos.utils.ComparatorPorMatricula;
import edu.dio.set.ordenacao.listadealunos.alunos.utils.ComparatorPorNota;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> conjuntoAlunos;

    public GerenciadorAlunos() {
        conjuntoAlunos = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media)  {
        conjuntoAlunos.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(long matricula) {
        Aluno aluno = null;
        if (!conjuntoAlunos.isEmpty()) {
            for (Aluno a : conjuntoAlunos) {
                if (a.getMatricula() == matricula) {
                    aluno = a;
                    break;
                }
            }
            conjuntoAlunos.remove(aluno);
        } else {
            System.out.printf("Não foi encontrado nenhum aluno com o número de matrícula [%d]%n", matricula);
        }
    }

    public void exibirAlunosPorNome() {
        if (conjuntoAlunos.isEmpty()) {
            System.out.println("A lista está vazia!");
            return;
        }

        Set<Aluno> ordenadoPeloNome = new TreeSet<>(conjuntoAlunos);
        for (Aluno a : ordenadoPeloNome) {
            System.out.printf("Nome: %s | Matrícula: %d | Nota: %.2f%n", a.getNome(), a.getMatricula(), a.getNota());
        }
    }

    public void exibirAlunosPorNota() {
        if (conjuntoAlunos.isEmpty()) {
            System.out.println("A lista está vazia!");
            return;
        }

        Set<Aluno> ordenadoPelaNota = new TreeSet<>(new ComparatorPorNota());
        ordenadoPelaNota.addAll(conjuntoAlunos);
        for (Aluno a : ordenadoPelaNota) {
            System.out.printf("Nome: %s | Matrícula: %d | Nota: %.2f%n", a.getNome(), a.getMatricula(), a.getNota());
        }
    }

    public void exibirAlunosPorMatricula() {
        if (conjuntoAlunos.isEmpty()) {
            System.out.println("A lista está vazia!");
            return;
        }

        Set<Aluno> ordenadoPelaMatricula = new TreeSet<>(new ComparatorPorMatricula());
        ordenadoPelaMatricula.addAll(conjuntoAlunos);
        for (Aluno a : ordenadoPelaMatricula) {
            System.out.printf("Nome: %s | Matrícula: %d | Nota: %.2f%n", a.getNome(), a.getMatricula(), a.getNota());
        }
    }

    public void exibirAlunos() {
        if (conjuntoAlunos.isEmpty()) {
            System.out.println("A lista está vazia!");
            return;
        }

        for (Aluno a : conjuntoAlunos) {
            System.out.printf("Nome: %s | Matrícula: %d | Nota: %.2f%n", a.getNome(), a.getMatricula(), a.getNota());
        }
    }
}
