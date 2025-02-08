package entornosTarea5.danielCarrillo;

/**
 * La clase Fraccion representa una fracción matemática con un numerador y un denominador.
 * Proporciona métodos para crear fracciones y manipular sus valores.
 */
public class Fraccion {
    private int numerador;
    private int denominador;
    /*OPCIONAL:
     *  ¿sabrías indicar por qué debe ser privado?
     * 
     * Esto se debe a la encapsulación de los atributos, asi podremos "ocultar" 
     * y controlar su acceso mediante métodos publicos, como los getter o setters.
     */
    /**
     * Crea una nueva fracción con valor 0/1.
     */
    public Fraccion() {
        this.numerador = 0;
        this.denominador = 1;
    }

    /**
     * Crea una nueva fracción con el numerador y denominador especificados.
     * Si el denominador es 0, se establece por defecto a 1.
     *
     * @param numerador   el numerador de la fracción
     * @param denominador el denominador de la fracción
     */
    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        if (denominador == 0) {
            System.out.println("No se puede dividir entre 0, el valor por defecto es 1");
            this.denominador = 1;
        } else {
            this.denominador = denominador;
        }
    }

    /**
     * Crea una nueva fracción con el numerador especificado y denominador 1.
     *
     * @param numerador el numerador de la fracción
     */
    public Fraccion(int numerador) {
        this.numerador = numerador;
        this.denominador = 1;
    }

    /**
     * Obtiene el denominador de la fracción.
     *
     * @return el denominador de la fracción
     */
    public int getDenominador() {
        return denominador;
    }

    /**
     * Establece el denominador de la fracción.
     * Si el denominador es 0, se establece por defecto a 1.
     *
     * @param denominador el nuevo denominador de la fracción
     */
    public void setDenominador(int denominador) {
        if (denominador == 0) {
            System.out.println("No se puede dividir entre 0, el valor por defecto es 1");
            this.denominador = 1;
        } else {
            this.denominador = denominador;
        }
    }

    /**
     * Obtiene el numerador de la fracción.
     *
     * @return el numerador de la fracción
     */
    public int getNumerador() {
        return numerador;
    }

    /**
     * Establece el numerador de la fracción.
     *
     * @param numerador el nuevo numerador de la fracción
     */
    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    /**
     * Devuelve una representación en cadena de la fracción en el formato "numerador/denominador".
     *
     * @return una cadena que representa la fracción
     */
    @Override
    public String toString() {
        return String.format("%d/%d",this.numerador, this.denominador);
    }

    /**
     * Método principal para probar la clase Fraccion.
     *
     * @param args argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        Fraccion fraccion = new Fraccion();
        Fraccion fraccion2 = new Fraccion(2, 5);
        Fraccion fraccion3 = new Fraccion(6);

        System.out.println("Fraccion 1 = " + fraccion.toString());
        System.out.println("Fraccion 2 = " + fraccion2.toString());
        System.out.println("Fraccion 3 = " + fraccion3.toString());
    }
}