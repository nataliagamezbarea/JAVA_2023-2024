
import examen.UtilidadesArrays;
import examen.UtilidadesConsola;
import examen.UtilidadesMatrices;

public class Main {

    static int NTAULER;
    static final int SIMBOLO_NEGRE = 1;
    static final int SIMBOLO_VERMELL = 2;
    static final int SIMBOLO_PEO = 8;
    static final int SIMBOLO_COSTAT = 9;
    static int[][] tablero;

    public static void main(String[] args) {
        NTAULER = UtilidadesConsola.leerEntero("Mida del tablero: ");
        tablero = new int[NTAULER][NTAULER];  // matriu NTAULERxNTAULER

        rellenarLados(tablero);

        UtilidadesMatrices.mostrarMatriz(tablero);

        rellenarInterior(tablero);
        UtilidadesMatrices.mostrarMatriz(tablero);

        situaPeon(tablero, SIMBOLO_VERMELL);
        UtilidadesMatrices.mostrarMatriz(tablero);

        situaPeon(tablero, SIMBOLO_NEGRE);
        UtilidadesMatrices.mostrarMatriz(tablero);

        mostraTauler(tablero);
    }

    public static void rellenarLados(int[][] tablero) {
        // Bucle contador hasta que recorra el numero de tablero
        for (int i = 0; i < tablero.length; i++) {
            tablero[0][i] = SIMBOLO_COSTAT; // Recorre todas las columnas de la fila 0 
            tablero[i][0] = SIMBOLO_COSTAT;// Recorre toda la filas de la columna 0 
            tablero[tablero.length - 1][i] = SIMBOLO_COSTAT;  // Recorre todas las columnas de la ultima fila
            tablero[i][tablero.length - 1] = SIMBOLO_COSTAT; // Recorre toda las filas de la ultima columna
        }
    }

    public static void rellenarInterior(int[][] tablero) {
        for (int i = 1; i < tablero.length - 1; i++) { // Excluir los bordes del tablero
            for (int j = 1; j < tablero[i].length - 1; j++) { // Excluye los bordes del tablero
                tablero[i][j] = ((i + j) % 2 == 0) ? SIMBOLO_NEGRE : SIMBOLO_VERMELL; // Si la suma de la fila y la columna es par es que es impar por lo tanto negro
            }
        }
    }

    public static void situaPeon(int[][] tablero, int simbol) {
        int[] peon;
//        boolean salir = false;
//
//        while (!salir) {
        peon = UtilidadesArrays.generaArray(2, 1, NTAULER - 2);  // Genera posiciones aleatorias
//
//            if (tablero[peon[0]][peon[1]] == simbol) {  // Comprueba si es la celda correcta
//                tablero[peon[0]][peon[1]] = SIMBOLO_PEO;  // Coloca el peón en el tablero
//                salir = true;  // Termina el bucle si la posición es válida
//            }
//        }

        if (tablero[peon[0]][peon[1]] == simbol) {  // Comprueba si la posición coincide con el símbolo negro o rojo 
            tablero[peon[0]][peon[1]] = SIMBOLO_PEO;  // Coloca el peón y termina el método
        } else {
            situaPeon(tablero, simbol);  // Llama al método de nuevo hasta encontrar la posición adecuada
        }
    }

    public static void mostraTauler(int[][] matriz) {
        String car = "";

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                switch (matriz[i][j]) {
                    case SIMBOLO_VERMELL ->
                        car = "   ";
                    case SIMBOLO_NEGRE ->
                        car = " : ";
                    case SIMBOLO_PEO ->
                        car = " Z ";
                    case SIMBOLO_COSTAT ->
                        car = " | ";
                    default ->
                        car = " ? ";
                }
                System.out.print(car);
            }
            System.out.println();

        }
    }
}
