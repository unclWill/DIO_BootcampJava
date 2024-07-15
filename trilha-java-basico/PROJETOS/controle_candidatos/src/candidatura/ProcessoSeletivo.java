package candidatura;

import java.util.ArrayList;
import java.util.List;

import candidatos.Candidato;
import rh.RecursosHumanos;

public class ProcessoSeletivo {
	private int numeroProcesso;
	private int qtdMaximaCandidatos;
	private double salarioBase;
	private RecursosHumanos respProcesso;
	private List<Candidato> candidatos;
	private List<Candidato> candidatosPreSelecionados;
	
	public ProcessoSeletivo() {
		candidatos = new ArrayList<>();
		candidatosPreSelecionados = new ArrayList<>();
	}
	
	public ProcessoSeletivo(int numeroProcesso, double salarioBase, int qtdMaximaCandidatos, RecursosHumanos respProcesso) {
		candidatos = new ArrayList<>();
		candidatosPreSelecionados = new ArrayList<>();
		setNumeroProcesso(numeroProcesso);
		setSalarioBase(salarioBase);
		setQtdMaximaCandidatos(qtdMaximaCandidatos);
		setRespProcesso(respProcesso);
	}
	
	public int getNumeroProcesso() {
		return numeroProcesso;
	}

	public void setNumeroProcesso(int numeroProcesso) {
		this.numeroProcesso = numeroProcesso;
	}

	public int getQtdMaximaCandidatos() {
		return qtdMaximaCandidatos;
	}

	public void setQtdMaximaCandidatos(int qtdMaximaCandidatos) {
		if (qtdMaximaCandidatos >= 0) {
			this.qtdMaximaCandidatos = qtdMaximaCandidatos;
		}
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		if (salarioBase > 0.0) {
			this.salarioBase = salarioBase;
		}
	}
	
	public RecursosHumanos getRespProcesso() {
		return respProcesso;
	}

	public void setRespProcesso(RecursosHumanos respProcesso) {
		if (respProcesso != null) {
			this.respProcesso = respProcesso;
		}
	}
	
	public List<Candidato> getCandidatosPreSelecionados() {
		return candidatosPreSelecionados;
	}

	public void addCandidatoPreSelecionado(Candidato candidatoPreSelecionado) {
		if (candidatoPreSelecionado != null) {
			candidatosPreSelecionados.add(candidatoPreSelecionado);
		}
	}
	
	public void addCandidatosPreSelecionados(List<Candidato> candidatosPreSelecionados) {
		if (candidatosPreSelecionados != null) {
			candidatosPreSelecionados.addAll(candidatosPreSelecionados);
		}
	}

	public List<Candidato> getCandidatos() {
		return candidatos;
	}

	public void addCandidato(Candidato candidato) {
		if (candidato != null) {
			candidatos.add(candidato);
		}
	}
	
	public void addCandidatos(List<Candidato> candidatos) {
		if (candidatos != null) {
			candidatos.addAll(candidatos);
		}		
	}

	public void analisarCandidato(double salarioPretendido) {
		System.out.print("Ação: ");

		if (salarioBase > salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO");
		} else if (salarioBase == salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
		} else {
			System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
		}
	}

	public List<Candidato> analisarPreRequisitos(List<Candidato> candidatos) {
		int contadorCandidatos = 0;

		for (Candidato cand : candidatos) {
			if ((cand.getSalarioPretendido() <= salarioBase) && (contadorCandidatos < qtdMaximaCandidatos)) {
				candidatosPreSelecionados.add(cand);
				contadorCandidatos++;
			}
		}

		return candidatosPreSelecionados;
	}
}