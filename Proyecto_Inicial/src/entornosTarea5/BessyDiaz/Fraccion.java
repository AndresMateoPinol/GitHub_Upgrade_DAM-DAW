package BessyDiaz;
/**
 Diseñar y documentar la clase Fraccion, incorporando conceptos básicos como atributos, constructores, encapsulación y documentación adecuada.
Instrucciones:
1.	Define una clase llamada Fraccion que represente una fracción matemática. La clase debe incluir:
o	Dos atributos privados (opcional: ¿sabrías indicar por qué debe ser privado?): numerador y denominador.
o	Tres constructores:
	Uno sin parámetros que inicialice la fracción como 0/1.
	Otro que reciba numerador y denominador como parámetros (validando que el denominador no sea 0).
	Un tercero que reciba solo el numerador y asuma que el denominador es 1.
o	Métodos para obtener y modificar los valores de los atributos, asegurando que el denominador no sea 0.
o	Un método para devolver la fracción en formato de texto (numerador/denominador).
2.	Documenta el código con comentarios claros y apropiados usando JavaDoc para describir la clase, los atributos y los métodos.
3.	Opcionalmente, prueba tu clase en un programa principal, mostrando en consola al menos una fracción creada con cada constructor.
Entrega: Enlace al proyecto de GitHub. Este proyecto se irá ampliando semanalmente a través de distintos commits.
    * @version 1.0
    @author Bessy
 */
public class Fraccion {
    // Dos atributos privados (opcional: ¿sabrías indicar por qué debe ser privado?): numerador y denominador.
    private int numerador; 
    private int denominador;

    //Crear 3 constructores

    
    /**
     * Constructor que recibe un numerador y un denominador.
     * Valida que el denominador no sea cero.
     *
     * @param numerador El numerador de la fracción.
     * @param denominador El denominador de la fracción.
     * @throws IllegalArgumentException Si el denominador es cero.
     */
    public Fraccion(int numerador, int denominador) {

        if (denominador == 0) {   
                throw new IllegalArgumentException("El denominador no puede ser cero.");
        }

        this.numerador = numerador;
        this.denominador = denominador;
    }

    //Un constructor que que no recibe parámetros y asume que el denominador es 1.Inicializa la fracción como 0/1
    public Fraccion(){
        this.numerador = 0 ;
        this.denominador = 1;
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

    //Métodos getter y setter para los atributos.
    public int getNumerador() {
        return numerador;
    }
    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }
    public int getDenominador() {
        return denominador;
    }
    public void setDenominador(int denominador) {
        if (denominador == 0) {
            throw new IllegalArgumentException("El denominador no puede ser cero.");
        }
        this.denominador = denominador;
    }
    /**
     * Devuelve la fracción como una cadena en formato "numerador/denominador".
     * 
     * @return La fracción en formato texto.
     */
    
    //Método toString que devuelve una cadena de texto con la fracción en formato "numerador/denominador".
    public String toString() {   
        return numerador + "/" + denominador;
    }

//Empezamos a instanciar objetos de la clase creada anteriormente y a aplicar los métodos creados si procede
    public static void main(String[] args) {
        /** 
         
        //Descomentar para probar la creacion y prueba del objeto fraccion1
        //Creamos un objeto de la clase Fraccion con numerador 3 y denominador 0 y probamos como se arroja un error al poner 0 en el denominador
        
        Fraccion fraccion1 = new Fraccion(3, 0);
        //Mostramos la información de la fracción y el objeto creado anteriormente
        System.out.println("La fracción1 es " + fraccion1.toString());
        */
        //Creamos un objeto de la clase Fraccion con numerador 3 y denominador 2, distinto de cero
        Fraccion fraccion2 = new Fraccion(3, 2);
        //Mostramos la información de la fracción y el objeto creado anteriormente
        System.out.println("La fracción2 es " + fraccion2.toString());
        //Creamos un objeto de la clase Fraccion con solo un numerador. La salida debería ser 3/1(denominador inicializado por defecto a 1)
        Fraccion fraccion3 = new Fraccion(3);
        //Mostramos la información de la fracción y el objeto creado anteriormente
        System.out.println("La fracción3 es " + fraccion3.toString());
        //Creamos un objeto de la clase Fraccion sin parámetros. La salida debería ser 0/1(numerador inicializado por defecto a 0 y denominador inicializado por defecto a 1)
        Fraccion fraccion4 = new Fraccion();
        //Mostramos la información de la fracción y el objeto creado anteriormentte
        System.out.println("La fracción4 es " + fraccion4.toString());
    }
}