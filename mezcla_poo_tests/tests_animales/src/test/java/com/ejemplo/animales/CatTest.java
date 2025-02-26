package com.ejemplo.animales;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CatTest {
    @Test
    public void testMakeSound(){
        Cat cat = new Cat("Mr. Mittens");
        assertEquals("Meow!", cat.makeSound());
    }
    @Test 
    public void testGetName(){
        Cat cat = new Cat("Mr. Mittens");
        assertEquals("Mr. Mittens", cat.getName());
    }

}
