package ACT_3_1;

import java.util.Scanner;

/**
 * ACT3.2: Verificar si un numero es Par o impar
 */
public class ACT3_1_02_Nº_Par {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        //
        System.out.print("Introduzca un número: ");
        num = scanner.nextInt();
        //
        if (num == 0) {
            System.out.println("El número es 0");
        } else if (num % 2 == 0) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }
        scanner.close();
    }
}
