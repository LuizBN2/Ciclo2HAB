package com.ejemplos.ejemplo14_poo;

public class Triangulos extends Figuras {
    //atributos
    private double altura;
    private double base;
    
    //constructor
    public Triangulos(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }
    
    //getters y setters
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
    
    //métodos funcionales
    @Override
    public double getArea(){
        double a = altura*base/2;
        return a;
    }
    
    @Override
    public double getPerimetro(){
        return 0;
    }  
    
}
