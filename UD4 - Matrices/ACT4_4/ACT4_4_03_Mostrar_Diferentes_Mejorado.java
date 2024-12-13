package ACT4_4;

import java.util.ArrayList;
import Utilidades.UtilidadesArrays;
import Utilidades.UtilidadesClasses;

public class ACT4_4_03_Mostrar_Diferentes_Mejorado {

    public static void main(String[] args) {
        int[] array = UtilidadesArrays.generaArray(25, 0, 3);
        ArrayList<Integer> resultado = new ArrayList<>();

        UtilidadesArrays.muestraArray(array);
        resultado = UtilidadesClasses.mostrarDiferentesMejorado(array);
        UtilidadesClasses.mostrarArrayListInt(resultado);
    }
}
