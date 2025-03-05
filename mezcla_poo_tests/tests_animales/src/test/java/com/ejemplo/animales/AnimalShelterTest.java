package com.ejemplo.animales;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class AnimalShelterTest {
    @Test
    public void testAddAndGetAllSounds(){
        AnimalShelter shelter = new AnimalShelter();

        shelter.addAnimal(new Cat("Karen"));
        shelter.addAnimal(new Dog("Ken"));

        List<String> sounds = shelter.getAllSounds();
        
        assertEquals(2, sounds.size());

        assertTrue(sounds.contains("Woof!"));
        assertTrue(sounds.contains("Meow!"));
        assertFalse(sounds.contains("Glup!"));

    }
}
