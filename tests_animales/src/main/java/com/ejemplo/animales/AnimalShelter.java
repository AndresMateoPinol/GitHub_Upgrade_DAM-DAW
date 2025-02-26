package com.ejemplo.animales;

import java.util.ArrayList;
import java.util.List;

public class AnimalShelter {
    // Aunque las veremos en el tema 9, me adelanto de cara a esta práctica por su utilidad:
    // List es una interfaz que define una colección ordenada de elementos.
    // ArrayList es una implementación de List que usa un array dinámico internamente.
    private List<Animal> animals;

    public AnimalShelter() {
        animals = new ArrayList<>(); // Creamos una lista vacía para almacenar los animales.
    }
    
    public void addAnimal(Animal animal) {
        animals.add(animal); // Agregamos un animal a la lista.
    }
    
    public List<String> getAllSounds() {
        List<String> sounds = new ArrayList<>();
        for (Animal animal : animals) {
            sounds.add(animal.makeSound()); // Guardamos el sonido de cada animal en la lista.
        }
        return sounds;
    }
}
