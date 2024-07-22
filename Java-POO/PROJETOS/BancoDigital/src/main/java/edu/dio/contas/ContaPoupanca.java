package edu.dio.contas;

import edu.dio.clientes.Cliente;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public ContaPoupanca(int agencia, int numero, double saldo) {
        super(agencia, numero, saldo);
    }

    @Override
    public String imprimirExtrato() {
        return String.format(
                """
                ---- Extrato da Conta Poupança ----
                %s
                """, super.imprimirInfosComuns());
    }
}