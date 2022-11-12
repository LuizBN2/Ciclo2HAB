package com.ejemplos.ejemplo12_poo;

public class Ejemplo12_poo {
//tenemos las edades de un grupo de estudiantes, y vamos a hallar algunas varibles estadísticas, como la media
    
    //atributos
    private int[] edad;
    
    //constructor: Son los datos iniciales con los que empieza a trabajar mi proyecto
    //un constructor se llama EXACTAMENTE IGUAL que la clase del proyecto

    public Ejemplo12_poo(){
        int[] edades = new int[]{15, 16, 14, 13, 16, 12,
                                 12, 16, 15, 14, 13, 12,
                                 11, 16, 15, 14, 12, 13};
        this.edad = edades;
    }
    
    //getters: es un método que me permite obtener el valor de un atributo
    public int[] getEdad(){
        return edad;
    }
    //setters: es un método que me permite configurar o cambiar el valor de un atributo

    public void setEdad(int[] edad) {
        this.edad = edad;
    }
    
    //métodos funcionales
    public static double[] informe(int[] edad){
        //sumatoria de las edades
        double suma = 0;
        double media;
        double[] misDatos = new double[2];
        for (int i = 0; i < edad.length; i++){
            suma = suma + edad[i];
        }
        media = suma / edad.length;
        misDatos[0]=suma;
        misDatos[1]=media;
        return misDatos;
    }   
    
    
    
    //programa principal
    public static void main(String[] args) {
        //creo un nuevo objeto llamado misEdades de la clase Ejemplo12_poo
        Ejemplo12_poo misEdades = new Ejemplo12_poo();
        double[] datos = informe(misEdades.getEdad());
        System.out.println("Suma\tMedia");
        for (int i = 0; i < datos.length; i++){
            System.out.print(datos[i] + "\t");
        }       
    }
}
