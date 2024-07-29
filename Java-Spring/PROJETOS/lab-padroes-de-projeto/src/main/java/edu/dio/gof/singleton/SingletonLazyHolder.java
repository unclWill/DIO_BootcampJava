package edu.dio.gof.singleton;

/**
 * Singleton "Lazy Holder". Thread-safe.
 *
 * @see <a href="https://stackoverflow.com/a/24018148">Referência</a>
 * @author William
 * @date 29/07/2024
 */

public class SingletonLazyHolder {
    private static class InstanceHolder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstancia() {
        return InstanceHolder.instancia;
    }
}
