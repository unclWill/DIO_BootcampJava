package edu.dio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
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

        DadosLocalizacao enderecoRafaela = p.getEndereco();
        Assertions.assertEquals(dadosLocalizacao.getBairro(), enderecoRafaela.getBairro());
        Assertions.assertEquals(dadosLocalizacao.getCidade(), enderecoRafaela.getCidade());
        Assertions.assertEquals(dadosLocalizacao.getUf(), enderecoRafaela.getUf());
    }

    @Test
    void lancarExceptionQuandoChamarApiDosCorreios() {
        // Pode ser feito destea forma:
        Mockito.when(apiDosCorreios.buscaDadosComBaseNoCep(ArgumentMatchers.anyString())).thenThrow(IllegalArgumentException.class);

        // Ou desta:
//        Mockito.doThrow(IllegalArgumentException.class)
//                .when(apiDosCorreios)
//                .buscaDadosComBaseNoCep(ArgumentMatchers.anyString());

        Assertions.assertThrows(IllegalArgumentException.class,
                () -> cadastrarPessoa.cadastrarPessoa("Rafaela Silva", "33456400", LocalDate.now(), "12345678"));
    }
}
