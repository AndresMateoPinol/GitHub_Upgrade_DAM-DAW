package entornosTarea5.javierSanchez;

public class Fraccion {

    /*
 * 1. Define una clase llamada Fraccion que represente
 * una fracción matemática. La clase debe incluir:
 *      - Dos atributos privados: numerador y denominador.
 *        (opcional: ¿sabrías indicar por qué debe ser privado?):
 *      - Tres constructores:
 *        - Uno sin parámetros que inicialice la fracción como 0/1.
 *        - Otro que reciba numerador y denominador como parámetros
 *          (validando que el denominador no sea 0).
 *        - Un tercero que reciba solo el numerador y asuma 
 *          que el denominador es 1.
 *      - Métodos para obtener y modificar los valores de los atributos,
 *        asegurando que el denominador no sea 0.
 *        - Un método para devolver la fracción en formato de texto (numerador/denominador).
 * 2. Documenta el código con comentarios claros y apropiados usando
 * JavaDoc para describir la clase, los atributos y los métodos.
 * 3. Opcionalmente, prueba tu clase en un programa principal,
 * mostrando en consola al menos una fracción creada con cada constructor.
 */

/**
 * 
 * @author Javier Sánchez
 * @version 2.0
 * 
 * La clase Fraccion representa una fracción matemática.
 * Proporciona métodos para crear fracciones y manipular sus valores.
 */

public class Fraccion {

    /**
     * Dos atributos privados: 
     * - numerador: El numerador de la fracción.
     * - denominador: El denominador de la fracción.
     */

    private int numerador;
    private int denominador;

    /*
     * Son privados para evitar modificaciones que causen algún error en la función.
     * Por ejemplo, que dé valor 0 al denominador.
     */
    
    /**
     * Constructores:
     * - Fraccion(): Inicializa la fracción como 0/1.
     * - Fraccion(int numerador): Inicializa la fracción con el numerador dado y el denominador como 1.
     */

    public Fraccion() {
        this.numerador = 0;
        this.denominador = 1;
    }

    /**
     * - Fraccion(int numerador, int denominador): 
     *   Inicializa la fracción con los valores dados,
     *   asegurando que el denominador no sea 0.
     */

    public Fraccion(int numerador, int denominador){
        this.numerador = numerador;
        this.denominador = denominador != 0 ? denominador : 1;
        simplificar();
    }

    /**
     * - Fraccion(int numerador): Inicializa la fracción con el numerador dado
     *   y el denominador como 1.
     */

    public Fraccion(int numerador){
        this(numerador, 1);
    }

    /*
     * Métodos:
     * - int getNumerador(): Devuelve el valor del numerador.
     */

    public int getNumerador(){
        return numerador;
    }

    /**
     * - int getDenominador(): Devuelve el valor del denominador.
     */

    public int getDenominador(){
        return denominador;
    }

    /**
     * - void setNumerador(int numerador): Modifica el valor del numerador.
     */

    public void setNumerador(int numerador){
        this.numerador = numerador;
        simplificar();
    }

    /**
     * - void setDenominador(int denominador): 
     *   Modifica el valor del denominador, asegurando que no sea 0.
     */

    public void setDenominador(int denominador){
        this.denominador = denominador != 0 ? denominador : 1;
        simplificar();
    }

    /**
     * - String toString():
     *   Devuelve la fracción en formato de texto (numerador/denominador).
     */

    public String toString(){
        return numerador + "/" + denominador;
    }

    private int calcularMCD(int a, int b) {

        while (b != 0) {
            int temporal = b;
            b = a % b;
            a = temporal;
        } 

        return a;
    }

    /**
     * Simplifica la fracción diviendo numerador y denominador por el MCD.
     */

    public void simplificar() {
        int mcd = calcularMCD(Math.abs(numerador), Math.abs(denominador));
        numerador /= mcd;
        denominador /= mcd;
    }

    /**
     * Suma la fracción actual con otra fracción.
     * @param otraFraccion
     * @return
     */

    public Fraccion sumar(Fraccion otraFraccion) {
        int nuevoNumerador = this.numerador * otraFraccion.denominador + otraFraccion.numerador * this.denominador;
        int nuevoDenominador = this.denominador * otraFraccion.denominador;
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }

    /**
     * Resta la fracción actual con otra fracción.
     * @param otraFraccion
     * @return
     */

    public Fraccion restar(Fraccion otraFraccion) {
        int nuevoNumerador = this.numerador * otraFraccion.denominador - otraFraccion.numerador * this.denominador;
        int nuevoDenominador = this.denominador * otraFraccion.denominador;
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }

    /**
     * Multiplica la fracción actual con otra fracción.
     * @param otraFraccion
     * @return
     */

    public Fraccion multiplicar(Fraccion otraFraccion) {
        int nuevoNumerador = this.numerador * otraFraccion.numerador;
        int nuevoDenominador = this.denominador * otraFraccion.denominador;
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }

    /**
     * Divide la fracción actual con otra fracción.
     * @param otraFraccion
     * @return
     */

    public Fraccion dividir(Fraccion otraFraccion) {
        int nuevoNumerador = this.numerador * otraFraccion.denominador;
        int nuevoDenominador = this.denominador * otraFraccion.numerador;
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }

    /**
     * Método main para probar la clase Fraccion.
     */

    public static void main(String[] args) {

        /**
         * Creo una instancia de la clase Fraccion
         * con los valores de numerador 1 y denominador 2, y almaceno
         * el objeto en la variable pruebaFraccion.
         * Esta prueba se realiza con el constructor Fraccion(int numerador, int denominador)
         * y se muestra correctamente por pantalla.
         */

        Fraccion pruebaFraccion = new Fraccion(1, 2);

        /**
         * Muestra por pantalla la fracción creada.
         */

        System.out.println("La fracción introducida es " + pruebaFraccion);

        /**
         * Probamos que la funcies sumar(), restar(), multiplicar() y dividir() funcionen correctamente.
         */

        System.out.println("Si sumamos las fracciones " + pruebaFraccion + " y 1/4, obtenemos " + pruebaFraccion.sumar(new Fraccion(1, 4)));

        System.out.println("Si restamos las fracciones " + pruebaFraccion + " y 1/4, obtenemos " + pruebaFraccion.restar(new Fraccion(1, 4)));

        System.out.println("Si multiplicamos las fracciones " + pruebaFraccion + " y 1/4, obtenemos " + pruebaFraccion.multiplicar(new Fraccion(1, 4)));

        System.out.println("Si dividimos las fracciones " + pruebaFraccion + " y 1/4, obtenemos " + pruebaFraccion.dividir(new Fraccion(1, 4)));
    }

}

}
