package principios_poo.exemplointerface.equipamentos.multifuncional;

import principios_poo.exemplointerface.equipamentos.copiadora.Copiadora;
import principios_poo.exemplointerface.equipamentos.digitalizadora.Digitalizadora;
import principios_poo.exemplointerface.equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {
	@Override
	public void copiar() {
		System.out.println("[Multifuncional] Copiando...");
	}

	@Override
	public void digitalizar() {
		System.out.println("[Multifuncional] Digitalizando...");
	}

	@Override
	public void imprimir() {
		System.out.println("[Multifuncional] Imprimindo...");	
	}
}