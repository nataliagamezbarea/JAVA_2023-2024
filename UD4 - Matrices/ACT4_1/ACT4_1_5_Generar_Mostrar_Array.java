package ACT4_1;

import Utilidades.UtilidadesArrays;

/**
 * Escribe una clase que genere dos vectores de enteros y los inicialice.
 * Escriba un método que pueda recibir dos vectores de enteros de diferente
 * longitud y devuelva un boolea diciendo si son iguales o no. Si no tienen la
 * misma longitud evidentemente no son iguales.
 */
public class ACT4_1_5_Generar_Mostrar_Array {

    public static void main(String[] args) {
        // int[]a = {1,2,3,4};
        // int[]b = {1,2,3};
        int[] a = UtilidadesArrays.generaArray(10, 1, 100);
        int[] b = UtilidadesArrays.generaArray(10, 1, 100);

        System.out.print("a: ");
        UtilidadesArrays.muestraArray(a);
        System.out.print("b: ");
        UtilidadesArrays.muestraArray(b);

        System.out.println(UtilidadesArrays.comparaArrays(a, b));
    }
}
