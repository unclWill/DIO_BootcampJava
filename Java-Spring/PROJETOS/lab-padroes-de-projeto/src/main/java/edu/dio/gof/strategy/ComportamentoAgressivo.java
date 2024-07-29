package edu.dio.gof.strategy;

/**
 * @author William
 * @date 29/07/2024
 */

public class ComportamentoAgressivo implements IComportamento {
    @Override
    public void mover() {
        System.out.println("Movendo-se agressivamente...");
    }
}
