import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    saldo = depositar(saldo, scanner);
                    break;
                case 2:
                    saldo = sacar(saldo, scanner);
                    break;
                case 3:
                    exibirSaldo(saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false; // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }

    public static double depositar(double saldo, Scanner sc) {
        double valor = sc.nextDouble();
        if (valor > 0) {
            saldo += valor;
            System.out.printf("Saldo atual: %.1f%n", saldo);
        }
        return saldo;
    }

    public static double sacar(double saldo, Scanner sc) {
        double valor = sc.nextDouble();
        if (valor <= saldo && valor > 0) {
            saldo -= valor;
            System.out.printf("Saldo atual: %.1f%n", saldo);
        } else {
            System.out.println("Saldo insuficiente.");
        }
        return saldo;
    }

    public static void exibirSaldo(double saldo) {
        System.out.printf("Saldo atual: %.1f%n", saldo);
    }
}