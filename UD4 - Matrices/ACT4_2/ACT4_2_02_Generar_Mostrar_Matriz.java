package ACT4_2;

import Utilidades.UtilidadesMatrices;

/**
 * Crea una clase que inicialice una matriz cuadrada, por ejemplo 10x10: Muestra
 * la matriz por pantalla, cada fila en una línea.
 */
public class ACT4_2_02_Generar_Mostrar_Matriz {

    public static void main(String[] args) {
        final int TAMAÑO = 10;
        int[][] matriz = UtilidadesMatrices.generaMatriz(TAMAÑO, 10, 100);

        System.out.println();
        UtilidadesMatrices.mostrarMatriz(matriz);
    }
}
