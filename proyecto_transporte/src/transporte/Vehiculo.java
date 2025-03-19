package transporte;

public abstract class Vehiculo {
    protected int velocidadMaxima;

    public Vehiculo(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public void arrancar() {
        System.out.println("El vehículo está en marcha.");
    }

    public abstract void describir();
}
