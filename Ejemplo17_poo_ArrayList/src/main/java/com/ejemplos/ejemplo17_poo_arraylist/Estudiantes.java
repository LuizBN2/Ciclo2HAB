
package com.ejemplos.ejemplo17_poo_arraylist;

public class Estudiantes extends Personas {
    //atributos
    private String gradoEnCurso;
    private float promedio;
    
    //constructor
    public Estudiantes(String gradoEnCurso, float promedio, String nombre, String ciudadNacimiento, int edad) {
        super(nombre, ciudadNacimiento, edad);
        this.gradoEnCurso = gradoEnCurso;
        this.promedio = promedio;
    }
    
    //getters y setters
    public String getGradoEnCurso() {
        return gradoEnCurso;
    }

    public void setGradoEnCurso(String gradoEnCurso) {
        this.gradoEnCurso = gradoEnCurso;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }
    
    
    
}
