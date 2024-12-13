package ACT_3_2;

/**
 * 27. En el programa anterior, elimina los *break* del *switch*. ¿Qué sucede?
 * Reescríbelo de manera que con el mínimo código obtengamos el resultado
 * correcto.
 */
public class ACT3_2_06_Vocal_Consonante_Switch_Simplificado {

    public static void main(String[] args) {
        for (char c = 'a'; c <= 'z'; c++) {
            switch (c) {
                case 'a', 'e', 'i', 'o', 'u' ->
                    System.out.println(c + " es vocal");
                default ->
                    System.out.println(c + " es consonante");
            }
        }
    }
}
