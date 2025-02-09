package entornosTarea5.adrianBaile;
import java.util.Scanner;

/**
 
    @author AdrianBaileCampos
    @version 1.0
    @since 2025-01-29

 
 */

 public class Fraccion {

    /**
     *  Atributos privados para evitar que los datos
     *  puedan ser modificados y esten protegidos. De esta forma solo se podrá tener acceso mediante
     *  los métodos creados para ello (Getters y Setters)
     */

    private int numerador;
    private int denominador;
    

    /**
     * 
     *  Constructor sin parámetros que inicializa la fracción como 0/1.
     * 
     */


    public Fraccion(){

        this.numerador=0;
        this.denominador=1;


    }


    /**
     * 
     *  Constructor que recibe  el numerador y el denominador.
     *  Valida que el denominador NO es 0
     * 
     */


    public Fraccion(int numerador, int denominador){

        this.numerador=numerador;

        if(denominador!=0){

            this.denominador=denominador;

        }else{ this.denominador=1;}
        

    }


    /**
     * 
     *  Constructor que recibe  el numerador y el denominador.
     *  Valida que el denominador NO es 0 y pide al usuario un valor valido
     * 
     */

 

    public Fraccion(Scanner escaner){

        int numerador=escaner.nextInt();
        int denominador;
    
        this.numerador=numerador;

        do{
            denominador=escaner.nextInt();
            this.denominador=denominador;
        }
        while(denominador==0);
    
    }





    /**
     *  
     *  Constructor que recibe solo el numerador.
     *  Asume que el denominador es 1.
     * 
     */


    public Fraccion(int numerador){

        this.numerador=numerador;
        this.denominador=1;

    }



    /**
     * 
     * 
     *  Metodos para obtener los valores de los atributos.
     *  Valida que el denominador NO es 0
     * 
     * 
     */


    public int getNumerador(){

        return numerador;

    }


    public int getDenominador(){

       if(denominador!=0){
            return denominador;

        }else{return 1;}

    }



    /**
     * 
     * 
     *  Metodos para modificar los valores de los atributos.
     *  Valida que el denominador NO es 0
     * 
     * 
     */



     public void setNumerador(int numerador){

        this.numerador=numerador;


     }

     public void setDenominador(int denominador){


        if(denominador!=0){

            this.denominador=denominador;}


     }


     /**
     * 
     * 
     *  Metodos para devolver la fraccion en formato texto
     *  numerador/denominador
     * 
     * 
     */


     @Override
     public String toString() {

        return numerador + "/" + denominador;
     }


     /**
     * 
     *  Programa de prueba de funcionamiento
     *  
     */

     public static void main(String[] args) {

        Scanner escaner=new Scanner(System.in);




        //Constructor sin parametros

            Fraccion fraccion1= new Fraccion();
            System.out.println("La fraccion numero 1 es = " + fraccion1);



        //Constructor con unico parametro variable(numerador)

            System.out.println("Dame un numerador");

            Fraccion fraccion2= new Fraccion(escaner.nextInt());
            System.out.println("La fraccion numero 2 es = " + fraccion2);



        //Constructor con ambos parametros que valida que el denominador no sea 0, 
        // En caso de serlo, el valor sera 1

            Fraccion fraccion3= new Fraccion(2, 0);
            System.out.println("La fraccion numero 3 es = " + fraccion3);



        //Constructor con ambos parametros que pide el denominador hasta que deje de ser 0
        //El parametro que se le pasa es un objeto de la clase Scanner

            System.out.println("Dame un numerador y denominador");
        
            Fraccion fraccion4= new Fraccion(escaner);
            System.out.println("La fraccion numero 4 es = " + fraccion4);



        escaner.close();



     }

}

