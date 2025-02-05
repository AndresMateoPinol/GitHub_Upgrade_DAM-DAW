package t2.entregas.entrega06;

/**
 * Clase Fracción

 * La clase Fracción representa una división entre los atributos numerador y denominador.
 * Tiene métodos getter y setter para establecer los atributos y el método obtenerFraccion para obtener el string formador por el numerador y denominador.
 *
 * Atributos:
 * - numerador: es el dividendo de la fracción.
 * - denominador: es el divisor de la fracción.
 *
 * Métodos:
 * - obtenerFraccion(): devuelve el String con el "numerador/denominador"
 * - getNumerador(): devuelve el numerador de la fracción.
 * - setNumerador(): devuelve el numerador de la fracción.
 * - getDenominador(): devuelve el denominador de la fracción.
 * - setDenominador(): establece el denominador de la fracción.
 *
 * @author Sergio Ruiz de León Almuedo
 * @version 1.0
 * @since 26/01/2025
 */

public class Fraccion {

  /* ATRIBUTOS */
  // Los atributos son privados porque queremos tener el control y validacción de lo que se asigna a los atributos, por eso sólo podemos establecer valores con los constructores o setters, controlando lo que añade el usuario.
  private int numerador;
  private int denominador;


  /* CONSTRUCTORES */

  /**
   * Genera un fracción básica 0/1
   */
  public Fraccion() {
    this.numerador = 0;
    this.denominador = 1;
  }

  /**
   * Genera una fracción con numerador dado y denominador 1
   *
   * @param numerdador numerador que se quiere dividir entre 1
   */
  public Fraccion(int numerador) {
    this.numerador = numerador;
    this.denominador = 1;
  }

  /**
   * Genera una fracción con numerador y denominador dados
   * @param numerador numerador que se quiere dividir
   * @param denominador denominador por el que se quiere dividir (diferente de 0)
   */
  public Fraccion(int numerador, int denominador) {
    if(denominador == 0){
      System.out.println("Error: no puedes utilizar un denominador 0");
    } else {
      this.numerador = numerador;
      this.numerador = denominador;
    }
  }

  /* MÉTODOS */

  /* Numerador */

  /**
   * Asignar valor al numerador
   * @param numerador asigna el valor de tipo int
   */
  public void setNumerador(int numerador) {
    this.numerador = numerador;
  }

  /**
   * Obtener valor del numerador
   * @return devuelve el valor actual del numerador en tipo int
   */
  public int getNumerador() {
    return numerador;
  }


  /* Denominador */

  /**
   * Asignar valor al denominador
   * @param numerador asigna el valor al denominador de tipo int
   */
  public void setDenominador(int denominador) {
    if(denominador == 0) {
      System.out.println("Error: no puedes asignar un denominador igual a 0");
    } else {
      this.denominador = denominador;
    }
  }

  /**
   * Obtener valor del denominador
   * @return devuelve el valor actual del denominador en tipo int
   */
  public int getDenominador() {
    return denominador;
  }


  /* OTROS MÉTODOS */

  /**
   * Obtener fracción en String
   * @return devuelve la fracción en un String en formato "numerador/denominador"
   */
  public String obtenerFraccion() {
    String fraccion = (numerador+"/"+denominador);
    return fraccion;
  }




  /* PROGRAMA */
  // Programa para probar la clase
  public static void main(String[] args) {

    // Usamos los tres constructores
    Fraccion fraccionSinArgumentos = new Fraccion();
    Fraccion fraccionConNumerador = new Fraccion(10);
    Fraccion fraccionConNumeradorYDenominador = new Fraccion(10,5);

    // Mostramos por pantalla las fracciones ayudados del método obtenerFraccion
    System.out.println("Constructor sin argumentos: " + fraccionSinArgumentos.obtenerFraccion());
    System.out.println("Constructor con numerador: " + fraccionConNumerador.obtenerFraccion());
    System.out.println("Constructor con numerador y denominador: " + fraccionConNumeradorYDenominador.obtenerFraccion());
  }

}
