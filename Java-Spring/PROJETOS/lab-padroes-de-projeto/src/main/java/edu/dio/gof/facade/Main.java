package edu.dio.gof.facade;

/**
 * @author William
 * @date 29/07/2024
 */

public class Main {
    public static void main(String[] args) {
        Facade facade = Facade.getInstancia();
        facade.migrarCliente("Bruno", "12345678");
    }
}