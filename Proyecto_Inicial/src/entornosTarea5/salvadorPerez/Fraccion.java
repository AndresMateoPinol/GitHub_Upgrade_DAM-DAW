package entornosTarea5.salvadorPerez;


/**
 * The Fraccion class represents a mathematical fraction with a numerator and a denominator.
 * It provides methods for basic arithmetic operations (addition, subtraction, multiplication, division),
 * as well as methods for simplifying the fraction and converting it to a string representation.
 * 
 * <p>Example usage:
 * <pre>
 * {@code
 * Fraccion miFraccion1 = new Fraccion();
 * Fraccion miFraccion2 = new Fraccion(-6, 8);
 * Fraccion miFraccion3 = new Fraccion(7, 3);
 * System.out.println("miFraccion1: " + miFraccion1.toString());
 * System.out.println("miFraccion2: " + miFraccion2.toString());
 * System.out.println("miFraccion3: " + miFraccion3.toString());
 * 
 * System.out.println("Denominador de miFraccion2: " + miFraccion2.getDenominador());
 * System.out.println("Actualizamos el denominador de \"miFraccion2\" a 8 usando el método setDenominador");
 * miFraccion2.setDenominador(8);
 * System.out.println("miFraccion2: " + miFraccion2.toString());
 * 
 * System.out.println("Si sumamos las fracciones " + miFraccion2 + " y " + miFraccion3 + " obtenemos: " + miFraccion2.sumar(miFraccion3));
 * }
 * </pre>
 * </p>
 * 
 * <p>Attributes:
 * <ul>
 * <li>numerador: The numerator of the fraction.</li>
 * <li>denominador: The denominator of the fraction.</li>
 * </ul>
 * </p>
 * 
 * <p>Constructors:
 * <ul>
 * <li>{@link #Fraccion()}: Creates a fraction with numerator 0 and denominator 1.</li>
 * <li>{@link #Fraccion(int, int)}: Creates a fraction with the specified numerator and denominator.</li>
 * <li>{@link #Fraccion(int)}: Creates a fraction with the specified numerator and denominator 1.</li>
 * </ul>
 * </p>
 * 
 * <p>Methods:
 * <ul>
 * <li>{@link #getNumerador()}: Returns the numerator of the fraction.</li>
 * <li>{@link #getDenominador()}: Returns the denominator of the fraction.</li>
 * <li>{@link #setNumerador(int)}: Sets the numerator of the fraction and simplifies it.</li>
 * <li>{@link #setDenominador(int)}: Sets the denominator of the fraction and simplifies it.</li>
 * <li>{@link #toString()}: Returns a string representation of the fraction.</li>
 * <li>{@link #simplificar()}: Simplifies the fraction by dividing the numerator and denominator by their greatest common divisor.</li>
 * <li>{@link #sumar(Fraccion)}: Adds the current fraction with another fraction and returns the result as a new fraction.</li>
 * <li>{@link #restar(Fraccion)}: Subtracts another fraction from the current fraction and returns the result as a new fraction.</li>
 * <li>{@link #multiplicar(Fraccion)}: Multiplies the current fraction by another fraction and returns the result as a new fraction.</li>
 * <li>{@link #dividir(Fraccion)}: Divides the current fraction by another fraction and returns the result as a new fraction.</li>
 * </ul>
 * </p>
 */
public class Fraccion {

    // Atributos
    private int numerador;
    private int denominador;

    // Constructores
    public Fraccion() {
        numerador = 0;
        denominador = 1;
    }

    // public Fraccion(int numerador, int denominador) {
    //     if (denominador != 0) {
    //         this.numerador = numerador;
    //         this.denominador = denominador;
    //     } else {
    //         System.out.println("El denominador no puede ser 0");
    //     }
    // }

    public Fraccion (int numerador, int denominador) {
        if (denominador == 0) {
            throw new IllegalArgumentException("El denominador no puede ser 0");
        }
        if (denominador < 0) {
            numerador = -numerador;
            denominador = -denominador;
        } else {
            this.numerador = numerador;
            this.denominador = denominador;
        }
        simplificar();
    }

    public Fraccion(int numerador) {
        this.numerador = numerador;
        denominador = 1;
    }

    // Métodos
    public int getNumerador() {
        return numerador;
    }
    public int getDenominador() {
        return denominador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
        simplificar();
    }
    
    // public void setDenominador(int denominador) {
    //     if(denominador != 0) {
    //         this.denominador = denominador;
    //     } else {
    //         System.out.println("El denominador no puede ser 0");
    //     }
    // }

    public void setDenominador(int denominador) {
        if (denominador == 0) {
            throw new IllegalArgumentException("El denominador no puede ser 0");
        }
        if (denominador < 0) {
            numerador = -numerador;
            this.denominador = -denominador;
        } else {
            this.denominador = denominador;
        }
        simplificar();
    }

    // public String toString() {
    //     return (numerador+"/"+denominador);
    // }

    @Override
    public String toString() {
        return (denominador == 1) ? String.valueOf(numerador) : numerador+"/"+denominador;
    }

    /**
     * Calculates the Greatest Common Divisor (GCD) of two integers using the Euclidean algorithm.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the greatest common divisor of the two integers
     */
    private int calcularMCD( int a, int b) { // Maximo Comun Divisor
        while (b != 0) {
            int temporal = b;
            b = a % b;
            a = temporal;
        }
        return a;
    }

    /**
     * *Simplifica la fracción dividiendo numerador y denominador por su máximo común divisor
     */
    /**
     * Simplifies the fraction by dividing the numerator and denominator
     * by their greatest common divisor (GCD).
     * This method modifies the fraction in place.
     */
    public void simplificar() {
        int mcd = calcularMCD(Math.abs(this.numerador), this.denominador);
        numerador /= mcd;
        denominador /= mcd;
    }

    /**
     * Suma la fracción actual con otra fracción dada.
     *
     * @param frac La fracción a sumar con la fracción actual.
     * @return Una nueva fracción que es la suma de la fracción actual y la fracción dada.
     */
    public Fraccion sumar(Fraccion frac) {
        int nuevoNumerador = this.numerador * frac.denominador + this.denominador * frac.numerador;
        int nuevoDenominador = this.denominador * frac.denominador;
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }

    /**
     * Subtracts the given fraction from the current fraction.
     *
     * @param frac the fraction to be subtracted
     * @return a new Fraccion object representing the result of the subtraction
     */
    public Fraccion restar(Fraccion frac) {
        int nuevoNumerador = this.numerador * frac.denominador - this.denominador * frac.numerador;
        int nuevoDenominador = this.denominador * frac.denominador;
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }

    /**
     * Multiplies this fraction by another fraction.
     *
     * @param frac the fraction to multiply by
     * @return a new Fraccion object representing the product of this fraction and the given fraction
     */
    public Fraccion multiplicar(Fraccion frac) {
        int nuevoNumerador = this.numerador * frac.numerador;
        int nuevoDenominador = this.denominador * frac.denominador;
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }

    /**
     * Divides this fraction by another fraction.
     *
     * @param frac the fraction to divide by
     * @return a new Fraccion object representing the result of the division
     */
    public Fraccion dividir(Fraccion frac) {
        int nuevoNumerador = this.numerador * frac.denominador;
        int nuevoDenominador = this.denominador * frac.numerador;
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }



    // Ejemplo de uso
    public static void main(String[] args) {
        //Crearemos una fracción de ejemplo
        Fraccion miFraccion1 = new Fraccion();
        Fraccion miFraccion2 = new Fraccion(-6, 8);
        Fraccion miFraccion3 = new Fraccion(7, 3);
        System.out.println("miFraccion1: "+miFraccion1.toString());
        System.out.println("miFraccion2: "+miFraccion2.toString());
        System.out.println("miFraccion3: "+miFraccion3.toString());

        System.out.println("Denominador de miFraccion2: "+miFraccion2.getDenominador());
        System.out.println("Actualizamos el denominador de \"miFraccion2\" a 8 usando el método setDenominador");
        miFraccion2.setDenominador(8);
        System.out.println("miFraccion2: "+miFraccion2.toString());

        System.out.println("Si sumamos las fracciones "+miFraccion2+" y "+miFraccion3+" obtenemos: "+miFraccion2.sumar(miFraccion3));
    }
}