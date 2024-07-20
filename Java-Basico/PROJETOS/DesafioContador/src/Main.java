import java.util.Scanner;

import excecoes.ParametrosInvalidosException;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Contador contador = new Contador();

        System.out.print("Digite o primeiro parâmetro: ");
        int param1 = sc.nextInt();
        System.out.print("Digite o segundo parâmetro: ");
        int param2 = sc.nextInt();

        try
        {
            contador.contar(param1, param2);
        } catch (ParametrosInvalidosException ex)
        { 
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }
}
