
package com.ejemplos.ejemplo17_poo_arraylist;
import java.util.ArrayList;

public class Ejemplo17_poo_ArrayList {

    public static void main(String[] args) {
        System.out.println("Ejemplo completo de ArrayList");
        /*Aquí estamos creando un objeto del tipo ArrayList, 
        en el cual habrán estudiantes
        */
        ArrayList<Estudiantes> grupo1;
        grupo1 = new ArrayList<>();
        
        //vamos a crear un grupo de estudiantes
        //declaramos
        Estudiantes e1;
        Estudiantes e2;
        Estudiantes e3;
        Estudiantes e4;
        //instanciamos los estudiantes
        e1 = new Estudiantes("9", 4.5f, "Juan", "Bucaramanga", 14);
        e2 = new Estudiantes("9", 4.7f, "Juana", "Ibague\t", 15);
        e3 = new Estudiantes("9", 4.2f, "Marcos", "Valledupar", 14);
        e4 = new Estudiantes("9", 4.8f, "Oscar", "Pereira\t", 16);
        
        grupo1.add(e1);
        grupo1.add(e2);
        grupo1.add(e3);
        grupo1.add(e4);
        
        //mostramos el tamaño del arreglo
        System.out.println("El grupo " + grupo1.get(0).getGradoEnCurso() + 
                " tiene " + grupo1.size() + " estudiantes participando.");
        System.out.println("");
        System.out.println("Nombre\tCiudad\t\tEdad\tGrado\tPromedio");
        //mostremos los elementos del arreglo
        for (int i = 0; i < grupo1.size(); i++){
            System.out.println(grupo1.get(i).getNombre() + "\t" +
                    grupo1.get(i).getCiudadNacimiento() + "\t" + 
                    grupo1.get(i).getEdad() + "\t" +
                    grupo1.get(i).getGradoEnCurso() + "\t" +
                    grupo1.get(i).getPromedio());
        }
    }
}
