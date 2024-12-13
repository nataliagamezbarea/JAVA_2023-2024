package ACT_3_2;

import java.util.Scanner;

/**
 * Haz un programa que lea números enteros del teclado hasta que el usuario
 * introduzca un -1. Calcula la media de estos números (sin incluir el -1
 * final).
 */
public class ACT3_2_04_Media_numeros_hasta_nº {

    public static void main(String[] args) {
        int numero = 0;
        int contador = 0;
        int suma = 0;
        double media;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Introduce un número (-1 para terminar): ");
            numero = scanner.nextInt();
            if (numero >= 0) {
                contador++;
                suma += numero;
            }
        } while (numero != -1);

        media = (double) suma / contador;
        System.out.println("La media es = " + media);

        scanner.close();
    }
}
