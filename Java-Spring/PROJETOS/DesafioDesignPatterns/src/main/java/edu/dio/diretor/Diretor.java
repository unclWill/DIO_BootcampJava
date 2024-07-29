package edu.dio.diretor;

import edu.dio.builders.Builder;
import edu.dio.carros.TipoCarro;
import edu.dio.componentes.ComputadorDeBordo;
import edu.dio.componentes.Motor;
import edu.dio.componentes.NavegadorGPS;
import edu.dio.componentes.Transmissao;

/**
 * @author William
 * @date 29/07/2024
 */

public class Diretor {
    public void constuirCarroEsportivo(Builder builder) {
        builder.setTipoCarro(TipoCarro.ESPORTIVO);
        builder.setAssentos(2);
        builder.setMotor(new Motor(3.0, 0));
        builder.setTransmissao(Transmissao.SEMI_AUTOMATICA);
        builder.setComputadorDeBordo(new ComputadorDeBordo());
        builder.setNavegadorGPS(new NavegadorGPS());
    }

    public void construirCarroDePasseio(Builder builder) {
        builder.setTipoCarro(TipoCarro.PASSEIO);
        builder.setAssentos(2);
        builder.setMotor(new Motor(1.2, 0));
        builder.setTransmissao(Transmissao.AUTOMATICA);
        builder.setComputadorDeBordo(new ComputadorDeBordo());
        builder.setNavegadorGPS(new NavegadorGPS());
    }

    public void construirSUV(Builder builder) {
        builder.setTipoCarro(TipoCarro.SUV);
        builder.setAssentos(4);
        builder.setMotor(new Motor(2.5, 0));
        builder.setTransmissao(Transmissao.MANUAL);
        builder.setNavegadorGPS(new NavegadorGPS());
    }
}
