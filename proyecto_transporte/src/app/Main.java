package app;

import transporte.*;

public class Main {
    public static void main(String[] args) {
        Coche miCoche = new Coche(180);
        Bicicleta miBici = new Bicicleta(30);
        Barco miBarco = new Barco(50);
        Avion miAvion = new Avion(900);

        miCoche.arrancar();
        miCoche.encenderMotor();
        miCoche.describir();

        miBici.arrancar();
        miBici.usarFuerzaHumana();
        miBici.describir();

        miBarco.arrancar();
        miBarco.encenderMotor();
        miBarco.describir();

        miAvion.arrancar();
        miAvion.encenderMotor();
        miAvion.describir();
    }
}
