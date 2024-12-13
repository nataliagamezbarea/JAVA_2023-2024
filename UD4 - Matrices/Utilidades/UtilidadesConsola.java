package Utilidades;

import java.util.Scanner;

public class UtilidadesConsola {

    /**
     * Lee un entero desde el scanner.
     *
     * @param mensaje El mensaje que muestra al usuario indicando qué dato debe
     * escribir.
     * @return El entero escrito por el usuario.
     */
    public static int leerEntero(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        int entero = 0;

        System.out.print(mensaje);
        entero = scanner.nextInt();
        //scanner.close();
        return entero;
    }

    /**
     * Lee una cadena desde el scanner.
     *
     * @param mensaje El mensaje que muestra al usuario indicando qué dato debe
     * escribir.
     * @return La cadena escrita por el usuario.
     */
    public static String leerCadena(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        String cadena;

        System.out.print(mensaje);
        cadena = scanner.nextLine();
        //scanner.close();
        return cadena;
    }

    /**
     * Lee un carácter desde el scanner.
     *
     * @param mensaje El mensaje que muestra al usuario indicando qué dato debe
     * escribir.
     * @return El carácter escrito por el usuario.
     */
    public static char leerCarácter(String mensaje) {
        char caracter;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print(mensaje);
            if (scanner.hasNext()) {
                caracter = scanner.next().charAt(0);
            } else {
                // Manejo de error o valor predeterminado en caso de que no haya entrada.
                caracter = 'X'; // Por ejemplo, devolver un valor por defecto.
            }

        }
        return caracter;
    }

    /**
     * Lee un número decimal (real) desde el scanner.
     *
     * @param mensaje El mensaje que muestra al usuario indicando qué dato debe
     * escribir.
     * @return El número decimal escrito por el usuario.
     */
    public static double leerDouble(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        double real = 0;

        System.out.print(mensaje);
        real = scanner.nextDouble();
        //scanner.close();
        return real;
    }

    // ACT4_3_2
    /**
     * Muestra el menú en pantalla y pide al usuario la opción a ejecutar hasta
     * que el usuario elija una opción correcta.
     *
     * @param titulo El título del menú
     * @param opciones La lista de opciones, sin número
     * @param pregunta La pregunta que se le hace al usuario
     * @return La opción válida elegida por el usuario.
     */
    public static int gestionarMenu(String titulo, String[] opciones, String pregunta) {
        System.out.println(titulo);
        int entero;

        for (int i = 0; i < opciones.length; i++) {
            System.out.println((i + 1) + ". " + opciones[i]);
        }
        do {
            entero = leerEntero(pregunta);
        } while (entero != 0);
        return entero;
    }
}
