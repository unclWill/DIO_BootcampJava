package principios_poo.exemplomessenger.apps;

public abstract class Messenger {
	public abstract void enviarMensagem();
	public abstract void receberMensagem();
	public abstract void salvarHistoricoMensagem();
	
	protected void validarConectadoInternet() {
		System.out.println("Validando conexão com a rede...");
	}
}