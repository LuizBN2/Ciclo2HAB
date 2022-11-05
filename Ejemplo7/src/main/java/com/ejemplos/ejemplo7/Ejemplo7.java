
package com.ejemplos.ejemplo7;
//arreglo unidimensional o vector
public class Ejemplo7 {

    public static void main(String[] args) {
        //declaración del arreglo
        int vector[] = new int [4];
        //llenar el vector
        for (int i = 0; i < vector.length; i++){
            vector[i] = i;
        }
        //mostrar el vector por pantalla
        for (int i = 0; i < vector.length; i++){
            System.out.print(vector[i] + "\t");
        }
    }
}
