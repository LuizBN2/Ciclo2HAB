package com.ejemplos.ejemplo15_poo;

//clase padre
public class Personas {
    //atributos
    private String nombre;
    private String genero;
    private int edad;
    private boolean enfermedad;
    
    //constructor

    public Personas(String nombre, String genero, int edad, boolean enfermedad) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.enfermedad = enfermedad;
    }
    
    //getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(boolean enfermedad) {
        this.enfermedad = enfermedad;
    }
    
    //método funcional
    public String getDatos(){
        String texto = "Nombre:\t" + nombre + "\n" +
                       "Genero:\t" + genero + "\n" +
                       "Edad:\t" + edad + "\n" +
                       "Enfermo:" + enfermedad + "\n";
        return texto;
    }
    
}
