package edu.dio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ServicoEnvioEmailTest {
    @Mock
    private PlataformaDeEnvio plataforma;

    @InjectMocks
    private ServicoEnvioEmail servicoEnvioEmail;

    @Captor
    private ArgumentCaptor<Email> captor;

    @Test
    void validarDadosEnviadosParaPlataforma() {
        String enderecoEmail = "usuario@mail.com";
        String msg = "Olá mundo teste mensagem.";
        boolean ehFormatoHtml = false;

        servicoEnvioEmail.enviaEmail(enderecoEmail, msg, ehFormatoHtml);

        Mockito.verify(plataforma).enviaEmail(captor.capture());
        Email emailCapturado = captor.getValue();

        Assertions.assertEquals(enderecoEmail, emailCapturado.getEnderecoEmail());
        Assertions.assertEquals(msg, emailCapturado.getMensagem());
        Assertions.assertEquals(Formato.TEXTO, emailCapturado.getFormato());
    }
}
