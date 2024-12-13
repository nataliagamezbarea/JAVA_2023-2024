package ACT_3_3;

/**
 * 1. Escribir una clase que cree un vector de 10 enteros, los inicialice de 1 a
 * 10 y los muestre por pantalla.
 *
 */
public class ACT3_3_01_Matriz_Inicializada_for {

    public static void main(String[] args) {
        //Una forma de hacerlo
        // int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //Otra forma de hacerlo
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        //Mostrar los por pantalla
        System.out.print("[ ");
        for (int a : array) {
            System.out.print(a + " ");
        }
        System.out.println("]");

    }
}
