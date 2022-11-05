
package com.ejemplos.ejemplo10_reto;


public class Ejemplo10_reto {
    
    //creamos nuestro método reportes
    //tipo de acceso: public, private, protected
    //static
    //tipo de datos que retorna, en este caso retorna un array de tipo entero
    public static int[] reporte(int[] productos){  //dentro de paréntesis recibo el parámetro de trabajo
        //crear un array de 3 posiciones: total, menor precio, mayor precio
        int[] informe = new int[3];
        int suma = 0;
        int menor = productos[0];
        int mayor = productos[0];
        //cálculo del total de la compra
        for (int i = 0; i < productos.length; i++){
            suma = suma + productos[i];
        }
        //cálculo del producto con menor y mayor  precio
        for (int i = 0; i < productos.length; i++){
            //menor
            if (productos[i] < menor){
                menor = productos[i];
            }
            //mayor
            if (productos[i] > mayor){
                mayor = productos[i];
            }
        }
        
        
        
        informe[0] = suma;
        informe[1] = menor;
        informe[2] = mayor;
   
        
        return informe;
    }
    
    public static void main(String[] args) {
        System.out.println("Tienda de Barrio");
        int[] compra = {2700, 9500, 300, 15000, 
            1800, 10000, 400, 3000, 400}; 
        int[] totales = reporte(compra); //dentro de paréntesis le envío el argumento de trabajo
        
        for (int i = 0; i < totales.length; i++){
            System.out.print(totales[i] + "\t");
        }
        
        
    }
}
