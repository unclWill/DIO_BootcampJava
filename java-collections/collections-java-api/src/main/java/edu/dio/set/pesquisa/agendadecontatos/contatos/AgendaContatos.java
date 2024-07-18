package edu.dio.set.pesquisa.agendadecontatos.contatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    Set<Contato> conjuntoContatos;

    public AgendaContatos() {
        conjuntoContatos = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        conjuntoContatos.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        if (!conjuntoContatos.isEmpty()) {
            for (Contato c : conjuntoContatos) {
                System.out.printf("Nome: %s | Telefone: %d%n", c.getNome(), c.getNumeroTelefone());
            }
        }
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosEncontrados = new HashSet<>();
        if (!conjuntoContatos.isEmpty()) {
            for (Contato c : conjuntoContatos) {
                if (c.getNome().equals(nome)) {
                    contatosEncontrados.add(c);
                }
            }
        }
        return contatosEncontrados;
    }

    public void atualizarNumeroContato(String nome, int numeroAntigo, int novoNumero) {
        if (!conjuntoContatos.isEmpty()) {
            for (Contato c : conjuntoContatos) {
                if ((c.getNome().equals(nome) && (c.getNumeroTelefone() == numeroAntigo))) {
                    c.setNumeroTelefone(novoNumero);
                    break;
                }
            }
        }
    }
}
