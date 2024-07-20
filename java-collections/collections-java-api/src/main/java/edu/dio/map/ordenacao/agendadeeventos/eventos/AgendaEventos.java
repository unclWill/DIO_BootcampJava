package edu.dio.map.ordenacao.agendadeeventos.eventos;

import edu.dio.map.ordenacao.agendadeeventos.utils.FormataData;

import java.time.LocalDate;
import java.util.*;

public class AgendaEventos {
    private Map<LocalDate, Evento> mapaEventos;

    public AgendaEventos() {
        mapaEventos = new HashMap<>();
    }

    public void adicionarEvento(String dataEntrada, String nome, String atracao) {
        LocalDate data = FormataData.formataStringParaData(dataEntrada);
        mapaEventos.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventos = new TreeMap<>(mapaEventos);
        for (Evento evt : eventos.values()) {
            System.out.printf("Nome: %s | Atração: %s%n", evt.getNome(), evt.getAtracao());
        }
    }

    public void obterProximoEvento() {
        // Set<LocalDate> dataSet = mapaEventos.keySet();
        // Collection<Evento> values = mapaEventos.values();
        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> eventos = new TreeMap<>(mapaEventos);
        for (Map.Entry<LocalDate, Evento> evento : eventos.entrySet()) {
            if (evento.getKey().isEqual(dataAtual) || evento.getKey().isAfter(dataAtual)) {
                System.out.printf("O próximo evento, %s, com a atração %s, acontecerá no dia %s%n",
                        evento.getValue().getNome(), evento.getValue().getAtracao(), FormataData.formataDataPáraString(evento.getKey()));
                break;
            }
        }
    }
}
