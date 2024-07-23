package edu.dio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class CondicionaisTest {
    @Test
    // --- Anotações condicionais. ---
    // Habilita o teste apenas se o usuário for algum específico.
    @EnabledIfEnvironmentVariable(named = "USERNAME", matches = "William")
    // Desabilita o teste apenas se o usuário for algum específico.
    @DisabledIfEnvironmentVariable(named = "USERNAME", matches = "Rafaela")
    // Habilita o teste apenas se o SO for o especificado.
    @EnabledOnOs({OS.LINUX, OS.MAC})
    // Habilita o teste apenas se a JRE for a especificada.
    @EnabledOnJre(JRE.JAVA_17)
    // Habilita o teste apenas na faixa de JREs especificada.
    @EnabledForJreRange(min = JRE.JAVA_11, max = JRE.JAVA_22)
    void validarAlgoSomentoNoUsuarioWilliam() {
        Assertions.assertEquals(10, 5 + 5);
    }
}
