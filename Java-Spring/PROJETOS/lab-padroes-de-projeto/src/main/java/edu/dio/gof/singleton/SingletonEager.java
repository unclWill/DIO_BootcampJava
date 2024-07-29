package edu.dio.gof.singleton;

/**
 * Singleton "apressado".
 * @author William Silva
 */
public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstancia() {
        return instancia;
    }
}
