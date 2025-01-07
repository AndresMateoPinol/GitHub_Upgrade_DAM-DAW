package examenQ1;

public class Matriz {
    public static void main(String[] args) {
        /*
         * b.Columnas de matrices
         * Crea un programa que pida al usuario un tamaño para una matriz cuadrada (una
         * matriz se dice que es cuadrada cuando tiene el mismo número de filas que de
         * columnas). Entonces, realiza los siguientes pasos:
         * 
         * ▪Rellena la matriz con los números desde el 1 hasta su tamaño (primero hazlo
         * con una matriz fija, sin pedir nada al usuario, y luego ya lo completas si
         * tienes tiempo, la diferencia será 0.75 de los 3 puntos).
         * 
         * ▪Calcula las sumas por filas de la matriz y muéstralas por pantalla.
         * 
         * ▪Calcula las sumas por columnas de la matriz y muéstralas por pantalla
         * (aprovecha el código del paso anterior).
         */
        java.util.Scanner entrada = new java.util.Scanner(System.in);
        System.out.print("Hola usuario, indícame el rango: ");
        int rango = entrada.nextInt();
        int[][] matriz = new int[rango][rango];
        
        // Vamos a rellenar la matriz.
        int contador = 1;
        for(int i = 0; i<matriz.length; i++){
            for(int j = 0; j<matriz[i].length; j++){
                matriz[i][j]= contador;
                contador++;
            }
        }
        
        // Vamos a calcular la suma por filas de la matriz:
        for(int i = 0; i<matriz.length; i++){
            int sumaFila = 0;
            for(int j = 0; j<matriz[i].length; j++){
                sumaFila += matriz[i][j];
            }
            System.out.println("La matriz en su fila "+(i+1)+" vale "+sumaFila+".");
        }
        
        // Vamos a calcular la suma por columnas de la matriz:
        for(int j = 0; j<rango; j++){
            int sumaColumna = 0;
            for(int i = 0; i<rango; i++){
                sumaColumna += matriz[i][j];
            }
            System.out.println("La matriz en su columna "+(j+1)+" vale "+sumaColumna+".");
        }
        entrada.close();
    }
}
