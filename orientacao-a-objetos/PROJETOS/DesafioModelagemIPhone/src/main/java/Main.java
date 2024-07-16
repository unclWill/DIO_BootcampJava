import dispositivo.IPhone;

public class Main {
    public static void main(String[] args) {
        IPhone iphone = new IPhone("00ABX45200700A","iPhone 2G");
        System.out.println(iphone.exibirInformacoesBasicas());

        iphone.selecionarMusica("System Of A Down - Holy Mountains");
    }
}