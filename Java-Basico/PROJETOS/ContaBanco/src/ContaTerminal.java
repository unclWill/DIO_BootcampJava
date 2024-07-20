/**
 * <h1>ContaTerminal</h1>
 * Classe que representa uma conta bancária manipulada via terminal.
 */

public class ContaTerminal {
    private int numeroConta;
    private String nomeAgencia;
    private String nomeCliente;
    private double saldo;

    public ContaTerminal() {
    }

    public ContaTerminal(int numeroConta, String nomeAgencia, String nomeCliente, double saldo) {
        setNumeroConta(numeroConta);
        setNomeAgencia(nomeAgencia);
        setNomeCliente(nomeCliente);
        depositar(saldo);
    }

    private void setNomeAgencia(String nomeAgencia) {
        if (nomeAgencia != null && !nomeAgencia.isBlank()) {
            this.nomeAgencia = nomeAgencia;
        }
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numero) {
        if (numero > 0) {
            this.numeroConta = numero;
        }
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nome) {
        if (nome != null && !nome.isBlank()) {
            this.nomeCliente = nome;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public void sacar(double valor) {
        if (valor > saldo) {
            throw new IllegalArgumentException("Saldo insuficiente");
        }
        saldo -= valor;
    }

    @Override
    public String toString() {
        return String.format(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$ %.2f já está disponível para saque.",
                nomeCliente, nomeAgencia, numeroConta, saldo);
    }
}
