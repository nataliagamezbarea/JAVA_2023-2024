package ACT4_3;

import Utilidades.UtilidadesArrays;
import Utilidades.UtilidadesMatrices;
import Utilidades.UtilidadesConsola;

/**
 * Crea una clase que inicialice una matriz cuadrada, por ejemplo 5x5: Muestra
 * la matriz por pantalla, cada fila en una línea.
 */
public class ACT4_3_02_Alumnox_Media_Nota {

    /**
     * Método principal que ejecuta el programa.
     *
     * @param args Los argumentos pasados por la línea de comandos.
     */
    public static void main(String[] args) {
        final int TAMAÑO = 5;
        String[] alumnos = new String[TAMAÑO];
        int[][] notas = UtilidadesMatrices.generaMatriz(TAMAÑO, 0, 10);

        // Leer los nombres de los alumnos
        for (int i = 0; i < alumnos.length; i++) {
            alumnos[i] = UtilidadesConsola.leerCadena("Nombre del alumno: ");
        }

        // Mostrar los alumnos y sus notas
        for (int i = 0; i < alumnos.length; i++) {
            System.out.print(alumnos[i] + ": ");
            UtilidadesArrays.muestraArray(notas[i]);
            System.out.println("Media: " + UtilidadesArrays.mediaArray(notas[i]));
            System.out.println("----------");
        }
    }
}
