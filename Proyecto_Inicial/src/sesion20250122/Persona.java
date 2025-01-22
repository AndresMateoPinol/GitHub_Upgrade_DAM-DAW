package sesion20250122;

/**
 * Clase que representa a una Persona con nombre y edad.
 * Demuestra el uso de la programación orientada a objetos en Java.
 * Incluye atributos, un constructor, métodos de acceso (getters y setters) 
 * y un método para mostrar información.
 * 
 * @author Nosotros
 * @version 1.0
 */
public class Persona {

    /**
     * El nombre de la persona.
     */
    private String nombre;

    /**
     * La edad de la persona.
     */
    private int edad;

    /**
     * Constructor de la clase Persona.
     * Permite inicializar el nombre y la edad de la persona.
     * 
     * @param nombre El nombre de la persona.
     * @param edad   La edad de la persona.
     */
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * Obtiene el nombre de la persona.
     * 
     * @return El nombre de la persona.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece un nuevo nombre para la persona.
     * 
     * @param nombre El nuevo nombre de la persona.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la edad de la persona.
     * 
     * @return La edad de la persona.
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Establece una nueva edad para la persona.
     * Si la edad es negativa, se muestra un mensaje de error.
     * 
     * @param edad La nueva edad de la persona (debe ser no negativa).
     */
    public void setEdad(int edad) {
        if (edad >= 0) { // Validación básica, podríamos completarlo más pero es para el ejemplo de la clase de hoy.
            this.edad = edad;
        } else {
            System.out.println("La edad no puede ser negativa.");
        }
    }

    /**
     * Muestra la información de la persona en la consola.
     * Incluye el nombre y la edad.
     */
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
    }

    /**
     * Método principal para probar la clase Persona.
     * 
     * @param args Argumentos de la línea de comandos (no se usan en este ejemplo, pero es lo que se pone por defecto).
     */
    public static void main(String[] args) {
        // Crear un objeto de la clase Persona
        Persona persona1 = new Persona("Juan", 25);

        // Usar los métodos de la clase
        persona1.mostrarInformacion();

        // Cambiar valores usando setters
        persona1.setNombre("Ana");
        persona1.setEdad(30);

        // Mostrar la información actualizada
        persona1.mostrarInformacion();
    }
}
