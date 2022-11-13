package com.ejemplos.ejemplo14_poo;

import java.util.Scanner;

public class Ejemplo14_poo {
//calcular el perímetro y el área de figuras planas
    public static void main(String[] args) {
        System.out.println("Ejemplo de Abstraccion");
        
        Scanner lector = new Scanner(System.in);
        int dato;
        
        do{
            System.out.println("Presione 1: cuadrado, 2: circulo, 3: triangulo y 0: salir: ");
            dato = lector.nextInt();
            switch (dato){
                case 0:                    
                    System.out.println("Saliste del sistema con exito!");
                    break;                    
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
                    System.out.println("Ingrese la base del triangulo: ");
                    double base = lector.nextDouble();
                    System.out.println("Ingrese la altura del triangulo: ");
                    double altura = lector.nextDouble();
                    Triangulos tri1 = new Triangulos(altura, base);
                    System.out.println("El area del triangulo es " + tri1.getArea() + "u2");
                    System.out.println("El perimetro del triangulo no "
                            + "es posible calcularse con la base y la altura");
                    break;
                default:
                    System.out.println("No es una opcion valida!");                  
            }
        }while(dato != 0); 
    }
}
