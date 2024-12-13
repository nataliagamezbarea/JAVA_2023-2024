package Utilidades;

/**
 *
 * @author Tomeu Vives
 */
public class UtilidadesMatrices {

    // ACT4_7
    /**
     * Asigna a cada posición de la matriz la suma de sus coordenadas
     *
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
     *
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
     *
     * @param matriz
     */
    public static int[] generaDiagonalPrincipal(int[][] matriz) {
        int[] salida = new int[matriz.length];

        for (int i = 0; i < matriz.length; i++) {
            salida[i] = matriz[i][i];
        }
        return salida;
    }

    public static int[] generaDiagonalPrincipal1(int[][] matriz) {
        // Determina la longitud máxima que puede tener la diagonal
        int tamañoDiagonal = Math.min(matriz.length, matriz[0].length);
        int[] salida = new int[tamañoDiagonal];

        // Recorre la matriz y extrae la diagonal
        for (int i = 0; i < tamañoDiagonal; i++) {
            salida[i] = matriz[i][i];
        }

        return salida;
    }

    public static int[] generaDiagonalSecundaria1(int[][] matriz) {
        // Determina la longitud máxima que puede tener la diagonal secundaria
        int tamañoDiagonal = Math.min(matriz.length, matriz[0].length);
        int[] salida = new int[tamañoDiagonal];

        // Recorre la matriz y extrae la diagonal secundaria
        for (int i = 0; i < tamañoDiagonal; i++) {
            salida[i] = matriz[i][matriz[0].length - 1 - i];
        }

        return salida;
    }

    // int[] diagonalprincipal = UtilidadesMatrices.generaDiagonalPrincipal1(tauler);

    // System.out.println (
    // "Diagonal principal: " + Arrays.toString(diagonalprincipal));

    //     int[] diagonalsecundaria = UtilidadesMatrices.generaDiagonalSecundaria1(tauler);

    // System.out.println (

    // "Diagonal principal: " + Arrays.toString(diagonalsecundaria));




    

    // ACT4_7
    /**
     * Muestra por consola la diagonal secundaria de la matriz
     *
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
