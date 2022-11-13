package com.ejemplos.ejemplo14_poo;

public class Ejemplo14_poo {
//calcular el perímetro y el área de figuras planas
    public static void main(String[] args) {
        System.out.println("Ejemplo de Abstracción");
        //creamos un objeto
        Cuadrados cuad1 = new Cuadrados(5);
        System.out.println("El area del cuadrado es " + cuad1.getArea() + "u2");
        System.out.println("El perimetro del cuadrado es " + cuad1.getPerimetro() + "u");
    }
}
