package sesion20250129;

import java.util.Scanner;

public class CombinacionesRecursivas {
    
    /**
     * Calcula el número de combinaciones posibles de n elementos tomados de k en k.
     * Utiliza la fórmula de combinaciones: C(n, k) = n! / (k! * (n-k)!)
     * @param n Número total de elementos.
     * @param k Tamaño del subconjunto.
     * @return Número total de combinaciones.
     */
    public static int calcularCombinaciones(int n, int k) {
        // Caso base: C(n, 0) = 1 y C(n, n) = 1
        if (k == 0 || k == n) {
            return 1;
        }
        // Fórmula recursiva: C(n, k) = C(n-1, k-1) + C(n-1, k)
        return calcularCombinaciones(n - 1, k - 1) + calcularCombinaciones(n - 1, k);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar valores de n y k al usuario
        System.out.print("Ingrese el número total de elementos (n): ");
        int n = scanner.nextInt();
        
        System.out.print("Ingrese el tamaño del subconjunto (k): ");
        int k = scanner.nextInt();
        
        // Validación básica
        if (n < 0 || k < 0 || k > n) {
            System.out.println("Entrada inválida. Asegúrese de que 0 ≤ k ≤ n.");
        } else {
            // Calcular y mostrar el número de combinaciones
            int resultado = calcularCombinaciones(n, k);
            System.out.println("Número total de combinaciones: " + resultado);
        }
        
        scanner.close();
    }
}

