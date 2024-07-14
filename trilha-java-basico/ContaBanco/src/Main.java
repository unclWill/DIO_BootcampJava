import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ContaTerminal conta;

        if (args.length != 0) {
            conta = lerDadosContaViaArgs(args);

        } else {
            conta = lerDadosConta(sc);
        }

        System.out.println(conta);
    }

    public static ContaTerminal lerDadosContaViaArgs(String[] args) {
        return new ContaTerminal(Integer.parseInt(args[0]), args[1], args[2], Double.parseDouble(args[3]));
    }

    public static ContaTerminal lerDadosConta(Scanner sc) {
        System.out.print("Por favor, digite o número da conta: ");
        int numeroConta = sc.nextInt();
        sc.nextLine();
        System.out.print("Por favor, digite o nome da agência: ");
        String nomeAgencia = sc.nextLine();
        System.out.print("Por favor, digite o seu nome: ");
        String nomeCliente = sc.nextLine();
        System.out.print("Por favor, digite o valor que será depositado R$: "); 
        double saldo = sc.nextDouble();

        return new ContaTerminal(numeroConta, nomeAgencia, nomeCliente, saldo);
    }
}
