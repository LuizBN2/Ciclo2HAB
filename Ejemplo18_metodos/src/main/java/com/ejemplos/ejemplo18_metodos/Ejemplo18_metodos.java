
package com.ejemplos.ejemplo18_metodos;

import java.util.Scanner;

public class Ejemplo18_metodos {

    public static void main(String[] args) {
        System.out.println("ejemplos de tipos de métodos");
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la persona: ");
        String nombre = lector.next();
        
        //funciones con retorno
        int edad = preguntarEdad();
        System.out.println(nombre + " tiene " + edad + " años.");
        int anho = calcularFecha(edad);
        
        
        //funciones sin retorno
        
        preguntarEstatura();
        //System.out.println(nombre + " mide " + estatura + " cm.");
        
        preguntarPeso(nombre);
        
        System.out.println(nombre + " nacio en " + anho);
        
        
    }
    
    public static int preguntarEdad (){
        Scanner lector2 = new Scanner(System.in);
        System.out.println("Ingrese la edad: ");
        int edad2 = lector2.nextInt();
        return edad2;
    }
    
    public static void preguntarEstatura(){
        Scanner lector3 = new Scanner(System.in);
        System.out.println("Ingrese la estatura: ");
        int estatura = lector3.nextInt();
        System.out.println(" mide " + estatura + " cm.");
    }
    
    public static void preguntarPeso(String nombre){
        Scanner lector4 = new Scanner(System.in);
        System.out.println("Ingrese el peso: ");
        int peso = lector4.nextInt();
        System.out.println(nombre + " pesa " + peso + " Kg.");
    }
    
    public static int calcularFecha(int edad){
        int fecha = 2022 - edad;
        return fecha;
    }
}
