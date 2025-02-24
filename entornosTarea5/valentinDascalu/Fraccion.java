public class Fraccion {
    private int numerador;
    private int denominador;

    public Fraccion() {
        this(0, 1);
    }

    public Fraccion(int numerador, int denominador) {
        if (denominador == 0) {
            throw new IllegalArgumentException("El denominador no puede ser 0.");
        }
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public Fraccion(int numerador) {
        this(numerador, 1);
    }

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
        if (denominador == 0) {
            throw new IllegalArgumentException("El denominador no puede ser 0.");
        }
        this.denominador = denominador;
    }

    public String toString() {
        return numerador + "/" + denominador;
    }

    public static void main(String[] args) {
        Fraccion f1 = new Fraccion();
        Fraccion f2 = new Fraccion(3, 4);
        Fraccion f3 = new Fraccion(5);

        System.out.println("Fracción 1: " + f1);
        System.out.println("Fracción 2: " + f2);
        System.out.println("Fracción 3: " + f3);

        f1.setNumerador(7);
        f1.setDenominador(2);
        System.out.println("Fracción 1 modificada: " + f1);
    }
}
