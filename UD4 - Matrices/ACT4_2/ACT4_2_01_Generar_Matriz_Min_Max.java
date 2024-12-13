package ACT4_2;

import Utilidades.UtilidadesMatrices;

/**
 * Crea una clase que inicialice una matriz cuadrada, por ejemplo 10x10:
 * Inicialízala de forma que cada casilla tenga un valor aleatorio.
 */
public class ACT4_2_01_Generar_Matriz_Min_Max {

    public static void main(String[] args) {
        final int TAMAÑO = 10;
        int[][] matriz = UtilidadesMatrices.generaMatriz(TAMAÑO, 10, 100);
    }
}
