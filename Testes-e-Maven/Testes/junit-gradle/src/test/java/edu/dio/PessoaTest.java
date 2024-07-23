package edu.dio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PessoaTest {

    @Test
    void validarCalculoIdade() {
        Pessoa pessoa = new Pessoa("Roberta", LocalDate.of(1997, 5, 10));
        Assertions.assertEquals(27, pessoa.getIdade());
    }
}
