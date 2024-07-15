import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        AboutMe aboutMe = new AboutMe();
        
        ExemploExcecao exemploExcecao = new ExemploExcecao();
        exemploExcecao.setValor(Double.valueOf("a1.75"));
        exemploExcecao.setValor(NumberFormat.getInstance().parse("a1.75"));

        System.out.println("Exemplo de exceção: " + exemploExcecao.getValor());

        try {
            aboutMe = lerDados(sc, aboutMe);
        } catch (InputMismatchException ex) {
            System.out.println("Os campos idade e altura precisam ser numéricos!");
        }

        imprimirDados(aboutMe);
        sc.close();
    }

    public static AboutMe lerDados(Scanner sc, AboutMe aboutMe) {
        System.out.print("Digite o seu nome: ");
        aboutMe.setNome(sc.nextLine());
        System.out.print("Digite o seu sobrenome: ");
        aboutMe.setSobrenome(sc.nextLine());
        System.out.print("Digite a sua idade: ");
        aboutMe.setIdade(sc.nextInt());
        System.out.print("Digite a sua altura: ");
        aboutMe.setAltura(sc.nextDouble());

        return aboutMe;
    }

    public static void imprimirDados(AboutMe aboutMe) {
        System.out.printf("Olá, me chamo %s %s%n", aboutMe.getNome(), aboutMe.getSobrenome());
        System.out.printf("Tenho %d anos de idade%n", aboutMe.getIdade());
        System.out.printf("Minha altura é %.2f%n", aboutMe.getAltura());
    }
}
