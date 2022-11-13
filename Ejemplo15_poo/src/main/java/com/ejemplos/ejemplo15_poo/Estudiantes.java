
package com.ejemplos.ejemplo15_poo;
//clase hija de Personas
public class Estudiantes extends Personas {
    //atributos
    private String universidad;
    private String carrera;
    
    //constructor

    public Estudiantes(String universidad, String carrera, String nombre, String genero, int edad, boolean enfermedad) {
        super(nombre, genero, edad, enfermedad);
        this.universidad = universidad;
        this.carrera = carrera;
    }
    
    //getters y setters

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    @Override
    public String getDatos(){
        String texto = super.getDatos() +
                       "Universidad: " + universidad + "\n" +
                       "Carrera:\t" + carrera;
        return texto;
    }
    
    
}
