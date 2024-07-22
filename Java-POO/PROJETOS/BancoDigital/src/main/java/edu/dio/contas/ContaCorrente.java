package edu.dio.contas;

import edu.dio.clientes.Cliente;

public class ContaCorrente extends Conta {
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    public ContaCorrente(int agencia, int numero, double saldo) {
        super(agencia, numero, saldo);
    }

    @Override
    public String imprimirExtrato() {
        return String.format(
                """
                ---- Extrato da Conta Corrente ----
                %s
                """, super.imprimirInfosComuns());
    }
}
