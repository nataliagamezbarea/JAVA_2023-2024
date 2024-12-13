package ACT_3_2;

/**
 * Crear un programa que, dado un número entero, muestre en pantalla todos sus
 * divisores. Por ejemplo, para el número 6 mostraría: 1, 2, 3, 6.
 *
 */
public class ACT3_2_01_Divisores_número {

    public static void main(String[] args) {

        int num = 6;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);
            }
        }

    }
}
