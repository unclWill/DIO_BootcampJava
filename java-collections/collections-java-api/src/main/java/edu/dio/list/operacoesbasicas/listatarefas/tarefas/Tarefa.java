package edu.dio.list.operacoesbasicas.listatarefas.tarefas;

public class Tarefa {
    private String descricao;

    public Tarefa() {}

    public Tarefa(String descricao) {
        setDescricao(descricao);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        if (descricao != null) {
            this.descricao = descricao;
        }
    }
}
