package sesion20250115;

public class Sumatoria {
// Sumatoria de números
// Escribe una función recursiva que calcule la suma de los números del 1 al ( n ).
// Ejemplo: suma(5) = 1 + 2 + 3 + 4 + 5 = 15.
    public static void main(String[] args) {
        System.out.println(suma(100));
    }
    public static int suma(int n){
        if (n<0) return -1;
        if (n==0) return 0;
        return n+suma(n-1);
    }
}

// hola

