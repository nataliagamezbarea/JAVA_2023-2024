package ACT4_6_1_Gusano;

import Utilidades.*;

public class ACT4_6_2_a_pregunta_hojas {

    static final int SIMBOLO_GUSANO = 1, SIMBOLO_VACIO = 0;
    static int accion;

    public static void main(String[] args) {

        // Preguntar medida tablero y guardarla en variable
        final int NTABLERO = UtilidadesConsola.leerEntero("Introduce el tamaño del tablero: ");

        // Generar tablero y gusano en una posición aleatoria
        int[][] tablero = UtilidadesMatrices.generaMatriz(NTABLERO, 0, 0);
        int[] gusano = UtilidadesArrays.generaArray(2, 0, tablero.length - 1);

        // Preguntar numero hojas y guardar en una variable
        int NHOJAS = UtilidadesConsola.leerEntero("Introduce la cantidad de hojas: ");

        // situar gusano en el tablero [fila] [columna]
        rellenarTablero(tablero, gusano);

        // * bucle que muestra la matriz , lee la acción y cambia la posición
        do {
            UtilidadesMatrices.mostrarMatriz(tablero);
            accion = UtilidadesConsola
                    .leerEntero("ACCIONES : 8- ARRIBA , 4 - IZQUIERDA , 6 - DERECHA , 2 - ABAJO , 0 : SALIR: ");
            cambiarPosicion(tablero, gusano, accion);
        } while (accion != 0);

    }

    // situar gusano en el tablero [fila] [columna]
    public static void rellenarTablero(int[][] tablero, int[] gusano) {
        tablero[gusano[0]][gusano[1]] = SIMBOLO_GUSANO;
    }

    public static void cambiarPosicion(int[][] tablero, int[] gusano, int accio) {
        final int MEDIDA_TABLERO = tablero.length - 1;
        // borra posición actual del gusano
        tablero[gusano[0]][gusano[1]] = SIMBOLO_VACIO;

        switch (accio) {

            case 4 -> // izquierda
                // si la columna actual es 0 (1º columna) debe aparecer en la última columna
                // sino deincrementa la columna
                gusano[1] = (gusano[1] == 0 ? MEDIDA_TABLERO : --gusano[1]);
            case 6 -> // derecha
                // si el gusano está en la última columna incrementa la columna
                gusano[1] = (gusano[1] == MEDIDA_TABLERO ? 0 : ++gusano[1]);
            case 8 -> // arriba
                // si el gusano está en la fila 0 (1º fila) debe aparecer en la última fila sino
                // deincrementa la fila
                gusano[0] = (gusano[0] == 0 ? MEDIDA_TABLERO : --gusano[0]);
            case 2 ->
                // si el gusano está en la primera columna incrementa la columna
                gusano[0] = (gusano[0] == MEDIDA_TABLERO ? 0 : ++gusano[0]);
        }
        // situa el gusano despues de cambiar la posición
        tablero[gusano[0]][gusano[1]] = SIMBOLO_GUSANO;
    }
}
