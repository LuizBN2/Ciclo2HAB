package com.ejemplos.ejemplo9;

import java.util.Scanner;


public class Ejemplo9 {

    public static void main(String[] args) {
        //creamos el scanner
        Scanner lector = new Scanner(System.in);
        
        int f;
        int c;
        System.out.println("Ingrese cuantas filas desea: ");
        f = lector.nextInt();
        System.out.println("Ingrese cuantas columnas desea: ");
        c = lector.nextInt();
        
        //declarar
        String letras[][];
        //instanciar
        letras = new String [f][c];
        
        System.out.println("");
        //llenar la matriz
        for (int fila = 0; fila < letras.length; fila++){
            for (int col = 0; col < letras[0].length; col++){
                System.out.print("Ingrese una letra: ");
                letras[fila][col] = lector.next();
            }
        }
        System.out.print("\nRespuesta\nMatriz\n");
        
        //mostrar la matriz
        for (int fila = 0; fila < letras.length; fila++){
            for (int col = 0; col < letras[0].length; col++){
                System.out.print(letras[fila][col] + "\t");                
            }
            System.out.print("\n");
        }
        
        
        //¿Cómo mostrar las letras de la diagonal principal de la matriz
        System.out.print("\n");
        
        if (f == c){
            System.out.print("Diagonal Principal\n");
            String diagonal[] = new String [f];        
            for (int fila = 0; fila < letras.length; fila++){
                for (int col = 0; col < letras[0].length; col++){
                    if (fila == col){
                        diagonal[fila] = letras[fila][col]; 
                        System.out.print(diagonal[fila] + "\t");
                    }
                }            
            }
        }else{
            System.out.println("La matriz no es cuadrada");
        }
        
        
        
        
    }
}
