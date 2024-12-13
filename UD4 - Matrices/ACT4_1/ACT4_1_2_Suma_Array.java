package ACT4_1;

import Utilidades.UtilidadesArrays;

/**
 * Crea una clase con un método que reciba un array de enteros y devuelva la
 * suma de todos sus valores. En el main muestra este resultado.
 */
public class ACT4_1_2_Suma_Array {

    public static void main(String[] args) {
        int[] array = {12, 25, 5, 30, 12};
        UtilidadesArrays.muestraArray(array);
        System.out.println("Suma: " + UtilidadesArrays.sumaArray(array));
    }
}
