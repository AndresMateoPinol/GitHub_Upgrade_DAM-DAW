package com.ejemplo.animales;

import java.util.List;
import java.util.ArrayList;

public class AnimalShelter {

    private List<Animal> animals;

    public AnimalShelter(){
        animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal){
        animals.add(animal); // We add "animal" to the list "animals"
    }

    public List<String> getAllSounds(){
        List<String> sounds = new ArrayList<>();
        for ( Animal animal : animals){
            sounds.add(animal.makeSound());
        }
        return sounds;
    }
}
