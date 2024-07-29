package edu.dio.carros;

import edu.dio.componentes.ComputadorDeBordo;
import edu.dio.componentes.Motor;
import edu.dio.componentes.NavegadorGPS;
import edu.dio.componentes.Transmissao;

/**
 * @author William
 * @date 29/07/2024
 */

public class Carro {
    private final TipoCarro tipoCarro;
    private final int assentos;
    private final Motor motor;
    private final Transmissao transmissao;
    private final ComputadorDeBordo computadorDeBordo;
    private final NavegadorGPS navegadorGPS;
    private double combustivel = 0;

    public Carro(TipoCarro tipoCarro, int assentos, Motor motor, Transmissao transmissao,
               ComputadorDeBordo computadorDeBordo, NavegadorGPS navegadorGPS) {
        this.tipoCarro = tipoCarro;
        this.assentos = assentos;
        this.motor = motor;
        this.transmissao = transmissao;
        this.computadorDeBordo = computadorDeBordo;
        if (this.computadorDeBordo != null) {
            this.computadorDeBordo.setCarro(this);
        }
        this.navegadorGPS = navegadorGPS;
    }

    public TipoCarro getTipoCarro() {
        return tipoCarro;
    }

    public int getAssentos() {
        return assentos;
    }

    public Motor getMotor() {
        return motor;
    }

    public Transmissao getTransmissao() {
        return transmissao;
    }

    public ComputadorDeBordo getComputadorDeBordo() {
        return computadorDeBordo;
    }

    public NavegadorGPS getNavegadorGPS() {
        return navegadorGPS;
    }

    public double getCombustivel() {
        return combustivel;
    }
}
