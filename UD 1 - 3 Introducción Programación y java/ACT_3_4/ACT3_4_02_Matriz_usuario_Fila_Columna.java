package ACT_3_4;
import java.util.Scanner;

public class ACT3_4_02_Matriz_usuario_Fila_Columna {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crear el Scanner una sola vez

        final int NMATRIZ = leerLongitud(scanner); // Pasar el Scanner al método
        int[][] matriz = new int[NMATRIZ][NMATRIZ];
        rellenarMatriz(matriz, scanner); // Pasar el Scanner al método
        mostrarMatriz(matriz);

        int min = min(matriz);
        int max = max(matriz);
        float media = media(matriz);
        mostrarResultados(min, max, media);

        scanner.close(); // Cerrar el Scanner al final del programa
    }

    public static int leerLongitud(Scanner scanner) {
        System.out.print("Introduce un número para la longitud de la matriz: ");
        return scanner.nextInt();
    }

    public static void rellenarMatriz(int[][] matriz, Scanner scanner) {
        System.out.println("Introduce los valores para la matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Introduce un número para el elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
    }

    public static void mostrarMatriz(int[][] matriz) {
        System.out.println("Matriz:");
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }

    public static int min(int[][] matriz) {
        int min = matriz[0][0];
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                if (elemento < min) {
                    min = elemento;
                }
            }
        }
        return min;
    }

    public static int max(int[][] matriz) {
        int max = matriz[0][0];
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                if (elemento > max) {
                    max = elemento;
                }
            }
        }
        return max;
    }

    public static float media(int[][] matriz) {
        int sumaTotal = 0;
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                sumaTotal += elemento;
            }
        }
        return (float) sumaTotal / (matriz.length * matriz[0].length);
    }

    public static void mostrarResultados(int min, int max, float media) {
        System.out.println("Resultados:");
        System.out.println("Mínimo: " + min);
        System.out.println("Máximo: " + max);
        System.out.println("Media: " + media);
    }
}
