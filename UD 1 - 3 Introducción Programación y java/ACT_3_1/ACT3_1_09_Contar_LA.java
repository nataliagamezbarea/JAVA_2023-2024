package ACT_3_1;

import java.util.Scanner;

/**
 * ACT3.9: Contar las veces que aparece la secuencia 'LA'
 *
 */
public class ACT3_1_09_Contar_LA {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contarLA = 0;
        char carAct = ' ', carAnt = ' ';
        do {
            System.out.print("Introduzca caracteres, 'X' para salir: ");
            carAct = scanner.next().charAt(0);
            if (carAnt == 'L' && carAct == 'A') {
                contarLA += 1;
            }
            carAnt = carAct;
        } while (carAct != 'X');
        System.out.println("La suma de 'LA' es: " + contarLA);
        scanner.close();
    }
}
