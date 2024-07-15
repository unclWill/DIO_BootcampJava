/**
 * <h1>Contador</h1>
 * A classe Contador é responsável por raalizar uma contagem entre dois números inteiros.
 * @author William Silva
 * @version 1.0
 * @since 15/07/2024
 */

public class Contador {
    private int parametro1;
    private int parametro2;

    public Contador() {}

    public Contador(int param1, int param2) {
        setParametro1(param1);
        setParametro2(param2);
    }

    public int getParametro1() {
        return parametro1;
    }

    public void setParametro1(int param1) {
        this.parametro1 = param1;
    }

    public int getParametro2() {
        return parametro2;
    }

    public void setParametro2(int param2) {
        this.parametro2 = param2;
    }

    /**
     * Método que realiza a contagem entre dois números inteiros.
     * @param param1 Recebe o primeiro número inteiro.
     * @param param2 Recebe o segundo número inteiro.
     * @throws ParametrosInvalidosException Caso o segundo parâmetro seja menor que o primeiro.
     */
    public void contar(int param1, int param2) throws ParametrosInvalidosException {
        if (param1 > param2) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contador = param2 - param1;
        for (int i = 0; i <= contador; i++) {
            System.out.printf("%d ", param1 + i);
        }
    }
}
