package edu.dio.set.pesquisa.agendadecontatos;

import edu.dio.set.pesquisa.agendadecontatos.contatos.AgendaContatos;
import edu.dio.set.pesquisa.agendadecontatos.contatos.Contato;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();

        // Adicionando contatos ao conjunto.
        agenda.adicionarContato("Júlia", 991234567);
        agenda.adicionarContato("Paulina", 991234568);
        agenda.adicionarContato("Paulina", 991235555);
        agenda.adicionarContato("Mariana", 991234569);
        agenda.adicionarContato("Pedro", 991234570);

        // Exibindo os contatos adicionados.
        System.out.println("Agenda de contatos");
        agenda.exibirContatos();

        // Pesquisando por contatos que tenham o nome passado como argumento.
        Set<Contato> contatosEncontrados =  agenda.pesquisarPorNome("Paulina");
        System.out.println("\nContatos encontrados na busca: ");
        percorrerConjunto(contatosEncontrados);

        // Atualizando o número de um contato.
        agenda.atualizarNumeroContato("Pedro", 991234570,900001111);

        // Exibindo o conjunto atualizado de contato.
        System.out.println("\nAgenda atualizada");
        agenda.exibirContatos();
    }

    public static void percorrerConjunto(Set<Contato> contatos) {
        for (Contato c : contatos) {
            System.out.printf("Nome: %s | Telefone: %d%n", c.getNome(), c.getNumeroTelefone());
        }
    }
}
