package sesion20250115;

public class Dudas {
    public static void main(String[] args) {
        int[] numero = {5};
        cambiaValor(numero);
        System.out.println(numero[0]);
    }

    public static void cambiaValor(int[] numero){
        numero[0] = numero[0] + 10;

    }   
}
