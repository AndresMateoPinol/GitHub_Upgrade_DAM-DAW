package com.ejemplo.animales;

public class Cat extends AbstractAnimal {
    
    public Cat(String name){
        super(name);
    }

    @Override
    public String makeSound(){
        return "Meow!";
    }

}
