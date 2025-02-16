public class Fraccion {
  // Atributos de mi clase: Los indico en privado porque solo los voy a usar en mi clase fraccion
  private int numerador;
  private int denominador;
  

  // Constructor de la clase para inicializar la fraccion como 0/1
  public Fraccion(){
    this.numerador = 0;
    this.denominador= 1;
  }

  
  /**
   * Otro para recibir numerador y dneominador como parámetros validando que denominador =! 0
   * @param numerador parametro para el valor del numerador
   * @param denominador parametro para el valor del denominador
   */
  public Fraccion(int numerador, int denominador){
    this.numerador = numerador;
    this.denominador = denominador;
  }

  //Otro que reciba solo el numerador y asuma que el denominador es 1
  public Fraccion(int numerador){
    this.numerador = numerador;
    this.denominador = 1;
  }

  // Para obtener los valores de los atributos
  public int getNumerador(){
    return numerador;
  }
  public int getDenominador(){
    return denominador;
  }
  // Para modificar valores de los atributos
  public void setNumerador(int numerador){
    this.numerador = numerador; 
  }
  //Modifica el valor del denominador con la condicion de que este no pueda ser 0
  public void setDenominador(int denominador){
    if (denominador == 0){
      System.out.println("El denominador no puede ser 0");
    }
    this.denominador = denominador; 
  }
  
  /**
   * 
   * @param formatoTxt Para devolver la fraccion en formato txt
   */
  public String toString(){
    return numerador + "/" + denominador;
  }
  public static void main(String[] args) {
    // Fraccion de ejemplo 
    Fraccion miFraccion = new Fraccion();
    System.out.println("Mi fraccion por defecto es " + miFraccion);
  }
}
