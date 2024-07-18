package edu.dio.set.operacoesbasicas.conjuntodeconvidados;

import edu.dio.set.operacoesbasicas.conjuntodeconvidados.convidados.ConjuntoConvidados;

public class Main {
    public static void main(String[] args) {
        ConjuntoConvidados conjConvidados = new ConjuntoConvidados();

        // Adicionando convidados.
        conjConvidados.adicionarConvidado("José Carlos", 1009);
        conjConvidados.adicionarConvidado("Maria Lúcia", 500);
        conjConvidados.adicionarConvidado("João Pereira", 1009);
        conjConvidados.adicionarConvidado("Júlia dos Santos", 103);

        // Removendo convidados.
        conjConvidados.removerConvidadoPorCodigoConvite(103);

        // Exibindo a quantidade de convidados.
        System.out.printf("Quantidade de convidados: %d%n", conjConvidados.contarConvidados());

        // Exibindo os convidados.
        conjConvidados.exibirConvidados();
    }
}
