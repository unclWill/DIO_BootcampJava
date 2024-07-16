package principios_poo.exemplointerface.equipamentos.copiadora;

public class Xerox implements Copiadora {
	@Override
	public void copiar() {
		System.out.println("Copiando...");
	}
}
