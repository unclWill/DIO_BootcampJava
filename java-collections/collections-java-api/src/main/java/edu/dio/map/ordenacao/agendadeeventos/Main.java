package edu.dio.map.ordenacao.agendadeeventos;

import edu.dio.map.ordenacao.agendadeeventos.eventos.AgendaEventos;

public class Main {
    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        // Adicionando eventos na agenda.
        agendaEventos.adicionarEvento("29/07/2024", "Bingo dos Compadres", "Bingo");
        agendaEventos.adicionarEvento("22/07/2024", "Show de Rock", "System Of A Duke");
        agendaEventos.adicionarEvento("23/07/2024", "Circo", "Cirque du Solaris");

        // Exibindo a agenda de eventos.
        agendaEventos.exibirAgenda();

        // Exibindo o próximo evento da agenda.
        agendaEventos.obterProximoEvento();
    }
}
