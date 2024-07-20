public class Main {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        smartTv.desligar();
        imprimirEstadoDaTv(smartTv);

        smartTv.ligar();
        smartTv.aumentarVolume();
        smartTv.mudarCanal(12);
        imprimirEstadoDaTv(smartTv);


    }

    private static void imprimirEstadoDaTv(SmartTv smartTv) {
        String estadoTv;
        if (smartTv.getLigada()) {
            estadoTv = "Ligada";
        } else {
            estadoTv = "Desligada";
        }

        System.out.printf("Estado: %s%n", estadoTv);
        System.out.printf("Canal atual: %d%n", smartTv.getCanal());
        System.out.printf("Volume: %d%n", smartTv.getVolume());
    }
}
