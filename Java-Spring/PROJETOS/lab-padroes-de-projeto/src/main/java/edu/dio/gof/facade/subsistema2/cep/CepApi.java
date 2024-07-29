package edu.dio.gof.facade.subsistema2.cep;

import edu.dio.gof.singleton.SingletonEager;

/**
 * @author William
 * @date 29/07/2024
 */

public class CepApi {
    private static CepApi instancia = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstancia() {
        return instancia;
    }

    public String recuperarCidade(String cep) {
        return "Juiz de Fora";
    }

    public String recuperarUf(String cep) {
        return "MG";
    }
}
