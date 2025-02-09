package ProyectoObjeto.src.ClaseFraccion;

/**
 * Clase Fraccion que representa una fracción matemática.
 * Permite la creación y manipulación de fracciones, asegurando la validez del
 * denominador.
 * Si el denominador es negativo, la fracción se normaliza para que el
 * denominador sea siempre positivo.
 * 
 * @author Andrés
 * @version 1.1
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
     * Constructor que recibe numerador y denominador, asegurando que el denominador
     * no sea 0.
     * Si el denominador es negativo, se normaliza haciéndolo positivo y cambiando
     * el signo del numerador.
     * 
     * @param numerador   El numerador de la fracción.
     * @param denominador El denominador de la fracción (no puede ser 0).
     * @throws IllegalArgumentException si el denominador es 0.
     */
    public Fraccion(int numerador, int denominador) {
        if (denominador == 0) {
            throw new IllegalArgumentException("El denominador no puede ser 0."); // He añadido lo del error para que
                                                                                  // empecemos a aprender a usarlos.
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
     * Si el denominador es negativo, se normaliza haciéndolo positivo y cambiando
     * el signo del numerador.
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
     * Devuelve la representación en cadena de la fracción en formato
     * "numerador/denominador".
     * Si el denominador es 1, solo muestra el numerador.
     * 
     * @return La fracción en formato de texto.
     */
    @Override // No es necesario, pero ayuda a asegurar que estés de verdad sobreescribiendo
              // la función de la clase Object que comentamos ayer.
    public String toString() {
        return (denominador == 1) ? String.valueOf(numerador) : numerador + "/" + denominador;
    }

    /**
     * Calculates the greatest common divisor (GCD) of two integers using the Euclidean algorithm.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the greatest common divisor of the two integers
     */
    private int calcularMCD(int a, int b) {
        while (b != 0) {
            int temporal = b;
            b = a % b;
            a = temporal;
        }
        return a;
    }

    public void simplificar() {
        int mcd = calcularMCD(Math.abs(numerador), Math.abs(denominador));
        numerador /= mcd;
        denominador /= mcd;
    }

    public Fraccion sumar(Fraccion otraFraccion){
        int nuevoNumerador = this.numerador*otraFraccion.denominador + otraFraccion.numerador*this.denominador;
        int nuevoDenominador = this.denominador*otraFraccion.denominador;
        return (new Fraccion(nuevoNumerador,nuevoDenominador));
    }

    public Fraccion restar(Fraccion otraFraccion){
        int nuevoNumerador = this.numerador*otraFraccion.denominador - otraFraccion.numerador*this.denominador;
        int nuevoDenominador = this.denominador*otraFraccion.denominador;
        return (new Fraccion(nuevoNumerador,nuevoDenominador));
    }

    public Fraccion multiplicar(Fraccion otraFraccion){
        int nuevoNumerador = this.numerador*otraFraccion.numerador;
        int nuevoDenominador = this.denominador*otraFraccion.denominador;
        return (new Fraccion(nuevoNumerador,nuevoDenominador));
    }

    public Fraccion dividir(Fraccion otraFraccion){
        int nuevoNumerador = this.numerador*otraFraccion.denominador;
        int nuevoDenominador = this.denominador*otraFraccion.numerador;
        return (new Fraccion(nuevoNumerador,nuevoDenominador));
    }
}