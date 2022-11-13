package com.ejemplos.ejemplo13_poo;

public class Ejemplo13_poo {
//vamos a diseñar un proyecto a partir de herencias, que tenga a una persona
//como clase padre, y a un estudiante como clase hija
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Juan","Restrepo",13);
        e1.mostrarDatos();
        Persona p1 = new Persona("Maria", "Jimenez",35);
        p1.mostrarDatos();
    }
}
