package edu.dio.gof.strategy;

/**
 * @author William
 * @date 29/07/2024
 */

public class Main {
    public static void main(String[] args) {
        IComportamento comportamentoNormal = new ComportamentoNormal();
        IComportamento comportamentoDefensivo = new ComportamentoDefensivo();
        IComportamento comportamentoAgressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(comportamentoNormal);
        robo.mover();
        robo.mover();

        robo.setComportamento(comportamentoDefensivo);
        robo.mover();

        robo.setComportamento(comportamentoAgressivo);
        robo.mover();
        robo.mover();
        robo.mover();
    }
}
