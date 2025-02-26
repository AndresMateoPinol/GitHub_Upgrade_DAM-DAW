package com.ejemplo.animales;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class AnimalShelterTest {

    @Test
    public void testAddAndGetAllSounds() {
        AnimalShelter shelter = new AnimalShelter(); // Creamos un refugio de animales.
        
        shelter.addAnimal(new Dog("Buddy")); // Agregamos un perro.
        shelter.addAnimal(new Cat("Kitty")); // Agregamos un gato.
        
        // Obtenemos la lista de sonidos generados por los animales en el refugio.
        List<String> sounds = shelter.getAllSounds();

        // Comprobamos que la lista tiene exactamente 2 sonidos.
        assertEquals(2, sounds.size());

        // Verificamos que en la lista están los sonidos esperados.
        assertTrue(sounds.contains("Woof!")); // ¿Está el sonido del perro?
        assertTrue(sounds.contains("Meow!")); // ¿Está el sonido del gato?
    }
}
