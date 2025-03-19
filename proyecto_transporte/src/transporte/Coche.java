package transporte;

public class Coche extends Vehiculo implements ConMotor {
    public Coche(int velocidadMaxima) {
        super(velocidadMaxima);
    }

    public void encenderMotor() {
        System.out.println("El motor del coche está encendido.");
    }

    public void describir() {
        System.out.println("Soy un coche que puede alcanzar " + velocidadMaxima + " km/h.");
    }
}
