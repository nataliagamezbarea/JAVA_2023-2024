package ACT_3_1;

import java.util.Scanner;

/**
 * ACT3.6: Mostrar la taula de multiplicar de un número
 *
 */
public class ACT3_1_06_Multiplicar_nº {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, resultado;
        //
        System.out.print("Introduzca su calificación: ");
        num = scanner.nextInt();
        //
        for (int i = 0; i <= 10; i = i + 1) {
            resultado = i * num;
            System.out.println(i + "x" + num + " = " + resultado);
        }
        scanner.close();
    }
}
