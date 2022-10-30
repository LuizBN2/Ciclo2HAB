/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.ejemplos.ejemplo5;
import java.util.Scanner;
/**
 *
 * @author luis_
 */
//condicionales
//¿cuál es mayor de tres números?
public class Ejemplo5 {

    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;
        
        
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Ingrese un numero: ");
        num1 = lector.nextInt();
        System.out.println("Ingrese un numero: ");
        num2 = lector.nextInt();
        System.out.println("Ingrese un numero: ");
        num3 = lector.nextInt();
        
        int mayor = num1;
        
        //5, 10, 6
        
        if (num1 > num2){
            if (num1 > num3){
                mayor = num1;
            }
            else {
                mayor = num3;
            }
        }
        else if (num2 > num1){
            if (num2 > num3){
                mayor = num2;
            }
            else{
                mayor = num3;
            }
        }
        
        /*
        comparadores lógicos

                && y
                || o


                p	q	y

                v	v	v
                v	f	f
                f	v	f
                f	f	f	


                p	q	o

                v	v	v
                v	f	v
                f	v	v
                f	f	f
        */
        
        if (mayor==num1 && mayor==num2 && mayor==num3){
            System.out.println("Los numeros son iguales");
        }
        else{
            System.out.println("El numero mayor es " + mayor);
        }   
    }
}
