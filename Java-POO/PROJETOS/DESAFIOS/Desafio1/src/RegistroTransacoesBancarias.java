import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;

public class RegistroTransacoesBancarias {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê a Entrada que informa o saldo inicial da conta
        double saldo = scanner.nextDouble();

        // Lê a Entrada com a quantidade total de transações
        int quantidadeTransacoes = scanner.nextInt();

        // Lista para armazenar as transações
        List<String> transacoes = new ArrayList<>();

        // Loop para iterar sobre as transações
        for (int i = 1; i <= quantidadeTransacoes; i++) {
            // Lê a Entrada com o tipo de transação (D para depósito ou S para saque)
            // O método "toUpperCase" padroniza o tipo de transação com a letra maiúscula
            char tipoTransacao = scanner.next().toUpperCase().charAt(0);
            // Lê a Entrada com o valor da transação
            double valorTransacao = scanner.nextDouble();

            // Atualiza o saldo da conta e adicionar a transação à lista
            if (tipoTransacao == 'D') {
                saldo += valorTransacao;
                transacoes.add("Deposito de " + valorTransacao);
            } else if (tipoTransacao == 'S') {
                saldo -= valorTransacao;
                transacoes.add("Saque de " + valorTransacao);
            } else {
                System.out.println("Opção inválida. Utilize D para depósito ou S para saque.");
                i--; // Decrementa o índice para repetir a iteração
            }
        }

        // TODO: Exibir o saldo final e a lista de transações conforme a tabela de Exemplos.
        imprimir(saldo, transacoes);

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }

    public static void imprimir(double saldo, List<String> transacoes) {
        if (!transacoes.isEmpty()) {
            exibirDadosDaTransacao(saldo);
            for (int i = 0, j = 1; i < transacoes.size(); i++, j++) {
                System.out.printf("%d. %s%n", j, transacoes.get(i));
            }
        } else {
            exibirDadosDaTransacao(saldo);
        }
    }

    private static void exibirDadosDaTransacao(double saldo) {
        System.out.printf("Saldo: %.1f%n", saldo);
        System.out.println("Transacoes: ");
    }
}