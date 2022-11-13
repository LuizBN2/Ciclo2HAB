package com.ejemplos.ejemplo14_poo;

public class Circulos extends Figuras {
    //atributos
    private double radio;
    //constante pi
    double pi = 3.1416;
    
    //constructor
    public Circulos(double radio) {
        this.radio = radio;
    }
    
    //getters
    public double getRadio() {
        return radio;
    }
    //setters
    public void setRadio(double radio) {
        this.radio = radio;
    }    
    //métodos funcionales
    @Override
    public double getArea(){
        double a = pi*radio*radio;
        return a;
    }    
    @Override
    public double getPerimetro(){
        double p = 2*pi*radio;
        return p;
    }
    
    
}
