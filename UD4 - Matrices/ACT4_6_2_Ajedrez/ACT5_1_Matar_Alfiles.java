package ACT4_6_2_Ajedrez;

import Utilidades.*;

public class ACT5_1_Matar_Alfiles {

    static int SIMBOLO_VACIO = 0;
    static int SIMBOLO_ALFIL = 9;
    static int[][] tablero;

    public static void main(String[] args) {
        // Preguntar la medida del tablero y almacenarla
        final int NTABLERO = UtilidadesConsola.leerEntero("Medida del tablero: ");
        tablero = UtilidadesMatrices.generaMatriz(NTABLERO, 0, 0); // Generamos el tablero con valores 0 (vacíos)

        // Preguntar el número de alfiles
        final int NALFILES = UtilidadesConsola.leerEntero("Indica numero alfiles: ");

        // Colocar los alfiles de manera aleatoria en el tablero
        agregarAlfil(tablero, NALFILES);

        UtilidadesMatrices.mostrarMatriz(tablero);

        // Verificar si algún alfil "mata" a otro
        matarAlfiles(tablero, SIMBOLO_ALFIL);

        // Mostrar el tablero después de las operaciones
        UtilidadesMatrices.mostrarMatriz(tablero);
    }

    // Método para agregar alfiles de manera aleatoria en el tablero
    public static void agregarAlfil(int[][] tablero, final int NALFILES) {
        int contadorAlfiles = 0;

        // Colocar alfiles aleatorios hasta alcanzar el número solicitado
        while (contadorAlfiles < NALFILES) {
            int nAleatorioFila = (int) (Math.random() * tablero.length);
            int nAleatorioColumna = (int) (Math.random() * tablero[0].length);

            // Si la celda está vacía, colocamos un alfil y aumentamos el contador
            if (tablero[nAleatorioFila][nAleatorioColumna] == SIMBOLO_VACIO) {
                tablero[nAleatorioFila][nAleatorioColumna] = SIMBOLO_ALFIL;
                contadorAlfiles++;
            }
        }
    }

    // Método para verificar si algún alfil "mata" a otro
    public static void matarAlfiles(int[][] tablero, final int SIMBOLO_ALFIL) {
        boolean alfilesMovidos;

        // Continuar verificando mientras haya alfiles que se hayan movido
        do {
            alfilesMovidos = false;

            // Recorrer todas las posiciones del tablero
            for (int i = 0; i < tablero.length; i++) {
                for (int j = 0; j < tablero[0].length; j++) {
                    if (tablero[i][j] == SIMBOLO_ALFIL) { // Si se encuentra un alfil
                        // Verificar las diagonales (superior izquierda a inferior derecha y viceversa)
                        for (int k = 1; k < tablero.length; k++) {
                            // Verificar diagonal superior izquierda a inferior derecha
                            if (i + k < tablero.length && j + k < tablero[0].length && tablero[i + k][j + k] == SIMBOLO_ALFIL) {
                                System.out.println("El alfil en [" + i + "," + j + "] coincide con otro alfil en la diagonal ["
                                        + (i + k) + "," + (j + k) + "]");
                                tablero[i][j] = SIMBOLO_VACIO; // Vaciar la posición original
                                tablero[i + k][j + k] = SIMBOLO_ALFIL; // Mover el alfil a la nueva posición
                                alfilesMovidos = true;
                                break;
                            }
                            // Verificar diagonal inferior izquierda a superior derecha
                            if (i + k < tablero.length && j - k >= 0
                                    && tablero[i + k][j - k] == SIMBOLO_ALFIL) {
                                System.out.println("El alfil en [" + i + "," + j + "] coincide con otro alfil en la diagonal ["
                                        + (i + k) + "," + (j - k) + "]");
                                tablero[i][j] = SIMBOLO_VACIO; // Vaciar la posición original
                                tablero[i + k][j - k] = SIMBOLO_ALFIL; // Mover el alfil a la nueva posición
                                alfilesMovidos = true;
                                break;
                            }
                        }
                    }
                }
            }
        } while (alfilesMovidos);  // Continuar mientras haya alfiles que se hayan movido
    }
}
