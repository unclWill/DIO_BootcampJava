package principios_poo.exemploveiculo;

public abstract class Veiculo {
	private String chassi;
	private double estadoTanqueCombustivel = 15;
	
	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		if (chassi != null && !chassi.isBlank()) {
			this.chassi = chassi;
		}
	}
	
	public double getEstadoTanqueCombustivel() {
		return estadoTanqueCombustivel;
	}

	public void setEstadoTanqueCombustivel(double estadoTanqueCombustivel) {
		this.estadoTanqueCombustivel = estadoTanqueCombustivel;
	}

	public abstract void ligar();
	
	public abstract boolean conferirCombustivel();
}
