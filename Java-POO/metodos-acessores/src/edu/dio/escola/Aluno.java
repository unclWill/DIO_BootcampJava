package edu.dio.escola;

public class Aluno extends Pessoa {
	private String matricula;
	
	public Aluno() {
		super();
	}

	public Aluno(String nome, String matricula) {
		super.setNome(nome);
		setMatricula(matricula);
	}
	
	public Aluno(String nome, int idade, String cpf, String endereco, String matricula) {
		super(nome, idade, cpf, endereco);
		setMatricula(matricula);
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		if (matricula != null && !matricula.isBlank()) {
			this.matricula = matricula;	
		}
	}
}