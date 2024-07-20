public class ExemploExcecao {
    private Number valor;

    public ExemploExcecao() {}

    public ExemploExcecao(Number valor) {
        setValor(valor);
    }

    public Number getValor() {
        return valor;
    }

    public void setValor(Number valor) {
        if (valor != null) {
            this.valor = valor;
        }
    }
}
