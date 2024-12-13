package ACT4_6_2_Ajedrez;

import Utilidades.*;

public class ACT5_1_Matar_Torres {

    static int SIMBOLO_VACIO = 0;
    static int SIMBOLO_TORRE = 9;
    static int[][] tablero;
    static boolean[][] torreMatada;

    public static void main(String[] args) {
        // Preguntar la medida del tablero y almacenarla
        final int NTABLERO = UtilidadesConsola.leerEntero("Medida del tablero: ");
        tablero = UtilidadesMatrices.generaMatriz(NTABLERO, 0, 0); // Generamos el tablero con valores 0 (vacíos)
        torreMatada = new boolean[NTABLERO][NTABLERO]; // Matriz para verificar si una torre ha sido matada

        // Preguntar el número de torres
        final int NTORRES = UtilidadesConsola.leerEntero("Indica numero torres: ");

        // Colocar las torres de manera aleatoria en el tablero
        agregarTorre(tablero, NTORRES);

        UtilidadesMatrices.mostrarMatriz(tablero);

        // Verificar si alguna torre es "matada" por otra
        matarTorres(tablero, SIMBOLO_TORRE);

        // Mostrar el tablero después de las operaciones
        UtilidadesMatrices.mostrarMatriz(tablero);
    }

    // Método para agregar torres de manera aleatoria en el tablero
    public static void agregarTorre(int[][] tablero, final int NTORRES) {
        int contadorTorres = 0;

        // Colocar torres aleatorias hasta alcanzar el número solicitado
        while (contadorTorres < NTORRES) {
            int nAleatorioFila = (int) (Math.random() * tablero.length);
            int nAleatorioColumna = (int) (Math.random() * tablero[0].length);

            // Si la celda está vacía, colocamos una torre y aumentamos el contador
            if (tablero[nAleatorioFila][nAleatorioColumna] == SIMBOLO_VACIO) {
                tablero[nAleatorioFila][nAleatorioColumna] = SIMBOLO_TORRE;
                contadorTorres++;
            }
        }
    }

    // Método para verificar las torres
    public static void matarTorres(int[][] tablero, final int SIMBOLO_TORRE) {
        boolean torresMovidas;

        do {
            torresMovidas = false;

            // recorrer filas y columnas del tablero
            for (int i = 0; i < tablero.length; i++) {
                for (int j = 0; j < tablero[0].length; j++) {
                    if (tablero[i][j] == SIMBOLO_TORRE) { // si se encuentra una torre
                        for (int k = 0; k < tablero[0].length; k++) { // recorre toda su columna
                            if (k != j && tablero[i][k] == SIMBOLO_TORRE) { // si su columna que está recorriendo es diferente a la columna de la torre y hay una torre
                                System.out.println("La torre en [" + i + "," + j + "] mata a la torre[" + i + "," + k + "]");
                                tablero[i][j] = SIMBOLO_VACIO; // Vaciar la posición original
                                tablero[i][k] = SIMBOLO_TORRE; // Mover la torre a la nueva posición
                                torresMovidas = true;  // Se movió una torre
                                break; // Salir del bucle de la fila
                            }
                        }

                        // Verificar si hay otra torre en la misma columna
                        if (torresMovidas) {
                            break;  // Si se movió una torre, no seguir buscando en la columna
                        }
                        for (int k = 0; k < tablero.length; k++) { // recorre  la columna
                            if (k != i && tablero[k][j] == SIMBOLO_TORRE) { // si la columna de la torre es diferente a la que se esta iterando y hay una torre
                                System.out.println("La torre en [" + i + "," + j + "] mata [" + k + "," + j + "]");
                                tablero[i][j] = SIMBOLO_VACIO; // Vaciar la posición original
                                tablero[k][j] = SIMBOLO_TORRE; // Mover la torre a la nueva posición
                                torresMovidas = true;  // Se movió una torre
                                break; // Salir del bucle de la columna
                            }
                        }
                    }
                }
            }
        } while (torresMovidas);  // Si la torre se ha movido se repite el proceso
    }
}
