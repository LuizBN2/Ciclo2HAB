
package com.ejemplos.ejemplo20_reto2;

import java.util.ArrayList;

public class Solution {
    //método
    public static Object[] reportes(ArrayList<Cliente> tienda){
        //promedio del total pagado
        double suma = 0;
        double promedio = 0;
        for (int i = 0; i < tienda.size(); i++){
            suma += tienda.get(i).getTotalAPagar();
        }
        promedio = suma / tienda.size();
        
        //cliente que menos pagó
        int menorPago = tienda.get(0).getTotalAPagar();
        String nombreMenor = tienda.get(0).getNombreCompleto();
        for (int i = 0; i < tienda.size(); i++){
            if (tienda.get(i).getTotalAPagar() < menorPago){
                menorPago = tienda.get(i).getTotalAPagar();
                nombreMenor = tienda.get(i).getNombreCompleto();
            }
        }
        
        //cliente que más pagó
        int mayorPago = tienda.get(0).getTotalAPagar();
        String nombreMayor = tienda.get(0).getNombreCompleto();
        for (int i = 0; i < tienda.size(); i++){
            if (tienda.get(i).getTotalAPagar() > mayorPago){
                mayorPago = tienda.get(i).getTotalAPagar();
                nombreMayor = tienda.get(i).getNombreCompleto();
            }
        }
        
        /*
        //contar el número de hombres y mujeres
        int contM = 0;
        int contF = 0;
        for (int i = 0; i < tienda.size(); i++){
            if ("M".equals(tienda.get(i).getGeneroCliente())){
                contM += 1;
            }
            else {
                contF += 1;
            }
        }
        double pagoM = 0;
        double pagoF = 0;
        //total pagos de hombres y total de compras de mujeres
        for (int i = 0; i < tienda.size(); i++){
            if ("M".equals(tienda.get(i).getGeneroCliente())){
                pagoM += tienda.get(i).getTotalAPagar();
            }
            else {
                pagoF += tienda.get(i).getTotalAPagar();
            }
        }
        
        //creamos el arreglo de objetos para poder retornar
        Object [] informe = new Object[]{promedio,nombreMenor, menorPago, nombreMayor, 
          mayorPago, contM, contF, pagoM, pagoF};
*/        

        //para el vpl
        Object [] informe = new Object[]{promedio,nombreMenor, menorPago, nombreMayor, 
            mayorPago};
        
        return informe;
    }
    
}
