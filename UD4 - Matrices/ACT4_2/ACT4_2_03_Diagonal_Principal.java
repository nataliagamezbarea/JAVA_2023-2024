package ACT4_2;

import Utilidades.UtilidadesArrays;
import Utilidades.UtilidadesMatrices;

/**
 * Crea una clase que inicialice una matriz cuadrada, por ejemplo 10x10: Muestra
 * la diagonal principal: [0,0] [1,1], [2,2]...
 */
public class ACT4_2_03_Diagonal_Principal {

    public static void main(String[] args) {
        final int TAMAÑO = 10;
        int[][] matriz = UtilidadesMatrices.generaMatriz(TAMAÑO, 10, 100);
        int[] diagonal;

        System.out.println();
        UtilidadesMatrices.mostrarMatriz(matriz);
        System.out.println();
        diagonal = UtilidadesMatrices.generaDiagonalPrincipal(matriz);
        UtilidadesArrays.muestraArray(diagonal);
    }
}
