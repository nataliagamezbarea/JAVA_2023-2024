package ACT_3_2;

/**
 * 26. Crear una clase que muestre las letras del alfabeto indicando si son
 * vocales o consonantes. Hacer tres versiones: 1. Con un if para cada vocal:
 * if() else if... 2. Con un único if() else 3. Con un switch (recordando
 * incluir el break en cada case).
 */
public class ACT3_2_05_Vocal_Consonante_Dif_Formas {

    public static void main(String[] args) {
        System.out.println("1ª FORMA ------------------------");
        // Primera forma
        for (char c = 'a'; c <= 'z'; c++) {
            if (c == 'a') {
                System.out.println(c + " es vocal");
            } else if (c == 'e') {
                System.out.println(c + " es vocal");
            } else if (c == 'i') {
                System.out.println(c + " es vocal");
            } else if (c == 'o') {
                System.out.println(c + " es vocal");
            } else if (c == 'u') {
                System.out.println(c + " es vocal");
            } else {
                System.out.println(c + " es consonante");
            }
        }

        System.out.println("2ª FORMA ------------------------");
        // Segunda forma
        for (char c = 'a'; c <= 'z'; c++) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                System.out.println(c + " es vocal");
            } else {
                System.out.println(c + " es consonante");
            }
        }

        System.out.println("3ª FORMA ------------------------");
        // Tercera forma
        for (char c = 'a'; c <= 'z'; c++) {
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println(c + " es vocal");
                    break;
                default:
                    System.out.println(c + " es consonante");
                    break;
            }
        }
    }
}
