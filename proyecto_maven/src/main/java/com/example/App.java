package com.example;

import org.apache.commons.lang3.StringUtils; // Importamos la clase de Apache Commons Lang

public class App {
    public static void main(String[] args) {
        String mensaje = "Hello World!";
        // Convierte el mensaje a mayúsculas usando StringUtils
        String mensajeEnMayusculas = StringUtils.upperCase(mensaje);
        System.out.println(mensajeEnMayusculas);
    }
}
