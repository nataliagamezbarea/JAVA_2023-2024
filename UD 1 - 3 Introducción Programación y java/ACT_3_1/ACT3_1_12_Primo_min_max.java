package ACT_3_1;

import java.util.Scanner;

/**
 * ACT3.12: Calcular los números primos entre 2 números (min, max)
 *
 */
public class ACT3_1_12_Primo_min_max {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numMin, numMax;
        //
        System.out.print("Introduzca el mínimo (>2): ");
        numMin = scanner.nextInt();
        System.out.print("Introduzca el máximo: ");
        numMax = scanner.nextInt();
        //
        for (int numero = Math.max(2, numMin); numero <= numMax; numero++) {
            boolean esPrimo = true;
            for (int i = 2; i <= numero - 1; i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;  // Se puede salir del ciclo cuando se encuentra un divisor
                }
            }
            if (esPrimo) {
                System.out.println(numero);
            }
        }
        scanner.close();
    }
}
