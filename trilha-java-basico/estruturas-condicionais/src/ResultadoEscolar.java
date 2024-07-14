public class ResultadoEscolar {
    private int nota;

    public ResultadoEscolar() {}

    public ResultadoEscolar(int nota) {
        setNota(nota);
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        if (nota >= 0 && nota <= 10) {
            this.nota = nota;
        }
    }

    public String estadoAprovacao() {
        if (nota >= 7) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }
}
