package ACT4_1;

import Utilidades.UtilidadesArrays;

/**
 * Crea una clase con un método que reciba la longitud de un array de enteros y
 * devuelva un array de la longitud solicitada inicializado de forma aleatoria
 * entre un mínimo y un máximo dados. En el main genera tres arrays de
 * longitudes diferentes y muestralos por pantalla. Utiliza el método del
 * ACT4_1.
 */
public class ACT4_1_4_Generar_Array_Min_Max {

    public static void main(String[] args) {
        UtilidadesArrays.muestraArray(UtilidadesArrays.generaArray(10, 1, 20));
        UtilidadesArrays.muestraArray(UtilidadesArrays.generaArray(5, 100, 225));
        UtilidadesArrays.muestraArray(UtilidadesArrays.generaArray(25, 25, 50));
    }
}
