package Ejercicios;

import java.util.Scanner;

public class FiguraGeometrica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca el valor de 'n' para el tamaño del triángulo: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // Salto de línea para la siguiente fila
        }

        scanner.close();
    }
}
