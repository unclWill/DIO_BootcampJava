package edu.dio.map.ordenacao.livrariaonline.livraria;

import edu.dio.map.ordenacao.livrariaonline.utils.ComparatorPorPreco;

import java.util.*;

public class LivrariaOnline {
    private Map<String, Livro> mapaLivros;

    public LivrariaOnline() {
        mapaLivros = new HashMap<>();
    }

    public void adicionarLivro(String isbn, String titulo, String autor, double preco) {
        mapaLivros.put(isbn, new Livro(titulo, autor, preco));
    }

    public void removerLivro(String titulo) {
        List<String> livrosParaRemover = new ArrayList<>();
        if (!mapaLivros.isEmpty()) {
            for (Map.Entry<String, Livro> livro : mapaLivros.entrySet()) {
                if (livro.getValue().getTitulo().equals(titulo)) {
                    livrosParaRemover.add(livro.getKey());
                }
            }
            for (String chaveLivro : livrosParaRemover) {
                mapaLivros.remove(chaveLivro);
            }
        }
    }

    public Map<String, Livro> exibirLivrosOrdenadosPorPreco() {
        List<Map.Entry<String, Livro>> livrosParaOrdenarPorPreco = new ArrayList<>(mapaLivros.entrySet());
        Map<String, Livro> livrosOrdenadosPorPreco = new LinkedHashMap<>();
        if (!mapaLivros.isEmpty()) {
            Collections.sort(livrosParaOrdenarPorPreco, new ComparatorPorPreco());
            for (Map.Entry<String, Livro> entry : livrosParaOrdenarPorPreco) {
                livrosOrdenadosPorPreco.put(entry.getKey(), entry.getValue());
            }
        }

        return livrosOrdenadosPorPreco;
    }

    public List<Livro> pesquisarLivrosPorAutor(String autor) {
        List<Livro> livrosDoAutor = new ArrayList<>();
        if (!mapaLivros.isEmpty()) {
            for (Livro livro : mapaLivros.values()) {
                if (livro.getAutor().equals(autor)) {
                    livrosDoAutor.add(livro);
                }
            }
        }
        return livrosDoAutor;
    }

    public Livro obterLivroMaisCaro() {
        Livro livroMaisCaro = null;
        double maiorPreco = 0;

        if (!mapaLivros.isEmpty()) {
            for (Map.Entry<String, Livro> livro : mapaLivros.entrySet()) {
                if (livro.getValue().getPreco() > maiorPreco) {
                    maiorPreco = livro.getValue().getPreco();
                    livroMaisCaro = livro.getValue();
                }
            }
        } else {
            throw new NoSuchElementException("A lista de livros está vazia.");
        }

        return livroMaisCaro;
    }

    public Livro obterLivroMaisBarato() {
        Livro livroMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;

        if (!mapaLivros.isEmpty()) {
            for (Map.Entry<String, Livro> livro : mapaLivros.entrySet()) {
                if (livro.getValue().getPreco() < menorPreco) {
                    menorPreco = livro.getValue().getPreco();
                    livroMaisBarato = livro.getValue();
                }
            }
        } else {
            throw new NoSuchElementException("A lista de livros está vazia.");
        }

        return livroMaisBarato;
    }
}
