package edu.dio.gof.singleton;

/**
 * Singleton "Preguiçoso".
 * @author William Silva
 */
public class SingletonLazy {
    private static SingletonLazy instancia;

    private SingletonLazy() {
        super();
    }

    public static SingletonLazy getInstancia() {
        return (instancia == null) ? instancia = new SingletonLazy() : instancia;
    }
}
