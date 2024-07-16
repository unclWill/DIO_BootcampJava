package dispositivo;

import recursos.AparelhoTelefonico;
import recursos.NavegadorInternet;
import recursos.ReprodutorMusical;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private String numeroSerie;
    private String modelo;

    public IPhone() {}

    public IPhone(String numeroSerie, String modelo) {
        setNumeroSerie(numeroSerie);
        setModelo(modelo);
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        if (numeroSerie != null && !numeroSerie.isBlank()) {
            this.numeroSerie = numeroSerie;
        }
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo != null && !modelo.isBlank()) {
            this.modelo = modelo;
        }
    }

    @Override
    public void ligar(String numero) {
        System.out.printf("Ligando para o número %s%n", numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.printf("Exibindo a página %s%n", url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada!");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada!");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música!");
    }

    @Override
    public void pausar() {
        System.out.println("Musica pausada!");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.printf("Música selecionada: %s%n", musica);
    }

    public String exibirInformacoesBasicas() {
        return String.format(
                """
                Número de série: %s
                Modelo: %s
                """, numeroSerie, modelo);
    }
}
