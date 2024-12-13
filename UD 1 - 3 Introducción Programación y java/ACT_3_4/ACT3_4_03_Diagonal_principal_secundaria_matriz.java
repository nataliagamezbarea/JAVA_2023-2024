package ACT_3_4;

public class ACT3_4_03_Diagonal_principal_secundaria_matriz {

    public static void main(String[] args) {
        final int LONGITUD = 4;
        int[][] matriz = new int[LONGITUD][LONGITUD];

        // Rellenar la matriz con valores sumando los índices de fila y columna
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = i + j;
            }
        }

        // Imprimir el contenido de la matriz
        System.out.println("[");
        for (int[] array : matriz) {
            System.out.print("[ ");
            for (int a : array) {
                System.out.print(a + " ");
            }
            System.out.println("]");
        }
        System.out.println("]");


        // Imprimir el contenido de la diagonal principal como la fila y la columna coinciden no se hace más bicles
        System.out.println();
        System.out.print("[ ");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + " ");
        }
        System.out.println("]");

        // Imprimir el contenido de la diagonal secundaria
        System.out.println();
        System.out.print("[ ");
        //  la longitud de la matriz -1 = 4-1 =3 porque el valor empieza por 0 si no la posición 4 no existe
        // i = 0 j = 3 i = 1 j=2  i = 2 j =1 i = 3 j=0
        // la i como empieza en 0 no hace falta porque lo hace hasta el 2 ya que en la parte 3<3 no se cumple
        // pero  el j tiene que empezar al final del tablero y retroceder entonces ya no empieza desde 0 y  que empieza desde 4,4 que cuya posición no existe

        for (int i = 0, j = matriz.length - 1; i < matriz.length; i++, j--) {
            System.out.print(matriz[i][j] + " ");
        }
        System.out.print("]");
    }
}
