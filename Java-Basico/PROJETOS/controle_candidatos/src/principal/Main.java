package principal;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

import bases.Pessoa;
import candidatos.Candidato;
import candidatos.Endereco;
import candidatura.ProcessoSeletivo;
import rh.RecursosHumanos;

public class Main {
	public static void main(String[] args) {
		// Setup inicial.
		Scanner sc = new Scanner(System.in);
		Endereco end1 = new Endereco("Avenida São Jacinto", "900", "Bairro dos Recrutadores", "Oráculo de São Javaé", "32.067-198", "MG");
		Pessoa respRh = new Pessoa("José", "Rodrigues", "(32) 91122-3344", end1);
		
		double[] dadosBasicosDoProcesso = preencherDadosDoProcesso(sc);
		int numeroProcesso = (int)dadosBasicosDoProcesso[0];
		double salarioBase = dadosBasicosDoProcesso[1];
		int qtdMaxCandidatos = (int)dadosBasicosDoProcesso[2];
		
		RecursosHumanos rh = new RecursosHumanos(respRh);
		ProcessoSeletivo procSeletivo = new ProcessoSeletivo(numeroProcesso, salarioBase, qtdMaxCandidatos, rh);
		
		// Execução.
		System.out.println("Processo seletivo");

		List<Candidato> candidatos = gerarListaDeCandidatos();
		procSeletivo.addCandidatos(candidatos);

		List<Candidato> candidatosPreSelecionados = procSeletivo.analisarPreRequisitos(candidatos);
		rh.contatarCandidatos(candidatosPreSelecionados);
		
		List<Candidato> candidatosSelecionados = rh.getCandidatosContatados();
		gerarListaCandidatosSelecionados(procSeletivo, candidatosSelecionados);
	}

	private static void gerarListaCandidatosSelecionados(ProcessoSeletivo procSeletivo, List<Candidato> candidatosSelecionados) {
		System.out.printf("%nPROCESSO Nª: %d | RESPONSÁVEL PELO SETOR: %s %s%n%n", 
				procSeletivo.getNumeroProcesso(), 
				procSeletivo.getRespProcesso().getResponsavelSetor().getNome(), 
				procSeletivo.getRespProcesso().getResponsavelSetor().getSobrenome());
		System.out.printf("QUANTIDADE DE CANDIDATOS SELECIONADOS: %d%n", candidatosSelecionados.size());
		
		for (Candidato cand : candidatosSelecionados) {
			System.out.printf("Candidato: %s %s | Salário pretendido: R$ %.2f%n", 
					cand.getNome(), cand.getSobrenome(), cand.getSalarioPretendido());
		}
	}
	
	private static double[] preencherDadosDoProcesso(Scanner sc) {
		double[] dadosProcesso = new double[3];
		
		try {
			System.out.print("Informe o número do processo: ");
			dadosProcesso[0] = sc.nextDouble();
			System.out.print("Informe o salário base para este processo: ");
			dadosProcesso[1] = sc.nextDouble();
			System.out.print("Informe a quantidade máxima de candidatos que serão selecionados: ");
			dadosProcesso[2] = sc.nextDouble();
		} catch (NumberFormatException | InputMismatchException ex) {
			throw new InputMismatchException("Os valores de entrada devem ser numéricos!");
		}

		return dadosProcesso;
	}
	
	private static List<Candidato> gerarListaDeCandidatos() {
		Endereco end1, end2, end3, end4, end5, end6, end7, end8, end9, end10;
		end1 = new Endereco("Rua do Java", "17", "Solaris", "Oréculo de São Javaé", "32.087-001", "MG");
		end2 = new Endereco("Rua dos Programadores", "21", "Javaé", "Oraculo de São Javaé", "32.099-003", "MG");
		end3 = new Endereco("Rua James Gosling", "8", "Santa Jota de Ká", "Oraculo de São Javaé", "32.459-040", "MG");
		end4 = new Endereco("Rua da Integração", "18", "Integra", "Oráculo de São Javaé", "32.087-002", "MG");
		end5 = new Endereco("Rua dos Desenvolvedores", "22", "Tech", "Oráculo de São Javaé", "32.099-004", "MG");
		end6 = new Endereco("Rua Linus Torvalds", "9", "Santa Jota Erreê", "Fluminjava", "21.459-041", "RJ");
		end7 = new Endereco("Rua da Compilação", "19", "Compilar", "Oráculo de São Javaé", "32.087-003", "MG");
		end8 = new Endereco("Rua dos Coders", "23", "Código", "Oráculo de São Javaé", "32.099-005", "MG");
		end9 = new Endereco("Rua Alan Turing", "10", "São Turing", "Javaé do Norte", "11.459-042", "SP");
		end10 = new Endereco("Rua Ada Lovelace", "11", "Santa Ada", "Oráculo de São Javaé", "32.459-043", "MG");

		Candidato cand1, cand2, cand3, cand4, cand5, cand6, cand7, cand8, cand9, cand10;
		cand1 = new Candidato("Romildo", "do Carmo", "(32) 98877-6655", end1, valorPretendido());
		cand2 = new Candidato("Matilde", "Vieira", "(32) 98975-6655", end2, valorPretendido());
		cand3 = new Candidato("Héctor", "Bonilla", "(32) 96677-6644", end3, valorPretendido());
		cand4 = new Candidato("José", "dos Santos", "(32) 97777-6905", end4, valorPretendido());
		cand5 = new Candidato("Luciana", "Oliveira","(32) 97677-6611", end5, valorPretendido());
		cand6 = new Candidato("Mirela", "Pereira", "(32) 99877-8655", end6, valorPretendido());
		cand7 = new Candidato("Mônica", "Valadares", "(32) 99877-4655",  end7, valorPretendido());
		cand8 = new Candidato("Jorge", "Augusto", "(32) 95877-6605", end8, valorPretendido());
		cand9 = new Candidato("Marco", "Aurélio", "(32) 98444-6725", end9, valorPretendido());
		cand10 = new Candidato("Joana", "Sousa", "(32) 92277-6021", end10, valorPretendido());

		List<Candidato> candidatos = new ArrayList<>();
		candidatos.add(cand1);
		candidatos.add(cand2);
		candidatos.add(cand3);
		candidatos.add(cand4);
		candidatos.add(cand5);
		candidatos.add(cand6);
		candidatos.add(cand7);
		candidatos.add(cand8);
		candidatos.add(cand9);
		candidatos.add(cand10);

		return candidatos;
	}
	
	private static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}
}
