package edu.dio.escola;

public class Escola {
	public static void main(String[] args) {
		Aluno felipe = new Aluno("Felipe", "202410019");
		
		System.out.printf("ALUNO: %s | MATRÍCULA: %s%n", felipe.getNome(), felipe.getMatricula());
		//RESULTADO NO CONSOLE
		//O aluno Felipe tem 8 anos 		
	}
}