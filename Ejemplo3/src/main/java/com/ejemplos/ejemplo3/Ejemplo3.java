/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.ejemplos.ejemplo3;
//las importaciones de librerías se ponen después de los paquetes
//esta librería me permite ingresar datos por consola
import java.util.Scanner;

/**
 *
 * @author luis_
 */

//ingresar datos por consola
//operaciones matemáticas
public class Ejemplo3 {

    public static void main(String[] args) {
        //tipo de variable <objeto> que se llama Scanner
        //Scanner sirve para ingresar datos por consola
        Scanner lector = new Scanner(System.in); //crear el objeto e instanciarlo
        System.out.println("Ingrese un numero: "); //envío un mensaje
        int num1 = lector.nextInt();
        //System.out.println("El numero que ingreso fue el " + num1);
        System.out.println("Ingrese otro numero: ");
        int num2 = lector.nextInt();
        //System.out.println("Los numeros que ingreso fueron " + num1 + " y " + num2);
        
        //resultados
        int suma;
        int resta;
        int multi;
        float div;
        //operaciones
        suma = num1 + num2;
        resta = num1 - num2;
        multi = num1*num2;
        
        div = (float)num1/num2;
        
        //mostrar los resultados
        System.out.println("El resultado de la suma es " + suma);
        System.out.println("El resultado de la resta es " + resta);
        System.out.println("El resultado de la multiplicacion es " + multi);
        System.out.println("El resultado de la division es " + div);
        
    }
}
