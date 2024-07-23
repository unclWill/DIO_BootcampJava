package edu.dio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTest {
    @Test
    void validaCenarioDeExcecaoNaTransferencia() {
        Conta contaOrigem, contaDestino;
        contaOrigem = new Conta("1001", "10012024-133","Maciel", 100D);
        contaDestino = new Conta("1003","10032022-109","Lucíola", 250D);

        // Verifica se a execção será lançada.
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                contaOrigem.transfere(-1, contaDestino));

        // Verifica se a execeção NÃO será lançada.
        Assertions.assertDoesNotThrow(() -> contaOrigem.transfere(10D, contaDestino));
    }

}
