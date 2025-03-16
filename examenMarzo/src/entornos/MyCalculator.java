package entornos;

/**
 * Clase MyCalculator que implementa operaciones aritméticas básicas.
 */
public class MyCalculator {

    /**
     * Suma dos números enteros.
     * @param a Primer operando.
     * @param b Segundo operando.
     * @return La suma de a y b.
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Divide el primer número entero por el segundo.
     * @param a Numerador.
     * @param b Denominador. Debe ser distinto de cero.
     * @return El resultado de la división de a entre b.
     * @throws ArithmeticException si b es igual a cero.
     */
    public int divide(int a, int b) {
        if(b == 0) {
            throw new ArithmeticException("División por cero");
        }
        return a / b;
    }
}
