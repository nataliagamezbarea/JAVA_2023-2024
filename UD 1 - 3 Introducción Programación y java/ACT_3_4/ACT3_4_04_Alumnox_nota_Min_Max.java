package ACT_3_4;

import java.util.Scanner;

public class ACT3_4_04_Alumnox_nota_Min_Max {

    public static void main(String[] args) {
        final int NALUMNES = 5;
        final int NNOTES = 10;
        final int MIN = 0;
        final int MAX = 10;
        Scanner scanner = new Scanner(System.in);
        String[] alumnes = new String[NALUMNES];
        int[][] notes = new int[NALUMNES][NNOTES];

        // Leer los nombres de los alumnos
        for (int i = 0; i < alumnes.length; i++) {
            System.out.print("Nom alumne [" + (i + 1) + "]: ");
            alumnes[i] = scanner.nextLine();
        }

        // Rellenar aleatoriamente las notas de cada alumno
        for (int i = 0; i < notes.length; i++) {
            for (int j = 0; j < notes[i].length; j++) {
                notes[i][j] = MIN + (int) (Math.random() * ((MAX - MIN) + 1));
            }
        }

        // Mostrar las notas de cada alumno
        System.out.println("Les notes dels alumnes són: ");
        for (int i = 0; i < notes.length; i++) {
            System.out.print(alumnes[i] + ": ");
            for (int j = 0; j < notes[i].length; j++) {
                System.out.print(notes[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
