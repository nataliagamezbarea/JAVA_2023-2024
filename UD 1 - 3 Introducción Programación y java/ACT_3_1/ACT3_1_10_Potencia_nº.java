package ACT_3_1;

import java.util.Scanner;

/**
 * ACT3.10: Calcular la potencia de un número
 *
 */
public class ACT3_1_10_Potencia_nº {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base, exponente, resultado = 1;
        //
        System.out.print("Introduzca la base: ");
        base = scanner.nextInt();
        System.out.print("Introduzca el exponente: ");
        exponente = scanner.nextInt();
        //
        for (int i = 1; i <= exponente; i++) {
            resultado = resultado * base;
        }
        System.out.print("El resultado es: " + resultado);
        scanner.close();
    }
}
