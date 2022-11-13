
package com.ejemplos.ejemplo15_poo;

public class Ejemplo15_poo {

    public static void main(String[] args) {
        System.out.println("Otro ejemplo de Polimorfismo");
        Personas persona1 = new Personas("Juliana", "Fem", 20, true);
        System.out.println(persona1.getDatos());
        System.out.println("");
        
        Personas persona2 = new Estudiantes("UdeA", "Ingenieria", "Melissa", "Fem", 26, false);
        System.out.println(persona2.getDatos());
        System.out.println("");
        
        Personas [] p = new Personas[]{persona1, persona2};
        //otra forma de mostrar los datos
        for (int i = 0; i < p.length; i++){
            System.out.println(p[i].getDatos());
        }
        
        System.out.println("Varificamos la enfermedad");
        for (int i = 0; i < p.length; i ++){
            if (p[i].isEnfermedad()){
                System.out.println(p[i].getNombre() + " por favor ve al medico.");
            }
            else{
                System.out.println(p[i].getNombre() + " muy bien que estes aliviada.");
            }
        }        
    }
}
