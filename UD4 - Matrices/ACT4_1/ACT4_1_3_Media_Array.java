package ACT4_1;

import Utilidades.UtilidadesArrays;

/**
 * Crea una clase con un método que reciba un array de enteros y devuelva la
 * suma de todos sus valores. En el main muestra este resultado..
 */
public class ACT4_1_3_Media_Array {

    public static void main(String[] args) {
        int[] array = {7, 8, 5, 2, 9};

        UtilidadesArrays.muestraArray(array);
        System.out.println("media: " + UtilidadesArrays.mediaArray(array));
    }
}
