package edu.dio;

import java.util.logging.Logger;

public class BancoDeDados {
    private static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());

    public static void iniciarConexao() {
        // Lógica de conexão implícita.
        LOGGER.info("A conexão foi inicializada.");
    }

    public static void finalizarConexao() {
        // Lógica de desconexão implícita.
        LOGGER.info("A conexão foi finalizada.");
    }

    public static void insereDados(Pessoa pessoa) {
        // Lógica de inserção implícita.
        LOGGER.info("Inseriu no banco de dados.");
    }

    public static void removeDados(Pessoa pessoa) {
        // Lógica de remoção implícita.
        LOGGER.info("Removeu no banco de dados.");
    }
}
