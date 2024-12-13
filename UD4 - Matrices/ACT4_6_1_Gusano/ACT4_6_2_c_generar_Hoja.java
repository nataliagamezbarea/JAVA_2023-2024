
package ACT4_6_1_Gusano;

import Utilidades.*;

public class ACT4_6_2_c_generar_Hoja {

    static final int SIMBOLO_GUSANO = 1, SIMBOLO_VACIO = 0;
    static int accion;
    static final int SIMBOLO_HOJA = 9;

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
            // aqui ya funciona generar las hojas porque en el bucle erifico que cuantas
            // hojas hay
            // no hace falta poner generarHojas afuera se puede poner dentro de bucle
            // siempre que sea lo primero que se revise
            generarHojas(tablero, SIMBOLO_HOJA, NHOJAS);
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

    public static void generarHojas(int[][] tablero, final int SIMBOLO_HOJA, final int NHOJAS) {
        int contadorHojas = 0;

        // contador de hojas recorre todo el array y cuenta las hojas que hay
        // actualmente y guardala en la variable
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                if (tablero[i][j] == SIMBOLO_HOJA) {
                    contadorHojas++;
                }
            }
        }

        // si el contador de hojas es menor que las hojas que debe haber genera hojas
        // aleatorias con fila y columna
        // NOTA ! --> tuve que crear un número aleatorio para Fila y Columna para evitar
        // que se repitieran las posiciones
        while (contadorHojas < NHOJAS) {
            int nAleatorioFila = (int) (Math.random() * tablero.length);
            int nAleatorioColumna = (int) (Math.random() * tablero[0].length);

            // Si la celda está vacía , colocamos una hoja y informa que la has añadido
            if (tablero[nAleatorioFila][nAleatorioColumna] == SIMBOLO_VACIO) {
                tablero[nAleatorioFila][nAleatorioColumna] = SIMBOLO_HOJA;
                contadorHojas++;
            }
        }


    }

}
