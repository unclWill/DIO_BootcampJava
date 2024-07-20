package principios_poo.exemploveiculo;

public class Moto extends Veiculo {
	private double estadoTanque = 6.7;
	
	public double getEstadoTanque() {
		return estadoTanque;
	}

	public void setEstadoTanque(int estadoTanque) {
		this.estadoTanque = estadoTanque;
	}
	
	@Override
	public void ligar() {
		if (conferirCombustivel()) {
			System.out.println("Moto ligada.");
		} else {
			System.out.println("Não foi possível dar a partida!");
		}
	}

	public boolean conferirCombustivel() {
		System.out.println("Conferindo combustível...");
		return (estadoTanque >= 7) ? true : false;
	}
}
