
package com.ejemplos.ejemplo20_reto2;
import java.util.ArrayList;
import java.util.Arrays;
import static com.ejemplos.ejemplo20_reto2.Solution.reportes;


public class Ejemplo20_reto2 {

    public static void main(String[] args) {
        System.out.println("Ejemplo Tienda");
        ArrayList<Cliente> cli = new ArrayList<>();
        cli.add(new Cliente("Melissa", "1234", 70000, "20/11/22", "C001", "F" ));
        cli.add(new Cliente("Carlos", "7896", 20000, "21/10/22", "C002", "M" ));
        cli.add(new Cliente("Daniela", "5656", 90000, "20/11/22", "C003", "F" ));
        cli.add(new Cliente("Sebastian", "8888", 57000, "21/10/22", "C004", "M" ));
        cli.add(new Cliente("Tatiana", "2323", 15000, "20/11/22", "C005", "F" ));
        Object peticion [] = reportes(cli);
        
        
        System.out.println(Arrays.toString(peticion));
        
        
        
        
    }
}
