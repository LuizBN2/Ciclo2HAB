
package com.ejemplos.ejemplo11_reto;


public class Ejemplo11_reto {

    public static double[] reporte(double[] notas){
        double[] informe = new double[3];
        double suma = 0;
        double promedio = 0;
        double menor = notas[0];
        double mayor = notas[0];
        
        //en este ciclo vamos a calcular la suma, el menor y el mayor
        for ( int i = 0; i < notas.length; i++){
            //calcular la suma
            suma += notas[i];
            //menor
            if (notas[i] < menor){
                menor = notas[i];
            }
            //mayor
            if (notas[i] > mayor){
                mayor = notas[i];
            }           
        }
        promedio = suma / notas.length;
        
        informe[0] = promedio;
        informe[1] = menor;
        informe[2] = mayor;
        
        
        return informe; 
    }
    
    
    public static void main(String[] args) {
        System.out.println("Notas de Colegio");
        double[] listaNotas = {4.1, 4.8, 1.5, 2.3, 0.1, 0.9, 1.4, 1.8, 1.5, 3.0};
        double[] solucion = reporte(listaNotas);
        //mostrar el reporte de notas
        for (int i = 0; i < solucion.length; i++){
            System.out.print(solucion[i] + "\t");
        }
    }
}
