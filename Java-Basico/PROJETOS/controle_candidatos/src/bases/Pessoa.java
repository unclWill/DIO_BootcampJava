package bases;

import candidatos.Endereco;

public class Pessoa {
	private String nome;
	private String sobrenome;
	private String telefone;
	private Endereco endereco;
	
	public Pessoa() {}
	
	public Pessoa(String nome, String sobrenome, String telefone, Endereco endereco) {
		setNome(nome);
		setSobrenome(sobrenome);
		setTelefone(telefone);
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

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		if (sobrenome != null && !sobrenome.isBlank()) {
			this.sobrenome = sobrenome;
		}
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		if (telefone != null && !telefone.isBlank()) {
			this.telefone = telefone;
		}
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		if (endereco != null) {
			this.endereco = endereco;
		}
	}
}
