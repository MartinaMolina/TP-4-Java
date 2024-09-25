package tp_4_java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcion = 0;

        do {
            System.out.println("""
                               INGRESE LA OPCIÓN QUE DESEE:
                               1- Ingresar países con sus respectivas ciudades.
                               2- Multiplicación de matrices.
                               3- Suma de cada columna de una matriz.
                               4- Múltiples ejercicios con un menú.
                               5- Maquina de golosinas.
                               0 - SALIR """);

            // VALIDAR QUE LA OPCION INGRESADA SEA UN NUM (ENTRE 0 Y 5)
            boolean opcionValida = false;

            while (!opcionValida) {
                
                if (sc.hasNextInt()) { // Verificar si el valor ingresado es un entero
                    opcion = sc.nextInt();
                    if (opcion >= 0 && opcion <= 5) { // Verificar si el número está en el rango válido (0-5)
                        opcionValida = true; // Acá sale del bucle y continua con 
                    } else {
                        System.out.println("Opción inválida. Ingrese un número entre 0 y 5.");
                    }
                } else {
                    System.out.println("Opción inválida. Ingrese un número.");
                    sc.next(); 
                }
            }

            switch (opcion) {
                case 1 ->
                    Funciones.punto1();
                case 2 ->
                    Funciones.punto2();
                case 3 ->
                    Funciones.punto3();
                case 4 ->
                    Funciones.punto4();
                case 5 ->
                    Funciones.punto5();
            }
        } while (opcion != 0);

    }

}
