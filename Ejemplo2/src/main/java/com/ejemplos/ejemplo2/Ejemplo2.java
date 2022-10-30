/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.ejemplos.ejemplo2;

/**
 *
 * @author luis_
 */
public class Ejemplo2 {

    public static void main(String[] args) {
        System.out.println("Ejemplo2");
        //comentario 1 línea
        /*
        comentarios de varias líneas
        */
        //tipos de variables
        //tipo <variable> = valor ;
        String nombre = "David";
        //si escribo sout y tab aparece solo el comando de imprimir por pantalla
        //para concatenar uso +
        System.out.println("Hola " + nombre);
        //int, String, float, double, bool
        int telefono = 123;
        System.out.println(nombre + " su numero de telefono es " + telefono);
        
        double estatura = 1.70;
        System.out.println("La estatura de " + nombre + " es " + estatura + "mts.");
        
        //boolean es true o false
        boolean ok = true;
        System.out.println(ok);
        
    }
}
