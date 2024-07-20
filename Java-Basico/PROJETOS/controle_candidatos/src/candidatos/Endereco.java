package candidatos;

public class Endereco {
	private String rua;
	private String numero;
	private String bairro;
	private String cidade;
	private String cep;
	private String uf;
	
	public Endereco() {}
	
	public Endereco(String rua, String numero, String bairro, String cidade, String cep, String uf) {
		setRua(rua);
		setNumero(numero);
		setBairro(bairro);
		setCidade(cidade);
		setCep(cep);
		setUf(uf);
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		if (rua != null && !rua.isBlank()) {
			this.rua = rua;
		}
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		if (numero != null && !numero.isBlank()) {
			this.numero = numero;
		}
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		if (bairro != null && !bairro.isBlank()) {
			this.bairro = bairro;
		}
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		if (cidade != null && !cidade.isBlank()) {
			this.cidade = cidade;
		}
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		if (cep != null && !cep.isBlank()) {
			this.cep = cep;
		}
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}
	
}
