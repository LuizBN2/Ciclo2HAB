
package com.ejemplos.ejemplo17_poo_arraylist;

public class Personas {
    //atributos
    private String nombre;
    private String ciudadNacimiento;
    private int edad;
    
    //constructor

    public Personas(String nombre, String ciudadNacimiento, int edad) {
        this.nombre = nombre;
        this.ciudadNacimiento = ciudadNacimiento;
        this.edad = edad;
    }
    
    //getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudadNacimiento() {
        return ciudadNacimiento;
    }

    public void setCiudadNacimiento(String ciudadNacimiento) {
        this.ciudadNacimiento = ciudadNacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
