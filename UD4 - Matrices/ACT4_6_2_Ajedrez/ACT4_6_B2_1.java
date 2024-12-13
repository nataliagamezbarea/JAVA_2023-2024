package ACT4_6_2_Ajedrez;

import Utilidades.UtilidadesArrays;
import Utilidades.UtilidadesConsola;
import Utilidades.UtilidadesMatrices;

public class ACT4_6_B2_1 {

    static int NTAULER;
    static int NTORRES;
    static final int SIMBOL_BUIT = 0;
    static final int SIMBOL_TORRE = 9;
    static final int SIMBOL_MATA = 1;
    static int[][] tauler;
    static int[] torre;

    public static void main(String[] args) {
        NTAULER = UtilidadesConsola.leerEntero("Intodueixi la mida del tauler: ");
        NTORRES = UtilidadesConsola.leerEntero("Intodueixi el nombre de torres: ");
        tauler = new int[NTAULER][NTAULER];  // matriu NTAULERxNTAULER
        int i = 0;

        while (i < NTORRES) {
            torre = afegeixTorre(tauler);  // Generar posición de la torre
            emplenaTauler(tauler, torre);  // Colocar torre en el tablero
            mataTorre(tauler, torre);      // Marcar las posiciones atacadas por la torre
            UtilidadesMatrices.mostrarMatriz(tauler);  // Mostrar el tablero
            i++;
        }
    }

    // Función para agregar una torre al tablero en una posición aleatoria
    public static int[] afegeixTorre(int[][] tauler) {
        boolean oktorre = true;
        do {
            torre = UtilidadesArrays.generaArray(2, 0, NTAULER - 1);  // Genera posición aleatoria para la torre
            if (tauler[torre[0]][torre[1]] == SIMBOL_TORRE) {  // Si ya hay una torre en esa posición, busca otra
                oktorre = false;
            }
        } while (!oktorre);
        return torre;
    }

    // Coloca la torre en el tablero
    public static void emplenaTauler(int[][] tauler, int[] torre) {
        tauler[torre[0]][torre[1]] = SIMBOL_TORRE;
    }

    // Función para marcar las posiciones que una torre puede atacar (toda su fila, columna y diagonales)
    public static void mataTorre(int[][] tauler, int[] torre) {
        // Atacar la columna de la torre
        for (int i = 0; i < NTAULER; i++) {
            if (tauler[i][torre[1]] != SIMBOL_TORRE) {
                tauler[i][torre[1]] = SIMBOL_MATA;
            } else if (i != torre[0]) {
                System.out.println("Torre (" + torre[0] + "," + torre[1] + ") mata a torre (" + i + "," + torre[1] + ")");
            }
        }

        // Atacar la fila de la torre
        for (int j = 0; j < NTAULER; j++) {
            if (tauler[torre[0]][j] != SIMBOL_TORRE) {
                tauler[torre[0]][j] = SIMBOL_MATA;
            } else if (j != torre[1]) {
                System.out.println("Torre (" + torre[0] + "," + torre[1] + ") mata a torre (" + torre[0] + "," + j + ")");
            }
        }

        // Atacar la diagonal principal (de arriba a la izquierda a abajo a la derecha)
        for (int i = 0; i < NTAULER; i++) {
            if (torre[0] == torre[1]) {
                tauler[i][i] = SIMBOL_MATA;  // Atacar la diagonal principal
            }
        }

        // Atacar la diagonal secundaria (de arriba a la derecha a abajo a la izquierda)
        for (int i = 0; i < NTAULER; i++) {
            tauler[i][NTAULER - 1 - i] = SIMBOL_MATA;  // Atacar la diagonal secundaria
        }
    }

    // Función para extraer la diagonal principal de una matriz
    public static int[] generaDiagonalPrincipal1(int[][] matriz) {
        int tamañoDiagonal = Math.min(matriz.length, matriz[0].length);
        int[] salida = new int[tamañoDiagonal];
        for (int i = 0; i < tamañoDiagonal; i++) {
            salida[i] = matriz[i][i];
        }
        return salida;
    }

    // Función para extraer la diagonal secundaria de una matriz
    public static int[] generaDiagonalSecundaria1(int[][] matriz) {
        int tamañoDiagonal = Math.min(matriz.length, matriz[0].length);
        int[] salida = new int[tamañoDiagonal];
        for (int i = 0; i < tamañoDiagonal; i++) {
            salida[i] = matriz[i][matriz[0].length - 1 - i];
        }
        return salida;
    }
}

