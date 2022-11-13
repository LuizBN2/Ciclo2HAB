package com.ejemplos.ejemplo14_poo;

import java.util.Scanner;

public class Ejemplo14_poo {
//calcular el perímetro y el área de figuras planas
    public static void main(String[] args) {
        System.out.println("Ejemplo de Abstraccion");
        
        Scanner lector = new Scanner(System.in);
        int dato;
        
        do{
            System.out.println("Presione 1: cuadrado, 2: circulo, 3: salir: ");
            dato = lector.nextInt();
            switch (dato){
                case 1:
                    System.out.println("Ingrese el lado del cuadrado: ");
                    double lado = lector.nextDouble();
                    Cuadrados cuad1 = new Cuadrados(lado);
                    System.out.println("El area del cuadrado es " + cuad1.getArea() + "u2");
                    System.out.println("El perimetro del cuadrado es " + cuad1.getPerimetro() + "u");
                    break;
                case 2:
                    System.out.println("Ingrese el radio del circulo: ");
                    double radio = lector.nextDouble();
                    Circulos circ1 = new Circulos(radio);
                    System.out.println("El area del circulo es " + circ1.getArea() + "u2");
                    System.out.println("El perimetro del circulo es " + circ1.getPerimetro() + "u");
                    break;
                case 3:
                    System.out.println("Saliste del sistema con exito!");
                    break;
                default:
                    System.out.println("No es una opcion valida!");                  
            }
        }while(dato != 3); 
    }
}
