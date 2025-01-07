package examenQ1;

import java.util.Scanner;

public class ListaCompra {
    public static void main(String[] args) {
        /*
         * a. Lista de la compra
         * Crea un programa que permita gestionar tu lista de la compra. Vamos a suponer que hay cinco elementos en tu lista, de la compra, pero será el usuario quien introduzca sus valores. Debes seguir los siguientes pasos:
         * ▪ Pide al usuario que introduzca los 5 valores.
         * ▪ Muestra la lista: Mostrarás en color azul el inventario de productos actuales. El último producto lo mostrarás en rojo.
         * ▪ Termina: Deséale una feliz compra al usuario.
         * Seguramente te venga bien saber que el código ANSI para el rojo es el \u001B[31m y para el azul es el \u001B[34m.
         */
        Scanner entrada = new Scanner(System.in);
        String[] lista = new String[5];

        // Vamos a pedirle al usuario que introduzca los 5 valores.
        for (int i = 0; i<lista.length; i++){
            System.out.print("Introduce el producto nº"+(i+1)+": ");
            lista[i]=entrada.nextLine();
        }

        // Vamos a mostrarle al usuario la lista cambiando el color del último. 
        System.out.println("\nToma tu lista de la compra: ");
        for(int i = 0; i<lista.length; i++){
            if (i<lista.length-1){
                System.out.println("\u001B[34m"+lista[i]);
            }else{
                System.out.println("\u001B[31m"+lista[i]);
            }
        }
        System.out.println("\u001B[0m¡Feliz compra!");
        entrada.close();
    }
}
