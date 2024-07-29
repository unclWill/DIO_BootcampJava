package edu.dio.carros;

import edu.dio.componentes.ComputadorDeBordo;
import edu.dio.componentes.Motor;
import edu.dio.componentes.NavegadorGPS;
import edu.dio.componentes.Transmissao;

/**
 * @author William
 * @date 29/07/2024
 */

public class Manual {
    private final TipoCarro tipoCarro;
    private final int assentos;
    private final Motor motor;
    private final Transmissao transmissao;
    private final ComputadorDeBordo computadorDeBordo;
    private final NavegadorGPS navegadorGPS;

    public Manual(TipoCarro tipoCarro, int assentos, Motor motor, Transmissao transmissao,
                  ComputadorDeBordo computadorDeBordo, NavegadorGPS navegadorGPS) {
        this.tipoCarro = tipoCarro;
        this.assentos = assentos;
        this.motor = motor;
        this.transmissao = transmissao;
        this.computadorDeBordo = computadorDeBordo;
        this.navegadorGPS = navegadorGPS;
    }

    public String imprimir() {
        String info = "";
        info += "Tipo de carro: " + tipoCarro + "\n";
        info += "Número de assentos: " + assentos + "\n";
        info += "Motor: cilindrada - " + motor.getCilindrada() + "; Kilometragem - " + motor.getKilometragem() + "\n";
        info += "Transmission: " + transmissao + "\n";
        if (this.computadorDeBordo != null) {
            info += "Computador de bordo: Funcional" + "\n";
        } else {
            info += "Computador de bordo: N/A" + "\n";
        }
        if (this.navegadorGPS != null) {
            info += "GPS: Funcional" + "\n";
        } else {
            info += "GPS: N/A" + "\n";
        }
        return info;
    }
}
