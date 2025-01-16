package sesion20250115;

public class Finacci {
    public static void main(String[] args) {
        System.out.println("El término 14 de la sucesión de Fibonacci es el "+fibonacci(14));
    }
    public static int fibonacci(int n){
        if (n==0) return 0;
        if (n==1) return 1;
        return fibonacci(n-1)+fibonacci(n-2);
    }
}
