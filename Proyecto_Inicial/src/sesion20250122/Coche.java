package sesion20250122;

public class Coche {
    
    // Lo primero que solemos hacer es declarar qué atributos va a usar nuestra clase.
    private String marca;
    private String modelo;
    private int velocidad;

    // Ahora voy a crear el CONSTRUCTOR de la clase. ESTO es lo que de verdad me permite crear objetos.

    public Coche(String marca, String modelo) { // Vamos a suponer que por defecto un coche está quieto. 
        this.marca = marca;
        this.modelo = modelo; 
        this.velocidad = 0;
    }

    // Los getters nos ayudan a obtener 
    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public int getVelocidad(){
        return velocidad;
    }

    // Setters, ayudan a modificar el valor en memoria de los atributos de un objeto.
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setVelocidad(int velocidad){
        if(velocidad>0){ 
            this.velocidad = velocidad;
        } else {
            System.out.println("La velocidad no puede ser negativa.");
        } 
    }

    public void acelerar(int incremento){
        if(incremento>0){
            velocidad += incremento;
            System.out.println("El coche ahora va más rápido. Su velocidad actual es de "+velocidad+ "km/h.");
        } else {
            System.out.println("El incremento debe ser positivo, por lo que no ha cambiado la velocidad al intentar acelerar.");
        }
    }

    /**
     * Reduce la velocidad del coche en una cantidad específica
     * 
     * @param decremento La cantidad de km/h a reducir (debe ser un número positivo)
     */
    public void frenar(int decremento){
        if(decremento>0 && velocidad - decremento >= 0){
            velocidad -= decremento;
            System.out.println("El coche ahora va más lento, su velocidad actual es de "+velocidad+"km/h.");
        } else if(decremento>0){
            System.out.println("La velocidad no puede quedar en números negativos.");
        } else {
            System.out.println("El decremento debe ser un número positivo, por lo que no ha cambiado la velocidad al intentar frenar.");
        }
    }

    public static void main(String[] args) {
        // Crearemos un coche de ejemplo.
        Coche miCoche = new Coche("KIA", "Ceed");

        System.out.println("Mi coche es un "+miCoche.getMarca()+" "+miCoche.getModelo() +" que ahora va a "+miCoche.getVelocidad()+"km/h." );
        miCoche.setVelocidad(100);
        System.out.println("Mi coche va a "+miCoche.getVelocidad()+"km/h.");
        miCoche.frenar(40);
    }
}
