package Ejercicios;

import java.util.Scanner;

public class Eco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase;

        System.out.println("Introduce cualquier texto o numero: ");

        while (true) {
            frase = sc.nextLine();
            if (frase.equalsIgnoreCase("salir")) {
                break;
            }
            System.out.println(frase);
        }

        sc.close();
    }
}
