package edu.dio.list.pesquisaemlist.catalogodelivros.livros;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public Livro() {}

    public Livro(String titulo, String autor, int anoPublicacao) {
        setTitulo(titulo);
        setAutor(autor);
        setAnoPublicacao(anoPublicacao);
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

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    @Override
    public String toString() {
        return String.format("Título: %s | Autor: %s | Ano de publicação: %d%n", titulo, autor, anoPublicacao);
    }
}
