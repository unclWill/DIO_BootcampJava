package edu.dio.contas;

import edu.dio.clientes.Cliente;
import lombok.Data;

@Data
public abstract class Conta {
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    private static final int AGENCIA_PADRAO = 1005;
    private static int sequencial = 1;

    public Conta(Cliente cliente) {
        setAgencia(AGENCIA_PADRAO);
        setNumero(sequencial++);
        setCliente(cliente);
    }

    public Conta(int agencia, int numero, double saldo) {
        setAgencia(agencia);
        setNumero(numero);
        depositar(saldo);
    }

    public boolean depositar(double valor) {
        if (valor >= 0) {
            saldo += valor;
            return true;
        }
        return false;
    }

    public boolean sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean transferir(double valor, Conta destino) {
        if (valor <= saldo) {
            this.sacar(valor);
            destino.depositar(valor);
            return true;
        }
        return false;
    }

    public abstract String imprimirExtrato();

    protected String imprimirInfosComuns() {
        return String.format(
                """
                        AGÊNCIA: %d
                        CONTA  : %d
                        TITULAR: %s %s
                        SALDO: %.2f
                        """, agencia, numero, cliente.getNome(), cliente.getSobrenome(),  saldo);
    }

    private void setAgencia(int agencia) {
        if (agencia > 0) {
            this.agencia = agencia;
        }
    }

    private void setNumero(int numero) {
        if (numero > 0) {
            this.numero = numero;
        }
    }

    private void setCliente(Cliente cliente) {
        if (cliente != null) {
            this.cliente = cliente;
        } else {
            throw new IllegalArgumentException("O cliente estava nulo!");
        }
    }
}
