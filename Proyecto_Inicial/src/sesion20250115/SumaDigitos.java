package sesion20250115;

public class SumaDigitos {
    // Sumar dígitos de un número
    // Escribe una función recursiva que sume los dígitos de un número.
    // Ejemplo: sumaDigitos(123) = 1 + 2 + 3 = 6.
    public static void main(String[] args) {
        System.out.println(sumaDigitos(123));
    }    
    public static int sumaDigitos(int n){
        if (n==0) return 0;
        return n%10 + sumaDigitos(n/10);
    }
}
