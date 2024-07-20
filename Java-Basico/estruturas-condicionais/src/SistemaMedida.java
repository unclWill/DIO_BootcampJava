public class SistemaMedida {
    private String sigla;

    public SistemaMedida() {}

    public SistemaMedida(String sigla) {
        setSigla(sigla);
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla.toUpperCase();
    }

    public String determinarMedidaPorSigla() {
        switch (sigla) {
            case "P":
                return "Pequeno";
            case "M":
                return "Médio";
            case "G":
                return "Grande";
            case "GG":
                return "Extra Grande";
            default:
                return "Indefinido";
        }
    }
}
