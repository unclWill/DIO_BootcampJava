package edu.dio.builders;

import edu.dio.carros.Carro;
import edu.dio.carros.Manual;
import edu.dio.componentes.ComputadorDeBordo;
import edu.dio.componentes.Motor;
import edu.dio.componentes.NavegadorGPS;
import edu.dio.componentes.Transmissao;
import edu.dio.carros.TipoCarro;

/**
 * @author William
 * @date 29/07/2024
 */

public class CarroManualBuilder implements Builder {
    private TipoCarro tipoCarro;
    private int assentos;
    private Motor motor;
    private Transmissao transmissao;
    private ComputadorDeBordo computadorDeBordo;
    private NavegadorGPS navegadorGPS;

    @Override
    public void setTipoCarro(TipoCarro tipoCarro) {
        this.tipoCarro = tipoCarro;
    }

    @Override
    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }

    @Override
    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    @Override
    public void setTransmissao(Transmissao transmissao) {
        this.transmissao = transmissao;
    }

    @Override
    public void setComputadorDeBordo(ComputadorDeBordo computadorDeBordo) {
        this.computadorDeBordo = computadorDeBordo;
    }

    @Override
    public void setNavegadorGPS(NavegadorGPS navegadorGPS) {
        this.navegadorGPS = navegadorGPS;
    }

    public Manual getResultado() {
        return new Manual(tipoCarro, assentos, motor, transmissao, computadorDeBordo, navegadorGPS);
    }
}
