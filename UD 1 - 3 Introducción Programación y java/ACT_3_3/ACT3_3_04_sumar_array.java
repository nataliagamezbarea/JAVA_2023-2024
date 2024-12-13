package ACT_3_3;

public class ACT3_3_04_sumar_array {

    /**
     * Crear un array de 4x4 y calcular la suma de sus elementos.
     */
    public static void main(String[] args) {
        final int LONGITUD = 4;
        int[][] matriz = new int[LONGITUD][LONGITUD];
        int n = 1;
        int suma = 0;

        // Inicializar la matriz con valores del 1 al 16
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = n;
                n++;
            }
        }

        // Imprimir el contenido de la matriz
        System.out.println("[");
        for (int[] array : matriz) {
            System.out.print("[ ");
            for (int a : array) {
                System.out.print(a + " ");
                suma = suma + a;  // Sumar los elementos de la matriz
            }
            System.out.println("]");
        }
        System.out.print("]");
        System.out.println();
        System.out.println("La suma es: " + suma);  // Mostrar la suma total
    }
}
