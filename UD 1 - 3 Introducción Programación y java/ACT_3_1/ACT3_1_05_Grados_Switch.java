package ACT_3_1;

import java.util.Scanner;

public class ACT3_1_05_Grados_Switch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Elija la conversión que desea realizar:");
        System.out.println("1. Celsius a Fahrenheit");
        System.out.println("2. Fahrenheit a Celsius");

        int eleccion = scanner.nextInt();

        System.out.println("Introduzca la temperatura:");
        double temperatura = scanner.nextDouble();

        double resultado;

        switch (eleccion) {
            case 1:
                resultado = (temperatura * 9 / 5) + 32;
                System.out.println("El resultado es: " + resultado + " °F");
                break;

            case 2:
                resultado = (temperatura - 32) * 5 / 9;
                System.out.println("El resultado es: " + resultado + " °C");
                break;

            default:
                System.out.println("Opción no válida");
        }

        scanner.close();
    }
}
