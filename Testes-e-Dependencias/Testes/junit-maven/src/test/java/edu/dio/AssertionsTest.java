package edu.dio;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

// Importação estática.
import static org.junit.jupiter.api.Assertions.*;

public class AssertionsTest {
    @Test
    void validarLancamentos() {
        int[] primeiroLancamento = {10, 20, 30, 40, 50};
        int[] segundooLancamento = {10, 5, 2, 3, 10};

        // Verifica se os elementos do array são iguais.
        assertArrayEquals(primeiroLancamento, segundooLancamento);
        // Verifica se os elementos do array são diferentes.
        assertNotEquals(primeiroLancamento, segundooLancamento);
    }

    @Test
    void validarSeObjetoEstaNulo() {
        Pessoa pessoa = null;
        // Verifica se a referência está nula.
        assertNull(pessoa);

        // Verifica se a referência não está nula.
        pessoa = new Pessoa("Luciano", LocalDate.now());
        assertNotNull(pessoa);
    }

    @Test
    void validarNumerosDeTiposDiferentes() {
        double valor = 5.0;
        double outroValor = 5.0;

        assertEquals(valor, outroValor);
    }
}
