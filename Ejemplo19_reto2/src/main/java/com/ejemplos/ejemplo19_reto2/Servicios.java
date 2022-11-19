
package com.ejemplos.ejemplo19_reto2;

public class Servicios {
    //atributos
    private String nombreUsuario;
    private String rutaOrigen;
    private String rutaDestino;
    private double valorServicio;
    
    //constructor

    public Servicios(String nombreUsuario, String rutaOrigen, String rutaDestino, double valorServicio) {
        this.nombreUsuario = nombreUsuario;
        this.rutaOrigen = rutaOrigen;
        this.rutaDestino = rutaDestino;
        this.valorServicio = valorServicio;
    }
    
    //getters

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getRutaOrigen() {
        return rutaOrigen;
    }

    public String getRutaDestino() {
        return rutaDestino;
    }

    public double getValorServicio() {
        return valorServicio;
    }
    
    //setters

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setRutaOrigen(String rutaOrigen) {
        this.rutaOrigen = rutaOrigen;
    }

    public void setRutaDestino(String rutaDestino) {
        this.rutaDestino = rutaDestino;
    }

    public void setValorServicio(double valorServicio) {
        this.valorServicio = valorServicio;
    }
    
    
}
