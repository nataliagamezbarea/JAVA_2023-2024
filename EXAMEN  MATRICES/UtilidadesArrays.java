package examen;

/**
 * @author joan
 */

public class UtilidadesArrays {
    /**
     * Muestra el array de enteros que recibe como parámetro por pantalla
     *
     * @param array El array que contiene los valores que queremos mostrar por pantalla.
     */
    public static void muestraArray(int[] array) {
        String separador = "";
        System.out.print('[');

        for (int i = 0; i < array.length; i++) {
            System.out.print(separador + array[i]);
            separador = ", ";
        }
        System.out.println(']');
    }

    /**
     * Muestra el array de booleanos que recibe como parámetro por pantalla
     *
     * @param array El array que contiene los valores que queremos mostrar por pantalla.
     */
    public static void muestraArray(boolean[] array) {
        String separador = "";
        System.out.print('[');

        for (int i = 0; i < array.length; i++) {
            System.out.print(separador + array[i]);
            separador = ", ";
        }
        System.out.println(']');
        System.out.println();
    }

    /**
     * Muestra el array de dobles que recibe como parámetro por pantalla
     *
     * @param array El array que contiene los valores que queremos mostrar por pantalla.
     */
    public static void muestraArray(double[] array) {
        String separador = "";
        System.out.print('[');

        for (int i = 0; i < array.length; i++) {
            System.out.print(separador + array[i]);
            separador = ", ";
        }
        System.out.println(']');
        System.out.println();
    }

    /**
     * Muestra el array de cadenas que recibe como parámetro por pantalla
     *
     * @param array El array que contiene los valores que queremos mostrar por pantalla.
     */
    public static void muestraArray(String[] array) {
        String separador = "";
        System.out.print('[');
        for (String a : array) {
            System.out.print(separador + a);
            separador = ", ";
        }
        System.out.println(']');
    }

    // ACT 4_1_2
    /**
     * Suma los enteros de un array
     * @param array 
     * @return int.
     */
    public static int sumaArray(int[] array) {
        int suma = 0;
        
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        return suma;
    }

    // ACT4_1_2
    /**
     * Calcula la media de los enteros de un array
     * @param array 
     * @return float.
     */
    public static float mediaArray(int[] array) {
        int suma = sumaArray(array);
        int total = array.length;

        return ((float) suma / (float) total);
    }

    // ACT4_1_4
    /**
     * Genera un array de enteros de la longitud indicada
     * @param longitud La longitud del array
     * @param minimo El valor mínimo
     * @param maximo El valor máximo
     * @return El array llenado de forma aleatoria.
     */
    public static int[] generaArray(int longitud, int minimo, int maximo) {
        int[] array = new int[longitud];
        
        for (int i = 0; i < array.length; i++) {
            array[i] = minimo + (int) (Math.random() * (maximo - minimo + 1));
        }
        return array;
    }
     
    // ACT4_1_5
    /**
     * Compara dos arrays de enteros de cualquier longitud
     *
     * @param array1 El primer array
     * @param array2 El segundo array
     * @return El resultado de la comparación
     */
    public static boolean comparaArrays(int[] array1, int[] array2) {
        boolean sonIguales = true;
        
        if (array1.length == array2.length) {
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] != array2[i]) {
                    sonIguales = false;
                    break;
                }
            }
        } else {
            sonIguales = false;
        }
        return sonIguales;
    }
}
