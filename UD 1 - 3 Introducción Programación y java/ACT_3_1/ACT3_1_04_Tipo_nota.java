package ACT_3_1;

import java.util.Scanner;

/**
 * ACT3.4: Mostrar la calificación de un estudiante
 *
 */
public class ACT3_1_04_Tipo_nota {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Float calificacion;
        //
        System.out.print("Introduzca su calificación: ");
        calificacion = scanner.nextFloat();
        //
        if (calificacion >= 9) {
            System.out.print("Sobresaliente");
        } else if (calificacion >= 7) {
            System.out.print("Notable");
        } else if (calificacion >= 6) {
            System.out.print("Bien");
        } else if (calificacion >= 5) {
            System.out.print("Aprobado");
        } else if (calificacion >= 3) {
            System.out.println("Insuficiente");
        } else {
            System.out.println("Muy deficiente");
        }
        scanner.close();
    }
}
