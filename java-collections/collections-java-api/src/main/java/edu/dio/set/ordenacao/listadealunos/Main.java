package edu.dio.set.ordenacao.listadealunos;

import edu.dio.set.ordenacao.listadealunos.alunos.GerenciadorAlunos;

public class Main {
    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        // Adicionando alunos na lista.
        gerenciadorAlunos.adicionarAluno("José da Silva", 202310019L, 7);
        gerenciadorAlunos.adicionarAluno("Alexandre Nogueira", 202210076L, 9);
        gerenciadorAlunos.adicionarAluno("Bianca Pereira", 202410021L, 8);
        gerenciadorAlunos.adicionarAluno("Marina Felisberto", 202220013L, 6);
        gerenciadorAlunos.adicionarAluno("Epaminondas Batista", 202216090L, 8);
        gerenciadorAlunos.adicionarAluno("Júlia Rosetto", 202300001L, 9);
        gerenciadorAlunos.adicionarAluno("Fabiana Santos", 202440015L, 5);
        gerenciadorAlunos.adicionarAluno("Mário Ségio", 202490085L, 10);

        // Removendo alunos da lista.
        gerenciadorAlunos.removerAluno(202440015L);

        // Exibindo alunos ordenados pelo nome.
        System.out.println("\nOrdenando pelo nome:");
        gerenciadorAlunos.exibirAlunosPorNome();

        // Exibindo alunos ordenados pela nota.
        System.out.println("\nOrdenando pela nota:");
        gerenciadorAlunos.exibirAlunosPorNota();

        // Exibindo alunos ordenados pela matrícula.
        System.out.println("\nOrdenando pela matrícula:");
        gerenciadorAlunos.exibirAlunosPorMatricula();

        // Exibindo todos os alunos.
        System.out.println("\nAlunos registrados:");
        gerenciadorAlunos.exibirAlunos();
    }
}
