package sesion20250109;

public class EjemploFunciones01 {
    public static void main(String[] args) {
        // Voy a crear una función que me permita elevar un número 'a' a una potencia 'b'.
        // La idea es que más adelante esta siguiente línea funcione: 
        double resultado = potencia(60, 0.5);
        System.out.println("El resultado de elevar 2.8 a 3.3 es: "+resultado);
    }

    public static double potencia(double a, double b){
        double resultado = Math.pow(a,b);
        return resultado;
        
    }

}
