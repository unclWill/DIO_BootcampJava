package edu.dio;

import java.time.LocalDate;

public class CadastrarPessoa {
    private ApiDosCorreios apiDosCorreios;

    public CadastrarPessoa(final ApiDosCorreios apiDosCorreios) {
        this.apiDosCorreios = apiDosCorreios;
    }

    public Pessoa cadastrarPessoa(String nome, String documento, LocalDate dataNascimento, String cep) {
        Pessoa pessoa = new Pessoa(nome, documento, dataNascimento);
        DadosLocalizacao dadosLocalizacao = apiDosCorreios.buscaDadosComBaseNoCep(cep);
        pessoa.adicionarDadosDeEndereco(dadosLocalizacao);
        return pessoa;
    }

}
