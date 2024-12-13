package ACT4_6_2_Ajedrez;

import Utilidades.UtilidadesArrays;
import Utilidades.UtilidadesConsola;
import Utilidades.UtilidadesMatrices;

public class ACT4_6_B2 {

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
            torre = afegeixTorre(tauler);

            emplenaTauler(tauler, torre);

            mataTorre(tauler, torre);

            UtilidadesMatrices.mostrarMatriz(tauler);

            i++;
        }
    }

    public static int[] afegeixTorre(int[][] tauler) {
        boolean oktorre = true;

        do {
            torre = UtilidadesArrays.generaArray(2, 0, NTAULER - 1); // genera posici� de la torre, ha de tornar-se en forma de funci� ja que l'array es genera cada vegada   

            if (tauler[torre[0]][torre[1]] == SIMBOL_TORRE) { // situa la torre en el tauler si la posici� est� no est� ocupada per una altra torre
                oktorre = false;
            }
        } while (!oktorre);

        return torre;

    }

    public static void emplenaTauler(int[][] tauler, int[] torre) {
        tauler[torre[0]][torre[1]] = SIMBOL_TORRE;
    }

    public static void mataTorre(int[][] tauler, int[] torre) {
        for (int i = 0; i < NTAULER; i++) {
            if (tauler[i][torre[1]] != SIMBOL_TORRE) {
                tauler[i][torre[1]] = SIMBOL_MATA;
            } else if (i != torre[0]) {
                System.out
                        .println("Torre (" + torre[0] + "," + torre[1] + ") mata a torre (" + i + "," + torre[1] + ")");
            }
        }

        for (int j = 0; j < NTAULER; j++) {
            if (tauler[torre[0]][j] != SIMBOL_TORRE) {
                tauler[torre[0]][j] = SIMBOL_MATA;
            } else if (j != torre[1]) {
                System.out
                        .println("Torre (" + torre[0] + "," + torre[1] + ") mata a torre (" + torre[0] + "," + j + ")");
            }
        }


    }
    

   

}
