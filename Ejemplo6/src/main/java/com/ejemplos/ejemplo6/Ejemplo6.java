/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.ejemplos.ejemplo6;

/**
 *
 * @author luis_
 */

//ciclos
/*
ciclo for : for (incio; final; paso){
             }

ciclo while:   while (condición){
                incrementar la condición si es el caso
                }

ciclo do-while:    do{
                    lo que hará el ciclo
                    }while(condicion);


*/

//ciclo for
//incrementar un contador
public class Ejemplo6 {

    public static void main(String[] args) {
        int sumatoria = 0;
        for (int i = 0; i < 10; i=i+1){
            sumatoria = sumatoria + i;
            System.out.println("Repeticion #: " + i + " guarda el numero: " + (i+1));
        }
        System.out.println("La sumatoria es " + sumatoria);
    }
}

















