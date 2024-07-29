package edu.dio.componentes;

import edu.dio.carros.Carro;

/**
 * @author William
 * @date 29/07/2024
 */

public class ComputadorDeBordo {
    private Carro carro;

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public void exibirNivelCombistivel() {
        System.out.println("Nível do combustível: " + carro.getCombustivel());
    }

    public void exibirEstado() {
        if (this.carro.getMotor().isLigado()) {
            System.out.println("Carro ligado");
        } else {
            System.out.println("O carro não está ligado");
        }
    }
}
