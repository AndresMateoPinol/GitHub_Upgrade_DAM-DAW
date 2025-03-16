package entornos;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolucionMyCalculatorTest {

/**
 * Clase de tests para la clase MyCalculator.
 */
    // Instancia de la clase a probar.
    private final MyCalculator calc = new MyCalculator();

    // Tests para el método add

    @Test
    void testAddWithPositiveNumbers() {
        // Caso típico: sumar dos números positivos.
        assertEquals(5, calc.add(2, 3), "La suma de 2 y 3 debe ser 5");
    }

    @Test
    void testAddWithNegativeNumbers() {
        // Caso borde: sumar dos números negativos.
        assertEquals(-5, calc.add(-2, -3), "La suma de -2 y -3 debe ser -5");
    }

    @Test
    void testAddWithZero() {
        // Caso borde: sumar cero a un número.
        assertEquals(2, calc.add(2, 0), "La suma de 2 y 0 debe ser 2");
    }

    // Tests para el método divide

    @Test
    void testDivideWithPositiveNumbers() {
        // División normal: dividir números positivos.
        assertEquals(2, calc.divide(6, 3), "La división de 6 entre 3 debe ser 2");
    }

    @Test
    void testDivideWithNegativeNumbers() {
        // División normal: dividir dos números negativos.
        assertEquals(2, calc.divide(-6, -3), "La división de -6 entre -3 debe ser 2");
    }

    @Test
    void testDivideWithMixedSignNumbers() {
        // División normal: dividir un número positivo por un número negativo.
        assertEquals(-2, calc.divide(6, -3), "La división de 6 entre -3 debe ser -2");
    }

    @Test
    void testDivideByZero() {
        // Caso borde: intentar dividir entre cero debe lanzar ArithmeticException.
        assertThrows(ArithmeticException.class, () -> calc.divide(6, 0), 
                    "Dividir entre cero debe lanzar ArithmeticException");
    }
}
