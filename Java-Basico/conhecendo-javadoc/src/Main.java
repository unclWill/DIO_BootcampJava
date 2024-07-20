
public class Main {
    public static void main(String[] args) throws Exception {
        Calculadora calc = new Calculadora();
        System.out.println("Soma: " + calc.somar(10, 5));
        System.out.println("Subtração: " + calc.subtrair(10, 5));
        System.out.println("Multiplicação: " + calc.multiplicar(10, 5));
        System.out.println("Divisão: " + calc.dividir(10, 5));
    }

    /* *
     * Comando utilizado para gerar o JavaDoc:
     * <b>
     * javadoc -encoding UTF-8 -docencoding ISO-8859-1 -d ../docs src/*.java
     * </b>
     */
}