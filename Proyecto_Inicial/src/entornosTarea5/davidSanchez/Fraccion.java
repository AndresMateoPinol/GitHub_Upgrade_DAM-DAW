public class Fraccion {

    /**
     * Clase que elabora una fraccion cuyos atributos son un numerador y un
     * denominador
     * El denominador nunca es 0
     * Incluye métodos getters y setters y también de devolución de fracción como
     * texto
     * 
     * @author davidsanchez
     * 
     * @version 1.0
     */

    private int numerador;
    private int denominador;

    /**
     * La función constructora es una función que admite sobrecarga
     * En este caso, al no recibir parámetros, devuelve la fracción 0/1
     */
    public Fraccion() {
        this.numerador = 0;
        this.denominador = 1;
    }

    /**
     * Cuando la función constructora recibe dos parámetros, valida que el
     * denominador no sea 0
     * En ese caso, crea una nueva función con el numerador y el denominador
     * indicados
     */
    public Fraccion(int num, int den) {
        if (den != 0) {
            this.numerador = num;
            this.denominador = den;
        } else {
            System.out.println("El denominador no puede ser 0");
        }

        simplificar();
    }

    /**
     * Si el constructor solo recibe el numerador, asigna el valor 1 al denominador
     */
    public Fraccion(int num) {
        this.numerador = num;
        this.denominador = 1;
    }

    /**
     * Devuelve el valor del numerador
     */
    public int getNumerador() {
        return this.numerador;
    }

    /**
     * Cambia el valor del numerador
     */
    public void setNumerador(int num) {
        this.numerador = num;
    }

    /**
     * Devuelve el valor del denominador
     */
    public int getDenominador() {
        return this.denominador;
    }

    /**
     * Cambia el valor del denominador, validando que no sea 0
     */
    public void setDenominador(int den) {
        if (den != 0) {
            this.denominador = den;
        } else {
            System.out.println("He pasado cero como denominador, por lo que no lo cambiaré");
        }
    }

    /**
     * Devuelve la fracción com texto
     */
    public String fraccionTexto() {

        return (Integer.toString(numerador) + "\\" + Integer.toString(denominador));
    }

    private int calcularMCD(int a, int b) {
        while (b != 0) {
            int temporal = b;
            b = a % b;
            a = temporal;

        }
        return a;
    }

    public void simplificar() {
        int mcd = calcularMCD(numerador, denominador);
        numerador /= mcd;
        denominador /= mcd;
    }

    public Fraccion sumar(Fraccion frac) {
        int num2 = this.numerador * frac.denominador + this.denominador * frac.numerador;
        int den2 = this.denominador * frac.denominador;
        return (new Fraccion(num2, den2));
    }

    public Fraccion restar(Fraccion frac) {
        int num2 = this.numerador * frac.denominador - this.denominador * frac.numerador;
        int den2 = this.denominador * frac.denominador;
        return (new Fraccion(num2, den2));
    }

    /**
     * Una serie de impresiones para asegurar el correcto funcionamiento de la
     * función
     */
    public static void main(String[] args) throws Exception {
        Fraccion fraccion = new Fraccion(6, 8);
        System.out.println("El denominador de mi primera fracción es " + fraccion.getDenominador());
        System.out.println("El numerador de mi primera fracción es " + fraccion.getNumerador());
        System.out.println("Mi fracción como texto es " + fraccion.fraccionTexto());
        fraccion.setDenominador(0);
        fraccion.setDenominador(6);
        System.out.println("He cambiado el denominador de mi fracción y ahora es " + fraccion.getDenominador());
        Fraccion nuevaFraccion = new Fraccion();
        System.out.println("Mi nueva fracción, a la que no he añadido parámetros, es " + nuevaFraccion.fraccionTexto());
        Fraccion ultimaFraccion = new Fraccion(3);
        System.out.println("La última fracción que creo, a la que le paso solo el numerador 3, me devuelve "
                + ultimaFraccion.fraccionTexto());
        System.out.println(fraccion.sumar(new Fraccion(1, 2)).fraccionTexto());
    }
}
