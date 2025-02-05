package entornosTarea5.andresMateo;

/**
 * Clase Fraccion que representa una fracción matemática.
 * Permite la creación y manipulación de fracciones, asegurando la validez del denominador.
 * Si el denominador es negativo, la fracción se normaliza para que el denominador sea siempre positivo.
 * 
 * @author Andrés
 * @version 1.0
 */
public class Fraccion {
    private int numerador;
    private int denominador;

    /**
     * Constructor sin parámetros que inicializa la fracción como 0/1.
     */
    public Fraccion() {
        this.numerador = 0;
        this.denominador = 1;
    }

    /**
     * Constructor que recibe numerador y denominador, asegurando que el denominador no sea 0.
     * Si el denominador es negativo, se normaliza haciéndolo positivo y cambiando el signo del numerador.
     * 
     * @param numerador El numerador de la fracción.
     * @param denominador El denominador de la fracción (no puede ser 0).
     * @throws IllegalArgumentException si el denominador es 0.
     */
    public Fraccion(int numerador, int denominador) {
        if (denominador == 0) {
            throw new IllegalArgumentException("El denominador no puede ser 0."); // He añadido lo del error para que empecemos a aprender a usarlos.
        }
        if (denominador < 0) {
            this.numerador = -numerador;
            this.denominador = -denominador;
        } else {
            this.numerador = numerador;
            this.denominador = denominador;
        }
    }
 
    /**
     * Constructor que recibe solo el numerador y asume que el denominador es 1.
     * 
     * @param numerador El numerador de la fracción.
     */
    public Fraccion(int numerador) {
        this.numerador = numerador;
        this.denominador = 1;
    }

    /**
     * Obtiene el numerador de la fracción.
     * 
     * @return El numerador actual.
     */
    public int getNumerador() {
        return numerador;
    }

    /**
     * Establece un nuevo valor para el numerador.
     * 
     * @param numerador El nuevo numerador.
     */
    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    /**
     * Obtiene el denominador de la fracción.
     * 
     * @return El denominador actual.
     */
    public int getDenominador() {
        return denominador;
    }

    /**
     * Establece un nuevo valor para el denominador, asegurando que no sea 0.
     * Si el denominador es negativo, se normaliza haciéndolo positivo y cambiando el signo del numerador.
     * 
     * @param denominador El nuevo denominador (no puede ser 0).
     * @throws IllegalArgumentException si el denominador es 0.
     */
    public void setDenominador(int denominador) {
        if (denominador == 0) {
            throw new IllegalArgumentException("El denominador no puede ser 0.");
        }
        if (denominador < 0) {
            this.numerador = -this.numerador;
            this.denominador = -denominador;
        } else {
            this.denominador = denominador;
        }
    }

    /**
     * Devuelve la representación en cadena de la fracción en formato "numerador/denominador".
     * Si el denominador es 1, solo muestra el numerador.
     * 
     * @return La fracción en formato de texto.
     */
    @Override  // No es necesario, pero ayuda a asegurar que estés de verdad sobreescribiendo la función de la clase Object que comentamos ayer.
    public String toString() {
        return (denominador == 1) ? String.valueOf(numerador) : numerador + "/" + denominador;
    }

    /**
     * Método principal para probar la clase Fraccion.
     * 
     * @param args Argumentos de línea de comandos.
     */
    public static void main(String[] args) {
        // Creación de fracciones con diferentes constructores (hacedlo siempre para no meter la pata)
        Fraccion f1 = new Fraccion();
        Fraccion f2 = new Fraccion(3, 4);
        Fraccion f3 = new Fraccion(5);
        Fraccion f4 = new Fraccion(-2, -5);
        Fraccion f5 = new Fraccion(7, -3);
        
        System.out.println("Fracción por defecto: " + f1);
        System.out.println("Fracción con numerador y denominador: " + f2);
        System.out.println("Fracción con solo numerador (denominador = 1): " + f3);
        System.out.println("Fracción con numerador y denominador negativos: " + f4);
        System.out.println("Fracción con denominador negativo: " + f5);
    }
}
