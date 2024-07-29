package edu.dio.gof.strategy;

/**
 * @author William
 * @date 29/07/2024
 */

public class Robo {
    private IComportamento comportamento; // strategy

    public void setComportamento(IComportamento comportamento) {
        this.comportamento = comportamento;
    }

    public void mover() {
        comportamento.mover();
    }
}
