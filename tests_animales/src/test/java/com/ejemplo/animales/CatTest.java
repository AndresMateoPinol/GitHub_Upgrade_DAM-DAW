package com.ejemplo.animales;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CatTest {

    @Test
    public void testMakeSound() {
        Cat cat = new Cat("Mittens"); // Creamos un objeto Cat llamado "Mittens".
        
        // Verificamos que el sonido del gato sea "Meow!".
        assertEquals("Meow!", cat.makeSound());
    }
    
    @Test
    public void testGetNombre() {
        Cat cat = new Cat("Whiskers"); // Creamos un objeto Cat llamado "Whiskers".
        
        // Verificamos que getNombre() devuelva el nombre correcto.
        assertEquals("Whiskers", cat.getNombre());
    }
}
