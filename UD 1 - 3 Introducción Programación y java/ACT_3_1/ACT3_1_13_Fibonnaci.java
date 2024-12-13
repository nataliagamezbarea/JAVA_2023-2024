package ACT_3_1;

import java.util.Scanner;

/**
 * ACT3.12: Calcular los primeros 'n' números de la secuencia de Fibonacci
 *
 */
public class ACT3_1_13_Fibonnaci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fibN = 0, fibN1 = 1, fibN2 = 0, numero;
        //
        System.out.print("Introduzca un número (>2): ");
        numero = scanner.nextInt();
        System.out.println("Los números de la secuencia de Fibonacci son: ");
        System.out.println("1: " + fibN2);
        System.out.println("2: " + fibN1);
        //
        for (int i = 3; i <= numero; i++) {
            fibN = fibN1 + fibN2;
            System.out.println(i + ": " + fibN);
            fibN2 = fibN1;
            fibN1 = fibN;
        }
        scanner.close();
    }
}
