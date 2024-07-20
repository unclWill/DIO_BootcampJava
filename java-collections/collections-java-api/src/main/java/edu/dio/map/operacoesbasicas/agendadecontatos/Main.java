package edu.dio.map.operacoesbasicas.agendadecontatos;

public class Main {
    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();

        // Inserindo contatos na agenda.
        agenda.adicionarContato("Pedro", 999112233);
        agenda.adicionarContato("Júlia", 999665544);
        agenda.adicionarContato("Clara", 999887700);
        agenda.adicionarContato("Alanis", 999754565);

        // Removendo contatos da agenda.
        agenda.removerContato("Pedro");

        // Exibindos os contatos armazenados na agenda.
        agenda.exibirContatos();

        // Pesquisando por um contato.
        System.out.println("\nContato pesquisado:");
        System.out.println(agenda.pesquisarPorNome("Alanis"));
    }
}
