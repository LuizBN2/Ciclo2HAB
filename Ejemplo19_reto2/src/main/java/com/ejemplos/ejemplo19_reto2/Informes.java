
package com.ejemplos.ejemplo19_reto2;

import java.util.ArrayList;


public class Informes {
    //métodos para hacer el informe
    public static Object[] tusResultados(ArrayList<Servicios> datos){
        //cantidad de servicios
        int cantidadServicios;
        cantidadServicios = datos.size();  //si fuera arreglo normal sería datos.lenght
        
        //valor total recuadado en el turno
        double suma = 0;
        for (int i = 0; i < datos.size(); i++){
            suma = suma + datos.get(i).getValorServicio();
        }
        
        //promedio de los servicios
        double promedio;
        promedio = suma / cantidadServicios;
        
        //servicio mejor pago
        double mayorPago = 0;
        String mayorRuta = "";        
        for (int i = 0; i < datos.size(); i++){
            if ( datos.get(i).getValorServicio() > mayorPago ){
                mayorPago = datos.get(i).getValorServicio();
                mayorRuta = datos.get(i).getRutaOrigen() +
                        "  " + datos.get(i).getRutaDestino();
            }
        }
        
        //servicio peor pago
        double menorPago = datos.get(0).getValorServicio();
        String menorRuta = datos.get(0).getRutaOrigen() +
                " - " + datos.get(0).getRutaDestino();
        for ( int i = 0; i < datos.size(); i++){
            if (datos.get(i).getValorServicio() < menorPago){
                menorPago = datos.get(i).getValorServicio();
                menorRuta = datos.get(i).getRutaOrigen() +
                " - " + datos.get(i).getRutaDestino();
            }
        }
        
        
        
        
        
        
        
        
        
        //objeto a retornar
        Object[] info = {cantidadServicios, suma, promedio,
                            mayorPago, mayorRuta,
                            menorPago, menorRuta};
        
        return info;
    }
}
