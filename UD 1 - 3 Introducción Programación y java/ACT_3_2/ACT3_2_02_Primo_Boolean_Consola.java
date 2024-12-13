package ACT_3_2;

import java.io.IOException;

/**
 * 23. Comprobar si un número, recuperado de la línea de comandos, es primo o no
 * utilizando un for y un break.
 *
 */
public class ACT3_2_02_Primo_Boolean_Consola {

    public static void main(String[] args) throws IOException {
        int num = Integer.parseInt(args[0]);
        boolean primo = true;
        for (int i = 2; i <= num - 1; i++) {
            if (num % i == 0) {
                primo = false;
                break;
            }
        }
        if (primo) {
            System.out.println("Es primo");
        } else {
            System.out.println("No es primo");
        }
    }
}
