
package com.ejemplos.ejemplo21_reto2;

import java.util.ArrayList;

public class Informes {
    
    public static int[] reportes(ArrayList<Clientes> tienda){
        //suma del total pagado
        int suma = 0;        
        for (int i = 0; i < tienda.size(); i++){
            suma += tienda.get(i).getTotalAPagar();
        }
                
        //cliente que menos pagó
        int menorPago = tienda.get(0).getTotalAPagar();        
        for (int i = 0; i < tienda.size(); i++){
            if (tienda.get(i).getTotalAPagar() < menorPago){
                menorPago = tienda.get(i).getTotalAPagar();                
            }
        }
        
        //cliente que más pagó
        int mayorPago = tienda.get(0).getTotalAPagar();        
        for (int i = 0; i < tienda.size(); i++){
            if (tienda.get(i).getTotalAPagar() > mayorPago){
                mayorPago = tienda.get(i).getTotalAPagar();                
            }
        }        
        
        //para el vpl
        int [] informe = new int[]{suma, menorPago, mayorPago};
        
        return informe;
    }
    
}
