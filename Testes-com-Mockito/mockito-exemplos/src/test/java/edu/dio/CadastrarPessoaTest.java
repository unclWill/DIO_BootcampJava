package edu.dio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;

@ExtendWith(MockitoExtension.class)
public class CadastrarPessoaTest {
    @Mock
    private ApiDosCorreios apiDosCorreios;

    @InjectMocks
    private CadastrarPessoa cadastrarPessoa;

    @Test
    void validarDadosDeCadastro() {
        DadosLocalizacao dadosLocalizacao = new DadosLocalizacao("MG", "Juiz de Fora", "Rua J","Apto","Solaris");
        Mockito.when(apiDosCorreios.buscaDadosComBaseNoCep("12345678")).thenReturn(dadosLocalizacao);
        Pessoa p = cadastrarPessoa.cadastrarPessoa("Rafaela Silva", "33456400", LocalDate.now(), "12345678");

        Assertions.assertEquals("Rafaela Silva", p.getNome());
        Assertions.assertEquals("33456400", p.getDocumento());
        Assertions.assertEquals("MG", p.getEndereco().getUf());
        Assertions.assertEquals("Apto", p.getEndereco().getComplemento());
    }
}
