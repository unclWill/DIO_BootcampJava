import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        String nome = "";
        String sobrenome = "";
        int idade = 0;
        double altura = 0.0;

        if (args.length != 0) {
            nome = args[0];
            sobrenome = args[1];
            idade = Integer.valueOf(args[2]);
            altura = Double.valueOf(args[3]);
        } else {
            System.out.print("Digite seu nome: ");
            nome = sc.nextLine();
            System.out.print("Digite seu sobrenome: ");
            sobrenome = sc.nextLine();
            System.out.print("Digite sua idade: ");
            idade = sc.nextInt();
            System.out.print("Digite sua altura: ");
            altura = sc.nextDouble();
            sc.close();
        }

        imprimir(nome, sobrenome, idade, altura);
    }

    private static void imprimir(String nome, String sobrenome, int idade, double altura) {
        System.out.printf("""
                Olá, me chamo %s %s
                Tenho %d anos de idade
                E tenho %.2f m de altura
                """, nome, sobrenome, idade, altura);
    }
}
