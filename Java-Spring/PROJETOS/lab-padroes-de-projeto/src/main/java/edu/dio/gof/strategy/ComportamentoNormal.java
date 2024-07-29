package edu.dio.gof.strategy;

/**
 * @author William
 * @date 29/07/2024
 */

public class ComportamentoNormal implements IComportamento {
    @Override
    public void mover() {
        System.out.println("Movendo-se normalmente...");
    }


}
