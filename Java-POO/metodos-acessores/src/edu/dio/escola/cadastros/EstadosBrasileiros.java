package edu.dio.escola.cadastros;

public enum EstadosBrasileiros {
	SAO_PAULO("SP", "São Paulo", 35),
	RIO_DE_JANEIRO("RJ", "Rio de Janeiro", 33),
	PIAUI("PI", "Piauí", 22),
	MINAS_GERAIS("MG", "Minas Gerais", 31),
	CEARA("CE", "Ceará", 23);
	
	private String nome;
	private String sigla;
	private int codIbge;
	
	private EstadosBrasileiros(String sigla, String nome, int codIbge) {
		this.sigla = sigla;
		this.nome = nome;
		this.codIbge = codIbge;
	}
	
	public String getSigla() {
		return sigla;
	}
	
	public String getNomeMaiusculo() {
		return nome.toUpperCase();
	}
	
	public int getCodIbge() {
		return codIbge;
	}
}
