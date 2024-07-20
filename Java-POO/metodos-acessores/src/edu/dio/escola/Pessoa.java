package edu.dio.escola;

public class Pessoa {
	private String nome;
	private int idade;
	private String cpf;
	private String endereco;
	
	public Pessoa() {}
	
	public Pessoa(String nome, int idade, String cpf, String endereco) {
		setNome(nome);
		setIdade(idade);
		setCpf(cpf);
		setEndereco(endereco);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome != null && !nome.isBlank()) {
			this.nome = nome;
		}
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		if (idade > 0) {
			this.idade = idade;
		}
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		if (cpf != null && !cpf.isBlank()) {
			this.cpf = cpf;
		}
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		if (endereco != null && !cpf.isBlank()) {
			this.endereco = endereco;
		}
	}
}
