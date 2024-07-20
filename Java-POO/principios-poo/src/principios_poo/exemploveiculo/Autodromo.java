package principios_poo.exemploveiculo;

public class Autodromo {
	public static void main(String[] args) {
		Carro jeep = new Carro();
		jeep.ligar();
		jeep.setChassi("9BW0987654234L");
		
		Moto z400 = new Moto();
		z400.ligar();
		z400.setChassi("VZ0987654367HS");
		
		Veiculo coringa = jeep;
		coringa.ligar();
	}
}