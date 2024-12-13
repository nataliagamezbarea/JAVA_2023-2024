package ACT4_3;

import Utilidades.UtilidadesArrays;
import Utilidades.UtilidadesConsola;

public class ACT4_3_01_Notas_Media {

    public static void main(String[] args) {
        int numNotas = UtilidadesConsola.leerEntero("Cantidad de notas del alumno: ");
        int[] notas = new int[numNotas];

        for (int index = 0; index < notas.length; index++) {
            notas[index] = UtilidadesConsola.leerEntero("Nota " + (index + 1) + ": ");
        }

        System.out.print("Notas: ");
        UtilidadesArrays.muestraArray(notas);

        System.out.println("Media: " + UtilidadesArrays.mediaArray(notas));
    }
}
