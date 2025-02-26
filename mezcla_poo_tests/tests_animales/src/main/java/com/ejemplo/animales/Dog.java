package com.ejemplo.animales;

public class Dog extends AbstractAnimal{

    public Dog(String name){
        super(name);
    } 

    @Override
    public String makeSound(){
        return "Woof!";
    }

}
