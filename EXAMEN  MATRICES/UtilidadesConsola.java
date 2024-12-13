package examen;

import java.util.Scanner;

public class UtilidadesConsola {

    /**
     * Lee un entero del scanner.
     *
     * @param prompt El mensaje que muestra al usuario indicando qu� dato debe
     *               escribir.
     * @return El entero escrito por el usuario
     */
    public static int leerEntero(String prompt) {
        Scanner scanner = new Scanner(System.in);
        int entero = 0;
        
        System.out.print(prompt);
        entero = scanner.nextInt();
        //scanner.close();
        return entero;
    }

    /**
     * Lee una cadena del scanner.
     *
     * @param prompt El mensaje que muestra al usuario indicando qu� dato debe
     *               escribir.
     * @return La cadena escrita por el usuario
     */
    public static String leerCadena(String prompt) {
        Scanner scanner = new Scanner(System.in);
        String cadena;

        System.out.print(prompt);
        cadena = scanner.nextLine();
        //scanner.close();
        return cadena;
    }
    
    /**
     * Lee un car�cter del scanner.
     *
     * @param prompt El mensaje que muestra al usuario indicando qu� dato debe
     *               escribir.
     * @return El car�cter escrito por el usuario
     */
    public static char leerCaracter(String prompt) {
        char caracter;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print(prompt);
            if (scanner.hasNext()) {
                caracter = scanner.next().charAt(0);
            } else {
                // Manejo de error o valor predeterminado en caso de que no haya entrada.
                caracter = 'X'; // Por ejemplo, devolver un espacio en blanco.
            }
        }
        return caracter;
    }

    /**
     * Lee un n�mero real del scanner. 
     *
     * @param prompt El mensaje que muestra al usuario indicando qu� dato debe
     *               escribir.
     * @return El n�mero real escrito por el usuario
     */
    public static double leerDouble(String prompt) {
        Scanner scanner = new Scanner(System.in);
        double real = 0;

        System.out.print(prompt);
        real = scanner.nextDouble();
        //scanner.close();
        return real;
    }   

    // ACT4_3_2
    /**
     * Muestra el men� por pantalla y pide al usuario la opci�n a ejecutar hasta
     * que el usuario elige una opci�n correcta.
     *
     * @param titulo    El t�tulo del men�
     * @param opciones  La lista de opciones, sin n�mero
     * @param pregunta  La pregunta que se hace al usuario
     * @return La opci�n v�lida elegida por el usuario.
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
