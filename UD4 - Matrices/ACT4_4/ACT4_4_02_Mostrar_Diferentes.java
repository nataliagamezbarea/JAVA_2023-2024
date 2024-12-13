package ACT4_4;

import Utilidades.UtilidadesArrays;
import Utilidades.UtilidadesClasses;
import java.util.ArrayList;

public class ACT4_4_02_Mostrar_Diferentes {

    public static void main(String[] args) {
        int[] array = UtilidadesArrays.generaArray(25, 0, 10);
        ArrayList<Integer> resultado = new ArrayList<>();

        UtilidadesArrays.muestraArray(array);
        resultado = UtilidadesClasses.mostrarDiferentes(array);
        UtilidadesClasses.mostrarArrayListInt(resultado);
    }
}
