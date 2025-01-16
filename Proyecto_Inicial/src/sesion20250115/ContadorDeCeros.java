package sesion20250115;

public class ContadorDeCeros {
    // Conteo de ceros en un número
    // Escribe una función recursiva que cuente cuántos ceros tiene un número.
    // Ejemplo: contarCeros(102030) = 3.
    public static void main(String[] args) {
        System.out.println(contarCeros(102030));
    }    
    public static int contarCeros(int n){
        if (n<10) return (n==0)? 1 : 0;
        return ((n%10==0)? 1 : 0) + contarCeros(n/10);
    }
}
