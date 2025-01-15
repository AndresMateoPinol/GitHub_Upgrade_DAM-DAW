package sesion20250109;

public class EjemploFunciones02 {
    public static void main(String[] args) {
        // luego hago esto
        System.out.println(esPrimo(198));
    }

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
