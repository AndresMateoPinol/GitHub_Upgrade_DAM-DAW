package sesion20250129;


/**
 * La clase Fraccion representa una fracción matemática con un numerador y un denominador.
 * Proporciona métodos para realizar operaciones aritméticas con fracciones, como suma, resta,
 * multiplicación y división, así como métodos para simplificar la fracción y obtener su representación
 * en cadena.
 * 
 * Ejemplo de uso:
 * <pre>
 *     Fraccion f1 = new Fraccion(1, 2); // Crea una fracción 1/2
 *     Fraccion f2 = new Fraccion(3, 4); // Crea una fracción 3/4
 *     Fraccion suma = f1.sumar(f2);     // Suma las fracciones: 1/2 + 3/4 = 5/4
 *     System.out.println(suma);         // Imprime: 5/4
 * </pre>
 * 
 * La clase asegura que el denominador nunca sea cero y normaliza las fracciones para que el denominador
 * siempre sea positivo.
 * 
 * Métodos disponibles:
 * - Constructores para crear fracciones con diferentes parámetros.
 * - Métodos getter y setter para numerador y denominador.
 * - Métodos para sumar, restar, multiplicar y dividir fracciones.
 * - Método para simplificar la fracción.
 * - Método toString para obtener la representación en cadena de la fracción.
 * 
 * Excepciones:
 * - IllegalArgumentException: Se lanza si se intenta establecer un denominador igual a cero.
 * 
 * @author Andrés
 * @version 2.0
 * @since 2023-10-05
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
        simplificar();
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
        simplificar();
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
        simplificar();
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

    private int calcularMCD(int a, int b){
        while(b!=0){
            int temporal = b;
            b = a % b;
            a = temporal;
        }
        return a;
    }

    /**
     * Simplifica la fracción dividiendo numerador y denominador por su máximo común divisor.
     */
    /**
     * Simplifies the fraction by dividing both the numerator and the denominator
     * by their greatest common divisor (GCD).
     * This method modifies the fraction in place.
     */
    public void simplificar() {
        int mcd = calcularMCD(Math.abs(this.numerador), Math.abs(this.denominador));
        this.numerador /= mcd;
        this.denominador /= mcd;
    }

    /**
     * Suma esta fracción con otra fracción dada.
     *
     * @param otraFraccion La fracción que se va a sumar a esta fracción.
     * @return Una nueva fracción que es el resultado de la suma de esta fracción y la fracción dada.
     */
    public Fraccion sumar(Fraccion otraFraccion){
        int nuevoNumerador = this.numerador * otraFraccion.denominador + otraFraccion.numerador * this.denominador;
        int nuevoDenominador = this.denominador * otraFraccion.denominador;
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }

    /**
     * Subtracts the given fraction from this fraction.
     *
     * @param otraFraccion the fraction to be subtracted
     * @return a new Fraccion representing the result of the subtraction
     */
    public Fraccion restar(Fraccion otraFraccion){
        int nuevoNumerador = this.numerador * otraFraccion.denominador - otraFraccion.numerador * this.denominador;
        int nuevoDenominador = this.denominador * otraFraccion.denominador;
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }

    /**
     * Multiplies this fraction by another fraction.
     *
     * @param otraFraccion the fraction to multiply by
     * @return a new Fraccion object representing the product of the two fractions
     */
    public Fraccion multiplicar(Fraccion otraFraccion){
        int nuevoNumerador = this.numerador * otraFraccion.numerador;
        int nuevoDenominador = this.denominador * otraFraccion.denominador;
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }


    /**
     * Divides this fraction by another fraction.
     *
     * @param otraFraccion the fraction to divide by
     * @return a new Fraccion representing the result of the division
     */
    public Fraccion dividir(Fraccion otraFraccion){
        int nuevoNumerador = this.numerador * otraFraccion.denominador;
        int nuevoDenominador = this.denominador * otraFraccion.numerador;
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }


    /**
     * Método principal para probar la clase Fraccion.
     * 
     * @param args Argumentos de línea de comandos.
     */
    public static void main(String[] args) {
        // Creación de fracciones con diferentes constructores (hacedlo siempre para no meter la pata)
        Fraccion f1 = new Fraccion();
        Fraccion f2 = new Fraccion(6, 54);
        Fraccion f3 = new Fraccion(5);
        Fraccion f4 = new Fraccion(-21, -15);
        Fraccion f5 = new Fraccion(7, -3);
        
        System.out.println("Fracción por defecto: " + f1);
        System.out.println("Fracción con numerador y denominador: " + f2);
        System.out.println("Fracción con solo numerador (denominador = 1): " + f3);
        System.out.println("Fracción con numerador y denominador negativos: " + f4);
        System.out.println("Fracción con denominador negativo: " + f5);

        System.out.println("Si sumamos las fracciones "+f2+" y "+f4+" obtenemos "+f2.sumar(f4));
    }
}
