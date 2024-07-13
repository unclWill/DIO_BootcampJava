/* Tipos primitivos: 
 *   - byte: 8 bits | 1 byte
 *   - short: 16 bits | 2 bytes
 *   - int: 32 bits | 4 bytes
 *   - long: 64 bits | 8 bytes
 *   - float: 32 bits | 4 bytes
 *   - double: 64 bits | 8 bytes
 *   - char: 16 bits | 2 bytes
 *   - boolean: 1 bit
*/

public class Main {
    public static void main(String[] args) throws Exception {
        final byte BYTE_VAR = 127; // Constante.
        short shortVar = 32767;
        int intVar = 2147483647;
        final long LONG_VAR = 9223372036854775807L;
        float floatVar = 3.4028235E38F;
        double doubleVar = 1.7976931348623157E308;
        final char CHAR_VAR = 'A';
        boolean booleanVar = true;

<<<<<<< HEAD
        imprimeValores(BYTE_VAR, shortVar, intVar, LONG_VAR, floatVar, doubleVar, CHAR_VAR, booleanVar);
    }

    public static void imprimeValores(byte byteVar, short shortVar, int intVar, long longVar, float floatVar, double doubleVar, char charVar, boolean booleanVar) {
=======
        imprimirValores(BYTE_VAR, shortVar, intVar, LONG_VAR, floatVar, doubleVar, CHAR_VAR, booleanVar);
    }

    public static void imprimirValores(byte byteVar, short shortVar, int intVar, long longVar, float floatVar, double doubleVar, char charVar, boolean booleanVar) {
>>>>>>> 79e0bdd (Exercitando a declaração de variáveis e constantes)
        System.out.println("BYTE: " + byteVar);
        System.out.println("SHORT: " + shortVar);
        System.out.println("INT: " + intVar);
        System.out.println("LONG: " + longVar);
        System.out.println("FLOAT: " + floatVar);
        System.out.println("DOUBLE: " + doubleVar);
        System.out.println("CHAR: " + charVar);
        System.out.println("BOOLEAN: " + booleanVar);
    }
}