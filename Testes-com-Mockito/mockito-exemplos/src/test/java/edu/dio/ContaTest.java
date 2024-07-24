package edu.dio;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ContaTest {
    @Spy
    private Conta conta = new Conta(1000D);

    @Test
    void validarOrdemDeChamadas() {
        conta.pagaBoleto(300D);

        InOrder inOrder = Mockito.inOrder(conta);
        inOrder.verify(conta).pagaBoleto(300D); // Poderia ser utilizado: ArgumentMatchers.anyDouble()
        inOrder.verify(conta).validaSaldo(300D);
        inOrder.verify(conta).debita(300D);
        inOrder.verify(conta).enviarCreditoParaEmissor(300D);
    }

    @Test
    void validarQuantidadeDeChamadas() {
        conta.validaSaldo(300D);
        conta.validaSaldo(500D);
        conta.validaSaldo(600);

        // Verifica se a verificação de saldo foi chamada 3 vezes.
        Mockito.verify(conta, Mockito.times(3)).validaSaldo(ArgumentMatchers.anyDouble());
    }

    @Test
    void retornaTrueParaQualquerValorNaValidacaoDeSaldo() {
        Mockito.doNothing().when(conta).validaSaldo(ArgumentMatchers.anyDouble());
        conta.validaSaldo(3500D);
    }
}
