
package com.ejemplos.ejemplo16_arraylist;

import java.util.ArrayList;
import java.util.Scanner;


public class Ejemplo16_arrayList {

    public static void main(String[] args) {
        System.out.println("Ejemplo para conocer como funciona ArraList");
        ArrayList<Integer> numeros = new ArrayList<>();
        //adicionemos elementos al ArraList
        numeros.add(3);
        //get() pone el índice donde está guardada la información
        System.out.println("El elemento del arreglo es " + numeros.get(0));
        numeros.add(8);
        //tamaño del ArrayList
        System.out.println("El tamano del ArrayList es " + numeros.size());
        
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese un numero para el ArrayList");
        int num = lector.nextInt();
        numeros.add(num);
        System.out.println("El tamano del ArrayList es " + numeros.size());
                      
        numeros.add(16);
        numeros.add(11);
        numeros.add(-20);
        System.out.println("El tamano del ArrayList es " + numeros.size());
        
        //mostrar los elementos del ArrayList
        for (int i = 0; i < numeros.size(); i++){
            System.out.print(numeros.get(i) + " ");
        }
        System.out.println("");       
        //eliminar un elemento del arreglo
        numeros.remove(2);
        for (int i = 0; i < numeros.size(); i++){
            System.out.print(numeros.get(i) + " ");
        }
        System.out.println("El tamano del ArrayList es " + numeros.size());
        //borrar todo el ArrayList
        numeros.clear();
        System.out.println("\nAquí ya se muestra vacio.");     
        //el ciclo lo ponemos para evidenciar que el ArrayList ya no tiene nada
        for (int i = 0; i < numeros.size(); i++){
            System.out.print(numeros.get(i) + " ");
        }
        System.out.println("El tamano del ArrayList es " + numeros.size());
        
    }
}
