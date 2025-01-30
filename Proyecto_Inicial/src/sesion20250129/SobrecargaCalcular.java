package sesion20250129;

public class SobrecargaCalcular {

    /**
     * Calcula la media de un arreglo de enteros.
     * @param numeros Arreglo de números enteros.
     * @return La media de los números.
     */
    public static double calcular(int[] numeros) {
        int suma = 0;
        for (int num : numeros) {
            suma += num;
        }
        return (double) suma / numeros.length;
    }

    /**
     * Encuentra la moda en un arreglo de números decimales.
     * @param numeros Arreglo de números decimales.
     * @return El número más frecuente en el arreglo.
     */
    public static double calcular(double[] numeros) {
        double moda = numeros[0];
        int maxFrecuencia = 0;
        for (int i = 0; i < numeros.length; i++) {
            int frecuencia = 0;
            for (int j = 0; j < numeros.length; j++) {
                if (numeros[i] == numeros[j]) {
                    frecuencia++;
                }
            }
            if (frecuencia > maxFrecuencia) {
                maxFrecuencia = frecuencia;
                moda = numeros[i];
            }
        }
        return moda;
    }

    /**
     * Determina la mediana de un arreglo de cadenas (orden alfabético).
     * @param palabras Arreglo de cadenas.
     * @return La mediana del arreglo ordenado.
     */
    public static String calcular(String[] palabras) {
        // Ordenamiento por el método burbuja, esto es famoso, no es mío.
        for (int i = 0; i < palabras.length - 1; i++) {
            for (int j = i + 1; j < palabras.length; j++) {
                if (palabras[i].compareTo(palabras[j]) > 0) {
                    String temp = palabras[i];
                    palabras[i] = palabras[j];
                    palabras[j] = temp;
                }
            }
        }
        // Cálculo de la mediana según la cantidad de elementos.
        int medio = palabras.length / 2;
        return (palabras.length % 2 == 0) ? palabras[medio - 1] : palabras[medio]; // He tomado el primero de los dos del medio en los pares. 
    }


    public static void main(String[] args) {
        int[] numerosEnteros = {5, 10, 15, 20, 25};
        double[] numerosDecimales = {1.5, 2.5, 2.5, 3.5, 4.5};
        String[] cadenas = {"manzana", "banana", "cereza", "durazno", "fresa"};

        System.out.println("Media de enteros: " + calcular(numerosEnteros));
        System.out.println("Moda de decimales: " + calcular(numerosDecimales));
        System.out.println("Mediana de cadenas: " + calcular(cadenas));
    }
}

