package edu.dio.componentes;

/**
 * @author William
 * @date 29/07/2024
 */

public class NavegadorGPS {
    private String rota;

    public NavegadorGPS() {
        this.rota = "Rua Walter Cabral, 98, São Judas Tadeu, Juiz de Fora - MG";
    }

    public NavegadorGPS(String rotaManual) {
        this.rota = rotaManual;
    }

    public String getRota() {
        return rota;
    }
}
