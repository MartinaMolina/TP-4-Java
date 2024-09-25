package tp_4_java;

import java.util.Arrays;
import java.util.Scanner;

public class Funciones {

    private static final Scanner sc = new Scanner(System.in);

    public static void punto1() {

        String[][] pais_ciudad = new String[4][4];

        System.out.println();
        System.out.println("Introduzca 4 paises y asígnele 3 ciudades a cada pais");
        System.out.println();

        // BUCLE PARA INGRESAR 4 PAISES
        for (int i = 0; i < 4; i++) {

            String pais;

            // Validar que "país" sea una palabra correcta (solo letras y espacios)
            while (true) {

                System.out.print("Ingrese el " + (i + 1) + "° país: ");
                pais = sc.nextLine();

                boolean paisValido = true;

                // Recorremos la palabra para verificar que solo tenga letras y espacios
                for (int j = 0; j < pais.length(); j++) {

                    char c = pais.charAt(j);

                    if (!(Character.isLetter(c) || c == ' ')) { // Si no es letra ni espacio, no es válido
                        // Método que comprueba que el carácter pasado como parámetro es una letra. 
                        // Si es una letra devuelve true, si no devuelve false.
                        paisValido = false;
                        break;
                    }
                }

                if (paisValido && !pais.isEmpty()) { // Si es válido y no está vacío, lo guardamos
                    pais_ciudad[i][0] = pais;
                    break;
                } else {
                    System.out.println("Inválido!. Intente nuevamente");
                }
            }

            // BUCLE PARA INGRESAR 3 CIUDADES
            for (int j = 1; j < 4; j++) {

                String ciudad;

                // Validar que "ciudad" sea una palabra correcta 
                while (true) {

                    System.out.println("Ciudad n° " + j + " para " + pais_ciudad[i][0] + ": ");
                    ciudad = sc.nextLine();

                    boolean ciudadValida = true;

                    for (int k = 0; k < ciudad.length(); k++) {

                        char c = ciudad.charAt(k);

                        if (!(Character.isLetter(c) || c == ' ')) {
                            ciudadValida = false;
                            break;
                        }
                    }

                    if (ciudadValida && !ciudad.isEmpty()) {
                        pais_ciudad[i][j] = ciudad;
                        break;
                    } else {
                        System.out.println("Inválido!. Intente nuevamente");
                    }
                }
            }
            System.out.println("------------------------------------------------------");
        }

        //MOSTRANDO LOS RESULTADOS
        System.out.println("- RESULTADOS -");
        System.out.println();

        for (int i = 0; i < 4; i++) {

            System.out.print("País: " + pais_ciudad[i][0] + " - Ciudades: ");

            for (int j = 1; j < 4; j++) {
                if (j < 3) {
                    System.out.print(pais_ciudad[i][j] + ", ");
                } else {
                    System.out.print(pais_ciudad[i][j]);
                }
            }

            System.out.println();
        }
        System.out.println();
    }

    public static void punto2() {

        System.out.println();
        System.out.println("CREE Y LLENE 2 MATRICES: ");

        System.out.println("Ingrese un numero entero (num de filas para la matriz 1 y columnas para la matriz 2): ");
        int x = sc.nextInt();

        System.out.println("Ingrese un numero entero (num de columnas para la matriz 1 y filas para la matriz 2): ");
        int y = sc.nextInt();

        // ------------------------------------------------------------------------------------------------------------
        int[][] matriz1 = new int[x][y];

        System.out.println("Ingrese los valores para la matriz 1 de tamaño [" + x + "][" + y + "]:");

        // Llenando la matriz 1...
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz1[i][j] = sc.nextInt();
            }
        }

        // ------------------------------------------------------------------------------------------------------------
        int[][] matriz2 = new int[y][x];

        System.out.println("Ingrese los valores para la matriz 2 de tamaño [" + y + "][" + x + "]:");

        // Llenando la matriz 2...
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz2[i][j] = sc.nextInt();
            }
        }

        // ------------------------------------------------------------------------------------------------------------
        int[][] matriz3 = new int[x][y];

        // MULTIPLICACIÓN 
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                matriz3[i][j] += matriz1[i][j] * matriz2[j][i];
            }
        }

        // MOSTRANDO LAS MATRICES
        System.out.println("------------------------------------------------------");
        System.out.println("- MATRIZ 1 -");

        for (int i = 0; i < matriz1.length; i++) {
            System.out.println(Arrays.toString(matriz1[i]));
        }

        System.out.println("------------------------------------------------------");
        System.out.println("- MATRIZ 2 -");

        for (int i = 0; i < matriz2.length; i++) {
            System.out.println(Arrays.toString(matriz2[i]));
        }

        System.out.println("------------------------------------------------------");
        System.out.println("- MATRIZ 3 (MULTIPLICACIÓN) -");

        for (int i = 0; i < matriz3.length; i++) {
            System.out.println(Arrays.toString(matriz3[i]));
        }
        System.out.println();
    }

    public static void punto3() {

        System.out.println("Ingrese un numero entero (>= 3 y <= 10): ");
        int x = sc.nextInt();

        while (!(x >= 3 && x <= 10)) {

            System.out.println("Inválido. Ingrese nuevamente un numero entero (entre 3 y 10): ");
            x = sc.nextInt();

        }

        int[][] matriz = new int[x][x];

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

        int[] arreglo = new int[x];

        // SUMA DE CADA COLUMNA DE LA MATRIZ
        for (int j = 0; j < x; j++) {
            int suma = 0; // Reiniciar la suma para cada columna
            for (int i = 0; i < x; i++) {
                suma += matriz[i][j];
            }
            arreglo[j] = suma; // Asignar la suma de la columna en la posición correcta del arreglo.
        }

        System.out.println("------------------------------------------------------");
        System.out.println("A continuación, se muestra la suma de cada columna de la matriz: ");

        for (int j = 0; j < x; j++) {
            System.out.println("Suma columna " + j + " : " + arreglo[j]);
        }

        System.out.println();
        System.out.println("El arreglo quedaría: ");
        System.out.println(Arrays.toString(arreglo));

        System.out.println("------------------------------------------------------");
        System.out.println("Ahora, sumamos todos los numeros del arreglo: ");

        int suma = 0;

        // SUMA DE LOS NUMEROS DEL ARREGLO
        for (int i = 0; i < arreglo.length; i++) {
            suma += arreglo[i];
        }

        System.out.println("TOTAL: " + suma);
        System.out.println();
    }

    public static void punto4() {

        System.out.println("Ingrese un numero entero (>= 4 y <= 10): ");
        int x = sc.nextInt();

        while (!(x >= 4 && x <= 10)) {

            System.out.println("Inválido. Ingrese nuevamente un numero entero (entre 4 y 10): ");
            x = sc.nextInt();

        }

        // MENÚ
        System.out.println("------------------------------------------------------");

        char opcion;

        do {
            System.out.println("- MENÚ -");
            System.out.println("""
                           Elija la opción que desee:
                           
                           a) Completar la matriz con números.
                           b) Sumar una fila.
                           c) Sumar una columna.
                           d) Sumar la diagonal principal.
                           e) Sumar la diagonal inversa.
                           f) La media de todos los valores de la matriz.
                           g) SALIR
                           """);

            opcion = sc.next().charAt(0);

            while (!Character.isLetter(opcion)) {
                System.out.println("Error! Elija una opcion (a-g)");
                opcion = sc.next().charAt(0);
            }

            switch (opcion) {
                case 'a' -> {
                    opcionesPunto4.a(x);
                }
                case 'b' -> {
                    opcionesPunto4.b(x);
                }
                case 'c' -> {
                    opcionesPunto4.c(x);
                }
                case 'd' -> {
                    opcionesPunto4.d(x);
                }
                case 'e' -> {
                    opcionesPunto4.e(x);
                }
                case 'f' -> {
                    opcionesPunto4.f(x);
                }
            }
        } while (opcion != 'g');

    }

    public static double totalVentas = 0; // Variable estática para mantener el total de ventas (PUNTO 5)

    public static void punto5() {

        String[][] golosinas = {
            {"KitKat", "32", "10"},
            {"Chicles", "2", "50"},
            {"Caramelos de Menta", "2", "50"},
            {"Huevo Kinder", "25", "10"},
            {"Chetoos", "30", "10"},
            {"Twix", "26", "10"},
            {"M&M'S", "35", "10"},
            {"Papas Lays", "40", "20"},
            {"Milkybar", "30", "10"},
            {"Alfajor Tofi", "20", "15"},
            {"Lata Coca", "50", "20"},
            {"Chitos", "45", "10"}
        };

        // MOSTRAR LA MATRIZ GOLOSINAS
        System.out.println("----- GOLOSINAS DISPONIBLES -----");

        for (int i = 0; i < golosinas.length; i++) {
            System.out.println("GOLOSINA: " + golosinas[i][0] + " | PRECIO: $" + golosinas[i][1] + " | STOCK: " + golosinas[i][2]);
        }

        // MENÚ
        System.out.println("------------------------------------------------------");

        char opcion;
        boolean salir = false;

        do {
            System.out.println("- MENÚ -");
            System.out.println("""
                           Elija la opción que desee:
                           
                           a) Comprar golosina.
                           b) Mostrar stock de golosinas.
                           c) Rellenar golosinas.
                           d) Apagar maquina.
                           """);

            opcion = sc.next().charAt(0);

            while (!Character.isLetter(opcion)) {
                System.out.println("Error! Elija una opcion (a-g)");
                opcion = sc.next().charAt(0);
            }

            switch (opcion) {
                case 'a' -> {
                    MaquinaExpendedora.a(golosinas);
                }
                case 'b' -> {
                    MaquinaExpendedora.b(golosinas);
                }
                case 'c' -> {
                    MaquinaExpendedora.c(golosinas);
                }
                case 'd' -> {
                    MaquinaExpendedora.d();
                    salir = true; // Acá sale del menu de opciones
                }
            }
        } while (!salir);

    }

}
