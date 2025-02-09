package entornosTarea5.sergioRamos;

/**
 * La clase Fraccion representa una fracción matemática con un numerador y un denominador.
 * Proporciona constructores para inicializar la fracción y métodos para acceder y modificar sus atributos.
 * También incluye un método para representar la fracción como una cadena de texto.
 *
 * Atributos:
 * - numerador: El numerador de la fracción.
 * - denominador: El denominador de la fracción.
 *
 * Constructores:
 * - Fraccion(): Inicializa la fracción a 0/1.
 * - Fraccion(int numerador, int denominador): Inicializa la fracción con los valores proporcionados.
 *   Si el denominador es 0, muestra un mensaje de error.
 * - Fraccion(int numerador): Inicializa la fracción con el numerador proporcionado y el denominador en 1.
 *
 * Métodos:
 * - int getNumerador(): Devuelve el numerador de la fracción.
 * - int getDenominador(): Devuelve el denominador de la fracción.
 * - void setNumerador(int numerador): Establece el numerador de la fracción.
 * - void setDenominador(int denominador): Establece el denominador de la fracción.
 * - String toString(): Devuelve la fracción en forma de cadena de texto.
 *
 * Ejemplo de uso:
 * <pre>
 * {@code
 * Fraccion fraccion1 = new Fraccion(3, 4);
 * System.out.println(fraccion1.toString()); // Imprime "3/4"
 *
 * Fraccion fraccion2 = new Fraccion(5);
 * System.out.println(fraccion2.toString()); // Imprime "5/1"
 *
 * Fraccion fraccion3 = new Fraccion();
 * System.out.println(fraccion3.toString()); // Imprime "0/1"
 * }
 * </pre>
 */
public class Fraccion {

    // Definimos dos atributos privados para la clase Fraccion.
    private int numerador;
    private int denominador;
    /* El numerador y el denominador son privados para proteger los datos.
    * Esto permite que solo se puedan modificar o leer usando métodos públicos, lo que da más control y seguridad al objeto.
    * Si los atributos fueran públicos, cualquier parte del código podría modificarlos directamente, lo que podría llevar a errores.
    * Para su modificacion se utilizan los métodos get y set.
    */
    public static void main(String[] args) {
        // Creamos tres objetos de la clase Fraccion para probar los constructores.
        Fraccion fraccion1 = new Fraccion(2, 6);
        System.out.println(fraccion1.toString());

        Fraccion fraccion2 = new Fraccion(5);
        System.out.println(fraccion2.toString());

        Fraccion fraccion3 = new Fraccion();
        System.out.println(fraccion3.toString());
    }

    // Creamos un constructor sin parámetros que inicializa la fracción a 0/1.
    public Fraccion() {
        this.numerador = 0;
        this.denominador = 1;
    }
    // Creamos un constructor con dos parametros para inicializar la fracción con los valores que se le pasen.
    public Fraccion(int numerador, int denominador) {
		if (denominador == 0) {
            System.out.println("Error: el denominador no puede ser 0");
        } // Si el denominador es 0, se muestra un mensaje de error.
        else {
            this.numerador = numerador;
            this.denominador = denominador;
        } // Si el denominador no es 0, se asignan los valores a los atributos.
	}
    // Creamos un constructor con un parámetro para inicializar la fracción con el numerador que se le pase y el denominador en 1.
    public Fraccion (int numerador) {
        this.numerador = numerador;
        this.denominador = 1;
    }
    // Creamos una serie de métodos get y set para poder modificar y leer los atributos de la clase Fraccion.
    public int getNumerador() {
        return numerador;
    }
    public int getDenominador() {
        return denominador;
    }
    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }
    public void setDenominador(int denominador) {
        //metodo para asegurar que el denominador no sea 0
        if (denominador == 0) {
            System.out.println("Error: el denominador no puede ser 0");
        } else {
            this.denominador = denominador;
        }
    }
    // Creamos un método que devuelve la fracción en forma de cadena de texto.
    public String toString() {
        return numerador + "/" + denominador;
    }
}