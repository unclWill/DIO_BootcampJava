package edu.dio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionsTest {
    @Test
    void validarAlgoSomentoNoUsuarioWilliam() {
        Assumptions.assumeTrue("William".equals(System.getenv("USERNAME")));
        Assertions.assertEquals(10, 5 + 5);
    }
}
