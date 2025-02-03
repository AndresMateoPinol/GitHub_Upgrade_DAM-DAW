package entornosTarea5.thayronSaldanha;

/**
 * 
 * @autor Thayron Saldanha
 * @version 1.0
 * 
 */

/***Objetivo:**
 *Diseñar y documentar la clase Fraccion, incorporando conceptos básicos como atributos, constructores, encapsulación y 
 *documentación adecuada.

**Instrucciones:**
  *Define una clase llamada Fraccion que represente una fracción matemática. La clase debe incluir:

  *1. Dos atributos privados (opcional: ¿sabrías indicar por qué debe ser privado?): numerador y denominador.
  *2. Tres constructores:
    *- Uno sin parámetros que inicialice la fracción como 0/1.
    *- Otro que reciba numerador y denominador como parámetros (validando que el denominador no sea 0).
    *- Un tercero que reciba solo el numerador y asuma que el denominador es 1.
  *3. Métodos para obtener y modificar los valores de los atributos, asegurando que el denominador no sea 0.
  *4. Un método para devolver la fracción en formato de texto (numerador/denominador).

  *Documenta el código con comentarios claros y apropiados usando JavaDoc para describir la clase, los atributos y los métodos.
  *Opcionalmente, prueba tu clase en un programa principal, mostrando en consola al menos una fracción creada con cada constructor.

**Entrega: Enlace al proyecto de GitHub. Este proyecto se irá ampliando semanalmente a través de distintos commits.**

 */


 /**
  * Clase Fraccion que representa una fracción matemática.
  *@param crear clase Fraccion
  */

  public class Fraccion{

    //son privados para encapsular la lógica de la clase. Esto significa que solo se pueden acceder y modificar
    //a través de métodos públicos. Esto ayuda a proteger los datos y asegura que se mantenga la integridad de la
    //fracción (por ejemplo, evitando un denominador igual a cero).

    /**
     * Atributos de la clase Fraccion.
     * @param numerador el numerador de la fracción privado
     * @param denominador el denominador de la fracción privado
     */

private int numerador;
private int denominador;

/**
 * Crea una fracción 0/1.
 * @param numerador
 * @param denominador
 */

public Fraccion(){
    numerador = 0;
    denominador = 1;

}

/**
 * Crea una fracción con un numerador y un denominador.
 * @param numerador
 * @param denominador
 */

public Fraccion(int numerador, int denominador){
    if (denominador != 0){
        this.numerador = numerador;
        this.denominador = denominador;
        } else {
            System.out.println("El denominador no puede ser 0, y no crea la fracción");
        }
    }

    /**
     * Crea una fracción con un numerador y denominador de 1.
     * @param numerador
     */
    
    public Fraccion(int numerador){
        this.numerador = numerador;
        this.denominador = 1;
    }

    /**
     * Devuelve el numerador de la fracción.
     * @return
     */

    public int getNumerador(){
        return numerador;
    }

    /**
     * Cambia el numerador de la fracción.
     * @param numerador
     */

    public void setNumerador(int numerador){
        this.numerador = numerador;
    }

    /**
     * Devuelve el denominador de la fracción.
     * @return
     */

    public int getDenominador(){
        return denominador;
    }

/**
 * Cambia el denominador de la fracción, siempre y cuando no sea 0.
 * @param denominador
 */

    public void setDenominador(int denominador){
        if (denominador != 0){
            this.denominador = denominador;
        } else {
            System.out.println("El denominador no puede ser 0, entonces no se ha cambiado el denominador");
        }
    }
/**
 * Devuelve la fracción en formato de texto (numerador/denominador).
 * @return la fracción en formato de texto (numerador/denominador)
 */
    public String toString(){
        return numerador + "/" + denominador;
    }

    /**
     * Método principal para probar la clase Fraccion.
     * @param args
     */

    public static void main(String[] args){
        Fraccion f1 = new Fraccion();
        System.out.println("f1 = " + f1);

        Fraccion f2 = new Fraccion(2, 1);
        System.out.println("f2 = " + f2);

        Fraccion f3 = new Fraccion(8);
        System.out.println("f3 = " + f3);

        f1.setNumerador(5);
        f1.setDenominador(2);
        System.out.println("f1 = " + f1);

        f1.setDenominador(0);
        System.out.println("f1 = " + f1);
    }
}





