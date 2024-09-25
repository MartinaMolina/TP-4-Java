package tp_4_java;

import java.util.Scanner;

public class MaquinaExpendedora {

    private static final Scanner sc = new Scanner(System.in);

    public static void a(String[][] golosinas) {

        System.out.println("Ingrese la golosina que desea comprar (0-11): ");
        int fila = sc.nextInt();

        while (!(fila >= 0 && fila < golosinas.length)) {
            System.out.println("Opción inválida. Ingrese nuevamente la golosina que desea comprar (0-11): ");
            fila = sc.nextInt();
        }

        int stock = Integer.parseInt(golosinas[fila][2]); // Parseamos/pasamos el string "stock" a entero

        if (stock > 0) {

            double precio = Double.parseDouble(golosinas[fila][1]); // Parseamos/pasamos el string "precio" a entero

            Funciones.totalVentas += precio; // Lo usamos despues

            stock--; // Restamos una unidad de la golosina del stock

            golosinas[fila][2] = String.valueOf(stock);
            // Volvemos a parsear/pasar el stock de entero a string para que se pueda guardar en la matriz

            System.out.println("Usted ha comprado: " + golosinas[fila][0]);

        } else {
            System.out.println("Lo sentimos, el stock de " + golosinas[fila][0] + " ha sido agotado. Intente con otra golosina");

        }
        System.out.println();
    }

    public static void b(String[][] golosinas) {

        System.out.println("----- GOLOSINAS DISPONIBLES -----");

        for (int i = 0; i < golosinas.length; i++) {
            System.out.println("GOLOSINA: " + golosinas[i][0] + " | PRECIO: $" + golosinas[i][1] + " | STOCK: " + golosinas[i][2]);
        }
        System.out.println();
    }

    public static void c(String[][] golosinas) {

        sc.nextLine(); // Para "limpiar" lo que se arrastra del metodo anterior

        System.out.println("Para poder recargar la maquina debe introducir la contraseña: ");
        String contraseña = sc.nextLine();

        String contraseñaCorrecta = "AdminXYZ";

        while (!(contraseña.equals(contraseñaCorrecta))) {
            System.out.println("Incorrecto! Introduzca nuevamente la contraseña: ");
            contraseña = sc.nextLine();
        }

        b(golosinas); // MOSTRAMOS EL STOCK DE GOLOSINAS (LA MATRIZ)
        System.out.println("------------------------------------------------------------------------");

        System.out.println("Elija la golosina que desea recargar (0-11): ");
        int fila = sc.nextInt();

        while (!(fila >= 0 && fila < golosinas.length)) {
            System.out.println("Opción inválida. Ingrese nuevamente la golosina a recargar (0-11): ");
            fila = sc.nextInt();
        }

        System.out.println("Ahora, ingrese la cantidad a recargar de " + golosinas[fila][0]);
        int cantidad = sc.nextInt();

        int stock = Integer.parseInt(golosinas[fila][2]); // Parseamos/pasamos el string "stock" a entero

        stock += cantidad;

        golosinas[fila][2] = String.valueOf(stock);
        // Volvemos a parsear/pasar el stock de entero a string para que se pueda guardar en la matriz

        // MOSTRAMOS EL STOCK
        System.out.println("----- GOLOSINAS DISPONIBLES (CON NUEVO STOCK) -----");

        for (int i = 0; i < golosinas.length; i++) {
            System.out.println("GOLOSINA: " + golosinas[i][0] + " | PRECIO: $" + golosinas[i][1] + " | STOCK: " + golosinas[i][2]);
        }
        
        System.out.println();

    }

    public static void d() {

        System.out.println("VENTAS TOTALES: $" + Funciones.totalVentas);
        System.out.println();
        System.out.println("APAGANDO LA MAQUINA...");
        System.out.println();
    }

}
