package edu.dio;

public class Conta {
    private String agencia;
    private String numero;
    private String cliente;
    private double saldo;

    public Conta() {
        this.saldo = 0D;
    }

    public Conta(String agencia, String numero, String cliente, double saldo) {
        this.agencia = agencia;
        this.numero = numero;
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNumero() {
        return numero;
    }

    public String getCliente() {
        return cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void transfere(double valor, Conta destino) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor deve ser maior que zero!");
        }
    }
}
