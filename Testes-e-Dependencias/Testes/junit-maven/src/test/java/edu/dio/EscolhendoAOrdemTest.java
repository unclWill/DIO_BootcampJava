package edu.dio;

import org.junit.jupiter.api.*;

// Definindo a ordem de execução dos testes.

// 1 - Pela ordem dos métodos utilizando a anotação Order()
// @TestMethodOrder(MethodOrderer.OrderAnnotation.class)

// 2 - Pelo nome do método (segue a ordem alfabética)
//@TestMethodOrder(MethodOrderer.MethodName.class)

// 3 - De forma aleatória
// @TestMethodOrder(MethodOrderer.Random.class)

// 4 - Utilizando o DisplayName
@TestMethodOrder(MethodOrderer.DisplayName.class)
public class EscolhendoAOrdemTest {
    @DisplayName("Teste que valida se o usuário foi criado")
    //@Order(4)
    @Test
    void validaFluxoA() {
        Assertions.assertTrue(true);
    }

    @DisplayName("B")
    //@Order(3)
    @Test
    void validaFluxoB() {
        Assertions.assertTrue(true);
    }

    @DisplayName("C")
    //@Order(2)
    @Test
    void validaFluxoC() {
        Assertions.assertTrue(true);
    }

    @DisplayName("D")
    //@Order(1)
    @Test
    void validaFluxoD() {
        Assertions.assertTrue(true);
    }
}
