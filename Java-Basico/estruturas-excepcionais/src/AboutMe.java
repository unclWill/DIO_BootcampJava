public class AboutMe {
    private String nome;
    private String sobrenome;
    private int idade;
    private double altura;

    public AboutMe() {}

    public AboutMe(String nome, String sobrenome, int idade, double altura) {
        setNome(sobrenome);
        setSobrenome(sobrenome);
        setIdade(idade);
        setAltura(altura);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.isBlank()) {
            this.nome = nome;
        } 
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        if (sobrenome != null && !sobrenome.isBlank()) {
            this.sobrenome = sobrenome;
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade > 0) {
            this.idade = idade;
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura > 0) {
            this.altura = altura;
        }
    }
}
