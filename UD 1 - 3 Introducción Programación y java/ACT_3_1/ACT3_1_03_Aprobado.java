package ACT_3_1;

import java.util.Scanner;

/**
 * ACT3.3: Mostrar la calificación de un estudiante
 */
public class ACT3_1_03_Aprobado {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int calificacion;
        System.out.print("Introduzca su calificación: ");
        calificacion = scanner.nextInt();

        if (calificacion >= 5) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Suspendido");
        }
        scanner.close();
    }
}
