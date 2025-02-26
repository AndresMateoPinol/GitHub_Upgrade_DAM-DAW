package com.ejemplo.animales;

import org.junit.jupiter.api.Test; // Importamos la anotación @Test para definir pruebas unitarias.
import static org.junit.jupiter.api.Assertions.*; // Importamos las Assertions para validar resultados.

public class DogTest {

    // Las pruebas unitarias se definen con métodos que tienen la anotación @Test.
    // Cada prueba ejecuta una parte del código y verifica si el resultado es el esperado.

    @Test
    public void testMakeSound() {
        Dog dog = new Dog("Firulais"); // Creamos un objeto Dog con el nombre "Firulais".
        
        // Comprobamos que el método makeSound() devuelve "Woof!".
        // assertEquals verifica que el valor esperado y el obtenido sean iguales.
        assertEquals("Woof!", dog.makeSound());
    }
    
    @Test
    public void testGetNombre() {
        Dog dog = new Dog("Rex"); // Creamos un objeto Dog con el nombre "Rex".
        
        // Verificamos que getNombre() devuelve el nombre correcto.
        assertEquals("Rex", dog.getNombre());
    }
}
