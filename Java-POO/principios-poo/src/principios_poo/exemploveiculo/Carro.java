package principios_poo.exemploveiculo;

public class Carro extends Veiculo {
	private char posicaoCambio = 'P';
	private double estadoTanque = 15;
	
	public double getEstadoTanque() {
		return estadoTanque;
	}

	public void setEstadoTanque(double estadoTanque) {
		this.estadoTanque = estadoTanque;
	}
	
	@Override
	public void ligar() {
		if (conferirCombustivel() && conferirCambio()) {
			System.out.println("Carro ligado.");
		} else {
			System.out.println("Não foi possível dar a partida!");
		}
	}
	
	@Override
	public boolean conferirCombustivel() {
		System.out.println("Conferindo combustível...");
		return (estadoTanque >= 10) ? true : false;
	}
	
	private boolean conferirCambio() {
		System.out.println("Conferindo a posição da alavanca de câmbio...");
		return (posicaoCambio == 'P') ? true : false;
	}
}
