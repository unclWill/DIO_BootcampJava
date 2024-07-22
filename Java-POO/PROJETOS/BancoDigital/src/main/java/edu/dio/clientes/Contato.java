package edu.dio.clientes;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Contato {
    private long telefone;
    private String email;

    public Contato(long telefone, String email) {
        setTelefone(telefone);
        setEmail(email);
    }

    public void setTelefone(long telefone) {
        String numeroTelefone = String.valueOf(telefone);
        if (numeroTelefone.length() == 10 || numeroTelefone.length() == 11) {
            this.telefone = telefone;
        } else {
            throw new IllegalArgumentException("O número do telefone deve conter 10 ou 11 dígitos");
        }
    }

    public void setEmail(String email) {
        if (email != null && !email.isBlank()) {
            this.email = email;
        } else {
            throw new IllegalArgumentException("O email não pode estar vazio!");
        }
    }
}
