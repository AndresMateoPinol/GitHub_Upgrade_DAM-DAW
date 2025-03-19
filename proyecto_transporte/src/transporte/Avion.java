package transporte;

public final class Avion extends Vehiculo implements ConMotor {
    public Avion(int velocidadMaxima) {
        super(velocidadMaxima);
    }

    public void encenderMotor() {
        System.out.println("El motor del avión está encendido.");
    }

    public void describir() {
        System.out.println("Soy un avión que vuela a " + velocidadMaxima + " km/h.");
    }
}
