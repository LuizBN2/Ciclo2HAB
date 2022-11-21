
package com.ejemplos.ejemplo21_reto2;

import static com.ejemplos.ejemplo21_reto2.Informes.reportes;
import java.util.ArrayList;
import java.util.Arrays;


public class Ejemplo21_reto2 {

    public static void main(String[] args) {
        System.out.println("Ejemplo Tienda");
        ArrayList<Clientes> cli = new ArrayList<>();
        cli.add(new Clientes("Melissa", "1234", 70000, "20/11/22", "C001"));
        cli.add(new Clientes("Carlos", "7896", 20000, "21/10/22", "C002"));
        cli.add(new Clientes("Daniela", "5656", 90000, "20/11/22", "C003"));
        cli.add(new Clientes("Sebastian", "8888", 57000, "21/10/22", "C004"));
        cli.add(new Clientes("Tatiana", "2323", 15000, "20/11/22", "C005"));
        int peticion [] = reportes(cli);
        
        
        System.out.println(Arrays.toString(peticion));
    }
}
