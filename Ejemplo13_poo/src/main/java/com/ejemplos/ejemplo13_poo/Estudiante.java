package com.ejemplos.ejemplo13_poo;

public class Estudiante extends Persona {
    //atributos
    private int grado;
    private double promedio;
    //los demás atributos los hereda de la clase Persona
    
    //constructor

    public Estudiante(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.grado = 7;
        this.promedio = 4.5;
    }
    
    //getters y setters

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

//crear un método funcional
    @Override
    public void mostrarDatos(){
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: " + getApellido());
        System.out.println("Edad: " + getEdad());
        System.out.println("Grado: " + getGrado());
        System.out.println("Promedio: " + getPromedio());
    }
    
}
