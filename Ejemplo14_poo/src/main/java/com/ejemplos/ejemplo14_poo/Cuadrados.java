package com.ejemplos.ejemplo14_poo;

public class Cuadrados extends Figuras {
    //atributos
    private double lado;
    
    //constructor
    public Cuadrados(double lado) {
        this.lado = lado;
    }
    //getters    
    public double getLado() {
        return lado;
    }
    //setters
    public void setLado(double lado) {
        this.lado = lado;
    }
    
    //métodos funcionales
    
    @Override
    public double getArea(){
        double a = lado*lado;
        return a;
    }
    
    @Override
    public double getPerimetro(){
        double p = 4*lado;
        return p;
    }
}
