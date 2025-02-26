package com.ejemplo.animales;

public class Cat extends AbstractAnimal {

    public Cat(String nombre) {
        super(nombre);
    }
    
    @Override
    public String makeSound() {
        return "Meow!";
    }
}