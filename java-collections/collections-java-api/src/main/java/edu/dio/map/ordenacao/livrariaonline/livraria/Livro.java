package edu.dio.map.ordenacao.livrariaonline.livraria;

public class Livro {
    private String titulo;
    private String autor;
    private double preco;

    public Livro() {}

    public Livro(String titulo, String autor, double preco) {
        setTitulo(titulo);
        setAutor(autor);
        setPreco(preco);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo != null && !titulo.isBlank()) {
            this.titulo = titulo;
        }
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        if (autor != null && !autor.isBlank()) {
            this.autor = autor;
        }
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        }
    }
}
