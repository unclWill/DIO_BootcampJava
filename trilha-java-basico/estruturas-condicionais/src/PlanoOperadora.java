public class PlanoOperadora {
    private String plano;

    public PlanoOperadora() {}

    public PlanoOperadora(String plano) {
        setPlano(plano);
    }

    public String getPlano() {
        return plano;
    }

    public void setPlano(String plano) {
        this.plano = plano.toUpperCase();
    }

    public void determinarPlanoPorSigla() {
        switch (plano) {
            case "T":
                System.out.println("5Gb YouTube");
            case "M":
                System.out.println("WhatsApp e Instagram ilimitados");
            case "B":
                System.out.println("100 minutos de ligação");
        }
    }
}
