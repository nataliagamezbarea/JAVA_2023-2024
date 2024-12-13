package ACT_3_4;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

 import java.util.Scanner;

 public class ACT3_04_1_Matriz_Max_Min_Media {
 
     public static void main(String[] args) {
         final int MIN = 0;
         final int MAX = 10;
         final int NELEMENTOS = leerElementos();
         int[][] matriz = new int[NELEMENTOS][NELEMENTOS];
         generarMatriz(matriz, MAX, MIN);
         mostrarMatriz(matriz);
 
         int min = min(matriz);
         int max = max(matriz);
         float media = media(matriz);
         mostrarResultados(min, max,media);
 
     }
 
     public static int leerElementos() {
         Scanner scanner = new Scanner(System.in);
         System.out.print("Introduce el tamaño de la matriz: ");
         final int NMATRIZ = scanner.nextInt();
         scanner.close();
         return NMATRIZ;
     }
 
     public static void generarMatriz(int[][] matriz, final int MIN, final int MAX) {
         for (int i = 0; i < matriz.length; i++) {
             for (int j = 0; j < matriz.length; j++) {
                 matriz[i][j] = (int) (Math.random() * ((MAX - MIN) + 1)) + MIN;
             }
         }
     }
 
     public static void mostrarMatriz(int [] [] matriz) {
         for (int[] fila : matriz) {
             for (int elemento : fila) {
                 System.out.println(elemento);
             }
         }
     }
 
     public static int min(int [] [] matriz) {
         int min = matriz [0][0];
         for (int[] fila : matriz) {
             for (int elemento : fila) {
                 if (elemento < min ) {
                     min = elemento ;
                 }
             }
         }
         return min ;
     }
 
     public static int max(int [] [] matriz) {
         int min = matriz [0][0];
         for (int[] fila : matriz) {
             for (int elemento : fila) {
                 if (elemento < min ) {
                     min = elemento ;
                 }
             }
         }
         return min ;
     }
 
     public static float media(int[] [] matriz) {
         int sumaTotal = 0 ;
         int total = 0 ;
 
         for (int[] fila : matriz) {
             for (int elemento : fila) {
                 sumaTotal += elemento;
                 total++;
             }
         }
         float media = (float) sumaTotal /  total;
         // float media = (float) sumaTotal / (matriz.length * matriz[0].length); columnas y filas
         return media;
 
     }
 
     public static void mostrarResultados(int min , int max , float media) {
             System.out.println("Resultados:");
             System.out.println("Min:" + min );
             System.out.println("Max:" + max);
             System.out.println("Media:" + media);
 
     }
 
 }
 