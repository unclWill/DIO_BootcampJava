package edu.dio;

import edu.dio.model.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Setup de cursos e mentorias.
        Conteudo cursoSantanderJava = new Curso("Bootcamp Santander Java", "Bootcamp Backend Java", 80);
        Conteudo cursoClaroJava = new Curso("Bootcamp Claro Java", "Bootcamp Backend Java + Spring", 60);
        Conteudo mentoria1 = new Mentoria("Mentoria Java POO", "Aprofundando Orientação a Objetos com Java", LocalDate.of(2024, 7, 29));

        // Setup Bootcamp.
        Bootcamp bootcamp = new Bootcamp("Bootcamp Backend Java", "Aprenda Java de uma vez por todas!");
        bootcamp.addConteudo(cursoSantanderJava);
        bootcamp.addConteudo(cursoClaroJava);
        bootcamp.addConteudo(mentoria1);

        // Setup de participantes.
        Participante raquel = new Participante("Raquel dos Santos", "raquel@mail.com", LocalDate.of(1999, 3, 20));
        Participante pedro = new Participante("Pedro Martins", "pedro@mail.com", LocalDate.of(1995, 10, 12));

        // Exibindo os dados.
        raquel.inscreverNoBootcamp(bootcamp);
        raquel.progredir();
        raquel.exibirConteudosEmAndamento();

        pedro.inscreverNoBootcamp(bootcamp);
        pedro.progredir();
        pedro.progredir();
        pedro.exibirConteudosEmAndamento();
        pedro.exibirConteudosConcluidos();

        System.out.printf("%n[Raquel dos Santos] XP: %.2f%n", raquel.calcularTotalXp());
        System.out.printf("[Pedro Martins] XP: %.2f%n", pedro.calcularTotalXp());
    }
}