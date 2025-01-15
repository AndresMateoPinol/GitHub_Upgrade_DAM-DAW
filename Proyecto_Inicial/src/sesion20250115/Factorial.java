package sesion20250115;

public class Factorial {
 /*
  * Factorial
  * Escribe una función recursiva que calcule el factorial de un número ( n ) (( n! )).
  * Ejemplo: ( 5! = 5 x 4 x 3 x 2 x 1 = 120 ).
  */
    public static void main(String[] args) {
        int numero = 5;
        System.out.println("El factorial de " + numero + " es: " + factorial(numero));
    }

    public static int factorial(int n){
        if (n<0) return -1;
        if (n == 0 || n == 1) return 1;
        return n*factorial(n-1);
    }
}

