package edu.dio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

public class PessoaTest {
    @Test
    void deveRetornarSeEhMaiorDeIdade() {
        Pessoa roberta = new Pessoa("Roberta", LocalDate.of(1999, 2, 20));
        Assertions.assertTrue(roberta.ehMaiorDeIdade());

        Pessoa marcela = new Pessoa("Marcela", LocalDate.of(2008, 10, 11));
        Assertions.assertFalse(marcela.ehMaiorDeIdade());

        List<Pessoa> pessoas = List.of(
                new Pessoa("Julia", LocalDate.of(2012, 2, 11)),
                new Pessoa("Laura", LocalDate.of(1994, 3, 30))
        );

        Assertions.assertAll("pessoas",
                () -> Assertions.assertFalse(pessoas.get(0).ehMaiorDeIdade()),
                () -> Assertions.assertTrue(pessoas.get(1).ehMaiorDeIdade())
        );
    }

    @Test
    void deveCalcularIdadeCorretamente() {
        Pessoa jessica = new Pessoa("Jéssica", LocalDate.of(2000, 1, 1));
        Assertions.assertEquals(24, jessica.getIdade());
    }
}
