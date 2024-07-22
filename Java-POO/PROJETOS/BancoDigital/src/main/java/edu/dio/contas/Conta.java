package edu.dio.contas;

public abstract class Conta {
    protected int agencia;
    protected int numero;
    protected double saldo;

    private static final int AGENCIA_PADRAO = 1005;
    private static int sequencial = 1;

    public Conta() {
        setAgencia(AGENCIA_PADRAO);
        setNumero(sequencial++);
    }

    public Conta(int agencia, int numero, double saldo) {
        setAgencia(agencia);
        setNumero(numero);
        depositar(saldo);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
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

    public boolean transferir(Conta destino, double valor) {
        if (valor <= saldo) {
            this.sacar(valor);
            destino.depositar(valor);
            return true;
        }
        return false;
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
}
