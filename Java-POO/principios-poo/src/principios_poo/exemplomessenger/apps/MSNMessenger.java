package principios_poo.exemplomessenger.apps;

public class MSNMessenger extends Messenger {
	@Override
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem pelo MSN Messenger");
	}
	
	@Override
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo MSN Messenger");
	}

	@Override
	public void salvarHistoricoMensagem() {
		// TODO Auto-generated method stub
		
	}
}