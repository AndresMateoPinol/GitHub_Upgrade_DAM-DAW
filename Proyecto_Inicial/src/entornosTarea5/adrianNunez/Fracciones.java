package org.dam.programacion.ejercicios.entregas;


/**
 * La clase Fraccion representa una fraccion matematica con un numerador y un denominador.
 */
public class Fracciones {

    /**
     * Constructor sin parametros.
     * Inicializa la fraccion como 0/1
     */
    public Fracciones(){
        this.numerador = 0;
        this.denominador = 1;
    }

    /**
     * Constructor con numerador y denominador
     * @param numerador el numerador de la fraccion
     * @param denominador el denominador de la fraccion. No puede ser 0
     * @throws IllegalArgumentException si el denominador es 0.
     */
    public Fracciones(int numerador, int denominador){
        if(denominador == 0 ){
            throw new IllegalArgumentException("El denominador no puede ser 0");
        }
        this.numerador = numerador;
        this.denominador = denominador;
    }
    /**
     * Constructor con solo el numerador.
     * Asume que el denominador es 1.
     * @param numerador el numerador de la fraccion.
     */
    public Fracciones(int numerador){
        this.numerador = numerador;
        this.denominador = 1;
    }

     //Numerador de la fraccion
    private int numerador;
    //Denominador de la fraccion
    private int denominador;


    //Getters y Setter de los parametros
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
        if(denominador == 0 ){
            throw new IllegalArgumentException("El denominador no puede ser 0");
        }
        this.denominador = denominador;
    }

    /**
     * Devuelve una representacion en formato de texto de la fraccion.
     * @return la fraccion en formato "numerador/denominador".
     */
    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }
}
