package edu.dio.clientes;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Endereco {
    private String rua;
    private String numero;
    private String cep;
    private String bairro;
    private String cidade;
    private String uf;

    public Endereco() {}

    public Endereco(String rua, String numero, String cep, String bairro, String cidade, String uf) {
        setRua(rua);
        setNumero(numero);
        setCep(cep);
        setBairro(bairro);
        setCidade(cidade);
        setUf(uf);
    }

    public void setRua(String rua) {
        if (rua != null && !rua.isBlank()) {
            this.rua = rua;
        } else {
            throw new IllegalArgumentException("O nome da rua não pode estar nulo ou vazio!");
        }
    }

    public void setNumero(String numero) {
        if (numero != null && !numero.isBlank()) {
            this.numero = numero;
        } else {
            throw new IllegalArgumentException("O número da residência não pode estar nulo ou vazio!");
        }
    }

    public void setCep(String cep) {
        if (cep != null && !cep.isBlank()) {
            this.cep = cep;
        } else {
            throw new IllegalArgumentException("O CEP da rua não pode estar nulo ou vazio!");
        }
    }

    public void setBairro(String bairro) {
        if (bairro != null && !bairro.isBlank()) {
            this.bairro = bairro;
        } else {
            throw new IllegalArgumentException("O nome da bairro não pode estar nulo ou vazio!");
        }
    }

    public void setCidade(String cidade) {
        if (cidade != null && !cidade.isBlank()) {
            this.cidade = cidade;
        } else {
            throw new IllegalArgumentException("O nome da cidade não pode estar nulo ou vazio!");
        }
    }

    public void setUf(String uf) {
        if (uf != null && !uf.isBlank()) {
            this.uf = uf;
        } else {
            throw new IllegalArgumentException("A sigla da UF não pode estar nula ou vazia!");
        }
    }
}
