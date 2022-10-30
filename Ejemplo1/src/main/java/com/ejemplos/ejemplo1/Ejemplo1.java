//paquete de datos --- son como las carpetas donde se guarda las clase
/*
para la encapsulación de las clases, se deben tener como prioridad
los paquetes, su respectiva importación si depende de otra carpeta
*/
package com.ejemplos.ejemplo1;

//la clase es la característica general o global de los objetos por crear
public class Ejemplo1 {
    /*
    public: es el acceso del método, también está el acceso private, protected
    método: es una acción que se ejecuta en tiempo real
    static: describe el comportamiento del método
    void: vacío -- no retorna ningún tipo de dato, o retorna vacío
    main: es el método principal 
    (String[] args) son los parámetros de dicho método
    */
    public static void main(String[] args) {
        //la forma de mostrar datos por consola
        System.out.println("Hello World!");
        System.out.println("Hola tripulantes");
        System.out.println("4:58pm");
    }
}
