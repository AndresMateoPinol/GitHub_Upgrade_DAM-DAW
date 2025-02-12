package Entregas;
/*Objetivo:
    Diseñar y documentar la clase Fraccion, incorporando conceptos básicos como atributos, constructores, 
    encapsulación y documentación adecuada.
    Instrucciones:
    1. Define una clase llamada Fraccion que represente una fracción matemática. La clase debe incluir:
   - Dos atributos privados (opcional: ¿sabrías indicar por qué debe ser privado?): numerador y denominador.
        Tres constructores:
            *Uno sin parámetros que inicialice la fracción como 0/1.
            *Otro que reciba numerador y denominador como parámetros (validando que el denominador no sea 0).
            *Un tercero que reciba solo el numerador y asuma que el denominador es 1.
    -Métodos para obtener y modificar los valores de los atributos, asegurando que el denominador no sea 0.
    -Un método para devolver la fracción en formato de texto (numerador/denominador).
    2. Documenta el código con comentarios claros y apropiados usando JavaDoc para describir la clase, los atributos y los métodos.
    3. Opcionalmente, prueba tu clase en un programa principal, mostrando en consola al menos una fracción creada con cada constructor.
    Entrega: Enlace al proyecto de GitHub. Este proyecto se irá ampliando semanalmente a través de distintos commits.*/



/**
 * Definimos una clase que representa una fracción matemática con numerador y denominador.
 */
public class Fraccion {
    
    // Atributos privados. Se hace así para garantizar la encapsulación, así se ocultan los detalles de implementación y otros objetos no pueden modificar directamente estos valores.
    private int numerador;
    private int denominador;

    /**
     * Constructor UNO sin parámetros.
     * Inicializa la fracción como 0/1.
     */
    public Fraccion() {
        this.numerador = 0;
        this.denominador = 1;
    }

    /**
     * Constructor DOS que recibe numerador y denominador.
     * @param numerador El numerador de la fracción.
     * @param denominador El denominador de la fracción (no puede ser 0).
     * @throws IllegalArgumentException Si el denominador es 0.
     */
    public Fraccion(int numerador, int denominador) {
        if (denominador == 0) {
            throw new IllegalArgumentException("El denominador no puede ser 0");
        }
        this.numerador = numerador;
        this.denominador = denominador;
    }

    /**
     * Constructor TRES que recibe solo el numerador.
     * Asume que el denominador es 1.
     * @param numerador El numerador de la fracción.
     */
    public Fraccion(int numerador) {
        this.numerador = numerador;
        this.denominador = 1;
    }

    /**
     * Obtiene el numerador de la fracción.
     * @return El valor del numerador.
     */
    public int getNumerador() {
        return numerador;
    }

    /**
     * Establece un nuevo valor para el numerador.
     * @param numerador El nuevo numerador.
     */
    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    /**
     * Obtiene el denominador de la fracción.
     * @return El valor del denominador.
     */
    public int getDenominador() {
        return denominador;
    }

    /**
     * Establece un nuevo valor para el denominador, validando que no sea 0.
     * @param denominador El nuevo denominador (debe ser diferente de 0).
     * @throws IllegalArgumentException Si el denominador es 0.
     */
    public void setDenominador(int denominador) {
        if (denominador == 0) {
            throw new IllegalArgumentException("El denominador no puede ser 0");
        }
        this.denominador = denominador;
    }

    /**
     * Devuelve la fracción en formato de texto "numerador/denominador".
     * @return Representación en texto de la fracción.
     */
    public String toString() {
        return numerador + "/" + denominador;
    }
}