package com.ejemplo.animales;

public class Dog extends AbstractAnimal {

    public Dog(String nombre) {
        super(nombre);
    }
    
    @Override
    public String makeSound() {
        return "Woof!";
    }
}