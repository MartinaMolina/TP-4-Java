package tp_4_java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("""
                               INGRESE LA OPCIÓN QUE DESEE:
                               1- Ingresar países con sus respectivas ciudades.
                               2- Multiplicación de matrices.
                               3- Suma de cada columna de una matriz.
                               4- Múltiples ejercicios con un menú.
                               5- 
                               0 - SALIR """);

            opcion = sc.nextInt();

            switch (opcion) {
                case 1 ->
                    Funciones.punto1();
                case 2 ->
                    Funciones.punto2();
                case 3 ->
                    Funciones.punto3();
                case 4 ->
                    Funciones.punto4();
                //case 5 ->
                    //Funciones.punto5();
            }
        } while (opcion != 0);

    }

}
