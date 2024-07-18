package edu.dio.list.pesquisa.catalogodelivros.livros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> listaLivros;

    public CatalogoLivros() {
        listaLivros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        if (livro != null) {
            listaLivros.add(livro);
        }
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosEncontrados = new ArrayList<>();

        if (!listaLivros.isEmpty()) {
            for (Livro livro : listaLivros) {
                if (livro.getAutor().equalsIgnoreCase(autor)) {
                    livrosEncontrados.add(livro);
                }
            }
        }
        return livrosEncontrados;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosNoIntervalo = new ArrayList<>();

        if (!listaLivros.isEmpty()) {
            for (Livro livro : listaLivros) {
                if ((livro.getAnoPublicacao() >= anoInicial) && (livro.getAnoPublicacao() <= anoFinal)) {
                    livrosNoIntervalo.add(livro);
                }
            }
        }

        return livrosNoIntervalo;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        if (!listaLivros.isEmpty()) {
            for (Livro livro : listaLivros) {
                if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                    return livro;
                }
            }
        }
        return null;
    }
}
