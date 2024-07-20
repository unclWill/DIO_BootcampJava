/**
 * <h1>Calculadora</h1>
 * <p>A Calculadora realiza operações matemáticas simples entre números inteiros.</p>
 * <b>Nota: </b> Leia atentamente a documentação da classe para desfrutar dos recursos ofericidos por ela.
 * 
 * @author William Silva
 * @version 1.0
 * @since 14/07/2024
 */

public class Calculadora {
    /**
     * Realiza a soma entre dois números inteiros.
     * @param num1 Primeiro parâmetro do método.
     * @param num2 Segundo parâmetro do método.
     * @return Resultado da soma entre os números inteiros.
     */

    public int somar(int num1, int num2) {
        return num1 + num2;
    }

    /**
     * Realiza a subtração entre dois números inteiros.
     * @param num1 Primeiro parâmetro do método.
     * @param num2 Segundo parâmetro do método.
     * @return Resultado da subtração entre os números inteiros.
     */

    public int subtrair(int num1, int num2) {
        return num1 - num2;
    }

    /**
     * Realiza a multiplicação entre dois números inteiros.
     * @param num1 Primeiro parâmetro do método.
     * @param num2 Segundo parâmetro do método.
     * @return Resultado da multiplicação entre os números inteiros.
     */

    public int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    /**
     * Realiza a divisão entre dois números inteiros.
     * @param num1 Primeiro parâmetro do método.
     * @param num2 Segundo parâmetro do método.
     * @return Resultado da divisão entre os números inteiros.
     * @throws ArithmeticException Caso o segundo parâmetro seja zero.
     */
    public int dividir(int num1, int num2) throws ArithmeticException {
        if (num2 == 0) {
            throw new ArithmeticException("Não é possível dividir por zero.");
        }

        return num1 / num2;
    }
}
