package ACT_3_3;

import java.util.Arrays;

/**
 * 3. Escribe una clase que genere dos arreglos de enteros de la misma longitud
 * y los inicialice. 1. Compáralos con una igualdad v1==v2. ¿Funciona? Escribe
 * la explicación por pantalla utilizando un println. 2. Compáralos
 * correctamente. Utiliza una variable booleana para guardar el resultado.
 * Imprime un println que nos informe del resultado de la comparación.
 *
 */
public class ACT3_3_03_Comparar_longitud_contenido_array {

    public static void main(String[] args) {

        boolean iguales = true;
        int[] array1 = new int[10];
        int[] array2 = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = i;
            array2[i] = i;
        }

        if (array1 == array2) {
            System.out.println("Los arreglos son iguales");
        } else {
            System.out.println("Los arreglos son diferentes");
        }
        System.out.println("'array1 == array2' compara las referencias de cada arreglo, no el contenido, por eso siempre serán diferentes.");

        // Comparamos la longitud
        if (array1.length == array2.length) {
            // Comparamos el contenido posición por posición
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] != array2[i]) {
                    iguales = false;
                }
            }
        } else {
            iguales = false;
        }

        if (iguales) {
            System.out.println("Los contenidos son iguales");
        } else {
            System.out.println("Los contenidos son diferentes");
        }

        if (Arrays.equals(array1, array2)) {
            System.out.println("Los contenidos son iguales, ahora con Arrays.equals");
        } else {
            System.out.println("Los contenidos son diferentes, ahora con Arrays.equals");
        }
    }
}
