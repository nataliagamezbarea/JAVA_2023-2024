package ACT4_6_2_Ajedrez;

import Utilidades.*;

public class ACT5_1_Matar_Torres_1 {

    static final int SIMBOLO_VACIO = 0;
    static final int SIMBOLO_TORRE = 9;
    static final int SIMBOLO_PEON = 1;
    static int[][] tablero;
    static int accion;

    public static void main(String[] args) {
        // Pedir la medida del tablero y el número de torres
        final int NTABLERO = UtilidadesConsola.leerEntero("Medida del tablero: ");
        tablero = UtilidadesMatrices.generaMatriz(NTABLERO, SIMBOLO_VACIO, SIMBOLO_VACIO);

        final int NTORRES = UtilidadesConsola.leerEntero("Indica número de torres: ");
        final int NPEON = 1; // Solo un peón en el tablero

        // Colocar las torres de manera aleatoria en el tablero
        agregarTorres(tablero, NTORRES);
        // Colocar un peón en el tablero
        agregarPeones(tablero, NPEON);

        UtilidadesMatrices.mostrarMatriz(tablero);

        // Verificar si el peón ha sido comido antes de comenzar el ciclo de movimiento
        verificarPeonComido(tablero);

        // Ejecutar el ciclo donde el jugador mueve el peón
        do {
            accion = UtilidadesConsola.leerEntero("ACCIONES: 8- ARRIBA, 4- IZQUIERDA, 6- DERECHA, 2- ABAJO, 0- SALIR: ");
            moverPeon(tablero, accion);
            matarTorres(tablero);  // Verificar si alguna torre mata a otra o a un peón
            verificarPeonComido(tablero);  // Verificar después de cada movimiento
            UtilidadesMatrices.mostrarMatriz(tablero);
        } while (accion != 0);
    }

    // Método para agregar torres de manera aleatoria
    public static void agregarTorres(int[][] tablero, int NTORRES) {
        int contadorTorres = 0;
        while (contadorTorres < NTORRES) {
            int fila = (int) (Math.random() * tablero.length);
            int col = (int) (Math.random() * tablero[0].length);
            if (tablero[fila][col] == SIMBOLO_VACIO) {
                tablero[fila][col] = SIMBOLO_TORRE;
                contadorTorres++;
            }
        }
    }

    // Método para agregar peones de manera aleatoria
    public static void agregarPeones(int[][] tablero, int NPEON) {
        int contadorPeones = 0;
        while (contadorPeones < NPEON) {
            int fila = (int) (Math.random() * tablero.length);
            int col = (int) (Math.random() * tablero[0].length);
            if (tablero[fila][col] == SIMBOLO_VACIO) {
                tablero[fila][col] = SIMBOLO_PEON;
                contadorPeones++;
            }
        }
    }

    // Método para mover al peón
    public static void moverPeon(int[][] tablero, int accion) {
        int[] peon = buscarPeon(tablero);
        if (peon != null) {
            int fila = peon[0];
            int col = peon[1];

            tablero[fila][col] = SIMBOLO_VACIO;  // Limpiar la posición anterior

            switch (accion) {
                case 8: // Arriba
                    fila = (fila == 0) ? tablero.length - 1 : fila - 1;
                    break;
                case 2: // Abajo
                    fila = (fila == tablero.length - 1) ? 0 : fila + 1;
                    break;
                case 4: // Izquierda
                    col = (col == 0) ? tablero[0].length - 1 : col - 1;
                    break;
                case 6: // Derecha
                    col = (col == tablero[0].length - 1) ? 0 : col + 1;
                    break;
            }

            tablero[fila][col] = SIMBOLO_PEON;  // Colocar el peón en la nueva posición

            // Verificar si una torre mata al peón
            if (tablero[fila][col] == SIMBOLO_PEON) {
                for (int i = 0; i < tablero.length; i++) {
                    for (int j = 0; j < tablero[0].length; j++) {
                        if (tablero[i][j] == SIMBOLO_TORRE && (i == fila || j == col)) {
                            UtilidadesMatrices.mostrarMatriz(tablero);
                            System.out.println("¡El peón ha sido comido por una torre en [" + i + "," + j + "]!");
                            tablero[fila][col] = SIMBOLO_TORRE; // El peón es comido
                            tablero[i][j] = SIMBOLO_VACIO; // El peón es comido

                            UtilidadesMatrices.mostrarMatriz(tablero);
                            System.out.println("Juego terminado.");
                            System.exit(0);  // Finalizar el juego cuando el peón es comido
                        }
                    }
                }
            }
        }
    }

    // Buscar la posición del peón en el tablero
    public static int[] buscarPeon(int[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                if (tablero[i][j] == SIMBOLO_PEON) {
                    return new int[]{i, j};
                }
            }
        }
        return null;  // No se encontró el peón
    }

    // Método para hacer que las torres se "coman" entre ellas
    public static void matarTorres(int[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                if (tablero[i][j] == SIMBOLO_TORRE) {
                    // Verificar si hay otra torre en la misma fila
                    for (int k = 0; k < tablero[0].length; k++) {
                        if (k != j && tablero[i][k] == SIMBOLO_TORRE) {
                            System.out.println("La torre en [" + i + "," + j + "] mata a la torre en [" + i + "," + k + "]");
                            tablero[i][k] = SIMBOLO_VACIO;  // Eliminar la torre matada
                        }
                    }

                    // Verificar si hay otra torre en la misma columna
                    for (int k = 0; k < tablero.length; k++) {
                        if (k != i && tablero[k][j] == SIMBOLO_TORRE) {
                            System.out.println("La torre en [" + i + "," + j + "] mata a la torre en [" + k + "," + j + "]");
                            tablero[k][j] = SIMBOLO_VACIO;  // Eliminar la torre matada
                        }
                    }
                }
            }
        }
    }

    // Verificar si el peón ha sido comido por alguna torre
    public static void verificarPeonComido(int[][] tablero) {
        int[] peon = buscarPeon(tablero);
        if (peon != null) {
            int fila = peon[0];
            int col = peon[1];

            for (int i = 0; i < tablero.length; i++) {
                for (int j = 0; j < tablero[0].length; j++) {
                    if (tablero[i][j] == SIMBOLO_TORRE && (i == fila || j == col)) {
                        System.out.println("¡El peón ha sido comido por una torre en [" + i + "," + j + "]!");
                        tablero[fila][col] = SIMBOLO_VACIO; // El peón es comido
                        System.out.println("Juego terminado.");
                        System.exit(0);  // Finalizar el juego cuando el peón es comido
                    }
                }
            }
        }
    }
}
