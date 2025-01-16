package sesion20250115;

public class Hanoi {
    public static void main(String[] args) {
        resolverTorre(3, 'A','B','C');
    }
    public static void resolverTorre(int n, char origen, char auxiliar, char destino){
        if (n==1){
            System.out.println("Mover disco 1 de "+origen+" a "+destino);
            return;
        }
        resolverTorre(n-1, origen, destino, auxiliar); // resuelve la torre inmediatamente menor a esta dejándola enmedio

        System.out.println("Mover disco "+n+" de "+origen+" a "+destino);
        
        resolverTorre(n-1, auxiliar, origen ,destino);
    }
}
