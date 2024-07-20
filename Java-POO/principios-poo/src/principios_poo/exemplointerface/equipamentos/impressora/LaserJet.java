package principios_poo.exemplointerface.equipamentos.impressora;

public class LaserJet implements Impressora {
	@Override
	public void imprimir() {
		System.out.println("[LaserJet] Imprimindo...");
	}
}
