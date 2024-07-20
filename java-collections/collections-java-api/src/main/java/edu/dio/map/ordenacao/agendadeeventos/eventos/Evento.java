package edu.dio.map.ordenacao.agendadeeventos.eventos;

public class Evento implements Comparable<Evento> {
    private String nome;
    private String atracao;

    public Evento() {}

    public Evento(String nome, String atracao) {
        setNome(nome);
        setAtracao(atracao);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.isBlank()) {
            this.nome = nome;
        }
    }

    public String getAtracao() {
        return atracao;
    }

    public void setAtracao(String atracao) {
        if (atracao != null && !atracao.isBlank()) {
            this.atracao = atracao;
        }
    }

    @Override
    public int compareTo(Evento o) {
        return 0;
    }
}
