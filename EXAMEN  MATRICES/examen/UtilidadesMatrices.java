package examen;

/**
 *
 * @author Tomeu Vives
 */
public class UtilidadesMatrices {
    // ACT4_7
    /**
     * Asigna a cada posición de la matriz la suma de sus coordenadas
     * @param longitud
     * @param minimo
     * @param maximo
     * @return matriz
     */
    public static int[][] generaMatriz(int longitud, int minimo, int maximo) {
        int[][] matriz = new int[longitud][longitud];
        
        for (int i = 0; i < matriz.length; i++) {
            matriz[i] = UtilidadesArrays.generaArray(longitud, minimo, maximo);
        }
        return matriz;
    }

    // ACT4_7
    /**
     * Muestra la matriz
     * @param matriz
     */
    public static void mostrarMatriz(int[][] matriz) {
        String separador = "  ";
        System.out.println('[');
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(separador);
            UtilidadesArrays.muestraArray(matriz[i]); 
            separador = ", ";
        }
        System.out.println(']');
    }
 
    // ACT4_7
    /**
     * Muestra por consola la diagonal principal de la matriz
     * @param matriz
     */
    public static int[] generaDiagonalPrincipal(int[][] matriz) {
        int[] salida = new int[matriz.length];
        
        for (int i = 0; i < matriz.length; i++) {
            salida[i] = matriz[i][i];
        }
        return salida;
    }
 
    // ACT4_7
    /**
     * Muestra por consola la diagonal secundaria de la matriz
     * @param matriz
     */
    public static int[] generaDiagonalSecundaria(int[][] matriz) {
        int[] salida = new int[matriz.length];
        
        for (int i = 0, j = matriz.length - 1; i < matriz.length; i++, j--) {
            salida[i] = matriz[i][j];
        }
        return salida;
    }

}
