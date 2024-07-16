package principios_poo.exemplomessenger.apps;

public class Telegram extends Messenger {
	@Override
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem pelo Telegram");
	}
	
	@Override
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Telegram");
	}

	@Override
	public void salvarHistoricoMensagem() {
		// TODO Auto-generated method stub
	}
}
