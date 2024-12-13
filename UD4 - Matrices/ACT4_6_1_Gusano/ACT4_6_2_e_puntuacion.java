package ACT4_6_1_Gusano;

import Utilidades.*;

public class ACT4_6_2_e_puntuacion {

    static final int SIMBOLO_GUSANO = 1, SIMBOLO_VACIO = 0;
    static int accion;
    static final int SIMBOLO_HOJA = 9;
    static int puntuacion = 0; // Variable para guardar la puntuación

    public static void main(String[] args) {

        // Preguntar medida tablero y guardarla en variable
        final int NTABLERO = UtilidadesConsola.leerEntero("Introduce el tamaño del tablero: ");
        // Generar tablero y gusano en una posición aleatoria
        int[][] tablero = UtilidadesMatrices.generaMatriz(NTABLERO, 0, 0);
        int[] gusano = UtilidadesArrays.generaArray(2, 0, tablero.length - 1);
        // Preguntar número hojas y guardar en una variable
        int NHOJAS = UtilidadesConsola.leerEntero("Introduce la cantidad de hojas: ");

        // Situar gusano en el tablero [fila] [columna]
        rellenarTablero(tablero, gusano);

        // * Bucle que muestra la matriz, lee la acción y cambia la posición
        do {
            // Generar hojas si es necesario
            generarHojas(tablero, SIMBOLO_HOJA, NHOJAS);
            // Mostrar tablero
            pintarTablero(tablero);
            // Mostrar puntuación
            System.out.println("Puntuación: " + puntuacion);
            // Leer acción del usuario
            accion = UtilidadesConsola
                    .leerEntero("ACCIONES: 8- ARRIBA, 4- IZQUIERDA, 6- DERECHA, 2- ABAJO, 0: SALIR: ");
            // Cambiar posición del gusano
            cambiarPosicion(tablero, gusano, accion);

        } while (accion != 0);

    }

    // Situar gusano en el tablero [fila] [columna]
    public static void rellenarTablero(int[][] tablero, int[] gusano) {
        tablero[gusano[0]][gusano[1]] = SIMBOLO_GUSANO;
    }

    public static void cambiarPosicion(int[][] tablero, int[] gusano, int accio) {
        final int MEDIDA_TABLERO = tablero.length - 1;

        // Borrar posición actual del gusano
        tablero[gusano[0]][gusano[1]] = SIMBOLO_VACIO;

        // Cambiar posición según acción
        switch (accio) {
            case 4 -> // izquierda
                gusano[1] = (gusano[1] == 0 ? MEDIDA_TABLERO : --gusano[1]);
            case 6 -> // derecha
                gusano[1] = (gusano[1] == MEDIDA_TABLERO ? 0 : ++gusano[1]);
            case 8 -> // arriba
                gusano[0] = (gusano[0] == 0 ? MEDIDA_TABLERO : --gusano[0]);
            case 2 -> // abajo
                gusano[0] = (gusano[0] == MEDIDA_TABLERO ? 0 : ++gusano[0]);
        }

        // Incrementar puntuación si el gusano se mueve a una celda con una hoja
        if (tablero[gusano[0]][gusano[1]] == SIMBOLO_HOJA) {
            puntuacion += 10; // Incrementar puntuación en 10
        }

        // Situar el gusano después de cambiar la posición
        tablero[gusano[0]][gusano[1]] = SIMBOLO_GUSANO;
    }

    public static void generarHojas(int[][] tablero, int SIMBOLO_HOJA, int NHOJAS) {
        int contadorHojas = 0;

        // Contador de hojas recorre todo el array y cuenta las hojas que hay
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                if (tablero[i][j] == SIMBOLO_HOJA) {
                    contadorHojas++;
                }
            }
        }

        // Si el contador de hojas es menor que las hojas que debe haber genera hojas
        while (contadorHojas < NHOJAS) {
            int nAleatorioFila = (int) (Math.random() * tablero.length);
            int nAleatorioColumna = (int) (Math.random() * tablero[0].length);

            // Si la celda está vacía, colocamos una hoja
            if (tablero[nAleatorioFila][nAleatorioColumna] == SIMBOLO_VACIO) {
                tablero[nAleatorioFila][nAleatorioColumna] = SIMBOLO_HOJA;
                contadorHojas++;
            }
        }

    }

    // Recorre todo el tablero y muestra caracteres según el contenido
    public static void pintarTablero(int[][] tablero) {
        char caracter;
        for (int i = 0; i < tablero.length; i++) {
            System.out.print("|");

            for (int j = 0; j < tablero[0].length; j++) {
                caracter = switch (tablero[i][j]) {
                    case SIMBOLO_GUSANO -> 'O';
                    case SIMBOLO_HOJA -> '*';
                    case SIMBOLO_VACIO -> ' ';
                    default -> ' ';
                };
                System.out.print(caracter);
            }

            System.out.println("|");
        }
    }
}
