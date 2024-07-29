package edu.dio.gof.facade;

import edu.dio.gof.facade.subsistema1.crm.CrmService;
import edu.dio.gof.facade.subsistema2.cep.CepApi;

/**
 * @author William
 * @date 29/07/2024
 */

public class Facade {
    private static Facade instancia = new Facade();

    private Facade() {
        super();
    }

    public static Facade getInstancia() {
        return instancia;
    }

    public void migrarCliente(String nome, String cep) {
       String cidade = CepApi.getInstancia().recuperarCidade(cep);
       String uf = CepApi.getInstancia().recuperarUf(cep);

       CrmService.gravarCliente(nome, cep, cidade, uf);
    }
}
