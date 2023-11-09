package Ejercicios;

import java.util.Scanner;

public class EncuentraLetra {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una frase: ");
        String frase = sc.nextLine();

        System.out.println("Introduce una letra");

        // Posible solución que suele dar problemas
        // char letra = sc.nextLine().charAt(0);

        // Variante mas segura
        String letraInput = sc.nextLine();
        while (letraInput.length() != 1) {
            System.out.println("Debes introducir solo una letra. Vuelve a probar:");
        }
        char letra = letraInput.charAt(0);

        int contadorCaseSensitive = 0;
        int contadorIgnoreCase = 0;

        for (int i = 0; i < frase.length(); i++) {

            // Versión Case Sensitive
            if (frase.charAt(i) == letra) {
                contadorCaseSensitive++;
            }

            // Versión ignoreCase
            if (letraInput.equalsIgnoreCase(frase.substring(i, i + 1))) {
                contadorIgnoreCase++;
            }
        }

        System.out.printf("VERSION CASE SENSITIVE: La letra '%s' aparece %d veces en la frase '%s'.\n", letra,
                contadorCaseSensitive,
                frase);
        System.out.printf("VERSION IGNORE CASE: La letra '%s' aparece %d veces en la frase '%s'.", letra,
                contadorIgnoreCase,
                frase);

        sc.close();
    }
}
