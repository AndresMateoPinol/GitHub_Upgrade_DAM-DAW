package entornosTarea5.adrianMartinez;
import java.util.Scanner;

/**
 * La clase Fraccion representa una fracción matemática con un numerador y un denominador.
 * Proporciona métodos para inicializar, obtener y establecer los valores del numerador y denominador,
 * así como para calcular el resultado de la fracción y convertirla a una representación en cadena.
 *
 * @author Adrian Martinez Palazon
 * @version 2.0
 */
public class Fraccion {
    
    /**
     * El numerador de la fracción.
     * 
     * Los atributos numerador y denominador son privados para que no se puedan modificar desde fuera de la clase. 
     * 
     * Ademas, esto permite que para modificarlos dentro de la clase se haga a traves de metodos get y set que filtran
     * los valores que se le pasan.
     */
    private double numerador;
    
    /**
     * El denominador de la fracción.
     */
    private double denominador;

    /**
     * Constructor por defecto que inicializa la fracción a 0/1.
     */
    public Fraccion() {
        this.numerador = 0;
        this.denominador = 1;
    }

    /**
     * Constructor que inicializa la fracción con el numerador y denominador dados.
     * Si el denominador es 0, lo establece a 1 y muestra un mensaje de advertencia.
     *
     * @param numerador   El numerador de la fracción.
     * @param denominador El denominador de la fracción.
     */
    public Fraccion(double numerador, double denominador) {
        this.numerador = numerador;
        if (denominador != 0) {
            this.denominador = denominador;
        } else {
            System.out.println("El denominador no puede ser 0. Se establecerá a 1 por defecto.");
            this.denominador = 1;
        }
    }

    /**
     * Constructor que inicializa la fracción con el numerador dado y establece el denominador a 1.
     *
     * @param numerador El numerador de la fracción.
     */
    public Fraccion(double numerador) {
        this.numerador = numerador;
        this.denominador = 1;
    }

    /**
     * Devuelve el numerador de la fracción.
     *
     * @return El numerador de la fracción.
     */
    public double getNumerador() {
        return numerador;
    }

    /**
     * Devuelve el denominador de la fracción.
     * 
     * el denominador no puede ser cero porque ha sido filtrado en el metodo setDenominador
     *
     * @return El denominador de la fracción.
     */
    public double getDenominador() {
        return denominador;
    }

    /**
     * Establece el numerador de la fracción.
     *
     * @param numerador El nuevo numerador de la fracción.
     */
    public void setNumerador(double numerador) {
        this.numerador = numerador;
        simplificar();
    }

    /**
     * Establece el denominador de la fracción. Si el denominador es 0, muestra un mensaje de advertencia.
     *
     * @param denominador El nuevo denominador de la fracción.
     */
    public void setDenominador(double denominador) {
        if (denominador != 0) {
            this.denominador = denominador;
        } else {
            throw new IllegalArgumentException("El denominador no puede ser 0. Se establecerá a 1 por defecto.");
        }
        simplificar();
    }

    /**
     * Convierte la fracción a una representación en cadena.
     * Si tanto el numerador como el denominador son enteros, los devuelve como enteros.
     *
     * @return La representación en cadena de la fracción.
     */
    @Override // Sobreescribimos el metodo toString para que nos devuelva el resultado de la fraccion en formato de fraccion
    public String toString() {
        if (numerador % 1 == 0 && denominador % 1 == 0) {
            return String.valueOf((int) numerador) + "/" + String.valueOf((int) denominador);
        }
        return String.valueOf(numerador) + "/" + String.valueOf(denominador);
    }

    /**
     * Calcula el Máximo Común Divisor (MCD) de dos números utilizando el algoritmo de Euclides.
     *
     * @param a El primer número.
     * @param b El segundo número.
     * @return El MCD de los dos números.
     */
    private double calcularMCD(double a, double b) {
        if (b == 0) {
            return a;
        }
        return calcularMCD(b, a % b);
    }

    /**
     * Simplifica la fracción dividiendo el numerador y el denominador por su MCD.
     */

    public void simplificar() {
        double mcd = calcularMCD(numerador, denominador);
        numerador /= mcd;
        denominador /= mcd;
    }

    /**
     * Calcula el resultado de la fracción como un doble redondeado a dos decimales.
     *
     * @return El resultado de la fracción redondeado a 2 decimales.
     */
    public double calcularResultado() {
        return (Math.round(100 * (numerador / denominador)) / 100.0);
    }

    /**
     * Suma esta fracción con otra fracción dada.
     *
     * @param otraFraccion La fracción que se va a sumar a esta fracción.
     * @return Una nueva fracción que es el resultado de la suma de esta fracción y la fracción dada.
     */
    public Fraccion sumar(Fraccion otraFraccion){
        double nuevoNumerador = this.numerador * otraFraccion.denominador + otraFraccion.numerador * this.denominador;
        double nuevoDenominador = this.denominador * otraFraccion.denominador;
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }

    /**
     * Resta otra fracción de esta fracción.
     *
     * @param otraFraccion La fracción que se va a restar de esta fracción.
     * @return Una nueva fracción que es el resultado de la resta de esta fracción y la fracción dada.
     */
    public Fraccion restar(Fraccion otraFraccion){
        double nuevoNumerador = this.numerador * otraFraccion.denominador - otraFraccion.numerador * this.denominador;
        double nuevoDenominador = this.denominador * otraFraccion.denominador;
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }

    /**
     * Multiplica esta fracción con otra fracción dada.
     *
     * @param otraFraccion La fracción que se va a multiplicar con esta fracción.
     * @return Una nueva fracción que es el resultado de la multiplicación de esta fracción y la fracción dada.
     */
    public Fraccion multiplicar(Fraccion otraFraccion){
        double nuevoNumerador = this.numerador * otraFraccion.numerador;
        double nuevoDenominador = this.denominador * otraFraccion.denominador;
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }

    /**
     * Divide esta fracción por otra fracción dada.
     *
     * @param otraFraccion La fracción por la que se va a dividir esta fracción.
     * @return Una nueva fracción que es el resultado de la división de esta fracción y la fracción dada.
     */
    public Fraccion dividir(Fraccion otraFraccion){
        double nuevoNumerador = this.numerador * otraFraccion.denominador;
        double nuevoDenominador = this.denominador * otraFraccion.numerador;
        return new Fraccion(nuevoNumerador, nuevoDenominador);
        }

    /**
     * Pregunta al usuario si desea realizar otra operación.
     *
     * @param entrada El objeto Scanner para la entrada del usuario.
     */
    public static void continuar(Scanner entrada) {
        System.out.println("Quieres hacer otra operacion? (SI/NO)");
        String continuar = entrada.next().toUpperCase();
        if (continuar.equals("SI")) interaccionPrograma();
    }

    /**
     * Interactúa con el usuario para calcular el resultado de una fracción.
     * Solicita al usuario que ingrese el numerador y el denominador, luego calcula y muestra el resultado.
     *
     * @param entrada El objeto Scanner para la entrada del usuario.
     */
    public static void interaccionCalcularResultado(Scanner entrada) {
        System.out.println("Introduce el numerador: ");
        Fraccion fraccion1 = new Fraccion();
        fraccion1.setNumerador(entrada.nextDouble());
        
        System.out.println("Introduce el denominador: ");
        fraccion1.setDenominador(entrada.nextDouble());
        
        double resultado = fraccion1.calcularResultado();
        System.out.println("El resultado de la fraccion " + fraccion1.toString() + " es: " + resultado);
    }

    /**
     * Interactúa con el usuario para calcular la suma de dos fracciones.
     * Solicita al usuario que ingrese los numeradores y denominadores de las fracciones, luego calcula y muestra el resultado.
     *
     * @param entrada El objeto Scanner para la entrada del usuario.
     */
    public static void interaccionCalcularSuma(Scanner entrada) {
        System.out.println("Introduce el numerador de la primera fraccion: ");
        Fraccion fraccion1 = new Fraccion();
        fraccion1.setNumerador(entrada.nextDouble());
        
        System.out.println("Introduce el denominador de la primera fraccion: ");
        fraccion1.setDenominador(entrada.nextDouble());

        System.out.println("Introduce el numerador de la segunda fraccion: ");
        Fraccion fraccion2 = new Fraccion();
        fraccion2.setNumerador(entrada.nextDouble());
        
        System.out.println("Introduce el denominador de la segunda fraccion: ");
        fraccion2.setDenominador(entrada.nextDouble());

        Fraccion resultado = fraccion1.sumar(fraccion2);
        System.out.println("El resultado de la suma de las fracciones " + fraccion1.toString() + " y " + fraccion2.toString() + " es: " + resultado.toString());
    }

    /**
     * Interactúa con el usuario para calcular la resta de dos fracciones.
     * Solicita al usuario que ingrese los numeradores y denominadores de las fracciones, luego calcula y muestra el resultado.
     *
     * @param entrada El objeto Scanner para la entrada del usuario.
     */
    public static void interaccionCalcularResta(Scanner entrada) {
        System.out.println("Introduce el numerador de la primera fraccion: ");
        Fraccion fraccion1 = new Fraccion();
        fraccion1.setNumerador(entrada.nextDouble());
        
        System.out.println("Introduce el denominador de la primera fraccion: ");
        fraccion1.setDenominador(entrada.nextDouble());

        System.out.println("Introduce el numerador de la segunda fraccion: ");
        Fraccion fraccion2 = new Fraccion();
        fraccion2.setNumerador(entrada.nextDouble());
        
        System.out.println("Introduce el denominador de la segunda fraccion: ");
        fraccion2.setDenominador(entrada.nextDouble());

        Fraccion resultado = fraccion1.restar(fraccion2);
        System.out.println("El resultado de la resta de las fracciones " + fraccion1.toString() + " y " + fraccion2.toString() + " es: " + resultado.toString());
    }

    /**
     * Interactúa con el usuario para calcular la multiplicación de dos fracciones.
     * Solicita al usuario que ingrese los numeradores y denominadores de las fracciones, luego calcula y muestra el resultado.
     *
     * @param entrada El objeto Scanner para la entrada del usuario.
     */
    public static void interaccionCalcularMultiplicacion(Scanner entrada) {
        System.out.println("Introduce el numerador de la primera fraccion: ");
        Fraccion fraccion1 = new Fraccion();
        fraccion1.setNumerador(entrada.nextDouble());
        
        System.out.println("Introduce el denominador de la primera fraccion: ");
        fraccion1.setDenominador(entrada.nextDouble());

        System.out.println("Introduce el numerador de la segunda fraccion: ");
        Fraccion fraccion2 = new Fraccion();
        fraccion2.setNumerador(entrada.nextDouble());
        
        System.out.println("Introduce el denominador de la segunda fraccion: ");
        fraccion2.setDenominador(entrada.nextDouble());

        Fraccion resultado = fraccion1.multiplicar(fraccion2);
        System.out.println("El resultado de la multiplicacion de las fracciones " + fraccion1.toString() + " y " + fraccion2.toString() + " es: " + resultado.toString());
    }

    /**
     * Interactúa con el usuario para calcular la división de dos fracciones.
     * Solicita al usuario que ingrese los numeradores y denominadores de las fracciones, luego calcula y muestra el resultado.
     *
     * @param entrada El objeto Scanner para la entrada del usuario.
     */
    public static void interaccionCalcularDivision(Scanner entrada) {
        System.out.println("Introduce el numerador de la primera fraccion: ");
        Fraccion fraccion1 = new Fraccion();
        fraccion1.setNumerador(entrada.nextDouble());
        
        System.out.println("Introduce el denominador de la primera fraccion: ");
        fraccion1.setDenominador(entrada.nextDouble());

        System.out.println("Introduce el numerador de la segunda fraccion: ");
        Fraccion fraccion2 = new Fraccion();
        fraccion2.setNumerador(entrada.nextDouble());
        
        System.out.println("Introduce el denominador de la segunda fraccion: ");
        fraccion2.setDenominador(entrada.nextDouble());

        Fraccion resultado = fraccion1.dividir(fraccion2);
        System.out.println("El resultado de la division de las fracciones " + fraccion1.toString() + " y " + fraccion2.toString() + " es: " + resultado.toString());
    }

    /**
     * Interactúa con el usuario para realizar operaciones con fracciones.
     * Proporciona opciones para realizar operaciones con 1 o 2 fracciones o salir del programa.
     */
    public static void interaccionPrograma() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce el numero de opcion que deseas realizar:");
        System.out.println("1. Calcular resultado");
        System.out.println("2. Sumar fracciones");
        System.out.println("3. Restar fracciones");
        System.out.println("4. Multiplicar fracciones");
        System.out.println("5. Dividir fracciones");
        System.out.println("6. Salir");

        int opcion = entrada.nextInt();
        
        switch (opcion) {
            case 1:
                interaccionCalcularResultado(entrada);
                break;
            case 2:
                interaccionCalcularSuma(entrada);
                break;
            case 3:
                interaccionCalcularResta(entrada);
                break;
            case 4:
                interaccionCalcularMultiplicacion(entrada);
                break;
            case 5:
                interaccionCalcularDivision(entrada);
                break;
            case 6:
                return;
            default:
                System.out.println("Opcion no valida");
                interaccionPrograma();
                break;
        }
        continuar(entrada);
        entrada.close();
    }

    /**
     * El método principal que inicia el programa de la calculadora de fracciones.
     *
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        System.out.println("--------------------------------------------------------------");
        System.out.println(" ____  ____    __    ___  ___  ____  _____  _  _  ____  ___ \r\n" + //
                        "( ___)(  _ \\  /__\\  / __)/ __)(_  _)(  _  )( \\( )( ___)/ __)\r\n" + //
                        " )__)  )   / /(__)\\( (__( (__  _)(_  )(_)(  )  (  )__) \\__ \\\r\n" + //
                        "(__)  (_)\\_)(__)(__)\\___)\\___)(____)(_____)(_)\\_)(____)(___/\r\n" + //
                        "                                                            ");
        System.out.println("--------------------------------------------------------------");
        interaccionPrograma();
        System.out.println("Gracias por utilizar el programa, hasta luego!");
        System.out.println("CERRANDO...");
    }
}
