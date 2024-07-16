package edu.dio.escola.cadastros;

public class SistemaIbge {
	public static void main(String[] args) {
		for (EstadosBrasileiros e : EstadosBrasileiros.values()) {
			System.out.printf("ESTADO: %s - %s%n", e.getSigla(), e.getNomeMaiusculo());
		}
		
		EstadosBrasileiros e = EstadosBrasileiros.MINAS_GERAIS;
		System.out.printf("%s %d%n", e.getNomeMaiusculo(), e.getCodIbge());
	}
}
