package ACT_3_2;

import java.io.IOException;

/**
 * 24. Comprobar si un número recibido desde la línea de comandos es primo o no
 * utilizando un while.
 */
public class ACT3_2_03_Es_primo_while_consola {

    public static void main(String[] args) throws IOException {
        // Comprueba que se haya pasado un único argumento
        if (args.length == 1) {
            // Convertimos el argumento a un número entero
            int num = Integer.parseInt(args[0]);

            int i = 2;
            // Busca un divisor y termina cuando lo encuentra o cuando i == num
            while (num % i != 0) {
                i++;
            }
            if (i == num) {
                System.out.println("Es primo");
            } else {
                System.out.println("No es primo");
            }
        } else {
            System.err.println("Debe proporcionar un único argumento");
        }
    }
}
