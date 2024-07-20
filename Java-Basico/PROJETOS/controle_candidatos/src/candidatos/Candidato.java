package candidatos;

import bases.Pessoa;

public class Candidato extends Pessoa {
	private double salarioPretendido;
	
	public Candidato() {
		super();
	}
	
	public Candidato(String nome, String sobrenome, String telefone, Endereco endereco, double salarioPretendido) {
		super(nome, sobrenome, telefone, endereco);
		setSalarioPretendido(salarioPretendido);
	}

	public double getSalarioPretendido() {
		return salarioPretendido;
	}

	public void setSalarioPretendido(double salarioPretendido) {
		if (salarioPretendido > 0.0) {
			this.salarioPretendido = salarioPretendido;
		}
	}
}
