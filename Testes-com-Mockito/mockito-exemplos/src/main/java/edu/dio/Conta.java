package edu.dio;

public class Conta {
    private double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public void pagaBoleto(double valorAPagar) {
        validaSaldo(valorAPagar);
        debita(valorAPagar);
        enviarCreditoParaEmissor(valorAPagar);
    }

    public void validaSaldo(double valorAPagar) {
        if (valorAPagar > saldo) {
            throw new IllegalStateException("Saldo insuficiente");
        }
        this.saldo += saldo;
    }

    public void debita(double valorAPagar) {
        if (valorAPagar <= saldo) {
            this.saldo -= valorAPagar;
        }
    }

    public void enviarCreditoParaEmissor(double valorAPagar) {
        // Lógica de envio de crédito implicita.
    }
}
