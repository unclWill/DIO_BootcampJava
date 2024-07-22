package edu.dio;

import edu.dio.contas.Conta;
import edu.dio.contas.ContaCorrente;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
public class Banco {
    private String nome;
    private List<Conta> contas;

    public Banco(String nome) {
        contas = new ArrayList<>();
        setNome(nome);
    }

    public void addConta(Conta conta) {
        if (conta != null) {
            this.contas.add(conta);
        }
    }

    public void addContas(List<Conta> novasContas) {
        if (!novasContas.isEmpty()) {
            this.contas.addAll(novasContas);
        }
    }

    public void listarContas() {
        String tipoConta = null;

        System.out.printf("CONTAS REGISTRADAS NO %s%n", nome);
        for (Conta c : contas) {
            if (c instanceof ContaCorrente) {
                tipoConta = "CC - Conta Corrente";
            } else {
                tipoConta = "CP - Conta Poupança";
            }
            System.out.printf(
                    """
                    TIPO CONTA: %s
                    AGÊNCIA   : %d
                    CONTA     : %d
                    TITULAR   : %s %s
                    SALDO     : %.2f%n
                    """,
                    tipoConta, c.getAgencia(), c.getNumero(), c.getCliente().getNome(), c.getCliente().getSobrenome(), c.getSaldo());
        }
    }

    private void setNome(String nome) {
        if (nome != null && !nome.isBlank()) {
            this.nome = nome;
        }
    }
}
