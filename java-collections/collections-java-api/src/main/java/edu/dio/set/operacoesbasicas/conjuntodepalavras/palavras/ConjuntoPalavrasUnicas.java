package edu.dio.set.operacoesbasicas.conjuntodepalavras.palavras;

import java.util.Objects;
import java.util.Set;
import java.util.HashSet;

public class ConjuntoPalavrasUnicas {
    private Set<String> conjuntoPalavras;

    public ConjuntoPalavrasUnicas() {
        conjuntoPalavras = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        conjuntoPalavras.add(palavra);
    }

    public void removerPalavra(String palavra) {
        String palavraParaRemover = null;
        for (String p : conjuntoPalavras) {
            if (p.equals(palavra)) {
                palavraParaRemover = p;
                break;
            }
        }
        conjuntoPalavras.remove(palavraParaRemover);
    }

    public void verificarPalavra(String palavra) {
        boolean existeNoConjunto = false;
        if (!conjuntoPalavras.isEmpty()) {
            for (String p : conjuntoPalavras) {
                existeNoConjunto = (p.equals(palavra));
                break;
            }
        }
        if (existeNoConjunto) {
            System.out.printf("A palavra %s existe no conjunto!%n", palavra);
        } else {
            System.out.printf("A palavra %s não existe no conjunto!%n", palavra);
        }
    }

    public void exibirPalavrasUnicas() {
        for (String p : conjuntoPalavras) {
            System.out.println(p);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConjuntoPalavrasUnicas that = (ConjuntoPalavrasUnicas) o;
        return Objects.equals(conjuntoPalavras, that.conjuntoPalavras);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(conjuntoPalavras);
    }
}
