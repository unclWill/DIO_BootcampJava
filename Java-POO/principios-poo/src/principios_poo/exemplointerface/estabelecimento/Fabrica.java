package principios_poo.exemplointerface.estabelecimento;

import principios_poo.exemplointerface.equipamentos.copiadora.Copiadora;
import principios_poo.exemplointerface.equipamentos.digitalizadora.Digitalizadora;
import principios_poo.exemplointerface.equipamentos.impressora.Impressora;
import principios_poo.exemplointerface.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
	public static void main(String[] args) {
		EquipamentoMultifuncional em = new EquipamentoMultifuncional();
		Impressora impressora = em;
		Digitalizadora digitalizadora = em;
		Copiadora copiadora = em;
		
		impressora.imprimir();
		digitalizadora.digitalizar();
		copiadora.copiar();
	}
}
