package tp_4_java;

import java.util.Arrays;
import java.util.Scanner;

public class opcionesPunto4 {

    private static final Scanner sc = new Scanner(System.in);
    private static boolean matrizRellena = false;  // Variable global para verificar si la matriz está completa
    private static int[][] matriz;  // Declarar la matriz como global para usarla en todos los métodos

    public static void a(int x) {

        matriz = new int[x][x]; // Dimensiones de la matriz con el numero que proporcionó el usuario 

        System.out.println("Ingrese los valores para la matriz de tamaño [" + x + "][" + x + "]:");

        // Llenando la matriz...
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        // MOSTRANDO LA MATRIZ
        System.out.println("------------------------------------------------------");
        System.out.println("- MATRIZ -");

        for (int i = 0; i < matriz.length; i++) {
            System.out.println(Arrays.toString(matriz[i]));
        }

        matrizRellena = true; // Actualizamos la variable para indicar que la matriz está completa

        System.out.println();
    }

    public static void b(int x) {

        if (!matrizRellena) { // Validamos si la matriz esta completa, si no, la volvemos a rellenar

            System.out.println("No puede realizar operaciones sin antes rellenar la matriz!");
            System.out.println("Vamos a completarla...");
            a(x);

        } else {

            System.out.println("Elija una fila para sumarla (0 - " + (x - 1) + "): ");
            int fila = sc.nextInt();

            while (!(fila >= 0 && fila < x)) { // Validamos que elija una fila que se encuentre en la matriz                
                System.out.println("Inválido! Elija nuevamente una fila para sumarla (0 - " + (x - 1) + "): ");
                fila = sc.nextInt();
            }

            int sumaFila = 0;

            // SUMA DE LA FILA
            for (int i = 0; i < x; i++) {
                sumaFila += matriz[i][fila]; // Sumar el elemento de cada columna en la fila seleccionada
            }

            System.out.println("------------------------------------------------------");
            System.out.println("La suma de la columna " + fila + " es: " + sumaFila);
            System.out.println();
        }

    }

    public static void c(int x) {

        if (!matrizRellena) { // Validamos si la matriz esta completa, si no, la volvemos a rellenar

            System.out.println("No puede realizar operaciones sin antes rellenar la matriz!");
            System.out.println("Vamos a completarla...");
            a(x);

        } else {

            System.out.println("Elija una columna para sumarla (0 - " + (x - 1) + "): ");
            int columna = sc.nextInt();

            while (!(columna >= 0 && columna <= x)) { // Validamos que elija una columna que se encuentre en la matriz                
                System.out.println("Inválido! Elija nuevamente una columna para sumarla (0 - " + (x - 1) + "): ");
                columna = sc.nextInt();
            }

            int sumaColumna = 0;

            // SUMA DE LA COLUMNA
            for (int i = 0; i < x; i++) {
                sumaColumna += matriz[i][columna]; // Sumar el elemento de cada fila en la columna seleccionada
            }

            System.out.println("------------------------------------------------------");
            System.out.println("La suma de la columna " + columna + " es: " + sumaColumna);
            System.out.println();

        }
    }

    public static void d(int x) {

        if (!matrizRellena) { // Validamos si la matriz esta completa, si no, la volvemos a rellenar

            System.out.println("No puede realizar operaciones sin antes rellenar la matriz!");
            System.out.println("Vamos a completarla...");
            a(x);

        } else {

            int sumaDiagonal = 0;

            // SUMA DIAGONAL PRINCIPAL
            for (int i = 0; i < x; i++) {
                sumaDiagonal += matriz[i][i]; // Elemento en la posición [i][i]
            }

            System.out.println("La suma de la diagonal PRINCIPAL es: " + sumaDiagonal);

            System.out.println();

        }

    }

    public static void e(int x) {

        if (!matrizRellena) { // Validamos si la matriz esta completa, si no, la volvemos a rellenar

            System.out.println("No puede realizar operaciones sin antes rellenar la matriz!");
            System.out.println("Vamos a completarla...");
            a(x);

        } else {

            int sumaDiagonalInv = 0;

            // SUMA DIAGONAL PRINCIPAL
            for (int i = 0; i < x; i++) {
                sumaDiagonalInv += matriz[i][x - 1 - i];  
            }

            System.out.println("La suma de la diagonal INVERSA es: " + sumaDiagonalInv);

            System.out.println();

        }

    }

    public static void f(int x) {

        if (!matrizRellena) { // Validamos si la matriz esta completa, si no, la volvemos a rellenar

            System.out.println("No puede realizar operaciones sin antes rellenar la matriz!");
            System.out.println("Vamos a completarla...");
            a(x);

        } else {

            int suma = 0, contador = 0;
            double promedio;

            // CALCULO PROMEDIO
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < x; j++) {
                    suma += matriz[i][j];
                    contador ++;
                }
            }
            
            promedio = suma / contador;

            System.out.println("El promedio de todos los elementos de la matriz es: " + promedio);

            System.out.println();

        }
    }

}
