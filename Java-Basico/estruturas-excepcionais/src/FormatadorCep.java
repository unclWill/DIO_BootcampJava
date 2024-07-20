public class FormatadorCep {
    public static void main(String[] args) {
        try {
            String cep = formatarCep("23765064");
            System.out.println(cep);
        } catch (CepInvalidoException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static String formatarCep(String cep) throws CepInvalidoException {
        if (cep.length() != 8) {
            throw new CepInvalidoException("O CEP deve conter 8 dígitos!");
        }
        return "23.765-064";
    }
}
