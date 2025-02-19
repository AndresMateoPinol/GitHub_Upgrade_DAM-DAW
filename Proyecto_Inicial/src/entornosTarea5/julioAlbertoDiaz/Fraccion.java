package julioAlbertoDiaz;

    /*
     * 1.Define una clase llamada Fraccion que represente una fracción matemática. La clase debe incluir:
     * 
     * · Dos atributos privados (opcional: ¿sabrías indicar por qué debe ser privado?): numerador y denominador.
     * · Tres constructores:
     *      - Uno sin parámetros que inicialice la fracción como 0/1.
     *      - Otro que reciba numerador y denominador como parámetros (validando que el denominador no sea 0).
     *      - Un tercero que reciba solo el numerador y asuma que el denominador es 1.
     * · Métodos para obtener y modificar los valores de los atributos, asegurando que el denominador no sea 0.
     * · Un método para devolver la fracción en formato de texto (numerador/denominador).
     * 
     * 2.Documenta el código con comentarios claros y apropiados usando JavaDoc para describir la clase, los atributos y los métodos.
     * 
     * 3.Opcionalmente, prueba tu clase en un programa principal, mostrando en consola al menos una fracción creada con cada constructor.
     */

public class Fraccion {
    
    /**
     * Constructor de la clase Fraccion.
     * Permite inicializar el numerador y denominador.
     * 
     * @param numerador El numerador de la fracción.
     * @param denominador  El denominador de la fracción.
     */
    private int numerador;
    private int denominador;
    
    /**
     * Constructor de la clase Fraccion.
     * Permite inicializar el numerador y denominador si no se especifican.
     */
    public Fraccion() {
        this.numerador = 0;
        this.denominador = 1;
    }
    
    /**
     * Constructor de la clase Fraccion.
     * Permite inicializar el numerador y denominador si se especifican.
     */
    public Fraccion(int num, int den) {
        if (denominador != 0) {
            this.numerador = num;
            this.denominador = den;
        } else {
            System.out.println("El denominador no puede ser 0.");
        }
    }
    
    /**
    * Constructor de la clase Fraccion.
    * Permite inicializar el numerador y denominador si se especifica solo el numerador.
    */
    public Fraccion(int num) {
        this.numerador = num;
        this.denominador = 1;
    }
    
    /**
     * Obtiene el numerador de la fracción.
     * 
     * @return El numerador de la fracción.
     */
    public int getNumerador() {
        return numerador;
    }
    
    /**
     * Establece un nuevo numerador para la fracción.
     * 
     * @param num El nuevo numerador de la fracción.
     */
    public void setNumerador(int num) {
        this.numerador = num;
    }
    
    /**
     * Obtiene el denominador de la fracción.
     * 
     * @return El denominador de la fracción.
     */
    public int getDenominador() {
        return denominador;
    }
    
    /**
     * Establece un nuevo denominador para la fracción.
     * 
     * @param den El nuevo denominador de la fracción.
     */
    public void setDenominador(int den) {
        if (den != 0) {
            this.denominador = den;
        } else {
            System.out.println("El denominador no puede ser 0.");
        }
    }
    
    /**
     * Devuelve la fracción en formato de texto (numerador/denominador).
     * 
     * @return La fracción en formato de texto.
     */
    public String toString() {
        return numerador + "/" + denominador;
    }
}