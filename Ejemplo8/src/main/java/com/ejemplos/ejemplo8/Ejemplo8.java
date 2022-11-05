
package com.ejemplos.ejemplo8;

//matriz o vector bidimensional
public class Ejemplo8 {

    public static void main(String[] args) {
        //declaración
        int matriz[][] = new int [20][6];
        //modificador con contador
        int contador = 0;
        //llenar la matriz
        for (int i = 0; i < matriz.length; i++){ //recorre las filas
            for (int j = 0; j < matriz[0].length; j++){ // recorre las columnas
                //llenar con el número 1
                matriz[i][j] = contador;
                contador++;
            }            
        }        
        //mostrar la matriz
        for (int i = 0; i < matriz.length; i++){ //recorre las filas
            for (int j = 0; j < matriz[0].length; j++){ // recorre las columnas
                System.out.print(matriz[i][j] + "\t\t");                
            }  
            System.out.print("\n\n");
            /*secuencia de escape: son comandos que permiten que mientras
            se muestra información en la consola, actúen como comandos del
            computador, por ejemplo \n me deja un renglón, \t aplica una
            tabulación
            
            */
        }
    }
}
