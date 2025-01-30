package sesion20250109;

/**
 * The EjemploFunciones02 class provides a method to determine if a given number is a prime number.
 * It contains a main method to demonstrate the usage of the esPrimo method.
 * 
 * <p>Example usage:
 * <pre>
 * {@code
 * EjemploFunciones02.main(new String[]{});
 * }
 * </pre>
 * </p>
 * 
 * <p>Method summary:
 * <ul>
 *   <li>{@link #esPrimo(double)} - Determines if a given number is a prime number.</li>
 * </ul>
 * </p>
 * 
 * @version 1.0
 * @since 2025-01-09
 */
public class EjemploFunciones02 {
    public static void main(String[] args) {
        // luego hago esto
        System.out.println(esPrimo(198));
    }

    /**
     * Determines if a given number is a prime number.
     * 
     * @param n the number to check for primality. It is assumed to be a positive integer greater than 1.
     * @return true if the number is prime, false otherwise.
     */
    public static boolean esPrimo(double n){
        // Vamos a suponer que el número es válido, es decir, es un entero positivo mayor que 1.
        if(n==2){
            return true;
        }
        if(n%2==0){
            return false;
        }
        for(int i=3; i<=Math.sqrt(n); i+=2){
            if (n%i==0){
                System.out.println(i);
                return false;
            }
        }
        return true;
    }
}
