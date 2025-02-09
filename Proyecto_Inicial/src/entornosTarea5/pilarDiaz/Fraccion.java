package pilarDiaz;

/**
 * La clase Fraccion representa una fracción matemática.
 * Proporciona métodos para gestionar el numerador y denominador,
 * y asegura que el denominador no sea 0.
 */
public class Fraccion {

    /**
     * Atributo privado para el numerador
     */
    private int numerador;

    /**
     * Atributo privado para el denominador.
     */
    private int denominador;

    /**
     * Constructor sin parámetros.
     * Inicializa la fracción como 0/1.
     */
    public Fraccion() {
        this.numerador = 0;
        this.denominador = 1;
    }

    /**
     * Constructor que recibe numerador y denominador como parámetros.
     * @param numerador El numerador de la fracción.
     * @param denominador El denominador de la fracción. No puede ser 0.
     * @throws IllegalArgumentException si el denominador es 0.
     */
    public Fraccion(int numerador, int denominador) {
        if (denominador == 0) {
            throw new IllegalArgumentException("El denominador no puede ser 0.");
        }
        this.numerador = numerador;
        this.denominador = denominador;
    }

    /**
     * Constructor que recibe solo el numerador.
     * Asume que el denominador es 1.
     * @param numerador El numerador de la fracción.
     */
    public Fraccion(int numerador) {
        this.numerador = numerador;
        this.denominador = 1;
    }

    /**
     * Obtiene el numerador de la fracción.
     * @return El numerador actual.
     */
    public int getNumerador() {
        return numerador;
    }

    /**
     * Establece un nuevo valor para el numerador.
     * @param numerador El nuevo valor del numerador.
     */
    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    /**
     * Obtiene el denominador de la fracción.
     * @return El denominador actual.
     */
    public int getDenominador() {
        return denominador;
    }

    /**
     * Establece un nuevo valor para el denominador.
     * @param denominador El nuevo valor del denominador. No puede ser 0.
     * @throws IllegalArgumentException si el denominador es 0.
     */
    public void setDenominador(int denominador) {
        if (denominador == 0) {
            throw new IllegalArgumentException("El denominador no puede ser 0.");
        }
        this.denominador = denominador;
    }

    /**
     * Devuelve la representación de la fracción en formato de texto.
     * @return Una cadena con el formato "numerador/denominador".
     */
    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }

}

