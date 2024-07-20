package principios_poo.exemplointerface.equipamentos.impressora;

public class DeskJet implements Impressora {
	@Override
	public void imprimir() {
		System.out.println("[DeskJet] Imprimindo...");
	}
}
