package edu.dio;

import edu.dio.clientes.Cliente;
import edu.dio.clientes.Contato;
import edu.dio.clientes.Endereco;
import edu.dio.contas.Conta;
import edu.dio.contas.ContaCorrente;
import edu.dio.contas.ContaPoupanca;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Setup das dos clientes.
        Endereco endJose = new Endereco("Sabino Leonel", "1001", "50345211", "Previdenciários", "Juiz de Fora", "MG");
        Contato contatoJose = new Contato(32922446688L, "jose@mail.com");
        Cliente jose = new Cliente("José", "Moreira", LocalDate.of(1989, 5, 20), endJose, contatoJose);

        Endereco endRaquel = new Endereco("Silvério do Santos", "35", "60748215", "Santa Tereza", "Juiz de Fora", "MG");
        Contato contatoRaquel = new Contato(32911223344L, "raquel@mail.com");
        Cliente raquel = new Cliente("Raquel", "Lopes", LocalDate.of(1995, 2, 10), endRaquel, contatoRaquel);

        // Instanciação do banco.
        Banco banco = new Banco("DIObank");

        // Setup das contas.
        Conta cc = new ContaCorrente(jose);
        depositar(cc, 1000.0);

        Conta cp = new ContaPoupanca(raquel);
        transferir(cc, cp, 500.0);

        // Adicionando contas ao banco.
        banco.addConta(cc);
        banco.addConta(cp);
        banco.listarContas();
    }

    private static void depositar(Conta conta, double valor) {
        if (conta.depositar(valor)) {
            System.out.println("(info) DEPÓSITO REALIZADO COM SUCESSO!");
        } else {
            exibeMsgErroNaOperacao();
        }
    }

    private static void sacar(Conta conta, double valor) {
        if (conta.depositar(valor)) {
            System.out.println("(info) SAQUE REALIZADO COM SUCESSO!");
        } else {
            exibeMsgErroNaOperacao();
        }
    }

    private static void transferir(Conta origem, Conta destino, double valor) {
        if(origem.transferir(valor, destino)) {
            System.out.println("(info) TRANSFERÊNCIA REALIZADA COM SUCESSO!");
        } else {
            exibeMsgErroNaOperacao();
        }
    }

    private static void exibeMsgErroNaOperacao() {
        System.out.println("(info) OCORREU UM ERRO AO TENTAR REALIZAR A OPERAÇÃO\nSeu saldo não sofreu alteração.");
    }
}