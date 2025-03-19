package transporte;

public class Barco extends Vehiculo implements ConMotor {
    public Barco(int velocidadMaxima) {
        super(velocidadMaxima);
    }

    public void encenderMotor() {
        System.out.println("El motor del barco está encendido.");
    }

    public void describir() {
        System.out.println("Soy un barco que navega a " + velocidadMaxima + " km/h.");
    }
}
