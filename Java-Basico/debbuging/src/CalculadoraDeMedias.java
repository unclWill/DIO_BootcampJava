import java.util.Scanner;

public class CalculadoraDeMedias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] alunos = {"Camila", "Lucas", "Bruna", "Pedro" };

        double media = calculaMediaTurma(alunos, sc);

        System.out.printf("Média da turma = %.2f", media);
    }

    public static double calculaMediaTurma(String[] alunos, Scanner sc) {
        int soma = 0;
        for (String aluno : alunos) {
            System.out.printf("Nota do aluno %s: ", aluno);
            double nota = sc.nextDouble();
            soma += nota;
        }

        return (double)soma / alunos.length;
    }
}
