package ACT4_4;

import Utilidades.UtilidadesArrays;
import Utilidades.UtilidadesConsola;
import java.util.ArrayList;

public class ACT4_4_04_Notas_alumnos {

    static ArrayList<String> alumnos = new ArrayList<>();
    static ArrayList<ArrayList<Integer>> notas = new ArrayList<>();

    public static void main(String[] args) {
        leerAlumnos(alumnos);
        mostrarNotas(alumnos, notas);
    }

    public static void leerAlumnos(ArrayList<String> alumnos) {
        String texto;

        do {
            texto = UtilidadesConsola.leerCadena("Nombre alumno ('salir' para acabar): ");
            // si no escribe salir en mayusculas o en minusculas
            if (!texto.equalsIgnoreCase("salir")) {
                alumnos.add(texto);
                leerNotas(notas);
            }
        } while (!texto.equalsIgnoreCase("salir"));
    }

    public static void leerNotas(ArrayList<ArrayList<Integer>> notas) {
        ArrayList<Integer> notasAlumno = new ArrayList<>();
        int nota;

        // Notas del alumno : para cambiar alumno -1
        do {
            nota = UtilidadesConsola.leerEntero("Introduzca nota ('-1' para acabar): ");
            if (nota == -1) {
                break;
            } else {
                notasAlumno.add(nota);
            }
        } while (true);

        // Añadir la fila de notas
        notas.add(notasAlumno);
    }

    public static void mostrarNotas(ArrayList<String> alumnos, ArrayList<ArrayList<Integer>> notas) {
        ArrayList<Integer> notasAlumno;

        for (int i = 0; i < alumnos.size(); i++) {
            System.out.print(alumnos.get(i) + ": ");
            notasAlumno = notas.get(i);
            for (Integer n : notasAlumno) {
                System.out.print(n + " ");
            }

            // Convertir ArrayList<Integer> a int[] para usar 'UtilidadesArrays.mediaArray'
            int[] notasArray = new int[notasAlumno.size()];
            for (int j = 0; j < notasAlumno.size(); j++) {
                notasArray[j] = notasAlumno.get(j);
            }

            // Calcular la media
            float media = UtilidadesArrays.mediaArray(notasArray);
            System.out.println("Media: " + media);
            System.out.println("----------");
        }
    }
}
