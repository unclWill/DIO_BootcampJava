package edu.dio.builders;

import edu.dio.componentes.ComputadorDeBordo;
import edu.dio.componentes.Motor;
import edu.dio.componentes.NavegadorGPS;
import edu.dio.componentes.Transmissao;
import edu.dio.carros.TipoCarro;

/**
 * @author William
 * @date 29/07/2024
 */

public interface Builder {
    void setTipoCarro(TipoCarro tipo);
    void setAssentos(int assentos);
    void setMotor(Motor motor);
    void setTransmissao(Transmissao transmissao);
    void setComputadorDeBordo(ComputadorDeBordo computadorDeBordo);
    void setNavegadorGPS(NavegadorGPS navegadorGPS);
}
