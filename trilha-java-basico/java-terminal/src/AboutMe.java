public class AboutMe {
    public static void main(String[] args) throws Exception {
        String nome = args[0];
        String sobrenome = args[1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);

        System.out.printf("""
                Olá, me chamo %s %s
                Tenho %d anos de idade
                E tenho %.2fm de altura
                """, nome, sobrenome, idade, altura);
    }
}
