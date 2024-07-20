package principios_poo.exemplomessenger;

import principios_poo.exemplomessenger.apps.FacebookMessenger;
import principios_poo.exemplomessenger.apps.MSNMessenger;
import principios_poo.exemplomessenger.apps.Messenger;
import principios_poo.exemplomessenger.apps.Telegram;

public class ComputadorUsuario {
	public static void main(String[] args) {
		Messenger messenger = null;

		String appEscolhido = "msn";

		switch (appEscolhido.toUpperCase()) {
			case "MSN":
			messenger = new MSNMessenger();
				break;
			case "FACEBOOK":
			messenger = new FacebookMessenger();
				break;
			case "TELEGRAM":
			messenger = new Telegram();
				break;
			default:
			System.out.println("Nenhuma opção escolhida!");
				return;
		}

		messenger.enviarMensagem();
		messenger.receberMensagem();
	}
}