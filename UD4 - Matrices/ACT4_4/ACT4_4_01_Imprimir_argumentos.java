package ACT4_4;
import java.util.ArrayList;
import Utilidades.UtilidadesClasses;

/**
 *
 * @author T.Vives
 */
public class ACT4_4_01_Imprimir_argumentos {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();

        // Imprimir argumentos introducidos en netbeans
        for (String a: args) {
            array.add(a);			
        }

        // Set proyect configuration , run proyect
        UtilidadesClasses.mostrarArrayListStr(array);
    }
}