
package com.ejemplos.ejemplo19_reto2;

import static com.ejemplos.ejemplo19_reto2.Informes.tusResultados;
import java.util.ArrayList;
import java.util.Arrays;


public class Ejemplo19_reto2 {

    public static void main(String[] args) {
        ArrayList<Servicios> carrera = new ArrayList<>();
        carrera.add(new Servicios("Jairo Arroyave", "Envigado", "Medellin", 12000));
        carrera.add(new Servicios("David Gonzalez", "Bello", "Medellin", 8000));
        carrera.add(new Servicios("Laura Acuña", "Itagui", "Sabaneta", 7600));
        carrera.add(new Servicios("Valeria Yepes", "Bello", "Itagui", 22000));
        carrera.add(new Servicios("Sara Londoño", "Medellín", "Caldas", 21000));
        carrera.add(new Servicios("Fernando Quintero", "La Estrella", "Sabaneta", 6000));
        Object retorno[] = tusResultados(carrera);
        System.out.println("Servicios: " + retorno[0]);
        System.out.println("Total Rec: " + retorno[1]);
        System.out.println("Promedio: " + retorno[2]);
        System.out.println("Valor Mayor: " + retorno[3]);
        System.out.println("Ruta Mayor: " + retorno[4]);
        System.out.println("Valor Menor: " + retorno[5]);
        System.out.println("Ruta Menor: " + retorno[6]);
        
        System.out.println(Arrays.toString(retorno));

    }
}
