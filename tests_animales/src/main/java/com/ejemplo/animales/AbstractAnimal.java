package com.ejemplo.animales;

public abstract class AbstractAnimal implements Animal {
    protected String nombre;
    
    public AbstractAnimal(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }
}