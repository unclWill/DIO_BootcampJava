package edu.dio;

import org.junit.jupiter.api.*;

import java.time.LocalDate;

public class ConsultarDadosDePessoaTest {
    // Executa apenas no ínicio do ciclo de testes.
    @BeforeAll
    static void configuraConexao() {
        BancoDeDados.iniciarConexao();
        System.out.println("Executou configuraConexao");
    }

    // Executa antes de cada teste.
    @BeforeEach
    void insereDadosParaTeste() {
        BancoDeDados.insereDados(new Pessoa("Pedro", LocalDate.now()));
    }

    // Executa depois de cada teste.
    @AfterEach
    void removeDadosDoTeste() {
        BancoDeDados.removeDados(new Pessoa("Pedro", LocalDate.now()));
    }

    @Test
    void validarDadosDeRetorno() {
        Assertions.assertTrue(true);
    }

    @Test
    void validarDadosDeRetorno2() {
        Assertions.assertNull(null);
    }

    // Executa apenas no fim do ciclo de testes.
    @AfterAll
    static void fecharConexao() {
        BancoDeDados.finalizarConexao();
        System.out.println("Executou fecharConexao");
    }
}
