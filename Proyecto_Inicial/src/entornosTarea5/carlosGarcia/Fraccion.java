package entornosTarea5.carlosGarcia;

/*
    * @autor: Carlos Garcia
    * @version: 1.0
    *
    * Clase Fraccion
    * Representa una fraccion matematica.
    */
public class Fraccion {

    private int numerador;
    private int denominador;

    /*
    * Primer constructor
    * Constructor sin parametros. Inicializa el numerador a 0 y el denominador a 1. 
    */
    public Fraccion(){
        this.numerador = 0;
        this.denominador = 1;
    }
    /*
    * Segundo constructor
    * Constructor que recibe numerador y denominador como parametros.
    * @param denominador no puede ser 0.
    */
    public Fraccion(int numerador, int denominador){
        if(denominador == 0){
            System.out.println("El denominador no puede ser 0.");
        }
        this.numerador = numerador;
        this.denominador = denominador;
    }
    /*
     * Tercer constructor
     * Constructor que reciba solo el numerador y asuma que el denominador es 1.
     */
    public Fraccion(int numerador){
        this.numerador = numerador;
        this.denominador = 1;
    }
    /*
     * Getter
     * Devuelve el numerador de la fraccion.
     * @return numerador de la fraccion.
     */
    public int getNumerador(){
        return numerador;
    }
    /*
     * Getter
     * Devuelve el denominador de la fraccion.
     * @return denominador de la fraccion.
     */
    public int getDenominador(){
        return denominador;
    }
    /*
     * Setter
     * Cambia el numerador de la fraccion.
     * @param numerador nuevo valor del numerador.
     */
    public void setNumerador(int numerador){
        this.numerador = numerador;
    }
    /*
     * Setter
     * Cambia el denominador de la fraccion.
     * @param denominador nuevo valor del denominador.
     */
    public void setDenominador(int denominador){
        if(denominador == 0){
            System.out.println("El denominador no puede ser 0.");
        }
        this.denominador = denominador;
    }
    /**
     * Devuelve una fraccion en formato de texto.
     * @return fraccion en formato "numerador/denominador".
     */
    public String toString(){
        return numerador + "/" + denominador;
    }
}
