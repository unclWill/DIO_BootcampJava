package edu.dio.gof.facade.subsistema1.crm;

/**
 * @author William
 * @date 29/07/2024
 */

public class CrmService {
    private CrmService() {
        super();
    }

    public static void gravarCliente(String nome, String cep, String cidade, String uf) {
        // Implementação de gravação implícita.
        System.out.println("Cliente salvo no sistema de CRM!");
        System.out.println(nome);
        System.out.println(cep);
        System.out.println(cidade);
        System.out.println(uf);

    }
}
