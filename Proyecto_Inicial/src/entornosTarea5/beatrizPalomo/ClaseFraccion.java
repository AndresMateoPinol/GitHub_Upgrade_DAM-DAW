package entornosTarea5.beatrizPalomo;

public class ClaseFraccion {
    //Establezco los atributos privados
    private int numerador;
    private int denominador;

    //Constructor sin parámetros que inicia la fracción como 0/1
    public ClaseFraccion() {
        numerador = 0;
        denominador = 1;
    }

    //Constructor que recibe el numerador y el denominador como parámetros
    public ClaseFraccion(int numerador, int denominador) {
        this.numerador = numerador;
        //Validamos que el denominador no sea igual a 0
        if (denominador != 0) {
            this.denominador = denominador;
        } else {
            this.denominador = 1;  // Si es 0, ponemos 1 por defecto
        }
    }

    //Constructor que sólo recibe el numerador como parámetro y asume que el denominador es 1
    public ClaseFraccion(int numerador) {
        this.numerador = numerador;
        this.denominador = 1;
    }

    //Método para obtener el numerador
    public int getNumerador() {
        return numerador;
    }
    
    //Método para obtener el denominador
    public int getDenominador() {
        return denominador;
    }
    
    //Método para modificar el numerador
    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }
    
    //Método para modificar el denominador asegurando que este no sea 0
    public void setDenominador(int denominador) {
        if (denominador != 0) {
            this.denominador = denominador;
        }
        // Si es 0, no modificamos el denominador
    }

    //Método para mostrar la fracción en formato texto
    public String toString() {
        return numerador + "/" + denominador;
    }
    
    // Método main para probar la clase
    public static void main(String[] args) {
        // Creo fracciones de prueba
        ClaseFraccion f1 = new ClaseFraccion();         
        ClaseFraccion f2 = new ClaseFraccion(3, 4);    
        ClaseFraccion f3 = new ClaseFraccion(5);       
        ClaseFraccion f4 = new ClaseFraccion(2, 0);    

        // Imprimo los resultados
        System.out.println("Fracción 1: " + f1);
        System.out.println("Fracción 2: " + f2);
        System.out.println("Fracción 3: " + f3);
        System.out.println("Fracción 4: " + f4);
    }
}