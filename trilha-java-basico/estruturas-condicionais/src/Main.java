public class Main {
    public static void main(String[] args) throws Exception {
        // CAIXA ELETRÔNICO.
        CaixaEletronico caixaEletronico = new CaixaEletronico();
        caixaEletronico.depositar(100);
        System.out.printf("Saldo: R$ %.2f%n", caixaEletronico.getSaldo());

        caixaEletronico.sacar(50);
        System.out.printf("Saldo: R$ %.2f%n", caixaEletronico.getSaldo());

        // RESULTADO ESCOLAR.
        ResultadoEscolar resultadoEscolar = new ResultadoEscolar(8);
        System.out.println("Estado de aprovação: " + resultadoEscolar.estadoAprovacao());

    }
}
