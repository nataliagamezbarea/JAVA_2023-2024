package ACT4_6_1_Gusano;

import Utilidades.*;

public class ACT4_6_1_b_gusano {

    public static void main(String[] args) {
        
        // Preguntar medida tablero y guardarla en variable
        final int NTABLERO = UtilidadesConsola.leerEntero("Introduce el tamaño del tablero: ");

        // *Generar tablero y gusano en una posición aleatoria
        int[][] tablero = UtilidadesMatrices.generaMatriz(NTABLERO, 0, 0);
        int[] gusano = UtilidadesArrays.generaArray(2, 0, tablero.length - 1);
    }
}
