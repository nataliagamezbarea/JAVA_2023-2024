package ACT_3_1;

/**
 * ACT3.8: Calcular la suma de los 100 primeros números pares
 *
 */
public class ACT3_1_08_Suma_100_pares {

    public static void main(String[] args) {
        int resultado = 0;

        for (int i = 1; i <= 100; i = i + 1) {
            if (i % 2 == 0) {
                resultado = resultado + i;
            }
        }
        System.out.println("El resultado es: " + resultado);
    }
}
