package ACT4_3;
import java.util.Scanner;

public class ACT_4_3_03_Gestionar_Menu_Switch {

    public static void main(String[] args) {
        String titulo = "Menú Principal";
        String[] opciones = {"Ver datos", "Agregar datos", "Eliminar datos", "Salir"};
        String pregunta = "Elige una opción: ";
        
        int eleccion = gestionarMenu(titulo, opciones, pregunta);

        switch (eleccion) {
            case 1 -> System.out.println("Has elegido: Ver datos");
            case 2 -> System.out.println("Has elegido: Agregar datos");
            case 3 -> System.out.println("Has elegido: Eliminar datos");
            case 4 -> System.out.println("Has elegido: Salir");
            default -> System.out.println("Opción no válida");
        }
    }

    public static int gestionarMenu(String titulo, String[] opciones, String pregunta) {
        Scanner scanner = new Scanner(System.in);
        int eleccion = -1;

        while (eleccion < 1 || eleccion > opciones.length) {
            System.out.println("\n" + titulo);
            for (int i = 0; i < opciones.length; i++) {
                System.out.println((i + 1) + ". " + opciones[i]);
            }
            System.out.print(pregunta);
            
            if (scanner.hasNextInt()) {
                eleccion = scanner.nextInt();
            } else {
                scanner.next(); 
            }

            if (eleccion < 1 || eleccion > opciones.length) {
                System.out.println("Por favor, elige una opción válida.");
            }
        }

        scanner.close();
        return eleccion;
    }
}
