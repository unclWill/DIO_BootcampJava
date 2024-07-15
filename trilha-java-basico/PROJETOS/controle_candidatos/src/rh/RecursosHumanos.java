package rh;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import bases.Pessoa;
import candidatos.Candidato;

public class RecursosHumanos {
	private Pessoa responsavelSetor;
	private List<Candidato> candidatosContatados;

	public RecursosHumanos() {
		candidatosContatados = new ArrayList<>();
	}

	public RecursosHumanos(Pessoa responsavelSetor) {
		candidatosContatados = new ArrayList<>();
		setResponsavelSetor(responsavelSetor);
	}

	public Pessoa getResponsavelSetor() {
		return responsavelSetor;
	}

	public void setResponsavelSetor(Pessoa responsavelSetor) {
		this.responsavelSetor = responsavelSetor;
	}
	
	public List<Candidato> getCandidatosContatados() {
		return candidatosContatados;
	}

	public void addCandidatoContatado(Candidato candidato) {
		if (candidato != null) {
			candidatosContatados.add(candidato);
		}
	}
	
	public void addCandidatosContatados(List<Candidato> candidatos) {
		if (candidatos != null) {
			candidatosContatados.addAll(candidatos);
		}
	}

	public void contatarCandidatos(List<Candidato> candidatos) {
		int tentativasRealizadas = 1;
		boolean continuarTentando = true;
		boolean atendeu = false;
		
		for (Candidato cand : candidatos) {
			do {
				atendeu = ligar();
				continuarTentando = !atendeu;
				
				if(continuarTentando) {
					tentativasRealizadas++;
				} else {
					System.out.println("CONTATO REALIZADO COM SUCESSO!");
				}
			} while (continuarTentando && tentativasRealizadas < 3);
			
			if (atendeu) {
				System.out.printf("CONSEGUIMOS CONTATO COM %s %s NA %dª TENTATIVA.%n", 
						cand.getNome(), cand.getSobrenome(), tentativasRealizadas);
				candidatosContatados.add(cand);
			} else {
				System.out.printf("NÃO CONSEGUIMOS CONTATO COM %s %s, DEPOIS DE %d TENTATIVAS REALIZADAS.%n", 
						cand.getNome(), cand.getSobrenome(), tentativasRealizadas);
			}
			tentativasRealizadas = 1;
		}
	}
	
	private boolean ligar() {
		return new Random().nextInt(3) == 1;
	}
}
