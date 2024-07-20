public class CaixaEletronico {
    private double saldo;

    public CaixaEletronico() {}

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("(i) Depósito realizado com sucesso!");
        }
    }

    public void sacar(double valor) {
        if (valor > saldo) {
            throw new IllegalArgumentException("Saldo insuficiente");
        }
        saldo -= valor;
        System.out.println("(i) Saque realizado com sucesso!");
    }
}
