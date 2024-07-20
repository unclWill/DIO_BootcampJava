public class SmartTv {
    private boolean ligada = false;
    private int canal = 1;
    private int volume = 25;

    public SmartTv() {
        setLigada(false);
        setCanal(1);
        setVolume(20);
    }

    public boolean getLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        if (canal > 0) {
            this.canal = canal;
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume >= 0) {
            this.volume = volume;
        }
    }

    public void ligar() {
        ligada = true;
        canal = 1;
        volume = 20;
    }

    public void desligar() {
        ligada = false;
        canal = 0;
        volume = 0;
    }

    public void mudarCanal(int canal) {
        this.canal = canal;
    }

    public void aumentarCanal() {
        if (ligada) {
            canal++;
        }
    }

    public void diminuirCanal() {
        if (ligada && canal > 0) {
            canal--;
        }
    }

    public void aumentarVolume() {
        if (ligada && volume < 100) {
            volume++;
        }
    }

    public void diminuirVolume() {
        if (ligada && volume > 0) {
            volume--;
        }
    }
}
