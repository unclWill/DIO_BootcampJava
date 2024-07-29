package edu.dio.componentes;

/**
 * @author William
 * @date 29/07/2024
 */

public class Motor {
    private final double cilindrada;
    private double kilometragem;
    private boolean ligado;

    public Motor(double cilindrada, double kilometragem) {
        this.cilindrada = cilindrada;
        this.kilometragem = kilometragem;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public double getKilometragem() {
        return kilometragem;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void ligado() {
        ligado = true;
    }

    public void desligado() {
        ligado = false;
    }

    public void ligar(double kilometragem) {
        if (ligado) {
            this.kilometragem += kilometragem;
        } else {
            System.err.println("Você deve dar a partida antes de sair com o carro!");
        }
    }
}
