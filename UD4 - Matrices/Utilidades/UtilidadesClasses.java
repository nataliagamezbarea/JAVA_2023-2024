package Utilidades;

import java.util.ArrayList;

public class UtilidadesClasses {

    public static void mostrarArrayListInt(ArrayList<Integer> array) {
        System.out.print("[ ");
        for (Integer a : array) {
            System.out.print(a + " ");
        }
        System.out.println("]");
    }

    public static void mostrarArrayListStr(ArrayList<String> array) {
        System.out.print("[ ");
        for (String a : array) {
            System.out.print(a + " ");
        }
        System.out.println("]");
    }

    //compara un int[] array si no está en array list lo añade
    public static ArrayList<Integer> mostrarDiferentes(int[] array) {
        ArrayList<Integer> resultado = new ArrayList<>();
        // Recorre cada número en el arreglo 'array'
        for (Integer num : array) {
            // Si el número no está presente en el 'ArrayList resultado'
            if (!resultado.contains(num)) {
                // Agregar el número al 'ArrayList resultado'
                resultado.add(num);
            }
        }
        return resultado;
    }

    public static ArrayList<Integer> arrayToArrayListInt(int[] array) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int a : array) {
            arrayList.add(a);
        }

        return arrayList;
    }

    public static ArrayList<Integer> mostrarDiferentesMejorado(int[] array) {
        ArrayList<Integer> resultado = new ArrayList<>();
    
        // Recorrer cada número en el arreglo 'array'
        for (int num : array) {
            int i = 0;  // Variable para llevar la cuenta de la posición
            boolean encontrado = false;  // Bandera que indica si el número ya está en 'resultado'
    
            // Recorrer los elementos de 'resultado' para ver si el número ya existe
            for (Integer r : resultado) {
                if (r == num) {
                    encontrado = true;  // Si el número ya está en 'resultado', marcamos 'encontrado'
                    break;  // Salimos del bucle ya que no necesitamos seguir buscando
                } else if (r > num) {
                    break;  // Si encontramos un número mayor, salimos porque los elementos están ordenados en orden ascendente
                } else {
                    i++;  // Si el número no se ha encontrado, incrementamos el índice
                }
            }
    
            // Si no se encontró el número, lo agregamos a 'resultado' en la posición correspondiente
            if (!encontrado) {
                resultado.add(i, num);  // Añadimos el número en la posición 'i'
            }
        }
    
        return resultado;  // Retornamos el 'ArrayList' con los números únicos y ordenados
    }
    
    
}
