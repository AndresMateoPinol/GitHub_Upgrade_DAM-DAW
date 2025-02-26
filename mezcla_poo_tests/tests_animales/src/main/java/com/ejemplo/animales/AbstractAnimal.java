package com.ejemplo.animales;

public abstract class AbstractAnimal implements Animal {

    protected String name;

    public AbstractAnimal(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }
}
