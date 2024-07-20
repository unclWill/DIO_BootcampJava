package edu.william.introducao;

/**
 * Introdução ao Java
 * 
 * Data: 13/07/2024
 * @author William Silva
 */

public class Main {
    public static void main(String[] args) throws Exception {
        String meuNome = "William";
        String meuSobrenome = "Silva";

        System.out.println(nomeCompleto(meuNome, meuSobrenome));
    }

    public static String nomeCompleto(String nome, String sobrenome) {
        return nome.concat(" ").concat(sobrenome);
    }
}