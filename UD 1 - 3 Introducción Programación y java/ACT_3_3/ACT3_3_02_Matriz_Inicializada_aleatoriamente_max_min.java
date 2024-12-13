package ACT_3_3;

/**
 * 2. Escribir una clase que cree un arreglo de 10 enteros, los inicialice
 * aleatoriamente entre 100 y 200, y los muestre por pantalla.
 *
 */
public class ACT3_3_02_Matriz_Inicializada_aleatoriamente_max_min {

    /**
     * @param args los argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        final int MIN = 100, MAX = 200;
        int[] array = new int[10];

        for (int index = 0; index < array.length; index++) {
            array[index] = MIN + (int) (Math.random() * ((MAX - MIN) + 1));
        }

        //Mostrar los por pantalla
        System.out.print("[ ");
        for (int a : array) {
            System.out.print(a + " ");
        }
        System.out.println("]");
    }
}
