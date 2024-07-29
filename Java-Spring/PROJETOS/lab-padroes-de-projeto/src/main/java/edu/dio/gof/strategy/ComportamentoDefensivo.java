package edu.dio.gof.strategy;

/**
 * @author William
 * @date 29/07/2024
 */

public class ComportamentoDefensivo implements IComportamento {
    @Override
    public void mover() {
        System.out.println("Movendo-se defensivamente...");
    }
}
