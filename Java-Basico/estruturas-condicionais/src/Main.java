public class Main {
    public static void main(String[] args) throws Exception {
        // CAIXA ELETRÔNICO.
        CaixaEletronico caixaEletronico = new CaixaEletronico();
        caixaEletronico.depositar(100);
        System.out.printf("Saldo: R$ %.2f%n", caixaEletronico.getSaldo());

        caixaEletronico.sacar(50);
        System.out.printf("Saldo: R$ %.2f%n", caixaEletronico.getSaldo());

        System.out.println();

        // RESULTADO ESCOLAR.
        ResultadoEscolar resultadoEscolar = new ResultadoEscolar(6);
        System.out.println("Estado de aprovação: " + resultadoEscolar.estadoAprovacao());

        System.out.println();

        // SISTEMA DE MEDIDA.
        SistemaMedida sistemaMedida = new SistemaMedida("P");
        System.out.println("Medida: " + sistemaMedida.determinarMedidaPorSigla());

        System.out.println();

        // PLANO OPERADORA.
        PlanoOperadora planoOperadora = new PlanoOperadora("b");
        System.out.println("Plano: " + planoOperadora.getPlano());
        System.out.println("Detalhes do plano:");
        planoOperadora.determinarPlanoPorSigla();

    }
}